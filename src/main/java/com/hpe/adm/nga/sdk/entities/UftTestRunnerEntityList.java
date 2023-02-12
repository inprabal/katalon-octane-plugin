package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.UftTestRunnerEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class UftTestRunnerEntityList extends TypedEntityList {

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
    public UftTestRunnerEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public UftTestRunnerEntities at(String entityId) {
        return new UftTestRunnerEntities(entityId);
    }


            public GetUftTestRunnerEntities get() {
        return new GetUftTestRunnerEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the UftTestRunnerEntities object(An object that represent one UftTestRunnerEntity )
    */
    public class UftTestRunnerEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        UftTestRunnerEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetUftTestRunnerEntity object with specific entity
        *
* @return The GetUftTestRunnerEntity object
*/
public GetUftTestRunnerEntity get() {
return new GetUftTestRunnerEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetUftTestRunnerEntities extends GetTypedEntities
<UftTestRunnerEntityModel
    , GetUftTestRunnerEntities    , AvailableFields, SortableFields> {
    GetUftTestRunnerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(UftTestRunnerEntityModel.class, octaneHttpClient, baseDomain + "uft_test_runners");
    }
    }

        public final class GetUftTestRunnerEntity extends GetTypedEntity
<UftTestRunnerEntityModel
    , GetUftTestRunnerEntity    , AvailableFields> {
    GetUftTestRunnerEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(UftTestRunnerEntityModel.class, octaneHttpClient, baseDomain + "uft_test_runners", entityId);
    }
    }

                }
