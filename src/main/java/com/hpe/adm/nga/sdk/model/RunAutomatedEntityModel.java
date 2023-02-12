package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: run_automated</p>
 * <p>Label: Run Automated</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "automated_runs", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class RunAutomatedEntityModel extends TypedEntityModel implements RunAutomatedEntity {

    public RunAutomatedEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "run_automated"));
    }

    public RunAutomatedEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RunAutomatedEntityModel(    final String name, final TestAutomatedEntityModel test) {
        this();
                    setName(name);
            setTest(test);
        }
    



    /**
	* Label: Creation time
	* Description: The time the entity was created.
	*/
    public java.time.ZonedDateTime getCreationTime(){
	    final FieldModel creation_time = wrappedEntityModel.getValue("creation_time");
	    return creation_time == null ? null : (java.time.ZonedDateTime) creation_time.getValue();
	}

        /**
	* Label: Cluster
	* Description: ALM Octane can group automated test runs if it  identifies runs that failed for similar reasons. This field indicates the name of the group, which is called a cluster.
	*/
    public String getCluster(){
	    final FieldModel cluster = wrappedEntityModel.getValue("cluster");
	    return cluster == null ? null : (String) cluster.getValue();
	}

        /**
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
	}

        /**
	* Label: Release
	* Description: The release that this run is associated with.
	*/
        public ReleaseEntityModel getRelease(){
    if (wrappedEntityModel.getValue("release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel release = (ReferenceFieldModel) wrappedEntityModel.getValue("release");
	final EntityModel referenceFieldModel = release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public RunAutomatedEntityModel setRelease(final ReleaseEntityModel release){
			if (release == null) {
			    wrappedEntityModel.removeValue("release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("release", release.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Sprint
	* Description: The sprint that this run is associated with.
	*/
        public SprintEntityModel getSprint(){
    if (wrappedEntityModel.getValue("sprint") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel sprint = (ReferenceFieldModel) wrappedEntityModel.getValue("sprint");
	final EntityModel referenceFieldModel = sprint.getValue();
            return new SprintEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setSprint(final SprintEntityModel sprint){
			if (sprint == null) {
			    wrappedEntityModel.removeValue("sprint");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("sprint", sprint.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Program
	* Description: The program for this entity. Program can be used to partition entities by some dev mission, such as by group, sub-product, and so on.
	*/
        public ProgramEntityModel getProgram(){
    if (wrappedEntityModel.getValue("program") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel program = (ReferenceFieldModel) wrappedEntityModel.getValue("program");
	final EntityModel referenceFieldModel = program.getValue();
            return new ProgramEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setProgram(final ProgramEntityModel program){
			if (program == null) {
			    wrappedEntityModel.removeValue("program");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("program", program.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Defects
	* Description: The defects associated directly with this run.
	*/
        public java.util.Collection<DefectEntityModel> getDefect(){
        final MultiReferenceFieldModel defect = (MultiReferenceFieldModel) wrappedEntityModel.getValue("defect");
        if (defect == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = defect.getValue();
                        return value.stream().map(DefectEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunAutomatedEntityModel setDefect(final java.util.Collection<DefectEntityModel> defect){
	    if (defect == null) {
	        wrappedEntityModel.removeValue("defect");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = defect.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of defect must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("defect", entityModels));
            return this;
	}

    /**
	* Label: Problem
	* Description: For problematic tests, specifies the type of problem, such as, Continuously failing, Oscillating, and Continuously skipped.
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
	* Label: Error type
	* Description: The type of the error, such as In progress, Passed, and Failed.
	*/
    public String getErrorType(){
	    final FieldModel error_type = wrappedEntityModel.getValue("error_type");
	    return error_type == null ? null : (String) error_type.getValue();
	}

        /**
	* Label: Failure age
	* Description: The number of builds for which the test run has been failing consecutively.
	*/
    public Long getFailedBuildAge(){
	    final FieldModel failed_build_age = wrappedEntityModel.getValue("failed_build_age");
	    return failed_build_age == null ? null : (Long) failed_build_age.getValue();
	}

        /**
	* Label: Last modified
	* Description: The date and time the entity was last modified, according to the ISO-8601 date format.
	*/
    public java.time.ZonedDateTime getLastModified(){
	    final FieldModel last_modified = wrappedEntityModel.getValue("last_modified");
	    return last_modified == null ? null : (java.time.ZonedDateTime) last_modified.getValue();
	}

        /**
	* Label: Error message
	* Description: Message for the error.
	*/
    public String getErrorMessage(){
	    final FieldModel error_message = wrappedEntityModel.getValue("error_message");
	    return error_message == null ? null : (String) error_message.getValue();
	}

        /**
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RunAutomatedEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Package
	* Description: The package of the test.
	*/
    public String getPackage(){
	    final FieldModel _package = wrappedEntityModel.getValue("package");
	    return _package == null ? null : (String) _package.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public RunAutomatedEntityModel setPackage(final String _package){
        if (_package == null) {
            wrappedEntityModel.removeValue("package");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("package", _package));
        }
        return this;
	}

    /**
	* Label: Test
	* Description: The run's test.
	*/
        public TestAutomatedEntityModel getTest(){
    if (wrappedEntityModel.getValue("test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test = (ReferenceFieldModel) wrappedEntityModel.getValue("test");
	final EntityModel referenceFieldModel = test.getValue();
            return new TestAutomatedEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunAutomatedEntityModel setTest(final TestAutomatedEntityModel test){
			if (test == null) {
			    wrappedEntityModel.removeValue("test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test", test.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Author
	* Description: The workspace user that created the entity.
	*/
        public WorkspaceUserEntityModel getAuthor(){
    if (wrappedEntityModel.getValue("author") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel author = (ReferenceFieldModel) wrappedEntityModel.getValue("author");
	final EntityModel referenceFieldModel = author.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Run by
	* Description: The user assigned to this run or has actually run it.
	*/
        public WorkspaceUserEntityModel getRunBy(){
    if (wrappedEntityModel.getValue("run_by") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel run_by = (ReferenceFieldModel) wrappedEntityModel.getValue("run_by");
	final EntityModel referenceFieldModel = run_by.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setRunBy(final WorkspaceUserEntityModel runBy){
			if (runBy == null) {
			    wrappedEntityModel.removeValue("run_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("run_by", runBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Application modules
	* Description: 
	*/
        public java.util.Collection<ProductAreaEntityModel> getProductAreas(){
        final MultiReferenceFieldModel product_areas = (MultiReferenceFieldModel) wrappedEntityModel.getValue("product_areas");
        if (product_areas == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = product_areas.getValue();
                        return value.stream().map(ProductAreaEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Tags
	* Description: A user-defined label for an entity.  Tags for a entity might be 'Showstopper' or 'Limitation.'
	*/
        public java.util.Collection<UserTagEntityModel> getUserTags(){
        final MultiReferenceFieldModel user_tags = (MultiReferenceFieldModel) wrappedEntityModel.getValue("user_tags");
        if (user_tags == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = user_tags.getValue();
                        return value.stream().map(UserTagEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunAutomatedEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
	    if (userTags == null) {
	        wrappedEntityModel.removeValue("user_tags");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = userTags.stream().map(entityModel -> {
		    if (entityModel instanceof UserTagEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of userTags must be of types {UserTagEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("user_tags", entityModels));
            return this;
	}

    /**
	* Label: Testing tool type
	* Description: The tool used for the test, such as LoadRunner Professional, UFT One, Selenium, LoadRunner Cloud, UFT Developer, and Manual Runner. 
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.testing_tool_type.TestingToolType getTestingToolType() {
    if (wrappedEntityModel.getValue("testing_tool_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel testing_tool_type = (ReferenceFieldModel) wrappedEntityModel.getValue("testing_tool_type");
    final EntityModel referenceFieldModel = testing_tool_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.testing_tool_type.TestingToolType.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Has comments
	* Description: Indication of whether the entity has comments.
	*/
    public Boolean getHasComments(){
	    final FieldModel has_comments = wrappedEntityModel.getValue("has_comments");
	    return has_comments == null ? null : (Boolean) has_comments.getValue();
	}

        /**
	* Label: Environment
	* Description: The list of taxonomies defined for this run (also known as environments).
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

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunAutomatedEntityModel setTaxonomies(final java.util.Collection<TaxonomyItemNodeEntityModel> taxonomies){
	    if (taxonomies == null) {
	        wrappedEntityModel.removeValue("taxonomies");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = taxonomies.stream().map(entityModel -> {
		    if (entityModel instanceof TaxonomyNodeEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of taxonomies must be of types {TaxonomyNodeEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("taxonomies", entityModels));
            return this;
	}

    /**
	* Label: Draft run
	* Description: Whether the automated run is a draft. Coverage metrics are not affected by draft run results.
	*/
    public Boolean getDraftRun(){
	    final FieldModel draft_run = wrappedEntityModel.getValue("draft_run");
	    return draft_run == null ? null : (Boolean) draft_run.getValue();
	}

        /**
	* Label: Name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public RunAutomatedEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Test name
	* Description: The name of the test this run is associated with.
	*/
    public String getTestName(){
	    final FieldModel test_name = wrappedEntityModel.getValue("test_name");
	    return test_name == null ? null : (String) test_name.getValue();
	}

        /**
	* Label: Status
	* Description: Summarized status of the run, such as passed or failed.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_status.RunStatus getStatus() {
    if (wrappedEntityModel.getValue("status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel status = (ReferenceFieldModel) wrappedEntityModel.getValue("status");
    final EntityModel referenceFieldModel = status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_status.RunStatus.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Who's on it
	* Description: The user that is investigating the failures related to the automated run.
	*/
        public WorkspaceUserEntityModel getOnIt(){
    if (wrappedEntityModel.getValue("on_it") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel on_it = (ReferenceFieldModel) wrappedEntityModel.getValue("on_it");
	final EntityModel referenceFieldModel = on_it.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setOnIt(final WorkspaceUserEntityModel onIt){
			if (onIt == null) {
			    wrappedEntityModel.removeValue("on_it");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("on_it", onIt.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Latest pipeline run
	* Description: A reference to the last-run pipeline.
	*/
    public Boolean getLatestPipelineRun(){
	    final FieldModel latest_pipeline_run = wrappedEntityModel.getValue("latest_pipeline_run");
	    return latest_pipeline_run == null ? null : (Boolean) latest_pipeline_run.getValue();
	}

        /**
	* Label: Failed since build
	* Description: The build number in which the test run first failed.
	*/
    public Long getFailedSinceBuild(){
	    final FieldModel failed_since_build = wrappedEntityModel.getValue("failed_since_build");
	    return failed_since_build == null ? null : (Long) failed_since_build.getValue();
	}

        /**
	* Label: Description
	* Description: The description for the entity in rich text using html codes.
	*/
    public String getDescription(){
	    final FieldModel description = wrappedEntityModel.getValue("description");
	    return description == null ? null : (String) description.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RunAutomatedEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Duration
	* Description: ?
	*/
    public Long getDuration(){
	    final FieldModel duration = wrappedEntityModel.getValue("duration");
	    return duration == null ? null : (Long) duration.getValue();
	}

        /**
	* Label: Full error details
	* Description: Complete error details for the failed automated run.
	*/
    public Boolean getFullErrorDetails(){
	    final FieldModel full_error_details = wrappedEntityModel.getValue("full_error_details");
	    return full_error_details == null ? null : (Boolean) full_error_details.getValue();
	}

        /**
	* Label: Error details
	* Description: Summarized error details.
	*/
    public String getErrorDetails(){
	    final FieldModel error_details = wrappedEntityModel.getValue("error_details");
	    return error_details == null ? null : (String) error_details.getValue();
	}

        /**
	* Label: Failing since build
	* Description: Information about the build in which the test run first failed.
	*/
    public String getFailedSinceBuildInfo(){
	    final FieldModel failed_since_build_info = wrappedEntityModel.getValue("failed_since_build_info");
	    return failed_since_build_info == null ? null : (String) failed_since_build_info.getValue();
	}

        /**
	* Label: Content
	* Description: The number of steps in the run.
	*/
    public Long getStepsNum(){
	    final FieldModel steps_num = wrappedEntityModel.getValue("steps_num");
	    return steps_num == null ? null : (Long) steps_num.getValue();
	}

        /**
	* Label: Class name
	* Description: The class of the test.
	*/
    public String getClassName(){
	    final FieldModel class_name = wrappedEntityModel.getValue("class_name");
	    return class_name == null ? null : (String) class_name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public RunAutomatedEntityModel setClassName(final String className){
        if (className == null) {
            wrappedEntityModel.removeValue("class_name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("class_name", className));
        }
        return this;
	}

    /**
	* Label: Test run report url
	* Description: URL linking to a custom build report stored externally.
	*/
    public String getExternalReportUrl(){
	    final FieldModel external_report_url = wrappedEntityModel.getValue("external_report_url");
	    return external_report_url == null ? null : (String) external_report_url.getValue();
	}

        /**
	* Label: Comments
	* Description: Whether the entity has any comments associated with it.
	*/
        public java.util.Collection<CommentEntityModel> getComments(){
        final MultiReferenceFieldModel comments = (MultiReferenceFieldModel) wrappedEntityModel.getValue("comments");
        if (comments == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = comments.getValue();
                        return value.stream().map(CommentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Native status
	* Description: Status of the run, such as passed or failed.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus getNativeStatus() {
    if (wrappedEntityModel.getValue("native_status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel native_status = (ReferenceFieldModel) wrappedEntityModel.getValue("native_status");
    final EntityModel referenceFieldModel = native_status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Test level (initial)
	* Description: The level of the test, such as Integration Test, System Test, and Unit Test.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel getTestLevel() {
    if (wrappedEntityModel.getValue("test_level") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel test_level = (ReferenceFieldModel) wrappedEntityModel.getValue("test_level");
    final EntityModel referenceFieldModel = test_level.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Quality Stories
	* Description: The quality stories which are linked to this run.
	*/
        public java.util.Collection<QualityStoryEntityModel> getQualityStories(){
        final MultiReferenceFieldModel quality_stories = (MultiReferenceFieldModel) wrappedEntityModel.getValue("quality_stories");
        if (quality_stories == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = quality_stories.getValue();
                        return value.stream().map(QualityStoryEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunAutomatedEntityModel setQualityStories(final java.util.Collection<QualityStoryEntityModel> qualityStories){
	    if (qualityStories == null) {
	        wrappedEntityModel.removeValue("quality_stories");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = qualityStories.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of qualityStories must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("quality_stories", entityModels));
            return this;
	}

    /**
	* Label: Started
	* Description: The date and time the run was started, according to the ISO-8601 date format.
	*/
    public java.time.ZonedDateTime getStarted(){
	    final FieldModel started = wrappedEntityModel.getValue("started");
	    return started == null ? null : (java.time.ZonedDateTime) started.getValue();
	}

        /**
	* Label: Last modified by
	* Description: The user who last modified the run.
	*/
        public WorkspaceUserEntityModel getLastModifiedBy(){
    if (wrappedEntityModel.getValue("last_modified_by") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel last_modified_by = (ReferenceFieldModel) wrappedEntityModel.getValue("last_modified_by");
	final EntityModel referenceFieldModel = last_modified_by.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public RunAutomatedEntityModel setLastModifiedBy(final WorkspaceUserEntityModel lastModifiedBy){
			if (lastModifiedBy == null) {
			    wrappedEntityModel.removeValue("last_modified_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("last_modified_by", lastModifiedBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Test type
	* Description: The type of the test, such as Acceptance, End to End, Regression, Sanity, Security, and Performance.
	*/
        public java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType> getTestType() {
    final MultiReferenceFieldModel test_type = (MultiReferenceFieldModel) wrappedEntityModel.getValue("test_type");
    if (test_type == null) {
return new java.util.ArrayList();
}
final java.util.Collection
<EntityModel> value = test_type.getValue();
	return value.stream().map(com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType::getFromEntityModel)
	    .collect(java.util.stream.Collectors.toList());

    }

                @FieldMetadata(filterable = true, sortable = false, required = false)
	public RunAutomatedEntityModel setTestType(final java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType> test_type) {
        if (test_type == null) {
            wrappedEntityModel.removeValue("test_type");
            return this;
        }

        java.util.Collection<EntityModel> entityModels = test_type.stream()
            .map(com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType::getAsEntityModel).collect(java.util.stream.Collectors.toList());
        wrappedEntityModel.setValue(new MultiReferenceFieldModel("test_type", entityModels));
        return this;
	}
    /**
	* Label: Pipeline
	* Description: Name of the pipeline that runs this automated test.
	*/
        public PipelineEntityModel getPipeline(){
    if (wrappedEntityModel.getValue("pipeline") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel pipeline = (ReferenceFieldModel) wrappedEntityModel.getValue("pipeline");
	final EntityModel referenceFieldModel = pipeline.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

        /**
	* Label: Component
	* Description: The component of the test.
	*/
    public String getComponent(){
	    final FieldModel component = wrappedEntityModel.getValue("component");
	    return component == null ? null : (String) component.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public RunAutomatedEntityModel setComponent(final String component){
        if (component == null) {
            wrappedEntityModel.removeValue("component");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("component", component));
        }
        return this;
	}

    /**
	* Label: Suite run
	* Description: The suite run in which this run is included.
	*/
        public RunSuiteEntityModel getParentSuite(){
    if (wrappedEntityModel.getValue("parent_suite") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel parent_suite = (ReferenceFieldModel) wrappedEntityModel.getValue("parent_suite");
	final EntityModel referenceFieldModel = parent_suite.getValue();
            return new RunSuiteEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public RunAutomatedEntityModel setParentSuite(final RunSuiteEntityModel parentSuite){
			if (parentSuite == null) {
			    wrappedEntityModel.removeValue("parent_suite");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent_suite", parentSuite.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Assigned to ("On it")
	* Description: 
	*/
        public WorkspaceUserEntityModel getMergedOnIt(){
    if (wrappedEntityModel.getValue("merged_on_it") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel merged_on_it = (ReferenceFieldModel) wrappedEntityModel.getValue("merged_on_it");
	final EntityModel referenceFieldModel = merged_on_it.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setMergedOnIt(final WorkspaceUserEntityModel mergedOnIt){
			if (mergedOnIt == null) {
			    wrappedEntityModel.removeValue("merged_on_it");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("merged_on_it", mergedOnIt.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Milestone
	* Description: The milestone that this run is associated with.
	*/
        public MilestoneEntityModel getMilestone(){
    if (wrappedEntityModel.getValue("milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("milestone");
	final EntityModel referenceFieldModel = milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RunAutomatedEntityModel setMilestone(final MilestoneEntityModel milestone){
			if (milestone == null) {
			    wrappedEntityModel.removeValue("milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("milestone", milestone.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Build number
	* Description: A link (reference) to the corresponding build for the automated test run.
	*/
        public CiBuildEntityModel getBuild(){
    if (wrappedEntityModel.getValue("build") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel build = (ReferenceFieldModel) wrappedEntityModel.getValue("build");
	final EntityModel referenceFieldModel = build.getValue();
            return new CiBuildEntityModel(referenceFieldModel);
    }

        /**
	* Label: Build report url
	* Description: A link to custom build reports created by the pipeline build. Configure a URL or URL template for custom report links in your pipeline step. ALM Octane adds the links to the test runs that are created as part of this pipeline step and to the build that is the result of this step.
	*/
    public String getCustomReportLink(){
	    final FieldModel custom_report_link = wrappedEntityModel.getValue("custom_report_link");
	    return custom_report_link == null ? null : (String) custom_report_link.getValue();
	}

        /**
	* Label: Test framework
	* Description: The framework for the test, such as JUnit, UFT, and TestNG.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework.Framework getTestFramework() {
    if (wrappedEntityModel.getValue("test_framework") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel test_framework = (ReferenceFieldModel) wrappedEntityModel.getValue("test_framework");
    final EntityModel referenceFieldModel = test_framework.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework.Framework.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Status age
	* Description: the amount of consecutive run status.
	*/
    public Long getStatusAge(){
	    final FieldModel status_age = wrappedEntityModel.getValue("status_age");
	    return status_age == null ? null : (Long) status_age.getValue();
	}

    }




















