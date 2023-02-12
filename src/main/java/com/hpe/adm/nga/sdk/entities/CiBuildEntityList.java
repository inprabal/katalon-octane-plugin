package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.CiBuildEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class CiBuildEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , RESULT("result")
                    , DURATION("duration")
                    , PIPELINENODE("pipeline_node")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PIPELINERUN("pipeline_run")
                    , ESTIMATEDDURATION("estimated_duration")
                    , CONSOLELOG("console_log")
                    , STARTTIME("start_time")
                    , NAME("name")
                    , COMMITS("commits")
                    , STATUS("status")
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
                    , RESULT("result")
                    , DURATION("duration")
                    , LASTMODIFIED("last_modified")
                    , ESTIMATEDDURATION("estimated_duration")
                    , STARTTIME("start_time")
                    , NAME("name")
                    , STATUS("status")
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
    public CiBuildEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public CiBuildEntities at(String entityId) {
        return new CiBuildEntities(entityId);
    }


            public GetCiBuildEntities get() {
        return new GetCiBuildEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the CiBuildEntities object(An object that represent one CiBuildEntity )
    */
    public class CiBuildEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        CiBuildEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetCiBuildEntity object with specific entity
        *
* @return The GetCiBuildEntity object
*/
public GetCiBuildEntity get() {
return new GetCiBuildEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetCiBuildEntities extends GetTypedEntities
<CiBuildEntityModel
    , GetCiBuildEntities    , AvailableFields, SortableFields> {
    GetCiBuildEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CiBuildEntityModel.class, octaneHttpClient, baseDomain + "ci_builds");
    }
    }

        public final class GetCiBuildEntity extends GetTypedEntity
<CiBuildEntityModel
    , GetCiBuildEntity    , AvailableFields> {
    GetCiBuildEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CiBuildEntityModel.class, octaneHttpClient, baseDomain + "ci_builds", entityId);
    }
    }

                }
