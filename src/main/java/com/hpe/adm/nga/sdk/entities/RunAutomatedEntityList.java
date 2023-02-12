package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunAutomatedEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunAutomatedEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLUSTER("cluster")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , DEFECT("defect")
                    , PROBLEM("problem")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , LASTMODIFIED("last_modified")
                    , ERRORMESSAGE("error_message")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PACKAGE("package")
                    , TEST("test")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , PRODUCTAREAS("product_areas")
                    , USERTAGS("user_tags")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , HASCOMMENTS("has_comments")
                    , TAXONOMIES("taxonomies")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ONIT("on_it")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , DESCRIPTION("description")
                    , DURATION("duration")
                    , FULLERRORDETAILS("full_error_details")
                    , ERRORDETAILS("error_details")
                    , FAILEDSINCEBUILDINFO("failed_since_build_info")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , EXTERNALREPORTURL("external_report_url")
                    , COMMENTS("comments")
                    , NATIVESTATUS("native_status")
                    , TESTLEVEL("test_level")
                    , QUALITYSTORIES("quality_stories")
                    , STARTED("started")
                    , LASTMODIFIEDBY("last_modified_by")
                    , TESTTYPE("test_type")
                    , PIPELINE("pipeline")
                    , COMPONENT("component")
                    , PARENTSUITE("parent_suite")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , BUILD("build")
                    , CUSTOMREPORTLINK("custom_report_link")
                    , TESTFRAMEWORK("test_framework")
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
                    , CLUSTER("cluster")
                    , VERSIONSTAMP("version_stamp")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , LASTMODIFIED("last_modified")
                    , ERRORMESSAGE("error_message")
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ONIT("on_it")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , DURATION("duration")
                    , ERRORDETAILS("error_details")
                    , STEPSNUM("steps_num")
                    , CLASSNAME("class_name")
                    , EXTERNALREPORTURL("external_report_url")
                    , NATIVESTATUS("native_status")
                    , TESTLEVEL("test_level")
                    , STARTED("started")
                    , COMPONENT("component")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , TESTFRAMEWORK("test_framework")
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
    public RunAutomatedEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunAutomatedEntities at(String entityId) {
        return new RunAutomatedEntities(entityId);
    }


            public GetRunAutomatedEntities get() {
        return new GetRunAutomatedEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateRunAutomatedEntities update() {
        return new UpdateRunAutomatedEntities(octaneHttpClient, baseDomain);
    }

                public DeleteRunAutomatedEntities delete() {
        return new DeleteRunAutomatedEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the RunAutomatedEntities object(An object that represent one RunAutomatedEntity )
    */
    public class RunAutomatedEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunAutomatedEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunAutomatedEntity object with specific entity
        *
* @return The GetRunAutomatedEntity object
*/
public GetRunAutomatedEntity get() {
return new GetRunAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateRunAutomatedEntity object with specific entity
        *
* @return The UpdateRunAutomatedEntity object
*/
public UpdateRunAutomatedEntity update() {
return new UpdateRunAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteRunAutomatedEntity object with specific entity
        *
* @return The DeleteRunAutomatedEntity object
*/
public DeleteRunAutomatedEntity delete() {
return new DeleteRunAutomatedEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunAutomatedEntities extends GetTypedEntities
<RunAutomatedEntityModel
    , GetRunAutomatedEntities    , AvailableFields, SortableFields> {
    GetRunAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs");
    }
    }

        public final class GetRunAutomatedEntity extends GetTypedEntity
<RunAutomatedEntityModel
    , GetRunAutomatedEntity    , AvailableFields> {
    GetRunAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs", entityId);
    }
    }

                    public final class UpdateRunAutomatedEntities extends UpdateTypedEntities
<RunAutomatedEntityModel
    , UpdateRunAutomatedEntities    > {
    UpdateRunAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs");
    }
    }

        public final class UpdateRunAutomatedEntity extends UpdateTypedEntity
<RunAutomatedEntityModel
    , UpdateRunAutomatedEntity    > {
    UpdateRunAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs", entityId);
    }
    }

                public final class DeleteRunAutomatedEntities extends DeleteTypedEntities
<RunAutomatedEntityModel
    , DeleteRunAutomatedEntities    > {
    DeleteRunAutomatedEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs");
    }
    }

        public final class DeleteRunAutomatedEntity extends DeleteTypedEntity
<RunAutomatedEntityModel
        > {
    DeleteRunAutomatedEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunAutomatedEntityModel.class, octaneHttpClient, baseDomain + "automated_runs", entityId);
    }
    }

    }
