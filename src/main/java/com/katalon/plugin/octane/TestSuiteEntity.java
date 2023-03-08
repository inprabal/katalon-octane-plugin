package com.katalon.plugin.octane;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestSuiteEntity")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestSuiteEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private IntegratedEntity integratedEntity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IntegratedEntity getIntegratedEntity() {
		return integratedEntity;
	}

	public void setIntegratedEntity(IntegratedEntity integratedEntity) {
		this.integratedEntity = integratedEntity;
	}

	@Override
	public String toString() {
		return "TestSuiteEntity [name=" + name + ", integratedEntity=" + integratedEntity + "]";
	}
	
	

}
