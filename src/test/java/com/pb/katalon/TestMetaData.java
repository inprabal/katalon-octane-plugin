package com.pb.katalon;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.hpe.adm.nga.sdk.entities.EntityList;
import com.hpe.adm.nga.sdk.entities.get.GetEntity;
import com.hpe.adm.nga.sdk.metadata.EntityMetadata;
import com.hpe.adm.nga.sdk.metadata.features.Feature;
import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.FieldModel;

public class TestMetaData extends TestBase {
	
	@Test
	public void getAllEntityMetadata(){
        // can call execute immediately since there is nothing else to build
        final Collection<EntityMetadata> entityMetadata = metadata.entities("test_automated").execute();

        for (Iterator iterator = entityMetadata.iterator(); iterator.hasNext();) {
        	
        	final EntityMetadata next = entityMetadata.iterator().next();
            // get the name
            System.out.println(next.getName());

            // can modify label?
            System.out.println(next.getLabel());

            // returns a list of features for this entity
            final Collection<Feature> features = next.features();
            
            for (Iterator iterator2 = features.iterator(); iterator2.hasNext();) {
            	// gets feature
                final Feature feature = features.iterator().next();

                // gets the feature name
                System.out.println(feature.getName());
                
                break;
				
			}
            
            
            break;
			
		}
        
        // get the first entity
        
    }	

}
