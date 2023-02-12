package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.RunHistoryEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class RunHistoryEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CLUSTER("cluster")
                    , RELEASE("release")
                    , RUNNATIVESTATUS("run_native_status")
                    , RUNSTARTED("run_started")
                    , TESTCLASS("test_class")
                    , RUNDURATION("run_duration")
                    , PROBLEM("problem")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , USERTAGSFROMRUN("user_tags_from_run")
                    , ERRORMESSAGE("error_message")
                    , PIPELINENAME("pipeline_name")
                    , BUILDID("build_id")
                    , TESTSUBTYPE("test_subtype")
                    , TAXONOMIES("taxonomies")
                    , TESTPACKAGE("test_package")
                    , URLTOCI("url_to_ci")
                    , MERGEDONITID("merged_on_it_id")
                    , ASSIGNEDTO("assigned_to")
                    , TESTNAME("test_name")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , JOBINFO("job_info")
                    , BUILDNAME("build_name")
                    , ISNEWFAILURE("is_new_failure")
                    , FAILEDSINCEPIPELINERUNID("failed_since_pipeline_run_id")
                    , ERRORDETAILS("error_details")
                    , PIPELINEID("pipeline_id")
                    , PIPELINE("pipeline")
                    , PIPELINERUNID("pipeline_run_id")
                    , BUILDSTATUS("build_status")
                    , RUNSTATUS("run_status")
                    , TESTID("test_id")
                    , OWNER("owner")
                    , USERTAGSFROMTEST("user_tags_from_test")
                    , RUNID("run_id")
                    , LINKEDDEFECTS("linked_defects")
                    , BDDSPECNAME("bdd_spec_name")
                    , APPLICATIONMODULES("application_modules")
                    , JOBNAME("job_name")
                    , MILESTONE("milestone")
                    , JOBID("job_id")
                    , STATUSAGE("status_age")
                    , TESTCOMPONENT("test_component")
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
                    CLUSTER("cluster")
                    , RUNNATIVESTATUS("run_native_status")
                    , RUNSTARTED("run_started")
                    , TESTCLASS("test_class")
                    , RUNDURATION("run_duration")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , BUILDID("build_id")
                    , TESTSUBTYPE("test_subtype")
                    , TESTPACKAGE("test_package")
                    , MERGEDONITID("merged_on_it_id")
                    , ASSIGNEDTO("assigned_to")
                    , TESTNAME("test_name")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , JOBINFO("job_info")
                    , ERRORDETAILS("error_details")
                    , BUILDSTATUS("build_status")
                    , RUNSTATUS("run_status")
                    , RUNID("run_id")
                    , LINKEDDEFECTS("linked_defects")
                    , BDDSPECNAME("bdd_spec_name")
                    , JOBNAME("job_name")
                    , STATUSAGE("status_age")
                    , TESTCOMPONENT("test_component")
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
    public RunHistoryEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public RunHistoryEntities at(String entityId) {
        return new RunHistoryEntities(entityId);
    }


            public GetRunHistoryEntities get() {
        return new GetRunHistoryEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the RunHistoryEntities object(An object that represent one RunHistoryEntity )
    */
    public class RunHistoryEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        RunHistoryEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetRunHistoryEntity object with specific entity
        *
* @return The GetRunHistoryEntity object
*/
public GetRunHistoryEntity get() {
return new GetRunHistoryEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetRunHistoryEntities extends GetTypedEntities
<RunHistoryEntityModel
    , GetRunHistoryEntities    , AvailableFields, SortableFields> {
    GetRunHistoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(RunHistoryEntityModel.class, octaneHttpClient, baseDomain + "previous_runs");
    }
    }

        public final class GetRunHistoryEntity extends GetTypedEntity
<RunHistoryEntityModel
    , GetRunHistoryEntity    , AvailableFields> {
    GetRunHistoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(RunHistoryEntityModel.class, octaneHttpClient, baseDomain + "previous_runs", entityId);
    }
    }

                }
