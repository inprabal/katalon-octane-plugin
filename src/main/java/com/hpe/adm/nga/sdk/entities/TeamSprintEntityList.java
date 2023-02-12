package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TeamSprintEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TeamSprintEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TOIMPROVE("to_improve")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , TEAM("team")
                    , EXPECTEDVELOCITY("expected_velocity")
                    , TOPRESERVE("to_preserve")
                    , ACTUALVELOCITY("actual_velocity")
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
                    , SPRINT("sprint")
                    , EXPECTEDVELOCITY("expected_velocity")
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
    public TeamSprintEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TeamSprintEntities at(String entityId) {
        return new TeamSprintEntities(entityId);
    }


            public GetTeamSprintEntities get() {
        return new GetTeamSprintEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateTeamSprintEntities update() {
        return new UpdateTeamSprintEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TeamSprintEntities object(An object that represent one TeamSprintEntity )
    */
    public class TeamSprintEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TeamSprintEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTeamSprintEntity object with specific entity
        *
* @return The GetTeamSprintEntity object
*/
public GetTeamSprintEntity get() {
return new GetTeamSprintEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTeamSprintEntity object with specific entity
        *
* @return The UpdateTeamSprintEntity object
*/
public UpdateTeamSprintEntity update() {
return new UpdateTeamSprintEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTeamSprintEntities extends GetTypedEntities
<TeamSprintEntityModel
    , GetTeamSprintEntities    , AvailableFields, SortableFields> {
    GetTeamSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamSprintEntityModel.class, octaneHttpClient, baseDomain + "team_sprints");
    }
    }

        public final class GetTeamSprintEntity extends GetTypedEntity
<TeamSprintEntityModel
    , GetTeamSprintEntity    , AvailableFields> {
    GetTeamSprintEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamSprintEntityModel.class, octaneHttpClient, baseDomain + "team_sprints", entityId);
    }
    }

                    public final class UpdateTeamSprintEntities extends UpdateTypedEntities
<TeamSprintEntityModel
    , UpdateTeamSprintEntities    > {
    UpdateTeamSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamSprintEntityModel.class, octaneHttpClient, baseDomain + "team_sprints");
    }
    }

        public final class UpdateTeamSprintEntity extends UpdateTypedEntity
<TeamSprintEntityModel
    , UpdateTeamSprintEntity    > {
    UpdateTeamSprintEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamSprintEntityModel.class, octaneHttpClient, baseDomain + "team_sprints", entityId);
    }
    }

        }
