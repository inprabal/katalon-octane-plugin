package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestSuiteLinkToGherkinEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestSuiteLinkToGherkinEntityList extends TypedEntityList {

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
    public TestSuiteLinkToGherkinEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestSuiteLinkToGherkinEntities at(String entityId) {
        return new TestSuiteLinkToGherkinEntities(entityId);
    }


            public GetTestSuiteLinkToGherkinEntities get() {
        return new GetTestSuiteLinkToGherkinEntities(octaneHttpClient, baseDomain);
    }

                public CreateTestSuiteLinkToGherkinEntities create() {
        return new CreateTestSuiteLinkToGherkinEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTestSuiteLinkToGherkinEntities update() {
        return new UpdateTestSuiteLinkToGherkinEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTestSuiteLinkToGherkinEntities delete() {
        return new DeleteTestSuiteLinkToGherkinEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TestSuiteLinkToGherkinEntities object(An object that represent one TestSuiteLinkToGherkinEntity )
    */
    public class TestSuiteLinkToGherkinEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestSuiteLinkToGherkinEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestSuiteLinkToGherkinEntity object with specific entity
        *
* @return The GetTestSuiteLinkToGherkinEntity object
*/
public GetTestSuiteLinkToGherkinEntity get() {
return new GetTestSuiteLinkToGherkinEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestSuiteLinkToGherkinEntity object with specific entity
        *
* @return The UpdateTestSuiteLinkToGherkinEntity object
*/
public UpdateTestSuiteLinkToGherkinEntity update() {
return new UpdateTestSuiteLinkToGherkinEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTestSuiteLinkToGherkinEntity object with specific entity
        *
* @return The DeleteTestSuiteLinkToGherkinEntity object
*/
public DeleteTestSuiteLinkToGherkinEntity delete() {
return new DeleteTestSuiteLinkToGherkinEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestSuiteLinkToGherkinEntities extends GetTypedEntities
<TestSuiteLinkToGherkinEntityModel
    , GetTestSuiteLinkToGherkinEntities    , AvailableFields, SortableFields> {
    GetTestSuiteLinkToGherkinEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests");
    }
    }

        public final class GetTestSuiteLinkToGherkinEntity extends GetTypedEntity
<TestSuiteLinkToGherkinEntityModel
    , GetTestSuiteLinkToGherkinEntity    , AvailableFields> {
    GetTestSuiteLinkToGherkinEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests", entityId);
    }
    }

                public final class CreateTestSuiteLinkToGherkinEntities extends CreateTypedEntities
<TestSuiteLinkToGherkinEntityModel
    , CreateTestSuiteLinkToGherkinEntities    > {
    CreateTestSuiteLinkToGherkinEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests");
    }
    }

                public final class UpdateTestSuiteLinkToGherkinEntities extends UpdateTypedEntities
<TestSuiteLinkToGherkinEntityModel
    , UpdateTestSuiteLinkToGherkinEntities    > {
    UpdateTestSuiteLinkToGherkinEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests");
    }
    }

        public final class UpdateTestSuiteLinkToGherkinEntity extends UpdateTypedEntity
<TestSuiteLinkToGherkinEntityModel
    , UpdateTestSuiteLinkToGherkinEntity    > {
    UpdateTestSuiteLinkToGherkinEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests", entityId);
    }
    }

                public final class DeleteTestSuiteLinkToGherkinEntities extends DeleteTypedEntities
<TestSuiteLinkToGherkinEntityModel
    , DeleteTestSuiteLinkToGherkinEntities    > {
    DeleteTestSuiteLinkToGherkinEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests");
    }
    }

        public final class DeleteTestSuiteLinkToGherkinEntity extends DeleteTypedEntity
<TestSuiteLinkToGherkinEntityModel
        > {
    DeleteTestSuiteLinkToGherkinEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestSuiteLinkToGherkinEntityModel.class, octaneHttpClient, baseDomain + "test_suite_link_to_gherkin_tests", entityId);
    }
    }

    }
