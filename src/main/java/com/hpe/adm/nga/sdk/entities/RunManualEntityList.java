package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunManualEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunManualEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , COVEREDCONTENT("covered_content")
                    , RUNSTEPS("run_steps")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , DEFECT("defect")
                    , TESTVERSION("test_version")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , PRODUCTAREAS("product_areas")
                    , USERTAGS("user_tags")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , HASCOMMENTS("has_comments")
                    , TAXONOMIES("taxonomies")
                    , TESTPHASE("test_phase")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ATTACHMENTS("attachments")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , DESCRIPTION("description")
                    , DURATION("duration")
                    , STEPSNUM("steps_num")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , NATIVESTATUS("native_status")
                    , QUALITYSTORIES("quality_stories")
                    , BDDSPECNAME("bdd_spec_name")
                    , STARTED("started")
                    , LASTMODIFIEDBY("last_modified_by")
                    , PREVIOUSRELEASE("previous_release")
                    , TESTTYPE("test_type")
                    , PARENTSUITE("parent_suite")
                    , MILESTONE("milestone")
                    , STATUSAGE("status_age")
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
                    , PROGRAM("program")
                    , TESTVERSION("test_version")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , DURATION("duration")
                    , STEPSNUM("steps_num")
                    , NATIVESTATUS("native_status")
                    , BDDSPECNAME("bdd_spec_name")
                    , STARTED("started")
                    , MILESTONE("milestone")
                    , STATUSAGE("status_age")
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
    public RunManualEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunManualEntities at(String entityId) {
        return new RunManualEntities(entityId);
    }


            public GetRunManualEntities get() {
        return new GetRunManualEntities(octaneHttpClient, baseDomain);
    }

                public CreateRunManualEntities create() {
        return new CreateRunManualEntities(octaneHttpClient, baseDomain);
    }

                public UpdateRunManualEntities update() {
        return new UpdateRunManualEntities(octaneHttpClient, baseDomain);
    }

                public DeleteRunManualEntities delete() {
        return new DeleteRunManualEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the RunManualEntities object(An object that represent one RunManualEntity )
    */
    public class RunManualEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunManualEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunManualEntity object with specific entity
        *
* @return The GetRunManualEntity object
*/
public GetRunManualEntity get() {
return new GetRunManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRunManualEntity object with specific entity
        *
* @return The UpdateRunManualEntity object
*/
public UpdateRunManualEntity update() {
return new UpdateRunManualEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteRunManualEntity object with specific entity
        *
* @return The DeleteRunManualEntity object
*/
public DeleteRunManualEntity delete() {
return new DeleteRunManualEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunManualEntities extends GetTypedEntities
<RunManualEntityModel
    , GetRunManualEntities    , AvailableFields, SortableFields> {
    GetRunManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs");
    }
    }

        public final class GetRunManualEntity extends GetTypedEntity
<RunManualEntityModel
    , GetRunManualEntity    , AvailableFields> {
    GetRunManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs", entityId);
    }
    }

                public final class CreateRunManualEntities extends CreateTypedEntities
<RunManualEntityModel
    , CreateRunManualEntities    > {
    CreateRunManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs");
    }
    }

                public final class UpdateRunManualEntities extends UpdateTypedEntities
<RunManualEntityModel
    , UpdateRunManualEntities    > {
    UpdateRunManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs");
    }
    }

        public final class UpdateRunManualEntity extends UpdateTypedEntity
<RunManualEntityModel
    , UpdateRunManualEntity    > {
    UpdateRunManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs", entityId);
    }
    }

                public final class DeleteRunManualEntities extends DeleteTypedEntities
<RunManualEntityModel
    , DeleteRunManualEntities    > {
    DeleteRunManualEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs");
    }
    }

        public final class DeleteRunManualEntity extends DeleteTypedEntity
<RunManualEntityModel
        > {
    DeleteRunManualEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunManualEntityModel.class, octaneHttpClient, baseDomain + "manual_runs", entityId);
    }
    }

    }
