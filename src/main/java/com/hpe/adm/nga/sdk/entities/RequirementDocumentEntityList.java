package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RequirementDocumentEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RequirementDocumentEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , FEATURES("features")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , RELATEDFROMREQUIREMENTS("related_from_requirements")
                    , USERTAGS("user_tags")
                    , HASCOMMENTS("has_comments")
                    , RELATEDTOREQUIREMENT("related_to_requirement")
                    , NAME("name")
                    , ATTACHMENTS("attachments")
                    , ORDERING("ordering")
                    , DESCRIPTION("description")
                    , ISROOT("is_root")
                    , OWNER("owner")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
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
                    , PHASE("phase")
                    , AUTHOR("author")
                    , NAME("name")
                    , ISROOT("is_root")
                    , OWNER("owner")
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
    public RequirementDocumentEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RequirementDocumentEntities at(String entityId) {
        return new RequirementDocumentEntities(entityId);
    }


            public GetRequirementDocumentEntities get() {
        return new GetRequirementDocumentEntities(octaneHttpClient, baseDomain);
    }

                public CreateRequirementDocumentEntities create() {
        return new CreateRequirementDocumentEntities(octaneHttpClient, baseDomain);
    }

                public UpdateRequirementDocumentEntities update() {
        return new UpdateRequirementDocumentEntities(octaneHttpClient, baseDomain);
    }

                public DeleteRequirementDocumentEntities delete() {
        return new DeleteRequirementDocumentEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the RequirementDocumentEntities object(An object that represent one RequirementDocumentEntity )
    */
    public class RequirementDocumentEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RequirementDocumentEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRequirementDocumentEntity object with specific entity
        *
* @return The GetRequirementDocumentEntity object
*/
public GetRequirementDocumentEntity get() {
return new GetRequirementDocumentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRequirementDocumentEntity object with specific entity
        *
* @return The UpdateRequirementDocumentEntity object
*/
public UpdateRequirementDocumentEntity update() {
return new UpdateRequirementDocumentEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteRequirementDocumentEntity object with specific entity
        *
* @return The DeleteRequirementDocumentEntity object
*/
public DeleteRequirementDocumentEntity delete() {
return new DeleteRequirementDocumentEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRequirementDocumentEntities extends GetTypedEntities
<RequirementDocumentEntityModel
    , GetRequirementDocumentEntities    , AvailableFields, SortableFields> {
    GetRequirementDocumentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents");
    }
    }

        public final class GetRequirementDocumentEntity extends GetTypedEntity
<RequirementDocumentEntityModel
    , GetRequirementDocumentEntity    , AvailableFields> {
    GetRequirementDocumentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents", entityId);
    }
    }

                public final class CreateRequirementDocumentEntities extends CreateTypedEntities
<RequirementDocumentEntityModel
    , CreateRequirementDocumentEntities    > {
    CreateRequirementDocumentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents");
    }
    }

                public final class UpdateRequirementDocumentEntities extends UpdateTypedEntities
<RequirementDocumentEntityModel
    , UpdateRequirementDocumentEntities    > {
    UpdateRequirementDocumentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents");
    }
    }

        public final class UpdateRequirementDocumentEntity extends UpdateTypedEntity
<RequirementDocumentEntityModel
    , UpdateRequirementDocumentEntity    > {
    UpdateRequirementDocumentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents", entityId);
    }
    }

                public final class DeleteRequirementDocumentEntities extends DeleteTypedEntities
<RequirementDocumentEntityModel
    , DeleteRequirementDocumentEntities    > {
    DeleteRequirementDocumentEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents");
    }
    }

        public final class DeleteRequirementDocumentEntity extends DeleteTypedEntity
<RequirementDocumentEntityModel
        > {
    DeleteRequirementDocumentEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementDocumentEntityModel.class, octaneHttpClient, baseDomain + "requirement_documents", entityId);
    }
    }

    }
