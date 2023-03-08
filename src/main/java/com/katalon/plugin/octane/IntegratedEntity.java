package com.katalon.plugin.octane;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "integratedEntity")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegratedEntity implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Map<String, String> properties = new HashMap<>();

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "IntegratedEntity [properties=" + properties + "]";
	}
	
	

}
