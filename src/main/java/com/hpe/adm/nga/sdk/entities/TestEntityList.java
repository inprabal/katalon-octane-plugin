package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , ESTIMATEDDURATION("estimated_duration")
                    , USERTAGS("user_tags")
                    , LINKTOTEST("link_to_test")
                    , AUTOMATIONSTATUS("automation_status")
                    , ATTACHMENTS("attachments")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , LINKTOTESTSUITE("link_to_test_suite")
                    , HASATTACHMENTS("has_attachments")
                    , QUALITYSTORIES("quality_stories")
                    , TESTLEVEL("test_level")
                    , TESTTYPE("test_type")
                    , COMPONENT("component")
                    , FRAMEWORK("framework")
                    , MODIFIEDBY("modified_by")
                    , TESTRUNNER("test_runner")
                    , COVEREDCONTENT("covered_content")
                    , BACKLOGCOVERAGE("backlog_coverage")
                    , RUN("run")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , LASTRUNS("last_runs")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , DESCRIPTION("description")
                    , SUBTYPE("subtype")
                    , OWNER("owner")
                    , COMMENTS("comments")
                    , DESIGNER("designer")
                    , COVEREDREQUIREMENT("covered_requirement")
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
                    , ESTIMATEDDURATION("estimated_duration")
                    , AUTOMATIONSTATUS("automation_status")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , TESTLEVEL("test_level")
                    , COMPONENT("component")
                    , FRAMEWORK("framework")
                    , MODIFIEDBY("modified_by")
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , NAME("name")
                    , SUBTYPE("subtype")
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
    public TestEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestEntities at(String entityId) {
        return new TestEntities(entityId);
    }


            public GetTestEntities get() {
        return new GetTestEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestEntities create() {
        return new CreateTestEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestEntities update() {
        return new UpdateTestEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestEntities delete() {
        return new DeleteTestEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestEntities object(An object that represent one TestEntity )
    */
    public class TestEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestEntity object with specific entity
        *
* @return The GetTestEntity object
*/
public GetTestEntity get() {
return new GetTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestEntity object with specific entity
        *
* @return The UpdateTestEntity object
*/
public UpdateTestEntity update() {
return new UpdateTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestEntity object with specific entity
        *
* @return The DeleteTestEntity object
*/
public DeleteTestEntity delete() {
return new DeleteTestEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestEntities extends GetTypedEntities
<TestEntityModel
    , GetTestEntities    , AvailableFields, SortableFields> {
    GetTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests");
    }
    }

        public final class GetTestEntity extends GetTypedEntity
<TestEntityModel
    , GetTestEntity    , AvailableFields> {
    GetTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests", entityId);
    }
    }

                public final class CreateTestEntities extends CreateTypedEntities
<TestEntityModel
    , CreateTestEntities    > {
    CreateTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests");
    }
    }

                public final class UpdateTestEntities extends UpdateTypedEntities
<TestEntityModel
    , UpdateTestEntities    > {
    UpdateTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests");
    }
    }

        public final class UpdateTestEntity extends UpdateTypedEntity
<TestEntityModel
    , UpdateTestEntity    > {
    UpdateTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests", entityId);
    }
    }

                public final class DeleteTestEntities extends DeleteTypedEntities
<TestEntityModel
    , DeleteTestEntities    > {
    DeleteTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests");
    }
    }

        public final class DeleteTestEntity extends DeleteTypedEntity
<TestEntityModel
        > {
    DeleteTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestEntityModel.class, octaneHttpClient, baseDomain + "tests", entityId);
    }
    }

    }
