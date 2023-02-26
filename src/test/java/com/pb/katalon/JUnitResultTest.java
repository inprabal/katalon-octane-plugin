package com.pb.katalon;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.jxpath.ri.parser.ParseException;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.junit.Test;

import com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel;
import com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType;
import com.hpe.adm.nga.sdk.enums.lists.list_node.testing_tool_type.TestingToolType;
import com.katalon.plugin.octane.RestClient;
import com.katalon.plugin.octane.Settings;
import com.katalon.plugin.octane.XmlProcessor;
import com.katalon.plugin.octane.exception.ValidationException;
import com.katalon.plugin.octane.tests.TestResult;
import com.katalon.plugin.octane.tests.TestResultPushStatus;

public class JUnitResultTest {
	
	@Test
	public void parseJunitFile() throws ParseException, ValidationException, IOException, InterruptedException, ExecutionException {
		XmlProcessor proc = new  XmlProcessor();
		
		File junitxml = new File(this.getClass().getClassLoader().getResource("JUnit_Report.xml").getFile());
		
		List<TestResult> result=proc.processJunitTestReport(junitxml, null);
		
		System.out.println(result);
		
		Settings settings = new Settings();
		
		settings.setServer("https://almoctane-apj.saas.microfocus.com");
		settings.setClientID("MyAPItest_ed81wo3m480d8uqx2ye1rw7no");
		settings.setClientSecret(")1641019824224521252250V");
		settings.setSharedspace(179014);
		settings.setWorkspace(1002);
		
		String[] productArea = {"1018"};// from suite integration, multiple
		settings.setProductAreas(productArea);
		
		String[] backlogItems = { "2001" };// from suite integration, multiple
		settings.setBacklogItems(backlogItems);
		
		settings.setSuite(1044);// from suite integration
		//settings.setSuiteExternalRunId("katalon_suite_id");
		
		//settings.setRelease(1002);
		
		settings.setDefaultRelease();
		
		
		// from suite integration, single
		List<String> test_types = new ArrayList<>();
		test_types.add("Test_Type:"+TestType.ACCEPTANCE.name());
		test_types.add("Test_Level:"+TestLevel.INTEGRATION_TEST.name());
		test_types.add("Testing_Tool_Type:"+TestingToolType.SELENIUM.name());
		
		settings.setFields(test_types);
		
		
		//List<String> tags = new ArrayList<>();
		//tags.add("Browser:Edge Chromium");		
		
		//settings.setTags(tags);
		
		Path path = Paths.get(FileUtils.getTempDirectory().getAbsolutePath(), UUID.randomUUID().toString());
		String tmpdir = Files.createDirectories(path).toFile().getAbsolutePath();
		
		
		System.out.println(tmpdir);
		
		File output= FileUtils.getFile(tmpdir,"Octane_Report.xml");  
		
		output.createNewFile();
		
		//File output = new File("D:\\eclipse\\projects\\katalon-octane-plugin\\temp\\out.xml");
		
		proc.writeTestResults(result, settings, output);
		
		RestClient client = new RestClient(settings);
		
        try {
            long id= client.postTestResult(new FileEntity(output, ContentType.APPLICATION_XML));
            System.out.println("Test run id:"+id);
        	//long id=1110;
        	TestResultPushStatus status = client.getTestResultStatus(id);
        	
        	System.out.println(
					"Test run status:" + status.getStatus() + "\nGet Until:" + status.getUntil());
			
			Runnable fetchStatus = () -> {				
				System.out.println("Inside executor");
			};
			final Callable<Object> callable = Executors.callable(fetchStatus,client.getTestResultStatus(id));
			int i=1;
			while (status.getStatus().equals("running") && i<6) {
				ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
				Future<?> resultFuture =   executorService.schedule(callable, 10, TimeUnit.SECONDS);
				status = (TestResultPushStatus)resultFuture.get();
				i++;
			}
			File octanestatus = FileUtils.getFile("D:\\eclipse\\projects\\katalon-octane-plugin\\temp", "Octane_Status.txt");

			//octanestatus.createNewFile();
			String output_result="Test run status:" + status.getStatus() + "\nError:" + status.getErrorMessage();
			System.out.println(
					"Test run status:" + status.getStatus() + "\nError:" + status.getErrorMessage());
			FileUtils.write(octanestatus, output_result,Charset.defaultCharset());
        	
           
        } finally {
            client.release();
        }

		
	}

}
