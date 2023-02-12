package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestManualEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestManualEntityList extends TypedEntityList {

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
                    , PHASE("phase")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , ESTIMATEDDURATION("estimated_duration")
                    , LASTRUNS("last_runs")
                    , USERTAGS("user_tags")
                    , LINKTOTEST("link_to_test")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , AUTOMATIONSTATUS("automation_status")
                    , COVERINGAUTOMATEDTEST("covering_automated_test")
                    , ATTACHMENTS("attachments")
                    , DESCRIPTION("description")
                    , STEPSNUM("steps_num")
                    , OWNER("owner")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , QUALITYSTORIES("quality_stories")
                    , DESIGNER("designer")
                    , COVEREDREQUIREMENT("covered_requirement")
                    , TESTTYPE("test_type")
                    , MODIFIEDBY("modified_by")
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
                    , PHASE("phase")
                    , AUTHOR("author")
                    , ESTIMATEDDURATION("estimated_duration")
                    , NAME("name")
                    , AUTOMATIONSTATUS("automation_status")
                    , STEPSNUM("steps_num")
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
    public TestManualEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestManualEntities at(String entityId) {
        return new TestManualEntities(entityId);
    }


            public GetTestManualEntities get() {
        return new GetTestManualEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestManualEntities create() {
        return new CreateTestManualEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestManualEntities update() {
        return new UpdateTestManualEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestManualEntities delete() {
        return new DeleteTestManualEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestManualEntities object(An object that represent one TestManualEntity )
    */
    public class TestManualEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestManualEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestManualEntity object with specific entity
        *
* @return The GetTestManualEntity object
*/
public GetTestManualEntity get() {
return new GetTestManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestManualEntity object with specific entity
        *
* @return The UpdateTestManualEntity object
*/
public UpdateTestManualEntity update() {
return new UpdateTestManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestManualEntity object with specific entity
        *
* @return The DeleteTestManualEntity object
*/
public DeleteTestManualEntity delete() {
return new DeleteTestManualEntity(octaneHttpClient, baseDomain, entityId);
}

/**
* An instance of {@link TestStepList} for access to the script of the test
* @return Instance of TestStepList
*/
public com.hpe.adm.nga.sdk.manualtests.TestStepList getTestSteps() {
return new com.hpe.adm.nga.sdk.manualtests.TestStepList(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestManualEntities extends GetTypedEntities
<TestManualEntityModel
    , GetTestManualEntities    , AvailableFields, SortableFields> {
    GetTestManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests");
    }
    }

        public final class GetTestManualEntity extends GetTypedEntity
<TestManualEntityModel
    , GetTestManualEntity    , AvailableFields> {
    GetTestManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests", entityId);
    }
    }

                public final class CreateTestManualEntities extends CreateTypedEntities
<TestManualEntityModel
    , CreateTestManualEntities    > {
    CreateTestManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests");
    }
    }

                public final class UpdateTestManualEntities extends UpdateTypedEntities
<TestManualEntityModel
    , UpdateTestManualEntities    > {
    UpdateTestManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests");
    }
    }

        public final class UpdateTestManualEntity extends UpdateTypedEntity
<TestManualEntityModel
    , UpdateTestManualEntity    > {
    UpdateTestManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests", entityId);
    }
    }

                public final class DeleteTestManualEntities extends DeleteTypedEntities
<TestManualEntityModel
    , DeleteTestManualEntities    > {
    DeleteTestManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests");
    }
    }

        public final class DeleteTestManualEntity extends DeleteTypedEntity
<TestManualEntityModel
        > {
    DeleteTestManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestManualEntityModel.class, octaneHttpClient, baseDomain + "manual_tests", entityId);
    }
    }

    }
