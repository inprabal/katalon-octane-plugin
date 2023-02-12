package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ReleaseEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ReleaseEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , EXPECTEDVELOCITY("expected_velocity")
                    , SPRINTDURATION("sprint_duration")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , NAME("name")
                    , DONEWORK("done_work")
                    , PROGRAMS("programs")
                    , ENDDATE("end_date")
                    , ATTACHMENTS("attachments")
                    , FEATURESESTIMATION("features_estimation")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , NUMOFSPRINTS("num_of_sprints")
                    , STARTDATE("start_date")
                    , HASATTACHMENTS("has_attachments")
                    , REMAININGWORK("remaining_work")
                    , AGILETYPE("agile_type")
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
                    , SPRINTDURATION("sprint_duration")
                    , LASTMODIFIED("last_modified")
                    , NAME("name")
                    , ENDDATE("end_date")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , STARTDATE("start_date")
                    , AGILETYPE("agile_type")
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
    public ReleaseEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ReleaseEntities at(String entityId) {
        return new ReleaseEntities(entityId);
    }


            public GetReleaseEntities get() {
        return new GetReleaseEntities(octaneHttpClient, baseDomain);
    }

                public CreateReleaseEntities create() {
        return new CreateReleaseEntities(octaneHttpClient, baseDomain);
    }

                public UpdateReleaseEntities update() {
        return new UpdateReleaseEntities(octaneHttpClient, baseDomain);
    }

                public DeleteReleaseEntities delete() {
        return new DeleteReleaseEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the ReleaseEntities object(An object that represent one ReleaseEntity )
    */
    public class ReleaseEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ReleaseEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetReleaseEntity object with specific entity
        *
* @return The GetReleaseEntity object
*/
public GetReleaseEntity get() {
return new GetReleaseEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateReleaseEntity object with specific entity
        *
* @return The UpdateReleaseEntity object
*/
public UpdateReleaseEntity update() {
return new UpdateReleaseEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteReleaseEntity object with specific entity
        *
* @return The DeleteReleaseEntity object
*/
public DeleteReleaseEntity delete() {
return new DeleteReleaseEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetReleaseEntities extends GetTypedEntities
<ReleaseEntityModel
    , GetReleaseEntities    , AvailableFields, SortableFields> {
    GetReleaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases");
    }
    }

        public final class GetReleaseEntity extends GetTypedEntity
<ReleaseEntityModel
    , GetReleaseEntity    , AvailableFields> {
    GetReleaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases", entityId);
    }
    }

                public final class CreateReleaseEntities extends CreateTypedEntities
<ReleaseEntityModel
    , CreateReleaseEntities    > {
    CreateReleaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases");
    }
    }

                public final class UpdateReleaseEntities extends UpdateTypedEntities
<ReleaseEntityModel
    , UpdateReleaseEntities    > {
    UpdateReleaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases");
    }
    }

        public final class UpdateReleaseEntity extends UpdateTypedEntity
<ReleaseEntityModel
    , UpdateReleaseEntity    > {
    UpdateReleaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases", entityId);
    }
    }

                public final class DeleteReleaseEntities extends DeleteTypedEntities
<ReleaseEntityModel
    , DeleteReleaseEntities    > {
    DeleteReleaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases");
    }
    }

        public final class DeleteReleaseEntity extends DeleteTypedEntity
<ReleaseEntityModel
        > {
    DeleteReleaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ReleaseEntityModel.class, octaneHttpClient, baseDomain + "releases", entityId);
    }
    }

    }
