package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TeamEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TeamEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , ASSIGNTONEWRELEASES("assign_to_new_releases")
                    , VERSIONSTAMP("version_stamp")
                    , NUMBEROFMEMBERS("number_of_members")
                    , DESCRIPTION("description")
                    , ESTIMATEDVELOCITY("estimated_velocity")
                    , PLANNINGDEADLINE("planning_deadline")
                    , MEMBERS("members")
                    , LASTMODIFIED("last_modified")
                    , TEAMSPRINTRELATION("team_sprint_relation")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , RELEASES("releases")
                    , NAME("name")
                    , TEAMMEMBERS("team_members")
                    , PROGRAMS("programs")
                    , TEAMLEAD("team_lead")
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
                    , ESTIMATEDVELOCITY("estimated_velocity")
                    , LASTMODIFIED("last_modified")
                    , NAME("name")
                    , TEAMLEAD("team_lead")
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
    public TeamEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TeamEntities at(String entityId) {
        return new TeamEntities(entityId);
    }


            public GetTeamEntities get() {
        return new GetTeamEntities(octaneHttpClient, baseDomain);
    }

                public CreateTeamEntities create() {
        return new CreateTeamEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTeamEntities update() {
        return new UpdateTeamEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTeamEntities delete() {
        return new DeleteTeamEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TeamEntities object(An object that represent one TeamEntity )
    */
    public class TeamEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TeamEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTeamEntity object with specific entity
        *
* @return The GetTeamEntity object
*/
public GetTeamEntity get() {
return new GetTeamEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTeamEntity object with specific entity
        *
* @return The UpdateTeamEntity object
*/
public UpdateTeamEntity update() {
return new UpdateTeamEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTeamEntity object with specific entity
        *
* @return The DeleteTeamEntity object
*/
public DeleteTeamEntity delete() {
return new DeleteTeamEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTeamEntities extends GetTypedEntities
<TeamEntityModel
    , GetTeamEntities    , AvailableFields, SortableFields> {
    GetTeamEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams");
    }
    }

        public final class GetTeamEntity extends GetTypedEntity
<TeamEntityModel
    , GetTeamEntity    , AvailableFields> {
    GetTeamEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams", entityId);
    }
    }

                public final class CreateTeamEntities extends CreateTypedEntities
<TeamEntityModel
    , CreateTeamEntities    > {
    CreateTeamEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams");
    }
    }

                public final class UpdateTeamEntities extends UpdateTypedEntities
<TeamEntityModel
    , UpdateTeamEntities    > {
    UpdateTeamEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams");
    }
    }

        public final class UpdateTeamEntity extends UpdateTypedEntity
<TeamEntityModel
    , UpdateTeamEntity    > {
    UpdateTeamEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams", entityId);
    }
    }

                public final class DeleteTeamEntities extends DeleteTypedEntities
<TeamEntityModel
    , DeleteTeamEntities    > {
    DeleteTeamEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams");
    }
    }

        public final class DeleteTeamEntity extends DeleteTypedEntity
<TeamEntityModel
        > {
    DeleteTeamEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TeamEntityModel.class, octaneHttpClient, baseDomain + "teams", entityId);
    }
    }

    }
