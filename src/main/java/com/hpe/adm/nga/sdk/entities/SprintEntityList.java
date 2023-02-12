package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.SprintEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class SprintEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    ENDDATE("end_date")
                    , CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , WORKINGDAYS("working_days")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , NUMBEROFWORKDAYSTILL("number_of_work_days_till")
                    , NUMBEROFREMAININGWORKDAYS("number_of_remaining_work_days")
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
                    , STARTDATE("start_date")
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
                    ENDDATE("end_date")
                    , CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
                    , STARTDATE("start_date")
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
    public SprintEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public SprintEntities at(String entityId) {
        return new SprintEntities(entityId);
    }


            public GetSprintEntities get() {
        return new GetSprintEntities(octaneHttpClient, baseDomain);
    }

                public CreateSprintEntities create() {
        return new CreateSprintEntities(octaneHttpClient, baseDomain);
    }

                public UpdateSprintEntities update() {
        return new UpdateSprintEntities(octaneHttpClient, baseDomain);
    }

                public DeleteSprintEntities delete() {
        return new DeleteSprintEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the SprintEntities object(An object that represent one SprintEntity )
    */
    public class SprintEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        SprintEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetSprintEntity object with specific entity
        *
* @return The GetSprintEntity object
*/
public GetSprintEntity get() {
return new GetSprintEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateSprintEntity object with specific entity
        *
* @return The UpdateSprintEntity object
*/
public UpdateSprintEntity update() {
return new UpdateSprintEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteSprintEntity object with specific entity
        *
* @return The DeleteSprintEntity object
*/
public DeleteSprintEntity delete() {
return new DeleteSprintEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetSprintEntities extends GetTypedEntities
<SprintEntityModel
    , GetSprintEntities    , AvailableFields, SortableFields> {
    GetSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints");
    }
    }

        public final class GetSprintEntity extends GetTypedEntity
<SprintEntityModel
    , GetSprintEntity    , AvailableFields> {
    GetSprintEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints", entityId);
    }
    }

                public final class CreateSprintEntities extends CreateTypedEntities
<SprintEntityModel
    , CreateSprintEntities    > {
    CreateSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints");
    }
    }

                public final class UpdateSprintEntities extends UpdateTypedEntities
<SprintEntityModel
    , UpdateSprintEntities    > {
    UpdateSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints");
    }
    }

        public final class UpdateSprintEntity extends UpdateTypedEntity
<SprintEntityModel
    , UpdateSprintEntity    > {
    UpdateSprintEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints", entityId);
    }
    }

                public final class DeleteSprintEntities extends DeleteTypedEntities
<SprintEntityModel
    , DeleteSprintEntities    > {
    DeleteSprintEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints");
    }
    }

        public final class DeleteSprintEntity extends DeleteTypedEntity
<SprintEntityModel
        > {
    DeleteSprintEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(SprintEntityModel.class, octaneHttpClient, baseDomain + "sprints", entityId);
    }
    }

    }
