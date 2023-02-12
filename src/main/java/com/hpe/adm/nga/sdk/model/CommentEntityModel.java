package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: comment</p>
 * <p>Label: Comment</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "comments", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class CommentEntityModel extends TypedEntityModel implements CommentEntity {

    public CommentEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "comment"));
    }

    public CommentEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
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
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
	}

        /**
	* Label: Owner work item
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, EpicEntityModel.class, StoryEntityModel.class, WorkItemRootEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public <T extends WorkItemEntity> T getOwnerWorkItem(){
    if (wrappedEntityModel.getValue("owner_work_item") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_work_item = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_work_item");
	final EntityModel referenceFieldModel = owner_work_item.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("defect")) {
			    return (T) new DefectEntityModel(referenceFieldModel);
			}else if (referenceType.equals("feature")) {
			    return (T) new FeatureEntityModel(referenceFieldModel);
			}else if (referenceType.equals("quality_story")) {
			    return (T) new QualityStoryEntityModel(referenceFieldModel);
			}else if (referenceType.equals("epic")) {
			    return (T) new EpicEntityModel(referenceFieldModel);
			}else if (referenceType.equals("work_item_root")) {
			    return (T) new WorkItemRootEntityModel(referenceFieldModel);
			}else if (referenceType.equals("story")) {
			    return (T) new StoryEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final DefectEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final FeatureEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final QualityStoryEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final EpicEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final WorkItemRootEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerWorkItem(final StoryEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public CommentEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public CommentEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Text
	* Description: The text of the comment.
	*/
    public String getText(){
	    final FieldModel text = wrappedEntityModel.getValue("text");
	    return text == null ? null : (String) text.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public CommentEntityModel setText(final String text){
        if (text == null) {
            wrappedEntityModel.removeValue("text");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("text", text));
        }
        return this;
	}

    /**
	* Label: Owner planning info
	* Description: 
	*/
        public PlanningInfoEntityModel getOwnerPlanningInfo(){
    if (wrappedEntityModel.getValue("owner_planning_info") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_planning_info = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_planning_info");
	final EntityModel referenceFieldModel = owner_planning_info.getValue();
            return new PlanningInfoEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerPlanningInfo(final PlanningInfoEntityModel ownerPlanningInfo){
			if (ownerPlanningInfo == null) {
			    wrappedEntityModel.removeValue("owner_planning_info");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_planning_info", ownerPlanningInfo.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner requirement
	* Description: 
	*/
        @AllowedReferences({RequirementDocumentEntityModel.class, RequirementFolderEntityModel.class, })
public <T extends RequirementEntity> T getOwnerRequirement(){
    if (wrappedEntityModel.getValue("owner_requirement") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_requirement = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_requirement");
	final EntityModel referenceFieldModel = owner_requirement.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("requirement_folder")) {
			    return (T) new RequirementFolderEntityModel(referenceFieldModel);
			}else if (referenceType.equals("requirement_document")) {
			    return (T) new RequirementDocumentEntityModel(referenceFieldModel);
			}                return (T) new RequirementEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRequirement(final RequirementFolderEntityModel ownerRequirement){
			if (ownerRequirement == null) {
			    wrappedEntityModel.removeValue("owner_requirement");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_requirement", ownerRequirement.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRequirement(final RequirementDocumentEntityModel ownerRequirement){
			if (ownerRequirement == null) {
			    wrappedEntityModel.removeValue("owner_requirement");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_requirement", ownerRequirement.getWrappedEntityModel()));
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
	* Label: Owner pipeline
	* Description: 
	*/
        public PipelineEntityModel getOwnerPipeline(){
    if (wrappedEntityModel.getValue("owner_pipeline") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_pipeline = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_pipeline");
	final EntityModel referenceFieldModel = owner_pipeline.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerPipeline(final PipelineEntityModel ownerPipeline){
			if (ownerPipeline == null) {
			    wrappedEntityModel.removeValue("owner_pipeline");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_pipeline", ownerPipeline.getWrappedEntityModel()));
            }
            return this;
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
	public CommentEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
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
        public CommentEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner task
	* Description: 
	*/
        public TaskEntityModel getOwnerTask(){
    if (wrappedEntityModel.getValue("owner_task") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_task = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_task");
	final EntityModel referenceFieldModel = owner_task.getValue();
            return new TaskEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerTask(final TaskEntityModel ownerTask){
			if (ownerTask == null) {
			    wrappedEntityModel.removeValue("owner_task");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_task", ownerTask.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner test
	* Description: 
	*/
        @AllowedReferences({TestManualEntityModel.class, TestSuiteEntityModel.class, GherkinTestEntityModel.class, TestAutomatedEntityModel.class, })
public <T extends TestEntity> T getOwnerTest(){
    if (wrappedEntityModel.getValue("owner_test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_test = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_test");
	final EntityModel referenceFieldModel = owner_test.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("test_automated")) {
			    return (T) new TestAutomatedEntityModel(referenceFieldModel);
			}else if (referenceType.equals("test_suite")) {
			    return (T) new TestSuiteEntityModel(referenceFieldModel);
			}else if (referenceType.equals("test_manual")) {
			    return (T) new TestManualEntityModel(referenceFieldModel);
			}else if (referenceType.equals("gherkin_test")) {
			    return (T) new GherkinTestEntityModel(referenceFieldModel);
			}                return (T) new TestEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerTest(final TestAutomatedEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerTest(final TestSuiteEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerTest(final TestManualEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerTest(final GherkinTestEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner run
	* Description: 
	*/
        @AllowedReferences({GherkinAutomatedRunEntityModel.class, RunManualEntityModel.class, RunSuiteEntityModel.class, RunAutomatedEntityModel.class, })
public <T extends RunEntity> T getOwnerRun(){
    if (wrappedEntityModel.getValue("owner_run") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_run = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_run");
	final EntityModel referenceFieldModel = owner_run.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("run_suite")) {
			    return (T) new RunSuiteEntityModel(referenceFieldModel);
			}else if (referenceType.equals("run_manual")) {
			    return (T) new RunManualEntityModel(referenceFieldModel);
			}else if (referenceType.equals("run_automated")) {
			    return (T) new RunAutomatedEntityModel(referenceFieldModel);
			}else if (referenceType.equals("gherkin_automated_run")) {
			    return (T) new GherkinAutomatedRunEntityModel(referenceFieldModel);
			}                return (T) new RunEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRun(final RunSuiteEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRun(final RunManualEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRun(final RunAutomatedEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public CommentEntityModel setOwnerRun(final GherkinAutomatedRunEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

                }




















