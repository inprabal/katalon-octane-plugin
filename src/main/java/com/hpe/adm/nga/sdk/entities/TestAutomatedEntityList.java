package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestAutomatedEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestAutomatedEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    TESTRUNNER("test_runner")
                    , CREATIONTIME("creation_time")
                    , COVEREDCONTENT("covered_content")
                    , BACKLOGCOVERAGE("backlog_coverage")
                    , VERSIONSTAMP("version_stamp")
                    , RUN("run")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , LASTRUNS("last_runs")
                    , USERTAGS("user_tags")
                    , LINKTOTEST("link_to_test")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , ATTACHMENTS("attachments")
                    , DESCRIPTION("description")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , OWNER("owner")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , TESTLEVEL("test_level")
                    , QUALITYSTORIES("quality_stories")
                    , DESIGNER("designer")
                    , COVEREDREQUIREMENT("covered_requirement")
                    , TESTTYPE("test_type")
                    , COMPONENT("component")
                    , FRAMEWORK("framework")
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
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , NAME("name")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , OWNER("owner")
                    , TESTLEVEL("test_level")
                    , DESIGNER("designer")
                    , COMPONENT("component")
                    , FRAMEWORK("framework")
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
    public TestAutomatedEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestAutomatedEntities at(String entityId) {
        return new TestAutomatedEntities(entityId);
    }


            public GetTestAutomatedEntities get() {
        return new GetTestAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestAutomatedEntities create() {
        return new CreateTestAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestAutomatedEntities update() {
        return new UpdateTestAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestAutomatedEntities delete() {
        return new DeleteTestAutomatedEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestAutomatedEntities object(An object that represent one TestAutomatedEntity )
    */
    public class TestAutomatedEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestAutomatedEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestAutomatedEntity object with specific entity
        *
* @return The GetTestAutomatedEntity object
*/
public GetTestAutomatedEntity get() {
return new GetTestAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestAutomatedEntity object with specific entity
        *
* @return The UpdateTestAutomatedEntity object
*/
public UpdateTestAutomatedEntity update() {
return new UpdateTestAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestAutomatedEntity object with specific entity
        *
* @return The DeleteTestAutomatedEntity object
*/
public DeleteTestAutomatedEntity delete() {
return new DeleteTestAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestAutomatedEntities extends GetTypedEntities
<TestAutomatedEntityModel
    , GetTestAutomatedEntities    , AvailableFields, SortableFields> {
    GetTestAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests");
    }
    }

        public final class GetTestAutomatedEntity extends GetTypedEntity
<TestAutomatedEntityModel
    , GetTestAutomatedEntity    , AvailableFields> {
    GetTestAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests", entityId);
    }
    }

                public final class CreateTestAutomatedEntities extends CreateTypedEntities
<TestAutomatedEntityModel
    , CreateTestAutomatedEntities    > {
    CreateTestAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests");
    }
    }

                public final class UpdateTestAutomatedEntities extends UpdateTypedEntities
<TestAutomatedEntityModel
    , UpdateTestAutomatedEntities    > {
    UpdateTestAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests");
    }
    }

        public final class UpdateTestAutomatedEntity extends UpdateTypedEntity
<TestAutomatedEntityModel
    , UpdateTestAutomatedEntity    > {
    UpdateTestAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests", entityId);
    }
    }

                public final class DeleteTestAutomatedEntities extends DeleteTypedEntities
<TestAutomatedEntityModel
    , DeleteTestAutomatedEntities    > {
    DeleteTestAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests");
    }
    }

        public final class DeleteTestAutomatedEntity extends DeleteTypedEntity
<TestAutomatedEntityModel
        > {
    DeleteTestAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_tests", entityId);
    }
    }

    }
