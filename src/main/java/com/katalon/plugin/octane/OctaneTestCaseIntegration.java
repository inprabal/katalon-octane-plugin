package com.katalon.plugin.octane;

import com.katalon.platform.api.model.Integration;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class OctaneTestCaseIntegration implements Integration {
    private String testCaseId;

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestCaseId() {
        return testCaseId != null ? testCaseId.replaceAll("\\D", "") : null;
    }

    @Override
    public String getName() {
        return OctaneConstants.INTEGRATION_ID;
    }

    @Override
    public Map<String, String> getProperties() {
        HashMap<String, String> props = new HashMap<>();
        props.put(OctaneConstants.INTEGRATION_TESTCASE_ID, getTestCaseId());
        return props;
    }
}
