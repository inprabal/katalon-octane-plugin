package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.MilestoneEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class MilestoneEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    DATE("date")
                    , CREATIONTIME("creation_time")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASATTACHMENTS("has_attachments")
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
                    DATE("date")
                    , CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
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
    public MilestoneEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public MilestoneEntities at(String entityId) {
        return new MilestoneEntities(entityId);
    }


            public GetMilestoneEntities get() {
        return new GetMilestoneEntities(octaneHttpClient, baseDomain);
    }

                public CreateMilestoneEntities create() {
        return new CreateMilestoneEntities(octaneHttpClient, baseDomain);
    }

                public UpdateMilestoneEntities update() {
        return new UpdateMilestoneEntities(octaneHttpClient, baseDomain);
    }

                public DeleteMilestoneEntities delete() {
        return new DeleteMilestoneEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the MilestoneEntities object(An object that represent one MilestoneEntity )
    */
    public class MilestoneEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        MilestoneEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetMilestoneEntity object with specific entity
        *
* @return The GetMilestoneEntity object
*/
public GetMilestoneEntity get() {
return new GetMilestoneEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateMilestoneEntity object with specific entity
        *
* @return The UpdateMilestoneEntity object
*/
public UpdateMilestoneEntity update() {
return new UpdateMilestoneEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteMilestoneEntity object with specific entity
        *
* @return The DeleteMilestoneEntity object
*/
public DeleteMilestoneEntity delete() {
return new DeleteMilestoneEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetMilestoneEntities extends GetTypedEntities
<MilestoneEntityModel
    , GetMilestoneEntities    , AvailableFields, SortableFields> {
    GetMilestoneEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones");
    }
    }

        public final class GetMilestoneEntity extends GetTypedEntity
<MilestoneEntityModel
    , GetMilestoneEntity    , AvailableFields> {
    GetMilestoneEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones", entityId);
    }
    }

                public final class CreateMilestoneEntities extends CreateTypedEntities
<MilestoneEntityModel
    , CreateMilestoneEntities    > {
    CreateMilestoneEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones");
    }
    }

                public final class UpdateMilestoneEntities extends UpdateTypedEntities
<MilestoneEntityModel
    , UpdateMilestoneEntities    > {
    UpdateMilestoneEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones");
    }
    }

        public final class UpdateMilestoneEntity extends UpdateTypedEntity
<MilestoneEntityModel
    , UpdateMilestoneEntity    > {
    UpdateMilestoneEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones", entityId);
    }
    }

                public final class DeleteMilestoneEntities extends DeleteTypedEntities
<MilestoneEntityModel
    , DeleteMilestoneEntities    > {
    DeleteMilestoneEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones");
    }
    }

        public final class DeleteMilestoneEntity extends DeleteTypedEntity
<MilestoneEntityModel
        > {
    DeleteMilestoneEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(MilestoneEntityModel.class, octaneHttpClient, baseDomain + "milestones", entityId);
    }
    }

    }
