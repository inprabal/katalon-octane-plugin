package com.katalon.plugin.octane.tests;

import java.io.Serializable;
import java.util.Map;

public class TestSuite implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Map<String, String> properties;
	
	

	public TestSuite(String id, Map<String, String> properties) {
		super();
		this.id = id;
		this.properties = properties;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "TestSuite [id=" + id + ", properties=" + properties + "]";
	}
	

}
