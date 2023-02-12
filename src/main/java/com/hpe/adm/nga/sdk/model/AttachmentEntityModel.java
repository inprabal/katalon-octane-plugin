package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: attachment</p>
 * <p>Label: Attachment</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "attachments", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class AttachmentEntityModel extends TypedEntityModel implements AttachmentEntity {

    public AttachmentEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "attachment"));
    }

    public AttachmentEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public AttachmentEntityModel(    final String name) {
        this();
                    setName(name);
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
	* Description: A reference to the item under which this attachement was created.
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
        public AttachmentEntityModel setOwnerWorkItem(final DefectEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerWorkItem(final FeatureEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerWorkItem(final QualityStoryEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerWorkItem(final EpicEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerWorkItem(final WorkItemRootEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerWorkItem(final StoryEntityModel ownerWorkItem){
			if (ownerWorkItem == null) {
			    wrappedEntityModel.removeValue("owner_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_work_item", ownerWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Description
	* Description: The description for the entity in rich text using html codes.
	*/
    public String getDescription(){
	    final FieldModel description = wrappedEntityModel.getValue("description");
	    return description == null ? null : (String) description.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 2000L)
	public AttachmentEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
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
	public AttachmentEntityModel setActivityLevel(final Long activityLevel){
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
	public AttachmentEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Owner release
	* Description: A reference to the item under which this attachement was created.
	*/
        public ReleaseEntityModel getOwnerRelease(){
    if (wrappedEntityModel.getValue("owner_release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_release = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_release");
	final EntityModel referenceFieldModel = owner_release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerRelease(final ReleaseEntityModel ownerRelease){
			if (ownerRelease == null) {
			    wrappedEntityModel.removeValue("owner_release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_release", ownerRelease.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner planning info
	* Description: A reference to the item under which this attachement was created.
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
        public AttachmentEntityModel setOwnerPlanningInfo(final PlanningInfoEntityModel ownerPlanningInfo){
			if (ownerPlanningInfo == null) {
			    wrappedEntityModel.removeValue("owner_planning_info");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_planning_info", ownerPlanningInfo.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner requirement
	* Description: A reference to the item under which this attachement was created.
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
        public AttachmentEntityModel setOwnerRequirement(final RequirementFolderEntityModel ownerRequirement){
			if (ownerRequirement == null) {
			    wrappedEntityModel.removeValue("owner_requirement");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_requirement", ownerRequirement.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerRequirement(final RequirementDocumentEntityModel ownerRequirement){
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
	* Label: Owner milestone
	* Description: A reference to the item under which this attachement was created.
	*/
        public MilestoneEntityModel getOwnerMilestone(){
    if (wrappedEntityModel.getValue("owner_milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_milestone");
	final EntityModel referenceFieldModel = owner_milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerMilestone(final MilestoneEntityModel ownerMilestone){
			if (ownerMilestone == null) {
			    wrappedEntityModel.removeValue("owner_milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_milestone", ownerMilestone.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner product area
	* Description: A reference to the item under which this attachement was created.
	*/
        public ProductAreaEntityModel getOwnerProductArea(){
    if (wrappedEntityModel.getValue("owner_product_area") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_product_area = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_product_area");
	final EntityModel referenceFieldModel = owner_product_area.getValue();
            return new ProductAreaEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerProductArea(final ProductAreaEntityModel ownerProductArea){
			if (ownerProductArea == null) {
			    wrappedEntityModel.removeValue("owner_product_area");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_product_area", ownerProductArea.getWrappedEntityModel()));
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
	public AttachmentEntityModel setClientLockStamp(final Long clientLockStamp){
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
        public AttachmentEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner task
	* Description: A reference to the item under which this attachement was created.
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
        public AttachmentEntityModel setOwnerTask(final TaskEntityModel ownerTask){
			if (ownerTask == null) {
			    wrappedEntityModel.removeValue("owner_task");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_task", ownerTask.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner test
	* Description: A reference to the item under which this attachement was created.
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
        public AttachmentEntityModel setOwnerTest(final TestAutomatedEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerTest(final TestSuiteEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerTest(final TestManualEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerTest(final GherkinTestEntityModel ownerTest){
			if (ownerTest == null) {
			    wrappedEntityModel.removeValue("owner_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_test", ownerTest.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner run step
	* Description: A reference to the item under which this attachement was created.
	*/
        public RunStepEntityModel getOwnerRunStep(){
    if (wrappedEntityModel.getValue("owner_run_step") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner_run_step = (ReferenceFieldModel) wrappedEntityModel.getValue("owner_run_step");
	final EntityModel referenceFieldModel = owner_run_step.getValue();
            return new RunStepEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerRunStep(final RunStepEntityModel ownerRunStep){
			if (ownerRunStep == null) {
			    wrappedEntityModel.removeValue("owner_run_step");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run_step", ownerRunStep.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Owner run
	* Description: A reference to the item under which this attachement was created.
	*/
        @AllowedReferences({RunManualEntityModel.class, RunSuiteEntityModel.class, })
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
			}                return (T) new RunEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerRun(final RunSuiteEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public AttachmentEntityModel setOwnerRun(final RunManualEntityModel ownerRun){
			if (ownerRun == null) {
			    wrappedEntityModel.removeValue("owner_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner_run", ownerRun.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Size
	* Description: The size of the attachment file
	*/
    public Long getSize(){
	    final FieldModel size = wrappedEntityModel.getValue("size");
	    return size == null ? null : (Long) size.getValue();
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
	public AttachmentEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

}




















