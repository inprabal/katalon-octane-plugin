package com.pb.katalon;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

import com.hpe.adm.nga.sdk.entities.TestSuiteEntityList;
import com.hpe.adm.nga.sdk.entities.TestSuiteEntityList.AvailableFields;
import com.hpe.adm.nga.sdk.entities.TestSuiteLinkToTestEntityList.TestSuiteLinkToTestEntities;
import com.hpe.adm.nga.sdk.model.TestAutomatedEntityModel;
import com.hpe.adm.nga.sdk.model.TestSuiteEntityModel;
import com.hpe.adm.nga.sdk.model.TestSuiteLinkToTestEntity;

public class AutomatedTestSuiteTest extends TestBase {
	
	@Test
	public void getTestSuitedata(){
		
		TestSuiteEntityModel entity =  octane.entityList(TestSuiteEntityList.class).at("1054").get().addFields(AvailableFields.NAME,AvailableFields.DESCRIPTION,AvailableFields.BACKLOGCOVERAGE,AvailableFields.USERTAGS,AvailableFields.LINKTOTESTSUITE).execute();
		
		System.out.println(entity.getId());
		
		System.out.println(entity.getName());
		
		System.out.println(entity.getDescription());
		
		System.out.println(entity.getBacklogCoverage());
		
		System.out.println(entity.getUserTags());
		
		Collection<TestSuiteLinkToTestEntity> tests = entity.getLinkToTestSuite();
		
		for (Iterator iterator = tests.iterator(); iterator.hasNext();) {
			TestSuiteLinkToTestEntity testSuiteLinkToTestEntity = (TestSuiteLinkToTestEntity) iterator.next();
			System.out.println(testSuiteLinkToTestEntity.getId());
		}
	}

}
