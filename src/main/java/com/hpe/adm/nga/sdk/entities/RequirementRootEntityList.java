package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RequirementRootEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RequirementRootEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , ORDERING("ordering")
                    , DESCRIPTION("description")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , USERTAGS("user_tags")
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
    public RequirementRootEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RequirementRootEntities at(String entityId) {
        return new RequirementRootEntities(entityId);
    }


            public GetRequirementRootEntities get() {
        return new GetRequirementRootEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the RequirementRootEntities object(An object that represent one RequirementRootEntity )
    */
    public class RequirementRootEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RequirementRootEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRequirementRootEntity object with specific entity
        *
* @return The GetRequirementRootEntity object
*/
public GetRequirementRootEntity get() {
return new GetRequirementRootEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRequirementRootEntities extends GetTypedEntities
<RequirementRootEntityModel
    , GetRequirementRootEntities    , AvailableFields, SortableFields> {
    GetRequirementRootEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RequirementRootEntityModel.class, octaneHttpClient, baseDomain + "requirement_roots");
    }
    }

        public final class GetRequirementRootEntity extends GetTypedEntity
<RequirementRootEntityModel
    , GetRequirementRootEntity    , AvailableFields> {
    GetRequirementRootEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RequirementRootEntityModel.class, octaneHttpClient, baseDomain + "requirement_roots", entityId);
    }
    }

                }
