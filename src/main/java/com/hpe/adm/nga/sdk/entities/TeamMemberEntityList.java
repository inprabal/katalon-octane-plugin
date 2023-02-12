package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TeamMemberEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TeamMemberEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , WORKSPACEUSER("workspace_user")
                    , TEAM("team")
                    , LASTMODIFIED("last_modified")
                    , CAPACITY("capacity")
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
                    , CAPACITY("capacity")
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
    public TeamMemberEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TeamMemberEntities at(String entityId) {
        return new TeamMemberEntities(entityId);
    }


            public GetTeamMemberEntities get() {
        return new GetTeamMemberEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateTeamMemberEntities update() {
        return new UpdateTeamMemberEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TeamMemberEntities object(An object that represent one TeamMemberEntity )
    */
    public class TeamMemberEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TeamMemberEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTeamMemberEntity object with specific entity
        *
* @return The GetTeamMemberEntity object
*/
public GetTeamMemberEntity get() {
return new GetTeamMemberEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTeamMemberEntity object with specific entity
        *
* @return The UpdateTeamMemberEntity object
*/
public UpdateTeamMemberEntity update() {
return new UpdateTeamMemberEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTeamMemberEntities extends GetTypedEntities
<TeamMemberEntityModel
    , GetTeamMemberEntities    , AvailableFields, SortableFields> {
    GetTeamMemberEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamMemberEntityModel.class, octaneHttpClient, baseDomain + "team_members");
    }
    }

        public final class GetTeamMemberEntity extends GetTypedEntity
<TeamMemberEntityModel
    , GetTeamMemberEntity    , AvailableFields> {
    GetTeamMemberEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamMemberEntityModel.class, octaneHttpClient, baseDomain + "team_members", entityId);
    }
    }

                    public final class UpdateTeamMemberEntities extends UpdateTypedEntities
<TeamMemberEntityModel
    , UpdateTeamMemberEntities    > {
    UpdateTeamMemberEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamMemberEntityModel.class, octaneHttpClient, baseDomain + "team_members");
    }
    }

        public final class UpdateTeamMemberEntity extends UpdateTypedEntity
<TeamMemberEntityModel
    , UpdateTeamMemberEntity    > {
    UpdateTeamMemberEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamMemberEntityModel.class, octaneHttpClient, baseDomain + "team_members", entityId);
    }
    }

        }
