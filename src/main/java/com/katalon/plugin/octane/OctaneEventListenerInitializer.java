package com.katalon.plugin.octane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.osgi.service.event.Event;

import com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus;
import com.katalon.platform.api.controller.TestCaseController;
import com.katalon.platform.api.event.EventListener;
import com.katalon.platform.api.event.ExecutionEvent;
import com.katalon.platform.api.execution.TestSuiteExecutionContext;
import com.katalon.platform.api.extension.EventListenerInitializer;
import com.katalon.platform.api.model.Integration;
import com.katalon.platform.api.model.ProjectEntity;
import com.katalon.platform.api.model.TestCaseEntity;
import com.katalon.platform.api.preference.PluginPreference;
import com.katalon.platform.api.service.ApplicationManager;

public class OctaneEventListenerInitializer implements EventListenerInitializer, OctaneComponent {
    

    private String mapToOctaneStatus(String ksStatus) {
        String status;
        switch (ksStatus) {
            case "PASSED":
                status = RunNativeStatus.PASSED.name(); //PASSED
                break;
            case "FAILED":
                status = RunNativeStatus.FAILED.name(); //FAILED
                break;
            case "ERROR":
                status = RunNativeStatus.FAILED.name(); //FAILED
                break;
            default:
                status = RunNativeStatus.BLOCKED.name();; // BLOCKED
        }
        return status;
    }

    @Override
    public void registerListener(EventListener listener) {
        listener.on(Event.class, event -> {
            try {
                PluginPreference preferences = getPluginStore();
                boolean isIntegrationEnabled = preferences.getBoolean(OctaneConstants.PREF_OCTANE_ENABLED, false);
                if (!isIntegrationEnabled) {
                    return;
                }
                String clientID = preferences.getString(OctaneConstants.PREF_OCTANE_CLIENT_ID, "");
                
                String clientSecret = preferences.getString(OctaneConstants.PREF_OCTANE_CLIENT_SECRET, "");

                if (ExecutionEvent.TEST_SUITE_FINISHED_EVENT.equals(event.getTopic())) {
                    ExecutionEvent eventObject = (ExecutionEvent) event.getProperty("org.eclipse.e4.data");

                    TestSuiteExecutionContext testSuiteContext = (TestSuiteExecutionContext) eventObject
                            .getExecutionContext();
                    TestSuiteStatusSummary testSuiteSummary = TestSuiteStatusSummary.of(testSuiteContext);
                    System.out.println("TestRail: Start sending summary message to channel:");
                    System.out.println(
                            "Summary execution result of test suite: " + testSuiteContext.getSourceId()
                                    + "\nTotal test cases: " + Integer.toString(testSuiteSummary.getTotalTestCases())
                                    + "\nTotal passes: " + Integer.toString(testSuiteSummary.getTotalPasses())
                                    + "\nTotal failures: " + Integer.toString(testSuiteSummary.getTotalFailures())
                                    + "\nTotal errors: " + Integer.toString(testSuiteSummary.getTotalErrors())
                                    + "\nTotal skipped: " + Integer.toString(testSuiteSummary.getTotalSkipped()));
                    System.out.println("Octane: Summary message has been successfully sent");
                   
                    
                    String sharedspace = preferences.getString(OctaneConstants.PREF_OCTANE_SPACE_ID, "");
                    
                    String workspace = preferences.getString(OctaneConstants.PREF_OCTANE_WORKSPACE_ID, "");

                    ProjectEntity project = ApplicationManager.getInstance().getProjectManager().getCurrentProject();
                    TestCaseController controller = ApplicationManager.getInstance().getControllerManager().getController(TestCaseController.class);

                    List<Long> updateIds = new ArrayList<>();
                    List<Map<String, String>> data = testSuiteContext.getTestCaseContexts().stream().map(testCaseExecutionContext -> {
                        String status = mapToOctaneStatus(testCaseExecutionContext.getTestCaseStatus());
                        try {
                            TestCaseEntity testCaseEntity = controller.getTestCase(project, testCaseExecutionContext.getId());
                            Integration integration = testCaseEntity.getIntegration(OctaneConstants.INTEGRATION_ID);
                            if (integration == null) {
                                return null;
                            }
                            String testRailTCId = integration.getProperties().get(OctaneConstants.INTEGRATION_TESTCASE_ID);
                            String filteredTestCaseId = testRailTCId != null ? testRailTCId.replaceAll("\\D", "") : null;
                            updateIds.add(Long.parseLong(filteredTestCaseId));
                            Map<String, String> resultMap = new HashMap<>();
                            resultMap.put("case_id", filteredTestCaseId);
                            resultMap.put("status_id", status);
                            return resultMap;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return null;
                    }).filter(map -> map != null).collect(Collectors.toList());
                    
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        });
    }
}
