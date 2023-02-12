package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.PipelineRunEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class PipelineRunEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , SCMCOMMITS("scm_commits")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , CIBUILDS("ci_builds")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , STARTTIME("start_time")
                    , USERTAGS("user_tags")
                    , NAME("name")
                    , STATUS("status")
                    , DURATION("duration")
                    , PIPELINE("pipeline")
                    , MILESTONE("milestone")
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
                    , SCMCOMMITS("scm_commits")
                    , VERSIONSTAMP("version_stamp")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , STARTTIME("start_time")
                    , NAME("name")
                    , STATUS("status")
                    , DURATION("duration")
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
    public PipelineRunEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public PipelineRunEntities at(String entityId) {
        return new PipelineRunEntities(entityId);
    }


            public GetPipelineRunEntities get() {
        return new GetPipelineRunEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the PipelineRunEntities object(An object that represent one PipelineRunEntity )
    */
    public class PipelineRunEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        PipelineRunEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetPipelineRunEntity object with specific entity
        *
* @return The GetPipelineRunEntity object
*/
public GetPipelineRunEntity get() {
return new GetPipelineRunEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetPipelineRunEntities extends GetTypedEntities
<PipelineRunEntityModel
    , GetPipelineRunEntities    , AvailableFields, SortableFields> {
    GetPipelineRunEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineRunEntityModel.class, octaneHttpClient, baseDomain + "pipeline_runs");
    }
    }

        public final class GetPipelineRunEntity extends GetTypedEntity
<PipelineRunEntityModel
    , GetPipelineRunEntity    , AvailableFields> {
    GetPipelineRunEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PipelineRunEntityModel.class, octaneHttpClient, baseDomain + "pipeline_runs", entityId);
    }
    }

                }
