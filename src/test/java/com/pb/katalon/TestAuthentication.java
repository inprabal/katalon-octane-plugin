package com.pb.katalon;

import java.util.Collection;

import org.junit.Test;

import com.hpe.adm.nga.sdk.exception.OctaneException;
import com.hpe.adm.nga.sdk.model.EntityModel;

import org.junit.Assert;

public class TestAuthentication extends TestBase {
	
	@Test
    public void testSignOut() throws Exception {
        octane.signOut();
        try {
            Collection<EntityModel> defectModel = octane.entityList("stories").get().execute();
            Assert.fail("Sign out failed.");
        } catch (OctaneException e) {}
    }

}
