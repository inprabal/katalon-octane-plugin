package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RequirementEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RequirementEntityList extends TypedEntityList {

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
                    , HASCHILDREN("has_children")
                    , TEST("test")
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
                    , SUBTYPE("subtype")
                    , OWNER("owner")
                    , COMMENTS("comments")
                    , HASATTACHMENTS("has_attachments")
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
                    , SUBTYPE("subtype")
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
    public RequirementEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RequirementEntities at(String entityId) {
        return new RequirementEntities(entityId);
    }


            public GetRequirementEntities get() {
        return new GetRequirementEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateRequirementEntities update() {
        return new UpdateRequirementEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the RequirementEntities object(An object that represent one RequirementEntity )
    */
    public class RequirementEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RequirementEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRequirementEntity object with specific entity
        *
* @return The GetRequirementEntity object
*/
public GetRequirementEntity get() {
return new GetRequirementEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRequirementEntity object with specific entity
        *
* @return The UpdateRequirementEntity object
*/
public UpdateRequirementEntity update() {
return new UpdateRequirementEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRequirementEntities extends GetTypedEntities
<RequirementEntityModel
    , GetRequirementEntities    , AvailableFields, SortableFields> {
    GetRequirementEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementEntityModel.class, octaneHttpClient, baseDomain + "requirements");
    }
    }

        public final class GetRequirementEntity extends GetTypedEntity
<RequirementEntityModel
    , GetRequirementEntity    , AvailableFields> {
    GetRequirementEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementEntityModel.class, octaneHttpClient, baseDomain + "requirements", entityId);
    }
    }

                    public final class UpdateRequirementEntities extends UpdateTypedEntities
<RequirementEntityModel
    , UpdateRequirementEntities    > {
    UpdateRequirementEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementEntityModel.class, octaneHttpClient, baseDomain + "requirements");
    }
    }

        public final class UpdateRequirementEntity extends UpdateTypedEntity
<RequirementEntityModel
    , UpdateRequirementEntity    > {
    UpdateRequirementEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementEntityModel.class, octaneHttpClient, baseDomain + "requirements", entityId);
    }
    }

        }
