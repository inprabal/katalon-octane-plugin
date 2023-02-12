package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestRunnerEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestRunnerEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , NAME("name")
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
                    , LASTMODIFIED("last_modified")
                    , NAME("name")
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
    public TestRunnerEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestRunnerEntities at(String entityId) {
        return new TestRunnerEntities(entityId);
    }


            public GetTestRunnerEntities get() {
        return new GetTestRunnerEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the TestRunnerEntities object(An object that represent one TestRunnerEntity )
    */
    public class TestRunnerEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestRunnerEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestRunnerEntity object with specific entity
        *
* @return The GetTestRunnerEntity object
*/
public GetTestRunnerEntity get() {
return new GetTestRunnerEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestRunnerEntities extends GetTypedEntities
<TestRunnerEntityModel
    , GetTestRunnerEntities    , AvailableFields, SortableFields> {
    GetTestRunnerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestRunnerEntityModel.class, octaneHttpClient, baseDomain + "test_runners");
    }
    }

        public final class GetTestRunnerEntity extends GetTypedEntity
<TestRunnerEntityModel
    , GetTestRunnerEntity    , AvailableFields> {
    GetTestRunnerEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestRunnerEntityModel.class, octaneHttpClient, baseDomain + "test_runners", entityId);
    }
    }

                }
