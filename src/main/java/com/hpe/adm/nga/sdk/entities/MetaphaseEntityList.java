package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.MetaphaseEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class MetaphaseEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    PHASE("phase")
                    , CREATIONTIME("creation_time")
                    , ISSYSTEM("is_system")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
                    , ENTITY("entity")
                    , ORDER("order")
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
                    , ISSYSTEM("is_system")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , ENTITY("entity")
                    , ORDER("order")
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
    public MetaphaseEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public MetaphaseEntities at(String entityId) {
        return new MetaphaseEntities(entityId);
    }


            public GetMetaphaseEntities get() {
        return new GetMetaphaseEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the MetaphaseEntities object(An object that represent one MetaphaseEntity )
    */
    public class MetaphaseEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        MetaphaseEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetMetaphaseEntity object with specific entity
        *
* @return The GetMetaphaseEntity object
*/
public GetMetaphaseEntity get() {
return new GetMetaphaseEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetMetaphaseEntities extends GetTypedEntities
<MetaphaseEntityModel
    , GetMetaphaseEntities    , AvailableFields, SortableFields> {
    GetMetaphaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(MetaphaseEntityModel.class, octaneHttpClient, baseDomain + "metaphases");
    }
    }

        public final class GetMetaphaseEntity extends GetTypedEntity
<MetaphaseEntityModel
    , GetMetaphaseEntity    , AvailableFields> {
    GetMetaphaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(MetaphaseEntityModel.class, octaneHttpClient, baseDomain + "metaphases", entityId);
    }
    }

                }
