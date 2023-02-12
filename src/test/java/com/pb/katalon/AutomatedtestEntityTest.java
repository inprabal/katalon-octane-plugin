package com.pb.katalon;

import org.junit.Test;

import com.hpe.adm.nga.sdk.Octane;
import com.hpe.adm.nga.sdk.entities.TestAutomatedEntityList;
import com.hpe.adm.nga.sdk.entities.TestAutomatedEntityList.AvailableFields;
import com.hpe.adm.nga.sdk.model.TestAutomatedEntityModel;

public class AutomatedtestEntityTest extends TestBase{
	
	@Test
	public void getTestEntitydata(){
		
		TestAutomatedEntityModel entity =  octane.entityList(TestAutomatedEntityList.class).at("1045").get().addFields(AvailableFields.DESCRIPTION,AvailableFields.BACKLOGCOVERAGE,AvailableFields.USERTAGS).execute();
		
		System.out.println(entity.getDescription());
		
		System.out.println(entity.getBacklogCoverage());
		
		System.out.println(entity.getUserTags());
		
	}

}
