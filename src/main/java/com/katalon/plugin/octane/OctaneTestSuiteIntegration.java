package com.katalon.plugin.octane;

import com.katalon.platform.api.model.Integration;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class OctaneTestSuiteIntegration implements Integration {
    private String testSuiteId;
    private String releaseId;
    private String productAreasId;
    private String backlogsId;    
    private String testLevel;
    private String testType;
    
    public String getTestSuiteId() {
		return testSuiteId;
	}

	public void setTestSuiteId(String testSuiteId) {
		this.testSuiteId = testSuiteId;
	}
	
	public String getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
	}

	public String getProductAreasId() {
		return productAreasId;
	}

	public void setProductAreasId(String productAreasId) {
		this.productAreasId = productAreasId;
	}

	public String getBacklogsId() {
		return backlogsId;
	}

	public void setBacklogsId(String backlogsId) {
		this.backlogsId = backlogsId;
	}
	
	

	public String getTestLevel() {
		return testLevel;
	}

	public void setTestLevel(String testLevel) {
		this.testLevel = testLevel;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	@Override
    public String getName() {
        return OctaneConstants.INTEGRATION_ID;
    }

    @Override
    public Map<String, String> getProperties() {
        HashMap<String, String> props = new HashMap<>();
        props.put(OctaneConstants.INTEGRATION_TESTSUITE_ID, getTestSuiteId());
        props.put(OctaneConstants.INTEGRATION_RELEASE_ID, getReleaseId());
        props.put(OctaneConstants.INTEGRATION_PRODUCT_AREA_ID, getProductAreasId());
        props.put(OctaneConstants.INTEGRATION_BACKLOGS_ID, getBacklogsId());
        props.put(OctaneConstants.INTEGRATION_TEST_LEVEL, getTestLevel());
        props.put(OctaneConstants.INTEGRATION_TEST_TYPE, getTestType());
        return props;
    }
}
