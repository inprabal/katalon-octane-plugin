package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RequirementFolderEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RequirementFolderEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , ORDERING("ordering")
                    , DESCRIPTION("description")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , USERTAGS("user_tags")
                    , HASCOMMENTS("has_comments")
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
                    , PARENT("parent")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
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
    public RequirementFolderEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RequirementFolderEntities at(String entityId) {
        return new RequirementFolderEntities(entityId);
    }


            public GetRequirementFolderEntities get() {
        return new GetRequirementFolderEntities(octaneHttpClient, baseDomain);
    }

                public CreateRequirementFolderEntities create() {
        return new CreateRequirementFolderEntities(octaneHttpClient, baseDomain);
    }

                public UpdateRequirementFolderEntities update() {
        return new UpdateRequirementFolderEntities(octaneHttpClient, baseDomain);
    }

                public DeleteRequirementFolderEntities delete() {
        return new DeleteRequirementFolderEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the RequirementFolderEntities object(An object that represent one RequirementFolderEntity )
    */
    public class RequirementFolderEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RequirementFolderEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRequirementFolderEntity object with specific entity
        *
* @return The GetRequirementFolderEntity object
*/
public GetRequirementFolderEntity get() {
return new GetRequirementFolderEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRequirementFolderEntity object with specific entity
        *
* @return The UpdateRequirementFolderEntity object
*/
public UpdateRequirementFolderEntity update() {
return new UpdateRequirementFolderEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteRequirementFolderEntity object with specific entity
        *
* @return The DeleteRequirementFolderEntity object
*/
public DeleteRequirementFolderEntity delete() {
return new DeleteRequirementFolderEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRequirementFolderEntities extends GetTypedEntities
<RequirementFolderEntityModel
    , GetRequirementFolderEntities    , AvailableFields, SortableFields> {
    GetRequirementFolderEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders");
    }
    }

        public final class GetRequirementFolderEntity extends GetTypedEntity
<RequirementFolderEntityModel
    , GetRequirementFolderEntity    , AvailableFields> {
    GetRequirementFolderEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders", entityId);
    }
    }

                public final class CreateRequirementFolderEntities extends CreateTypedEntities
<RequirementFolderEntityModel
    , CreateRequirementFolderEntities    > {
    CreateRequirementFolderEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders");
    }
    }

                public final class UpdateRequirementFolderEntities extends UpdateTypedEntities
<RequirementFolderEntityModel
    , UpdateRequirementFolderEntities    > {
    UpdateRequirementFolderEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders");
    }
    }

        public final class UpdateRequirementFolderEntity extends UpdateTypedEntity
<RequirementFolderEntityModel
    , UpdateRequirementFolderEntity    > {
    UpdateRequirementFolderEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders", entityId);
    }
    }

                public final class DeleteRequirementFolderEntities extends DeleteTypedEntities
<RequirementFolderEntityModel
    , DeleteRequirementFolderEntities    > {
    DeleteRequirementFolderEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders");
    }
    }

        public final class DeleteRequirementFolderEntity extends DeleteTypedEntity
<RequirementFolderEntityModel
        > {
    DeleteRequirementFolderEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementFolderEntityModel.class, octaneHttpClient, baseDomain + "requirement_folders", entityId);
    }
    }

    }
