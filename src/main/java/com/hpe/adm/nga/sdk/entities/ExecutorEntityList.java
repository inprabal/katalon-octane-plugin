package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ExecutorEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ExecutorEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , SUBTYPE("subtype")
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
                    , SUBTYPE("subtype")
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
    public ExecutorEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ExecutorEntities at(String entityId) {
        return new ExecutorEntities(entityId);
    }


            public GetExecutorEntities get() {
        return new GetExecutorEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the ExecutorEntities object(An object that represent one ExecutorEntity )
    */
    public class ExecutorEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ExecutorEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetExecutorEntity object with specific entity
        *
* @return The GetExecutorEntity object
*/
public GetExecutorEntity get() {
return new GetExecutorEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetExecutorEntities extends GetTypedEntities
<ExecutorEntityModel
    , GetExecutorEntities    , AvailableFields, SortableFields> {
    GetExecutorEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ExecutorEntityModel.class, octaneHttpClient, baseDomain + "executors");
    }
    }

        public final class GetExecutorEntity extends GetTypedEntity
<ExecutorEntityModel
    , GetExecutorEntity    , AvailableFields> {
    GetExecutorEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ExecutorEntityModel.class, octaneHttpClient, baseDomain + "executors", entityId);
    }
    }

                }
