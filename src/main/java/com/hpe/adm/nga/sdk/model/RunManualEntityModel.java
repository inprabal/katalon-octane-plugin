package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: run_manual</p>
 * <p>Label: Run Manual</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "manual_runs", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class RunManualEntityModel extends TypedEntityModel implements RunManualEntity {

    public RunManualEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "run_manual"));
    }

    public RunManualEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RunManualEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus native_status, final ReleaseEntityModel release, final GherkinTestEntityModel test) {
        this();
                    setName(name);
            setNativeStatus(native_status);
            setRelease(release);
            setTest(test);
        }
        public RunManualEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus native_status, final ReleaseEntityModel release, final TestManualEntityModel test) {
        this();
                    setName(name);
            setNativeStatus(native_status);
            setRelease(release);
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
	* Label: Backlog Coverage
	* Description: 
	*/
        @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getCoveredContent(){
        final MultiReferenceFieldModel covered_content = (MultiReferenceFieldModel) wrappedEntityModel.getValue("covered_content");
        if (covered_content == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = covered_content.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public RunManualEntityModel setCoveredContent(final java.util.Collection<WorkItemEntity> coveredContent){
	    if (coveredContent == null) {
	        wrappedEntityModel.removeValue("covered_content");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = coveredContent.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of coveredContent must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("covered_content", entityModels));
            return this;
	}

    /**
	* Label: Run steps
	* Description: The steps in this run.
	*/
        public java.util.Collection<RunStepEntityModel> getRunSteps(){
        final MultiReferenceFieldModel run_steps = (MultiReferenceFieldModel) wrappedEntityModel.getValue("run_steps");
        if (run_steps == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = run_steps.getValue();
                        return value.stream().map(RunStepEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
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

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunManualEntityModel setRelease(final ReleaseEntityModel release){
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
        public RunManualEntityModel setSprint(final SprintEntityModel sprint){
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
        public RunManualEntityModel setProgram(final ProgramEntityModel program){
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
    	public RunManualEntityModel setDefect(final java.util.Collection<DefectEntityModel> defect){
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
	* Label: Test version
	* Description: 
	*/
        public TestVersionEntityModel getTestVersion(){
    if (wrappedEntityModel.getValue("test_version") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test_version = (ReferenceFieldModel) wrappedEntityModel.getValue("test_version");
	final EntityModel referenceFieldModel = test_version.getValue();
            return new TestVersionEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = false, sortable = true, required = false)
        public RunManualEntityModel setTestVersion(final TestVersionEntityModel testVersion){
			if (testVersion == null) {
			    wrappedEntityModel.removeValue("test_version");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test_version", testVersion.getWrappedEntityModel()));
            }
            return this;
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
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RunManualEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Test
	* Description: The run's test.
	*/
        @AllowedReferences({TestManualEntityModel.class, GherkinTestEntityModel.class, })
public <T extends TestEntity> T getTest(){
    if (wrappedEntityModel.getValue("test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test = (ReferenceFieldModel) wrappedEntityModel.getValue("test");
	final EntityModel referenceFieldModel = test.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("test_manual")) {
			    return (T) new TestManualEntityModel(referenceFieldModel);
			}else if (referenceType.equals("gherkin_test")) {
			    return (T) new GherkinTestEntityModel(referenceFieldModel);
			}                return (T) new TestEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunManualEntityModel setTest(final TestManualEntityModel test){
			if (test == null) {
			    wrappedEntityModel.removeValue("test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test", test.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunManualEntityModel setTest(final GherkinTestEntityModel test){
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
        public RunManualEntityModel setAuthor(final WorkspaceUserEntityModel author){
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
        public RunManualEntityModel setRunBy(final WorkspaceUserEntityModel runBy){
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
    	public RunManualEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
    	public RunManualEntityModel setTaxonomies(final java.util.Collection<TaxonomyItemNodeEntityModel> taxonomies){
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
	* Label: Test phase (initial)
	* Description: 
	*/
        public PhaseEntityModel getTestPhase(){
    if (wrappedEntityModel.getValue("test_phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test_phase = (ReferenceFieldModel) wrappedEntityModel.getValue("test_phase");
	final EntityModel referenceFieldModel = test_phase.getValue();
            return new PhaseEntityModel(referenceFieldModel);
    }

        /**
	* Label: Draft run
	* Description: Whether the manual run is a draft. Coverage metrics are not affected by draft run results.
	*/
    public Boolean getDraftRun(){
	    final FieldModel draft_run = wrappedEntityModel.getValue("draft_run");
	    return draft_run == null ? null : (Boolean) draft_run.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public RunManualEntityModel setDraftRun(final Boolean draftRun){
        if (draftRun == null) {
            wrappedEntityModel.removeValue("draft_run");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("draft_run", draftRun));
        }
        return this;
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
	public RunManualEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Test name (initial)
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
	* Label: Attachments
	* Description: References to the attachments of the entity.
	*/
        public java.util.Collection<AttachmentEntityModel> getAttachments(){
        final MultiReferenceFieldModel attachments = (MultiReferenceFieldModel) wrappedEntityModel.getValue("attachments");
        if (attachments == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = attachments.getValue();
                        return value.stream().map(AttachmentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunManualEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
	    if (attachments == null) {
	        wrappedEntityModel.removeValue("attachments");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = attachments.stream().map(entityModel -> {
		    if (entityModel instanceof AttachmentEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of attachments must be of types {AttachmentEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("attachments", entityModels));
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
	* Label: Description
	* Description: The description for the entity in rich text using html codes.
	*/
    public String getDescription(){
	    final FieldModel description = wrappedEntityModel.getValue("description");
	    return description == null ? null : (String) description.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RunManualEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Duration
	* Description: 
	*/
    public Long getDuration(){
	    final FieldModel duration = wrappedEntityModel.getValue("duration");
	    return duration == null ? null : (Long) duration.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public RunManualEntityModel setDuration(final Long duration){
        if (duration == null) {
            wrappedEntityModel.removeValue("duration");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("duration", duration));
        }
        return this;
	}

    /**
	* Label: Content
	* Description: The number of run steps in the run.
	*/
    public Long getStepsNum(){
	    final FieldModel steps_num = wrappedEntityModel.getValue("steps_num");
	    return steps_num == null ? null : (Long) steps_num.getValue();
	}

        /**
	* Label: Has attachments
	* Description: Whether the entity has an attachment.
	*/
    public Boolean getHasAttachments(){
	    final FieldModel has_attachments = wrappedEntityModel.getValue("has_attachments");
	    return has_attachments == null ? null : (Boolean) has_attachments.getValue();
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
	* Description: The run's status. For example Planned, Passed, Failed, Not completed or Blocked.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus getNativeStatus() {
    if (wrappedEntityModel.getValue("native_status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel native_status = (ReferenceFieldModel) wrappedEntityModel.getValue("native_status");
    final EntityModel referenceFieldModel = native_status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = true)
	public RunManualEntityModel setNativeStatus(final com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus native_status) {
    if (native_status == null) {
	    wrappedEntityModel.removeValue("native_status");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("native_status", native_status.getAsEntityModel()));
    }
    return this;
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
    	public RunManualEntityModel setQualityStories(final java.util.Collection<QualityStoryEntityModel> qualityStories){
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
	* Label: BDD Spec name (initial)
	* Description: The name of the BDD Spec this run is associated with.
	*/
    public String getBddSpecName(){
	    final FieldModel bdd_spec_name = wrappedEntityModel.getValue("bdd_spec_name");
	    return bdd_spec_name == null ? null : (String) bdd_spec_name.getValue();
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
        public RunManualEntityModel setLastModifiedBy(final WorkspaceUserEntityModel lastModifiedBy){
			if (lastModifiedBy == null) {
			    wrappedEntityModel.removeValue("last_modified_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("last_modified_by", lastModifiedBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Version from Release
	* Description: 
	*/
        public ReleaseEntityModel getPreviousRelease(){
    if (wrappedEntityModel.getValue("previous_release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel previous_release = (ReferenceFieldModel) wrappedEntityModel.getValue("previous_release");
	final EntityModel referenceFieldModel = previous_release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public RunManualEntityModel setPreviousRelease(final ReleaseEntityModel previousRelease){
			if (previousRelease == null) {
			    wrappedEntityModel.removeValue("previous_release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("previous_release", previousRelease.getWrappedEntityModel()));
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
	public RunManualEntityModel setTestType(final java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType> test_type) {
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
        public RunManualEntityModel setParentSuite(final RunSuiteEntityModel parentSuite){
			if (parentSuite == null) {
			    wrappedEntityModel.removeValue("parent_suite");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent_suite", parentSuite.getWrappedEntityModel()));
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
        public RunManualEntityModel setMilestone(final MilestoneEntityModel milestone){
			if (milestone == null) {
			    wrappedEntityModel.removeValue("milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("milestone", milestone.getWrappedEntityModel()));
            }
            return this;
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




















