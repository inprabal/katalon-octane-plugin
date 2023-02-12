package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.WorkspaceUserEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class WorkspaceUserEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , WSUSERACTIVATIONSTATUS("ws_user_activation_status")
                    , VERSIONSTAMP("version_stamp")
                    , PASSWORD("password")
                    , LASTMODIFIED("last_modified")
                    , FULLNAME("full_name")
                    , UID("uid")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , EMAIL("email")
                    , LDAPSERVERID("ldap_server_id")
                    , LASTNAME("last_name")
                    , LDAPDN("ldap_dn")
                    , LANGUAGE("language")
                    , PHONE1("phone1")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , NAME("name")
                    , FIRSTNAME("first_name")
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
                    , FULLNAME("full_name")
                    , UID("uid")
                    , EMAIL("email")
                    , LASTNAME("last_name")
                    , PHONE1("phone1")
                    , NAME("name")
                    , FIRSTNAME("first_name")
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
    public WorkspaceUserEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public WorkspaceUserEntities at(String entityId) {
        return new WorkspaceUserEntities(entityId);
    }


            public GetWorkspaceUserEntities get() {
        return new GetWorkspaceUserEntities(octaneHttpClient, baseDomain);
    }

                public CreateWorkspaceUserEntities create() {
        return new CreateWorkspaceUserEntities(octaneHttpClient, baseDomain);
    }

                public UpdateWorkspaceUserEntities update() {
        return new UpdateWorkspaceUserEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the WorkspaceUserEntities object(An object that represent one WorkspaceUserEntity )
    */
    public class WorkspaceUserEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        WorkspaceUserEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetWorkspaceUserEntity object with specific entity
        *
* @return The GetWorkspaceUserEntity object
*/
public GetWorkspaceUserEntity get() {
return new GetWorkspaceUserEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateWorkspaceUserEntity object with specific entity
        *
* @return The UpdateWorkspaceUserEntity object
*/
public UpdateWorkspaceUserEntity update() {
return new UpdateWorkspaceUserEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetWorkspaceUserEntities extends GetTypedEntities
<WorkspaceUserEntityModel
    , GetWorkspaceUserEntities    , AvailableFields, SortableFields> {
    GetWorkspaceUserEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkspaceUserEntityModel.class, octaneHttpClient, baseDomain + "workspace_users");
    }
    }

        public final class GetWorkspaceUserEntity extends GetTypedEntity
<WorkspaceUserEntityModel
    , GetWorkspaceUserEntity    , AvailableFields> {
    GetWorkspaceUserEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkspaceUserEntityModel.class, octaneHttpClient, baseDomain + "workspace_users", entityId);
    }
    }

                public final class CreateWorkspaceUserEntities extends CreateTypedEntities
<WorkspaceUserEntityModel
    , CreateWorkspaceUserEntities    > {
    CreateWorkspaceUserEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkspaceUserEntityModel.class, octaneHttpClient, baseDomain + "workspace_users");
    }
    }

                public final class UpdateWorkspaceUserEntities extends UpdateTypedEntities
<WorkspaceUserEntityModel
    , UpdateWorkspaceUserEntities    > {
    UpdateWorkspaceUserEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkspaceUserEntityModel.class, octaneHttpClient, baseDomain + "workspace_users");
    }
    }

        public final class UpdateWorkspaceUserEntity extends UpdateTypedEntity
<WorkspaceUserEntityModel
    , UpdateWorkspaceUserEntity    > {
    UpdateWorkspaceUserEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkspaceUserEntityModel.class, octaneHttpClient, baseDomain + "workspace_users", entityId);
    }
    }

        }
