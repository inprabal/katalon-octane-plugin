package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestSuiteEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestSuiteEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , COVEREDCONTENT("covered_content")
                    , BACKLOGCOVERAGE("backlog_coverage")
                    , VERSIONSTAMP("version_stamp")
                    , RUN("run")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , ESTIMATEDDURATION("estimated_duration")
                    , LASTRUNS("last_runs")
                    , USERTAGS("user_tags")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , ATTACHMENTS("attachments")
                    , DESCRIPTION("description")
                    , LINKTOTESTSUITE("link_to_test_suite")
                    , OWNER("owner")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , QUALITYSTORIES("quality_stories")
                    , DESIGNER("designer")
                    , COVEREDREQUIREMENT("covered_requirement")
                    , TESTTYPE("test_type")
        ;

        private final String fieldName;

        AvailableFields(final String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldName() {
            return fieldName;
        }
    }

    public enum SortableFields implements TypedEntityList.SortableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
                    , ESTIMATEDDURATION("estimated_duration")
                    , NAME("name")
                    , OWNER("owner")
                    , DESIGNER("designer")
        ;

        private final String fieldName;

        SortableFields(final String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldName() {
            return fieldName;
        }
    }

    /**
    * Creates a new object.  This represents an entity collection
    *
    * @param octaneHttpClient - Http Client
    * @param baseDomain - Domain Name
    */
    public TestSuiteEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestSuiteEntities at(String entityId) {
        return new TestSuiteEntities(entityId);
    }


            public GetTestSuiteEntities get() {
        return new GetTestSuiteEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestSuiteEntities create() {
        return new CreateTestSuiteEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestSuiteEntities update() {
        return new UpdateTestSuiteEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestSuiteEntities delete() {
        return new DeleteTestSuiteEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestSuiteEntities object(An object that represent one TestSuiteEntity )
    */
    public class TestSuiteEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestSuiteEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestSuiteEntity object with specific entity
        *
* @return The GetTestSuiteEntity object
*/
public GetTestSuiteEntity get() {
return new GetTestSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestSuiteEntity object with specific entity
        *
* @return The UpdateTestSuiteEntity object
*/
public UpdateTestSuiteEntity update() {
return new UpdateTestSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestSuiteEntity object with specific entity
        *
* @return The DeleteTestSuiteEntity object
*/
public DeleteTestSuiteEntity delete() {
return new DeleteTestSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestSuiteEntities extends GetTypedEntities
<TestSuiteEntityModel
    , GetTestSuiteEntities    , AvailableFields, SortableFields> {
    GetTestSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites");
    }
    }

        public final class GetTestSuiteEntity extends GetTypedEntity
<TestSuiteEntityModel
    , GetTestSuiteEntity    , AvailableFields> {
    GetTestSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites", entityId);
    }
    }

                public final class CreateTestSuiteEntities extends CreateTypedEntities
<TestSuiteEntityModel
    , CreateTestSuiteEntities    > {
    CreateTestSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites");
    }
    }

                public final class UpdateTestSuiteEntities extends UpdateTypedEntities
<TestSuiteEntityModel
    , UpdateTestSuiteEntities    > {
    UpdateTestSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites");
    }
    }

        public final class UpdateTestSuiteEntity extends UpdateTypedEntity
<TestSuiteEntityModel
    , UpdateTestSuiteEntity    > {
    UpdateTestSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites", entityId);
    }
    }

                public final class DeleteTestSuiteEntities extends DeleteTypedEntities
<TestSuiteEntityModel
    , DeleteTestSuiteEntities    > {
    DeleteTestSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites");
    }
    }

        public final class DeleteTestSuiteEntity extends DeleteTypedEntity
<TestSuiteEntityModel
        > {
    DeleteTestSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteEntityModel.class, octaneHttpClient, baseDomain + "test_suites", entityId);
    }
    }

    }
