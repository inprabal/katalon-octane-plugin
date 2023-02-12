package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestSuiteLinkToTestEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestSuiteLinkToTestEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , INCLUDEINNEXTRUN("include_in_next_run")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , ORDER("order")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , COVEREDWORKITEM("covered_workitem")
                    , SUBTYPE("subtype")
                    , TESTSUITE("test_suite")
                    , RUNMODE("run_mode")
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
                    , INCLUDEINNEXTRUN("include_in_next_run")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , ORDER("order")
                    , AUTHOR("author")
                    , SUBTYPE("subtype")
                    , RUNMODE("run_mode")
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
    public TestSuiteLinkToTestEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestSuiteLinkToTestEntities at(String entityId) {
        return new TestSuiteLinkToTestEntities(entityId);
    }


            public GetTestSuiteLinkToTestEntities get() {
        return new GetTestSuiteLinkToTestEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestSuiteLinkToTestEntities create() {
        return new CreateTestSuiteLinkToTestEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestSuiteLinkToTestEntities update() {
        return new UpdateTestSuiteLinkToTestEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestSuiteLinkToTestEntities delete() {
        return new DeleteTestSuiteLinkToTestEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestSuiteLinkToTestEntities object(An object that represent one TestSuiteLinkToTestEntity )
    */
    public class TestSuiteLinkToTestEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestSuiteLinkToTestEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestSuiteLinkToTestEntity object with specific entity
        *
* @return The GetTestSuiteLinkToTestEntity object
*/
public GetTestSuiteLinkToTestEntity get() {
return new GetTestSuiteLinkToTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestSuiteLinkToTestEntity object with specific entity
        *
* @return The UpdateTestSuiteLinkToTestEntity object
*/
public UpdateTestSuiteLinkToTestEntity update() {
return new UpdateTestSuiteLinkToTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestSuiteLinkToTestEntity object with specific entity
        *
* @return The DeleteTestSuiteLinkToTestEntity object
*/
public DeleteTestSuiteLinkToTestEntity delete() {
return new DeleteTestSuiteLinkToTestEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestSuiteLinkToTestEntities extends GetTypedEntities
<TestSuiteLinkToTestEntityModel
    , GetTestSuiteLinkToTestEntities    , AvailableFields, SortableFields> {
    GetTestSuiteLinkToTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests");
    }
    }

        public final class GetTestSuiteLinkToTestEntity extends GetTypedEntity
<TestSuiteLinkToTestEntityModel
    , GetTestSuiteLinkToTestEntity    , AvailableFields> {
    GetTestSuiteLinkToTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests", entityId);
    }
    }

                public final class CreateTestSuiteLinkToTestEntities extends CreateTypedEntities
<TestSuiteLinkToTestEntityModel
    , CreateTestSuiteLinkToTestEntities    > {
    CreateTestSuiteLinkToTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests");
    }
    }

                public final class UpdateTestSuiteLinkToTestEntities extends UpdateTypedEntities
<TestSuiteLinkToTestEntityModel
    , UpdateTestSuiteLinkToTestEntities    > {
    UpdateTestSuiteLinkToTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests");
    }
    }

        public final class UpdateTestSuiteLinkToTestEntity extends UpdateTypedEntity
<TestSuiteLinkToTestEntityModel
    , UpdateTestSuiteLinkToTestEntity    > {
    UpdateTestSuiteLinkToTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests", entityId);
    }
    }

                public final class DeleteTestSuiteLinkToTestEntities extends DeleteTypedEntities
<TestSuiteLinkToTestEntityModel
    , DeleteTestSuiteLinkToTestEntities    > {
    DeleteTestSuiteLinkToTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests");
    }
    }

        public final class DeleteTestSuiteLinkToTestEntity extends DeleteTypedEntity
<TestSuiteLinkToTestEntityModel
        > {
    DeleteTestSuiteLinkToTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToTestEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_tests", entityId);
    }
    }

    }
