package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.PipelineNodeEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class PipelineNodeEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , CIBUILDS("ci_builds")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PIPELINE("pipeline")
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
    public PipelineNodeEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public PipelineNodeEntities at(String entityId) {
        return new PipelineNodeEntities(entityId);
    }


            public GetPipelineNodeEntities get() {
        return new GetPipelineNodeEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the PipelineNodeEntities object(An object that represent one PipelineNodeEntity )
    */
    public class PipelineNodeEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        PipelineNodeEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetPipelineNodeEntity object with specific entity
        *
* @return The GetPipelineNodeEntity object
*/
public GetPipelineNodeEntity get() {
return new GetPipelineNodeEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetPipelineNodeEntities extends GetTypedEntities
<PipelineNodeEntityModel
    , GetPipelineNodeEntities    , AvailableFields, SortableFields> {
    GetPipelineNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineNodeEntityModel.class, octaneHttpClient, baseDomain + "pipeline_nodes");
    }
    }

        public final class GetPipelineNodeEntity extends GetTypedEntity
<PipelineNodeEntityModel
    , GetPipelineNodeEntity    , AvailableFields> {
    GetPipelineNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PipelineNodeEntityModel.class, octaneHttpClient, baseDomain + "pipeline_nodes", entityId);
    }
    }

                }
