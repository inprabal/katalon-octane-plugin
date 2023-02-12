package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.UserItemEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class UserItemEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , REASON("reason")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , MYFOLLOWITEMSTASK("my_follow_items_task")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , ENTITYTYPE("entity_type")
                    , MYFOLLOWITEMSRUN("my_follow_items_run")
                    , MYFOLLOWITEMSREQUIREMENT("my_follow_items_requirement")
                    , MYFOLLOWITEMSWORKITEM("my_follow_items_work_item")
                    , USER("user")
                    , LASTMODIFIED("last_modified")
                    , MYFOLLOWITEMSTEST("my_follow_items_test")
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
                    , REASON("reason")
                    , VERSIONSTAMP("version_stamp")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , ENTITYTYPE("entity_type")
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
    public UserItemEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public UserItemEntities at(String entityId) {
        return new UserItemEntities(entityId);
    }


            public GetUserItemEntities get() {
        return new GetUserItemEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the UserItemEntities object(An object that represent one UserItemEntity )
    */
    public class UserItemEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        UserItemEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetUserItemEntity object with specific entity
        *
* @return The GetUserItemEntity object
*/
public GetUserItemEntity get() {
return new GetUserItemEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetUserItemEntities extends GetTypedEntities
<UserItemEntityModel
    , GetUserItemEntities    , AvailableFields, SortableFields> {
    GetUserItemEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(UserItemEntityModel.class, octaneHttpClient, baseDomain + "user_items");
    }
    }

        public final class GetUserItemEntity extends GetTypedEntity
<UserItemEntityModel
    , GetUserItemEntity    , AvailableFields> {
    GetUserItemEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(UserItemEntityModel.class, octaneHttpClient, baseDomain + "user_items", entityId);
    }
    }

                }
