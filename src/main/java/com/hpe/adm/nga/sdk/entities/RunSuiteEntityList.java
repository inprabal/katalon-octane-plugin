package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunSuiteEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunSuiteEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , DEFAULTRUNBY("default_run_by")
                    , DEFECT("defect")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , USERTAGS("user_tags")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , HASCOMMENTS("has_comments")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ATTACHMENTS("attachments")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , DESCRIPTION("description")
                    , RUNSINSUITE("runs_in_suite")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , NATIVESTATUS("native_status")
                    , QUALITYSTORIES("quality_stories")
                    , STARTED("started")
                    , LASTMODIFIEDBY("last_modified_by")
                    , PREVIOUSRELEASE("previous_release")
                    , TESTTYPE("test_type")
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
                    , DEFAULTRUNBY("default_run_by")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , NATIVESTATUS("native_status")
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
    public RunSuiteEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunSuiteEntities at(String entityId) {
        return new RunSuiteEntities(entityId);
    }


            public GetRunSuiteEntities get() {
        return new GetRunSuiteEntities(octaneHttpClient, baseDomain);
    }

                public CreateRunSuiteEntities create() {
        return new CreateRunSuiteEntities(octaneHttpClient, baseDomain);
    }

                public UpdateRunSuiteEntities update() {
        return new UpdateRunSuiteEntities(octaneHttpClient, baseDomain);
    }

                public DeleteRunSuiteEntities delete() {
        return new DeleteRunSuiteEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the RunSuiteEntities object(An object that represent one RunSuiteEntity )
    */
    public class RunSuiteEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunSuiteEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunSuiteEntity object with specific entity
        *
* @return The GetRunSuiteEntity object
*/
public GetRunSuiteEntity get() {
return new GetRunSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRunSuiteEntity object with specific entity
        *
* @return The UpdateRunSuiteEntity object
*/
public UpdateRunSuiteEntity update() {
return new UpdateRunSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteRunSuiteEntity object with specific entity
        *
* @return The DeleteRunSuiteEntity object
*/
public DeleteRunSuiteEntity delete() {
return new DeleteRunSuiteEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunSuiteEntities extends GetTypedEntities
<RunSuiteEntityModel
    , GetRunSuiteEntities    , AvailableFields, SortableFields> {
    GetRunSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run");
    }
    }

        public final class GetRunSuiteEntity extends GetTypedEntity
<RunSuiteEntityModel
    , GetRunSuiteEntity    , AvailableFields> {
    GetRunSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run", entityId);
    }
    }

                public final class CreateRunSuiteEntities extends CreateTypedEntities
<RunSuiteEntityModel
    , CreateRunSuiteEntities    > {
    CreateRunSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run");
    }
    }

                public final class UpdateRunSuiteEntities extends UpdateTypedEntities
<RunSuiteEntityModel
    , UpdateRunSuiteEntities    > {
    UpdateRunSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run");
    }
    }

        public final class UpdateRunSuiteEntity extends UpdateTypedEntity
<RunSuiteEntityModel
    , UpdateRunSuiteEntity    > {
    UpdateRunSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run", entityId);
    }
    }

                public final class DeleteRunSuiteEntities extends DeleteTypedEntities
<RunSuiteEntityModel
    , DeleteRunSuiteEntities    > {
    DeleteRunSuiteEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run");
    }
    }

        public final class DeleteRunSuiteEntity extends DeleteTypedEntity
<RunSuiteEntityModel
        > {
    DeleteRunSuiteEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunSuiteEntityModel.class, octaneHttpClient, baseDomain + "suite_run", entityId);
    }
    }

    }
