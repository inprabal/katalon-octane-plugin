package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.AttachmentEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class AttachmentEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , OWNERWORKITEM("owner_work_item")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , OWNERRELEASE("owner_release")
                    , OWNERPLANNINGINFO("owner_planning_info")
                    , OWNERREQUIREMENT("owner_requirement")
                    , LASTMODIFIED("last_modified")
                    , OWNERMILESTONE("owner_milestone")
                    , OWNERPRODUCTAREA("owner_product_area")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , OWNERTASK("owner_task")
                    , OWNERTEST("owner_test")
                    , OWNERRUNSTEP("owner_run_step")
                    , OWNERRUN("owner_run")
                    , SIZE("size")
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
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
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
    public AttachmentEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public AttachmentEntities at(String entityId) {
        return new AttachmentEntities(entityId);
    }


            public GetAttachmentEntities get() {
        return new GetAttachmentEntities(octaneHttpClient, baseDomain);
    }

                public CreateAttachmentEntities create() {
        return new CreateAttachmentEntities(octaneHttpClient, baseDomain);
    }

                public UpdateAttachmentEntities update() {
        return new UpdateAttachmentEntities(octaneHttpClient, baseDomain);
    }

                public DeleteAttachmentEntities delete() {
        return new DeleteAttachmentEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the AttachmentEntities object(An object that represent one AttachmentEntity )
    */
    public class AttachmentEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        AttachmentEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetAttachmentEntity object with specific entity
        *
* @return The GetAttachmentEntity object
*/
public GetAttachmentEntity get() {
return new GetAttachmentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateAttachmentEntity object with specific entity
        *
* @return The UpdateAttachmentEntity object
*/
public UpdateAttachmentEntity update() {
return new UpdateAttachmentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteAttachmentEntity object with specific entity
        *
* @return The DeleteAttachmentEntity object
*/
public DeleteAttachmentEntity delete() {
return new DeleteAttachmentEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetAttachmentEntities extends GetTypedEntities
<AttachmentEntityModel
    , GetAttachmentEntities    , AvailableFields, SortableFields> {
    GetAttachmentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments");
    }
    }

        public final class GetAttachmentEntity extends GetTypedEntity
<AttachmentEntityModel
    , GetAttachmentEntity    , AvailableFields> {
    GetAttachmentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments", entityId);
    }
    }

                public final class CreateAttachmentEntities extends CreateTypedEntities
<AttachmentEntityModel
    , CreateAttachmentEntities    > {
    CreateAttachmentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments");
    }
    }

                public final class UpdateAttachmentEntities extends UpdateTypedEntities
<AttachmentEntityModel
    , UpdateAttachmentEntities    > {
    UpdateAttachmentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments");
    }
    }

        public final class UpdateAttachmentEntity extends UpdateTypedEntity
<AttachmentEntityModel
    , UpdateAttachmentEntity    > {
    UpdateAttachmentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments", entityId);
    }
    }

                public final class DeleteAttachmentEntities extends DeleteTypedEntities
<AttachmentEntityModel
    , DeleteAttachmentEntities    > {
    DeleteAttachmentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments");
    }
    }

        public final class DeleteAttachmentEntity extends DeleteTypedEntity
<AttachmentEntityModel
        > {
    DeleteAttachmentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(AttachmentEntityModel.class, octaneHttpClient, baseDomain + "attachments", entityId);
    }
    }

    }
