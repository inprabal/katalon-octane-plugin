package com.katalon.plugin.octane;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.osgi.service.event.Event;

import com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel;
import com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType;
import com.hpe.adm.nga.sdk.enums.lists.list_node.testing_tool_type.TestingToolType;
import com.katalon.platform.api.event.EventListener;
import com.katalon.platform.api.event.ExecutionEvent;
import com.katalon.platform.api.execution.TestSuiteExecutionContext;
import com.katalon.platform.api.extension.EventListenerInitializer;
import com.katalon.platform.api.model.ProjectEntity;
import com.katalon.platform.api.preference.PluginPreference;
import com.katalon.platform.api.service.ApplicationManager;
import com.katalon.plugin.octane.tests.TestResult;
import com.katalon.plugin.octane.tests.TestResultPushStatus;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class OctaneEventListenerInitializer implements EventListenerInitializer, OctaneComponent {

	@Override
	public void registerListener(EventListener listener) {
		listener.on(Event.class, event -> {
			try {
				PluginPreference preferences = getPluginStore();
				boolean isIntegrationEnabled = preferences.getBoolean(OctaneConstants.PREF_OCTANE_ENABLED, false);
				if (!isIntegrationEnabled) {
					return;
				}

				ExecutionEvent eventObject = (ExecutionEvent) event.getProperty("org.eclipse.e4.data");
				TestSuiteExecutionContext testSuiteContext = (TestSuiteExecutionContext) eventObject
						.getExecutionContext();

				String report_loc = testSuiteContext.getReportLocation();

				String server = preferences.getString(OctaneConstants.PREF_OCTANE_URL, "");
				String clientID = preferences.getString(OctaneConstants.PREF_OCTANE_CLIENT_ID, "");
				String clientSecret = preferences.getString(OctaneConstants.PREF_OCTANE_CLIENT_SECRET, "", true);
				String sharedspace = preferences.getString(OctaneConstants.PREF_OCTANE_SPACE_ID, "");
				String workspace = preferences.getString(OctaneConstants.PREF_OCTANE_WORKSPACE_ID, "");

				ProjectEntity project = ApplicationManager.getInstance().getProjectManager().getCurrentProject();

				if (ExecutionEvent.TEST_SUITE_FINISHED_EVENT.equals(event.getTopic())) {

					RestClient client = null;
					try {
						File junitxml = FileUtils.getFile(report_loc, "JUnit_Report.xml");

						File suitexml = FileUtils.getFile(project.getFolderLocation(),
								testSuiteContext.getSourceId() + ".ts");

						JAXBContext jaxbcontext = JAXBContext.newInstance(TestSuiteEntity.class);

						Unmarshaller jaxbUnmarshaller = jaxbcontext.createUnmarshaller();

						TestSuiteEntity testSuiteEntity = (TestSuiteEntity) jaxbUnmarshaller.unmarshal(suitexml);

						XmlProcessor proc = new XmlProcessor();
						List<TestResult> result = proc.processJunitTestReport(junitxml, null);

						Settings settings = new Settings();

						settings.setServer(server);
						settings.setClientID(clientID);
						settings.setClientSecret(clientSecret);
						settings.setSharedspace(Integer.parseInt(sharedspace));
						settings.setWorkspace(Integer.parseInt(workspace));

						if (testSuiteEntity.getIntegratedEntity() != null) {
							Map<String, String> integrations = testSuiteEntity.getIntegratedEntity().getProperties();

							String[] productArea = StringUtils.split(integrations.get("octane.product.areas.id"), ",");
							if (productArea != null) {
								settings.setProductAreas(productArea);
							}

							
							String[] backlogItems = StringUtils.split(integrations.get("octane.backlogs.id"), ",");
							if (backlogItems != null) {
								settings.setBacklogItems(backlogItems);
							}
							
							String suiteID = integrations.get("octane.testsuite.id");
							if (StringUtils.isNoneBlank(suiteID)) {
								settings.setSuite(Integer.parseInt(suiteID));
							}
							
							String releaseID = integrations.get("octane.release.id");
							if (StringUtils.isNoneBlank(releaseID)) {
								settings.setRelease(Integer.parseInt(releaseID));
							}
							else {
								settings.setDefaultRelease();
							}
					

							List<String> test_types = new ArrayList<>();
							test_types.add("Test_Type:" + integrations.get("octane.test.type")!=null?integrations.get("octane.test.type"):"");
							test_types.add("Test_Level:" + integrations.get("octane.test.level")!=null?integrations.get("octane.test.level"):"");
							test_types.add("Testing_Tool_Type:" + "Katalon");

							settings.setFields(test_types);
						}

						File octanexml = FileUtils.getFile(report_loc, "Octane_Result.xml");

						octanexml.createNewFile();

						proc.writeTestResults(result, settings, octanexml);

						client = new RestClient(settings);

						long id = client.postTestResult(new FileEntity(octanexml, ContentType.APPLICATION_XML));
						System.out.println("Test run id:" + id);

						TestResultPushStatus status = client.getTestResultStatus(id);
						Runnable fetchStatus = () -> {
							System.out.println("Inside executor");
						};
						final Callable<Object> callable = Executors.callable(fetchStatus,
								client.getTestResultStatus(id));
						int i = 1;
						while (status.getStatus().equals("running") && i < 6) {
							ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
							Future<?> resultFuture = executorService.schedule(callable, 10, TimeUnit.SECONDS);
							status = (TestResultPushStatus) resultFuture.get();
							i++;
						}
						File octanestatus = FileUtils.getFile(report_loc, "Octane_Status.txt");
						String output_result = "Test run id:" + id + "\nTest run status:" + status.getStatus()
								+ "\nError:" + status.getErrorMessage();
						System.out.println("Test run id:" + id + "\nTest run status:" + status.getStatus() + "\nError:"
								+ status.getErrorMessage());
						FileUtils.write(octanestatus, output_result, Charset.defaultCharset());

					} catch (Exception e) {
						File octanestatus = FileUtils.getFile(report_loc, "Octane_Error.txt");
						FileUtils.write(octanestatus, ExceptionUtils.getStackTrace(e), Charset.defaultCharset());
					} finally {
						if (client != null) {
							client.release();
						}
					}
				}
			} catch (Throwable e) {
				e.printStackTrace(System.out);
			}
		});
	}
}
