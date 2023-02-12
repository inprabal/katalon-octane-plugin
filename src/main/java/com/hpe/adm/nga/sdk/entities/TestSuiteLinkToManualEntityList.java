package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestSuiteLinkToManualEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestSuiteLinkToManualEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , INCLUDEINNEXTRUN("include_in_next_run")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , ORDER("order")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TESTSUITE("test_suite")
                    , TEST("test")
                    , AUTHOR("author")
                    , COVEREDWORKITEM("covered_workitem")
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
    public TestSuiteLinkToManualEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestSuiteLinkToManualEntities at(String entityId) {
        return new TestSuiteLinkToManualEntities(entityId);
    }


            public GetTestSuiteLinkToManualEntities get() {
        return new GetTestSuiteLinkToManualEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestSuiteLinkToManualEntities create() {
        return new CreateTestSuiteLinkToManualEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestSuiteLinkToManualEntities update() {
        return new UpdateTestSuiteLinkToManualEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestSuiteLinkToManualEntities delete() {
        return new DeleteTestSuiteLinkToManualEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestSuiteLinkToManualEntities object(An object that represent one TestSuiteLinkToManualEntity )
    */
    public class TestSuiteLinkToManualEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestSuiteLinkToManualEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestSuiteLinkToManualEntity object with specific entity
        *
* @return The GetTestSuiteLinkToManualEntity object
*/
public GetTestSuiteLinkToManualEntity get() {
return new GetTestSuiteLinkToManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestSuiteLinkToManualEntity object with specific entity
        *
* @return The UpdateTestSuiteLinkToManualEntity object
*/
public UpdateTestSuiteLinkToManualEntity update() {
return new UpdateTestSuiteLinkToManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestSuiteLinkToManualEntity object with specific entity
        *
* @return The DeleteTestSuiteLinkToManualEntity object
*/
public DeleteTestSuiteLinkToManualEntity delete() {
return new DeleteTestSuiteLinkToManualEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestSuiteLinkToManualEntities extends GetTypedEntities
<TestSuiteLinkToManualEntityModel
    , GetTestSuiteLinkToManualEntities    , AvailableFields, SortableFields> {
    GetTestSuiteLinkToManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests");
    }
    }

        public final class GetTestSuiteLinkToManualEntity extends GetTypedEntity
<TestSuiteLinkToManualEntityModel
    , GetTestSuiteLinkToManualEntity    , AvailableFields> {
    GetTestSuiteLinkToManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests", entityId);
    }
    }

                public final class CreateTestSuiteLinkToManualEntities extends CreateTypedEntities
<TestSuiteLinkToManualEntityModel
    , CreateTestSuiteLinkToManualEntities    > {
    CreateTestSuiteLinkToManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests");
    }
    }

                public final class UpdateTestSuiteLinkToManualEntities extends UpdateTypedEntities
<TestSuiteLinkToManualEntityModel
    , UpdateTestSuiteLinkToManualEntities    > {
    UpdateTestSuiteLinkToManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests");
    }
    }

        public final class UpdateTestSuiteLinkToManualEntity extends UpdateTypedEntity
<TestSuiteLinkToManualEntityModel
    , UpdateTestSuiteLinkToManualEntity    > {
    UpdateTestSuiteLinkToManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests", entityId);
    }
    }

                public final class DeleteTestSuiteLinkToManualEntities extends DeleteTypedEntities
<TestSuiteLinkToManualEntityModel
    , DeleteTestSuiteLinkToManualEntities    > {
    DeleteTestSuiteLinkToManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests");
    }
    }

        public final class DeleteTestSuiteLinkToManualEntity extends DeleteTypedEntity
<TestSuiteLinkToManualEntityModel
        > {
    DeleteTestSuiteLinkToManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToManualEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_manual_tests", entityId);
    }
    }

    }
