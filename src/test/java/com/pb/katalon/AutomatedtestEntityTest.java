package com.pb.katalon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.Test;

import com.hpe.adm.nga.sdk.entities.EntityList;
import com.hpe.adm.nga.sdk.entities.RunEntityList;
import com.hpe.adm.nga.sdk.entities.TestAutomatedEntityList;
import com.hpe.adm.nga.sdk.entities.TestAutomatedEntityList.AvailableFields;
import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.FieldModel;
import com.hpe.adm.nga.sdk.model.ReferenceFieldModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import com.hpe.adm.nga.sdk.model.TestAutomatedEntityModel;
import com.hpe.adm.nga.sdk.network.google.GoogleHttpClient;
import com.pb.hpe.sdk.utils.CommonUtils;

public class AutomatedtestEntityTest extends TestBase{
	
	
	@Test
	public void getTestEntitydata(){
		
		TestAutomatedEntityModel entity =  octane.entityList(TestAutomatedEntityList.class).at("1045").get().addFields(AvailableFields.NAME,AvailableFields.DESCRIPTION,AvailableFields.BACKLOGCOVERAGE,AvailableFields.USERTAGS).execute();
		
		System.out.println(entity.getId());
		
		System.out.println(entity.getName());
		
		System.out.println(entity.getDescription());
		
		System.out.println(entity.getBacklogCoverage());
		
		System.out.println(entity.getUserTags());
		
		EntityList entityList_run=octane.entityList("runs");
		
		Collection<EntityModel> entities = new ArrayList<EntityModel>();
		
		
		
		Set<FieldModel> runFields = new HashSet<>();
		FieldModel<String> name = new StringFieldModel("name", "sdk_runs_" + UUID.randomUUID());
        FieldModel<EntityModel> test = new ReferenceFieldModel("test", entity.getWrappedEntityModel());

        runFields.add(name);
        runFields.add(test);
        
        EntityModel run =new EntityModel(runFields);
        
        entities.add(run);
        
        Collection<EntityModel> entityModels = entityList_run.create().entities(entities).execute();
        EntityModel entityModel = entityModels.iterator().next();
        String entityId = CommonUtils.getIdFromEntityModel(entityModel);
		
        System.out.println("entityId>>"+ entityId);
		
		
	}
	
	
	 private static FieldModel<EntityModel> getReferenceFieldModel(String fieldName, String id, String type) {
	        Set<FieldModel> businessImpactFields = new HashSet<>();
	        businessImpactFields.add(new StringFieldModel("id", id));
	        businessImpactFields.add(new StringFieldModel("type", type));
	        EntityModel businessImpact = new EntityModel(businessImpactFields);

	        return new ReferenceFieldModel(fieldName, businessImpact);
	    }

}
