package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestSuiteLinkToAutomatedEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestSuiteLinkToAutomatedEntityList extends TypedEntityList {

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
    public TestSuiteLinkToAutomatedEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestSuiteLinkToAutomatedEntities at(String entityId) {
        return new TestSuiteLinkToAutomatedEntities(entityId);
    }


            public GetTestSuiteLinkToAutomatedEntities get() {
        return new GetTestSuiteLinkToAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestSuiteLinkToAutomatedEntities create() {
        return new CreateTestSuiteLinkToAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestSuiteLinkToAutomatedEntities update() {
        return new UpdateTestSuiteLinkToAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestSuiteLinkToAutomatedEntities delete() {
        return new DeleteTestSuiteLinkToAutomatedEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestSuiteLinkToAutomatedEntities object(An object that represent one TestSuiteLinkToAutomatedEntity )
    */
    public class TestSuiteLinkToAutomatedEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestSuiteLinkToAutomatedEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestSuiteLinkToAutomatedEntity object with specific entity
        *
* @return The GetTestSuiteLinkToAutomatedEntity object
*/
public GetTestSuiteLinkToAutomatedEntity get() {
return new GetTestSuiteLinkToAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestSuiteLinkToAutomatedEntity object with specific entity
        *
* @return The UpdateTestSuiteLinkToAutomatedEntity object
*/
public UpdateTestSuiteLinkToAutomatedEntity update() {
return new UpdateTestSuiteLinkToAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestSuiteLinkToAutomatedEntity object with specific entity
        *
* @return The DeleteTestSuiteLinkToAutomatedEntity object
*/
public DeleteTestSuiteLinkToAutomatedEntity delete() {
return new DeleteTestSuiteLinkToAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestSuiteLinkToAutomatedEntities extends GetTypedEntities
<TestSuiteLinkToAutomatedEntityModel
    , GetTestSuiteLinkToAutomatedEntities    , AvailableFields, SortableFields> {
    GetTestSuiteLinkToAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests");
    }
    }

        public final class GetTestSuiteLinkToAutomatedEntity extends GetTypedEntity
<TestSuiteLinkToAutomatedEntityModel
    , GetTestSuiteLinkToAutomatedEntity    , AvailableFields> {
    GetTestSuiteLinkToAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests", entityId);
    }
    }

                public final class CreateTestSuiteLinkToAutomatedEntities extends CreateTypedEntities
<TestSuiteLinkToAutomatedEntityModel
    , CreateTestSuiteLinkToAutomatedEntities    > {
    CreateTestSuiteLinkToAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests");
    }
    }

                public final class UpdateTestSuiteLinkToAutomatedEntities extends UpdateTypedEntities
<TestSuiteLinkToAutomatedEntityModel
    , UpdateTestSuiteLinkToAutomatedEntities    > {
    UpdateTestSuiteLinkToAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests");
    }
    }

        public final class UpdateTestSuiteLinkToAutomatedEntity extends UpdateTypedEntity
<TestSuiteLinkToAutomatedEntityModel
    , UpdateTestSuiteLinkToAutomatedEntity    > {
    UpdateTestSuiteLinkToAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests", entityId);
    }
    }

                public final class DeleteTestSuiteLinkToAutomatedEntities extends DeleteTypedEntities
<TestSuiteLinkToAutomatedEntityModel
    , DeleteTestSuiteLinkToAutomatedEntities    > {
    DeleteTestSuiteLinkToAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests");
    }
    }

        public final class DeleteTestSuiteLinkToAutomatedEntity extends DeleteTypedEntity
<TestSuiteLinkToAutomatedEntityModel
        > {
    DeleteTestSuiteLinkToAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToAutomatedEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_automated_tests", entityId);
    }
    }

    }
