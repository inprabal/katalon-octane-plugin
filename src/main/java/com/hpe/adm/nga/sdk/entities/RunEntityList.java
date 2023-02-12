package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLUSTER("cluster")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , DEFECT("defect")
                    , PROBLEM("problem")
                    , TESTVERSION("test_version")
                    , LASTMODIFIED("last_modified")
                    , USERTAGS("user_tags")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , TAXONOMIES("taxonomies")
                    , DRAFTRUN("draft_run")
                    , STATUS("status")
                    , ATTACHMENTS("attachments")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , RUNSINSUITE("runs_in_suite")
                    , STEPSNUM("steps_num")
                    , ERRORDETAILS("error_details")
                    , CLASSNAME("class_name")
                    , EXTERNALREPORTURL("external_report_url")
                    , HASATTACHMENTS("has_attachments")
                    , QUALITYSTORIES("quality_stories")
                    , TESTLEVEL("test_level")
                    , STARTED("started")
                    , BDDSPECNAME("bdd_spec_name")
                    , TESTTYPE("test_type")
                    , PIPELINE("pipeline")
                    , COMPONENT("component")
                    , CUSTOMREPORTLINK("custom_report_link")
                    , COVEREDCONTENT("covered_content")
                    , RUNSTEPS("run_steps")
                    , SPRINT("sprint")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , ERRORMESSAGE("error_message")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , PACKAGE("package")
                    , TEST("test")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , PRODUCTAREAS("product_areas")
                    , HASCOMMENTS("has_comments")
                    , TESTPHASE("test_phase")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , ONIT("on_it")
                    , DESCRIPTION("description")
                    , DURATION("duration")
                    , FULLERRORDETAILS("full_error_details")
                    , SUBTYPE("subtype")
                    , FAILEDSINCEBUILDINFO("failed_since_build_info")
                    , COMMENTS("comments")
                    , NATIVESTATUS("native_status")
                    , LASTMODIFIEDBY("last_modified_by")
                    , PREVIOUSRELEASE("previous_release")
                    , PARENTSUITE("parent_suite")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , BUILD("build")
                    , STATUSAGE("status_age")
                    , TESTFRAMEWORK("test_framework")
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
                    , PROGRAM("program")
                    , TESTVERSION("test_version")
                    , LASTMODIFIED("last_modified")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , DRAFTRUN("draft_run")
                    , STATUS("status")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , STEPSNUM("steps_num")
                    , ERRORDETAILS("error_details")
                    , CLASSNAME("class_name")
                    , EXTERNALREPORTURL("external_report_url")
                    , TESTLEVEL("test_level")
                    , STARTED("started")
                    , BDDSPECNAME("bdd_spec_name")
                    , COMPONENT("component")
                    , SPRINT("sprint")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , ERRORMESSAGE("error_message")
                    , PACKAGE("package")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , ONIT("on_it")
                    , DURATION("duration")
                    , SUBTYPE("subtype")
                    , NATIVESTATUS("native_status")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , STATUSAGE("status_age")
                    , TESTFRAMEWORK("test_framework")
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
    public RunEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunEntities at(String entityId) {
        return new RunEntities(entityId);
    }


            public GetRunEntities get() {
        return new GetRunEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the RunEntities object(An object that represent one RunEntity )
    */
    public class RunEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunEntity object with specific entity
        *
* @return The GetRunEntity object
*/
public GetRunEntity get() {
return new GetRunEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunEntities extends GetTypedEntities
<RunEntityModel
    , GetRunEntities    , AvailableFields, SortableFields> {
    GetRunEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunEntityModel.class, octaneHttpClient, baseDomain + "runs");
    }
    }

        public final class GetRunEntity extends GetTypedEntity
<RunEntityModel
    , GetRunEntity    , AvailableFields> {
    GetRunEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunEntityModel.class, octaneHttpClient, baseDomain + "runs", entityId);
    }
    }

                }
