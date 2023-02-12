package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: run_history</p>
 * <p>Label: Run History</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "previous_runs", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class RunHistoryEntityModel extends TypedEntityModel implements RunHistoryEntity {

    public RunHistoryEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "run_history"));
    }

    public RunHistoryEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RunHistoryEntityModel(    final PipelineEntityModel pipeline, final PipelineEntityModel pipeline_id, final PipelineRunEntityModel pipeline_run_id) {
        this();
                    setPipeline(pipeline);
            setPipelineId(pipeline_id);
            setPipelineRunId(pipeline_run_id);
        }
    



    /**
	* Label: Cluster
	* Description: 
	*/
    public String getCluster(){
	    final FieldModel cluster = wrappedEntityModel.getValue("cluster");
	    return cluster == null ? null : (String) cluster.getValue();
	}

        /**
	* Label: Release
	* Description: The release of the run history.
	*/
        public ReleaseEntityModel getRelease(){
    if (wrappedEntityModel.getValue("release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel release = (ReferenceFieldModel) wrappedEntityModel.getValue("release");
	final EntityModel referenceFieldModel = release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

        /**
	* Label: Native Status
	* Description: 
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus getRunNativeStatus() {
    if (wrappedEntityModel.getValue("run_native_status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel run_native_status = (ReferenceFieldModel) wrappedEntityModel.getValue("run_native_status");
    final EntityModel referenceFieldModel = run_native_status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Run started
	* Description: 
	*/
    public java.time.ZonedDateTime getRunStarted(){
	    final FieldModel run_started = wrappedEntityModel.getValue("run_started");
	    return run_started == null ? null : (java.time.ZonedDateTime) run_started.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public RunHistoryEntityModel setRunStarted(final java.time.ZonedDateTime runStarted){
        if (runStarted == null) {
            wrappedEntityModel.removeValue("run_started");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("run_started", runStarted));
        }
        return this;
	}

    /**
	* Label: Class name
	* Description: 
	*/
    public String getTestClass(){
	    final FieldModel test_class = wrappedEntityModel.getValue("test_class");
	    return test_class == null ? null : (String) test_class.getValue();
	}

        /**
	* Label: Run duration
	* Description: 
	*/
    public Long getRunDuration(){
	    final FieldModel run_duration = wrappedEntityModel.getValue("run_duration");
	    return run_duration == null ? null : (Long) run_duration.getValue();
	}

        /**
	* Label: Problem
	* Description: 
	*/
        public java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.run_problem.Problem> getProblem() {
    final MultiReferenceFieldModel problem = (MultiReferenceFieldModel) wrappedEntityModel.getValue("problem");
    if (problem == null) {
return new java.util.ArrayList();
}
final java.util.Collection
<EntityModel> value = problem.getValue();
	return value.stream().map(com.hpe.adm.nga.sdk.enums.lists.list_node.run_problem.Problem::getFromEntityModel)
	    .collect(java.util.stream.Collectors.toList());

    }

        /**
	* Label: Exception
	* Description: 
	*/
    public String getErrorType(){
	    final FieldModel error_type = wrappedEntityModel.getValue("error_type");
	    return error_type == null ? null : (String) error_type.getValue();
	}

        /**
	* Label: Failure age
	* Description: 
	*/
    public Long getFailedBuildAge(){
	    final FieldModel failed_build_age = wrappedEntityModel.getValue("failed_build_age");
	    return failed_build_age == null ? null : (Long) failed_build_age.getValue();
	}

        /**
	* Label: Tags
	* Description: 
	*/
    public String getUserTagsFromRun(){
	    final FieldModel user_tags_from_run = wrappedEntityModel.getValue("user_tags_from_run");
	    return user_tags_from_run == null ? null : (String) user_tags_from_run.getValue();
	}

        /**
	* Label: Error message
	* Description: 
	*/
    public String getErrorMessage(){
	    final FieldModel error_message = wrappedEntityModel.getValue("error_message");
	    return error_message == null ? null : (String) error_message.getValue();
	}

        /**
	* Label: Pipeline name
	* Description: 
	*/
    public String getPipelineName(){
	    final FieldModel pipeline_name = wrappedEntityModel.getValue("pipeline_name");
	    return pipeline_name == null ? null : (String) pipeline_name.getValue();
	}

        /**
	* Label: Build ID
	* Description: 
	*/
    public Long getBuildId(){
	    final FieldModel build_id = wrappedEntityModel.getValue("build_id");
	    return build_id == null ? null : (Long) build_id.getValue();
	}

        /**
	* Label: Test subtype
	* Description: 
	*/
    public String getTestSubtype(){
	    final FieldModel test_subtype = wrappedEntityModel.getValue("test_subtype");
	    return test_subtype == null ? null : (String) test_subtype.getValue();
	}

        /**
	* Label: Environment
	* Description: 
	*/
        public java.util.Collection<TaxonomyItemNodeEntityModel> getTaxonomies(){
        final MultiReferenceFieldModel taxonomies = (MultiReferenceFieldModel) wrappedEntityModel.getValue("taxonomies");
        if (taxonomies == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = taxonomies.getValue();
                        return value.stream().map(TaxonomyItemNodeEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Package
	* Description: 
	*/
    public String getTestPackage(){
	    final FieldModel test_package = wrappedEntityModel.getValue("test_package");
	    return test_package == null ? null : (String) test_package.getValue();
	}

        /**
	* Label: URL to CI
	* Description: 
	*/
    public String getUrlToCi(){
	    final FieldModel url_to_ci = wrappedEntityModel.getValue("url_to_ci");
	    return url_to_ci == null ? null : (String) url_to_ci.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false, maxLength = 255L)
	public RunHistoryEntityModel setUrlToCi(final String urlToCi){
        if (urlToCi == null) {
            wrappedEntityModel.removeValue("url_to_ci");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("url_to_ci", urlToCi));
        }
        return this;
	}

    /**
	* Label: Assigned to ("On it")
	* Description: 
	*/
        public WorkspaceUserEntityModel getMergedOnItId(){
    if (wrappedEntityModel.getValue("merged_on_it_id") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel merged_on_it_id = (ReferenceFieldModel) wrappedEntityModel.getValue("merged_on_it_id");
	final EntityModel referenceFieldModel = merged_on_it_id.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

        /**
	* Label: Assigned to ("On it")
	* Description: 
	*/
        public WorkspaceUserEntityModel getAssignedTo(){
    if (wrappedEntityModel.getValue("assigned_to") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel assigned_to = (ReferenceFieldModel) wrappedEntityModel.getValue("assigned_to");
	final EntityModel referenceFieldModel = assigned_to.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

        /**
	* Label: Test name
	* Description: 
	*/
    public String getTestName(){
	    final FieldModel test_name = wrappedEntityModel.getValue("test_name");
	    return test_name == null ? null : (String) test_name.getValue();
	}

        /**
	* Label: Latest pipeline run
	* Description: 
	*/
    public Boolean getLatestPipelineRun(){
	    final FieldModel latest_pipeline_run = wrappedEntityModel.getValue("latest_pipeline_run");
	    return latest_pipeline_run == null ? null : (Boolean) latest_pipeline_run.getValue();
	}

        /**
	* Label: Failed since build
	* Description: 
	*/
    public Long getFailedSinceBuild(){
	    final FieldModel failed_since_build = wrappedEntityModel.getValue("failed_since_build");
	    return failed_since_build == null ? null : (Long) failed_since_build.getValue();
	}

        /**
	* Label: Build
	* Description: 
	*/
    public String getJobInfo(){
	    final FieldModel job_info = wrappedEntityModel.getValue("job_info");
	    return job_info == null ? null : (String) job_info.getValue();
	}

        /**
	* Label: Build name
	* Description: 
	*/
    public String getBuildName(){
	    final FieldModel build_name = wrappedEntityModel.getValue("build_name");
	    return build_name == null ? null : (String) build_name.getValue();
	}

        /**
	* Label: New Failure
	* Description: 
	*/
    public Boolean getIsNewFailure(){
	    final FieldModel is_new_failure = wrappedEntityModel.getValue("is_new_failure");
	    return is_new_failure == null ? null : (Boolean) is_new_failure.getValue();
	}

        /**
	* Label: Failed since pipeline run id
	* Description: 
	*/
    public Long getFailedSincePipelineRunId(){
	    final FieldModel failed_since_pipeline_run_id = wrappedEntityModel.getValue("failed_since_pipeline_run_id");
	    return failed_since_pipeline_run_id == null ? null : (Long) failed_since_pipeline_run_id.getValue();
	}

        /**
	* Label: Stacktrace
	* Description: 
	*/
    public String getErrorDetails(){
	    final FieldModel error_details = wrappedEntityModel.getValue("error_details");
	    return error_details == null ? null : (String) error_details.getValue();
	}

        /**
	* Label: Pipeline
	* Description: The pipeline of the run history.
	*/
        public PipelineEntityModel getPipelineId(){
    if (wrappedEntityModel.getValue("pipeline_id") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel pipeline_id = (ReferenceFieldModel) wrappedEntityModel.getValue("pipeline_id");
	final EntityModel referenceFieldModel = pipeline_id.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunHistoryEntityModel setPipelineId(final PipelineEntityModel pipelineId){
			if (pipelineId == null) {
			    wrappedEntityModel.removeValue("pipeline_id");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("pipeline_id", pipelineId.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Pipeline
	* Description: The pipeline of the run history.
	*/
        public PipelineEntityModel getPipeline(){
    if (wrappedEntityModel.getValue("pipeline") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel pipeline = (ReferenceFieldModel) wrappedEntityModel.getValue("pipeline");
	final EntityModel referenceFieldModel = pipeline.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunHistoryEntityModel setPipeline(final PipelineEntityModel pipeline){
			if (pipeline == null) {
			    wrappedEntityModel.removeValue("pipeline");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("pipeline", pipeline.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Pipeline Run
	* Description: The pipeline of the run history.
	*/
        public PipelineRunEntityModel getPipelineRunId(){
    if (wrappedEntityModel.getValue("pipeline_run_id") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel pipeline_run_id = (ReferenceFieldModel) wrappedEntityModel.getValue("pipeline_run_id");
	final EntityModel referenceFieldModel = pipeline_run_id.getValue();
            return new PipelineRunEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunHistoryEntityModel setPipelineRunId(final PipelineRunEntityModel pipelineRunId){
			if (pipelineRunId == null) {
			    wrappedEntityModel.removeValue("pipeline_run_id");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("pipeline_run_id", pipelineRunId.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Build status
	* Description: 
	*/
    public String getBuildStatus(){
	    final FieldModel build_status = wrappedEntityModel.getValue("build_status");
	    return build_status == null ? null : (String) build_status.getValue();
	}

        /**
	* Label: Status
	* Description: 
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_status.RunStatus getRunStatus() {
    if (wrappedEntityModel.getValue("run_status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel run_status = (ReferenceFieldModel) wrappedEntityModel.getValue("run_status");
    final EntityModel referenceFieldModel = run_status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_status.RunStatus.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Test ID
	* Description: 
	*/
    public Long getTestId(){
	    final FieldModel test_id = wrappedEntityModel.getValue("test_id");
	    return test_id == null ? null : (Long) test_id.getValue();
	}

        /**
	* Label: Test owner
	* Description: 
	*/
        public WorkspaceUserEntityModel getOwner(){
    if (wrappedEntityModel.getValue("owner") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner = (ReferenceFieldModel) wrappedEntityModel.getValue("owner");
	final EntityModel referenceFieldModel = owner.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

        /**
	* Label: User tags from test
	* Description: 
	*/
    public String getUserTagsFromTest(){
	    final FieldModel user_tags_from_test = wrappedEntityModel.getValue("user_tags_from_test");
	    return user_tags_from_test == null ? null : (String) user_tags_from_test.getValue();
	}

        /**
	* Label: ID
	* Description: 
	*/
    public Long getRunId(){
	    final FieldModel run_id = wrappedEntityModel.getValue("run_id");
	    return run_id == null ? null : (Long) run_id.getValue();
	}

        /**
	* Label: Linked defects
	* Description: 
	*/
    public String getLinkedDefects(){
	    final FieldModel linked_defects = wrappedEntityModel.getValue("linked_defects");
	    return linked_defects == null ? null : (String) linked_defects.getValue();
	}

        /**
	* Label: BDD Spec name
	* Description: 
	*/
    public String getBddSpecName(){
	    final FieldModel bdd_spec_name = wrappedEntityModel.getValue("bdd_spec_name");
	    return bdd_spec_name == null ? null : (String) bdd_spec_name.getValue();
	}

        /**
	* Label: Application modules
	* Description: 
	*/
        public java.util.Collection<ProductAreaEntityModel> getApplicationModules(){
        final MultiReferenceFieldModel application_modules = (MultiReferenceFieldModel) wrappedEntityModel.getValue("application_modules");
        if (application_modules == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = application_modules.getValue();
                        return value.stream().map(ProductAreaEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Job name
	* Description: 
	*/
    public String getJobName(){
	    final FieldModel job_name = wrappedEntityModel.getValue("job_name");
	    return job_name == null ? null : (String) job_name.getValue();
	}

        /**
	* Label: Milestone
	* Description: The milestone of the run history.
	*/
        public MilestoneEntityModel getMilestone(){
    if (wrappedEntityModel.getValue("milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("milestone");
	final EntityModel referenceFieldModel = milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

        /**
	* Label: Job id
	* Description: 
	*/
    public Long getJobId(){
	    final FieldModel job_id = wrappedEntityModel.getValue("job_id");
	    return job_id == null ? null : (Long) job_id.getValue();
	}

        /**
	* Label: Status age
	* Description: 
	*/
    public Long getStatusAge(){
	    final FieldModel status_age = wrappedEntityModel.getValue("status_age");
	    return status_age == null ? null : (Long) status_age.getValue();
	}

        /**
	* Label: Component
	* Description: 
	*/
    public String getTestComponent(){
	    final FieldModel test_component = wrappedEntityModel.getValue("test_component");
	    return test_component == null ? null : (String) test_component.getValue();
	}

    }




















