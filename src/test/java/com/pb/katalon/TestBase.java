package com.pb.katalon;
import com.hpe.adm.nga.sdk.Octane;
import com.hpe.adm.nga.sdk.SiteAdmin;
import com.hpe.adm.nga.sdk.authentication.Authentication;
import com.hpe.adm.nga.sdk.entities.EntityList;
import com.hpe.adm.nga.sdk.metadata.Metadata;
import com.katalon.platform.api.service.ApplicationManager;
import com.pb.hpe.sdk.utils.AuthenticationUtils;
import com.pb.hpe.sdk.utils.ContextUtils;

import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * Created by Guy Guetta on 12/04/2016.
 */
public class TestBase {
    protected static Octane octane;
    protected static SiteAdmin siteAdmin;
    protected static String entityName = "";
    private static String entityTypeOld = "";
    protected static EntityList entityList;
    protected static Metadata metadata;
 
    static {
        // for local execution
        if (System.getProperty("should.set.proxy") == null) {
            System.setProperty("should.set.proxy", "true");
        }
        
    }

    @BeforeClass
    public static void init() {
        Authentication authentication = AuthenticationUtils.getAuthentication("MyAPItest_ed81wo3m480d8uqx2ye1rw7no", ")1641019824224521252250V");
        
        octane = ContextUtils.getContextWorkspace("https://almoctane-apj.saas.microfocus.com", authentication, "179014", "1002");
        siteAdmin = ContextUtils.getContextSiteAdmin("https://almoctane-apj.saas.microfocus.com", authentication);
        metadata = octane.metadata();        
        
     
    }

    @Before
    public void before() {
        if (!entityName.equals(entityTypeOld)) {
            entityList = octane.entityList(entityName);
            entityTypeOld = entityName;
        }
    }
}