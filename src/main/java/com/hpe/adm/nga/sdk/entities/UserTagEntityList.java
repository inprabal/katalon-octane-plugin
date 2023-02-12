package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.UserTagEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class UserTagEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , AUTHOR("author")
                    , RUN("run")
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
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
                    , AUTHOR("author")
                    , NAME("name")
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
    public UserTagEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public UserTagEntities at(String entityId) {
        return new UserTagEntities(entityId);
    }


            public GetUserTagEntities get() {
        return new GetUserTagEntities(octaneHttpClient, baseDomain);
    }

                public CreateUserTagEntities create() {
        return new CreateUserTagEntities(octaneHttpClient, baseDomain);
    }

            
    /**
    * This class hold the UserTagEntities object(An object that represent one UserTagEntity )
    */
    public class UserTagEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        UserTagEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetUserTagEntity object with specific entity
        *
* @return The GetUserTagEntity object
*/
public GetUserTagEntity get() {
return new GetUserTagEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetUserTagEntities extends GetTypedEntities
<UserTagEntityModel
    , GetUserTagEntities    , AvailableFields, SortableFields> {
    GetUserTagEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(UserTagEntityModel.class, octaneHttpClient, baseDomain + "user_tags");
    }
    }

        public final class GetUserTagEntity extends GetTypedEntity
<UserTagEntityModel
    , GetUserTagEntity    , AvailableFields> {
    GetUserTagEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(UserTagEntityModel.class, octaneHttpClient, baseDomain + "user_tags", entityId);
    }
    }

                public final class CreateUserTagEntities extends CreateTypedEntities
<UserTagEntityModel
    , CreateUserTagEntities    > {
    CreateUserTagEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(UserTagEntityModel.class, octaneHttpClient, baseDomain + "user_tags");
    }
    }

            }
