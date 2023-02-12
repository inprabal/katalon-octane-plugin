package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.PipelineEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class PipelineEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , ROOTJOBCIID("root_job_ci_id")
                    , USERTAGS("user_tags")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , CURRENTRELEASE("current_release")
                    , COMMENTS("comments")
                    , JOBS("jobs")
                    , REFERRALPIPELINE("referral_pipeline")
                    , PIPELINERUN("pipeline_run")
                    , CURRENTMILESTONE("current_milestone")
                    , NODES("nodes")
                    , CISERVER("ci_server")
                    , SERVERCIID("server_ci_id")
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
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
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
    public PipelineEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public PipelineEntities at(String entityId) {
        return new PipelineEntities(entityId);
    }


            public GetPipelineEntities get() {
        return new GetPipelineEntities(octaneHttpClient, baseDomain);
    }

                public CreatePipelineEntities create() {
        return new CreatePipelineEntities(octaneHttpClient, baseDomain);
    }

                public UpdatePipelineEntities update() {
        return new UpdatePipelineEntities(octaneHttpClient, baseDomain);
    }

                public DeletePipelineEntities delete() {
        return new DeletePipelineEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the PipelineEntities object(An object that represent one PipelineEntity )
    */
    public class PipelineEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        PipelineEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetPipelineEntity object with specific entity
        *
* @return The GetPipelineEntity object
*/
public GetPipelineEntity get() {
return new GetPipelineEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdatePipelineEntity object with specific entity
        *
* @return The UpdatePipelineEntity object
*/
public UpdatePipelineEntity update() {
return new UpdatePipelineEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeletePipelineEntity object with specific entity
        *
* @return The DeletePipelineEntity object
*/
public DeletePipelineEntity delete() {
return new DeletePipelineEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetPipelineEntities extends GetTypedEntities
<PipelineEntityModel
    , GetPipelineEntities    , AvailableFields, SortableFields> {
    GetPipelineEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines");
    }
    }

        public final class GetPipelineEntity extends GetTypedEntity
<PipelineEntityModel
    , GetPipelineEntity    , AvailableFields> {
    GetPipelineEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines", entityId);
    }
    }

                public final class CreatePipelineEntities extends CreateTypedEntities
<PipelineEntityModel
    , CreatePipelineEntities    > {
    CreatePipelineEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines");
    }
    }

                public final class UpdatePipelineEntities extends UpdateTypedEntities
<PipelineEntityModel
    , UpdatePipelineEntities    > {
    UpdatePipelineEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines");
    }
    }

        public final class UpdatePipelineEntity extends UpdateTypedEntity
<PipelineEntityModel
    , UpdatePipelineEntity    > {
    UpdatePipelineEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines", entityId);
    }
    }

                public final class DeletePipelineEntities extends DeleteTypedEntities
<PipelineEntityModel
    , DeletePipelineEntities    > {
    DeletePipelineEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines");
    }
    }

        public final class DeletePipelineEntity extends DeleteTypedEntity
<PipelineEntityModel
        > {
    DeletePipelineEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PipelineEntityModel.class, octaneHttpClient, baseDomain + "pipelines", entityId);
    }
    }

    }
