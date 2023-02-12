package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.CommentEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class CommentEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , OWNERWORKITEM("owner_work_item")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , TEXT("text")
                    , OWNERPLANNINGINFO("owner_planning_info")
                    , OWNERREQUIREMENT("owner_requirement")
                    , LASTMODIFIED("last_modified")
                    , OWNERPIPELINE("owner_pipeline")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , OWNERTASK("owner_task")
                    , OWNERTEST("owner_test")
                    , OWNERRUN("owner_run")
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
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , LASTMODIFIED("last_modified")
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
    public CommentEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public CommentEntities at(String entityId) {
        return new CommentEntities(entityId);
    }


            public GetCommentEntities get() {
        return new GetCommentEntities(octaneHttpClient, baseDomain);
    }

                public CreateCommentEntities create() {
        return new CreateCommentEntities(octaneHttpClient, baseDomain);
    }

                public UpdateCommentEntities update() {
        return new UpdateCommentEntities(octaneHttpClient, baseDomain);
    }

                public DeleteCommentEntities delete() {
        return new DeleteCommentEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the CommentEntities object(An object that represent one CommentEntity )
    */
    public class CommentEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        CommentEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetCommentEntity object with specific entity
        *
* @return The GetCommentEntity object
*/
public GetCommentEntity get() {
return new GetCommentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateCommentEntity object with specific entity
        *
* @return The UpdateCommentEntity object
*/
public UpdateCommentEntity update() {
return new UpdateCommentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteCommentEntity object with specific entity
        *
* @return The DeleteCommentEntity object
*/
public DeleteCommentEntity delete() {
return new DeleteCommentEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetCommentEntities extends GetTypedEntities
<CommentEntityModel
    , GetCommentEntities    , AvailableFields, SortableFields> {
    GetCommentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments");
    }
    }

        public final class GetCommentEntity extends GetTypedEntity
<CommentEntityModel
    , GetCommentEntity    , AvailableFields> {
    GetCommentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments", entityId);
    }
    }

                public final class CreateCommentEntities extends CreateTypedEntities
<CommentEntityModel
    , CreateCommentEntities    > {
    CreateCommentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments");
    }
    }

                public final class UpdateCommentEntities extends UpdateTypedEntities
<CommentEntityModel
    , UpdateCommentEntities    > {
    UpdateCommentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments");
    }
    }

        public final class UpdateCommentEntity extends UpdateTypedEntity
<CommentEntityModel
    , UpdateCommentEntity    > {
    UpdateCommentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments", entityId);
    }
    }

                public final class DeleteCommentEntities extends DeleteTypedEntities
<CommentEntityModel
    , DeleteCommentEntities    > {
    DeleteCommentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments");
    }
    }

        public final class DeleteCommentEntity extends DeleteTypedEntity
<CommentEntityModel
        > {
    DeleteCommentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CommentEntityModel.class, octaneHttpClient, baseDomain + "comments", entityId);
    }
    }

    }
