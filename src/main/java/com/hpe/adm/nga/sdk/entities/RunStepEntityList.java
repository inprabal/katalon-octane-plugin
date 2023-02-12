package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunStepEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunStepEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , ACTUAL("actual")
                    , NUMOFDEFECTS("num_of_defects")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , ATTACHMENTS("attachments")
                    , HASATTACHMENTS("has_attachments")
                    , VERSIONSTAMP("version_stamp")
                    , STEPTYPE("step_type")
                    , DESCRIPTION("description")
                    , RUN("run")
                    , RESULT("result")
                    , DEFECT("defect")
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
                    , NUMOFDEFECTS("num_of_defects")
                    , VERSIONSTAMP("version_stamp")
                    , STEPTYPE("step_type")
                    , RESULT("result")
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
    public RunStepEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunStepEntities at(String entityId) {
        return new RunStepEntities(entityId);
    }


            public GetRunStepEntities get() {
        return new GetRunStepEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateRunStepEntities update() {
        return new UpdateRunStepEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the RunStepEntities object(An object that represent one RunStepEntity )
    */
    public class RunStepEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunStepEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunStepEntity object with specific entity
        *
* @return The GetRunStepEntity object
*/
public GetRunStepEntity get() {
return new GetRunStepEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRunStepEntity object with specific entity
        *
* @return The UpdateRunStepEntity object
*/
public UpdateRunStepEntity update() {
return new UpdateRunStepEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunStepEntities extends GetTypedEntities
<RunStepEntityModel
    , GetRunStepEntities    , AvailableFields, SortableFields> {
    GetRunStepEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunStepEntityModel.class, octaneHttpClient, baseDomain + "run_steps");
    }
    }

        public final class GetRunStepEntity extends GetTypedEntity
<RunStepEntityModel
    , GetRunStepEntity    , AvailableFields> {
    GetRunStepEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunStepEntityModel.class, octaneHttpClient, baseDomain + "run_steps", entityId);
    }
    }

                    public final class UpdateRunStepEntities extends UpdateTypedEntities
<RunStepEntityModel
    , UpdateRunStepEntities    > {
    UpdateRunStepEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunStepEntityModel.class, octaneHttpClient, baseDomain + "run_steps");
    }
    }

        public final class UpdateRunStepEntity extends UpdateTypedEntity
<RunStepEntityModel
    , UpdateRunStepEntity    > {
    UpdateRunStepEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunStepEntityModel.class, octaneHttpClient, baseDomain + "run_steps", entityId);
    }
    }

        }
