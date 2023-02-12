package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: user_item</p>
 * <p>Label: User Item</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "user_items", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class UserItemEntityModel extends TypedEntityModel implements UserItemEntity {

    public UserItemEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "user_item"));
    }

    public UserItemEntityModel(final EntityModel wrappedEntityModel) {
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
	* Label: Reason
	* Description: 
	*/
    public String getReason(){
	    final FieldModel reason = wrappedEntityModel.getValue("reason");
	    return reason == null ? null : (String) reason.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public UserItemEntityModel setReason(final String reason){
        if (reason == null) {
            wrappedEntityModel.removeValue("reason");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("reason", reason));
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
	public UserItemEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
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
	* Label: Linked task
	* Description: 
	*/
        public TaskEntityModel getMyFollowItemsTask(){
    if (wrappedEntityModel.getValue("my_follow_items_task") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel my_follow_items_task = (ReferenceFieldModel) wrappedEntityModel.getValue("my_follow_items_task");
	final EntityModel referenceFieldModel = my_follow_items_task.getValue();
            return new TaskEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsTask(final TaskEntityModel myFollowItemsTask){
			if (myFollowItemsTask == null) {
			    wrappedEntityModel.removeValue("my_follow_items_task");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_task", myFollowItemsTask.getWrappedEntityModel()));
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
	public UserItemEntityModel setActivityLevel(final Long activityLevel){
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
	public UserItemEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Entity type
	* Description: 
	*/
    public String getEntityType(){
	    final FieldModel entity_type = wrappedEntityModel.getValue("entity_type");
	    return entity_type == null ? null : (String) entity_type.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public UserItemEntityModel setEntityType(final String entityType){
        if (entityType == null) {
            wrappedEntityModel.removeValue("entity_type");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("entity_type", entityType));
        }
        return this;
	}

    /**
	* Label: Linked run
	* Description: 
	*/
        @AllowedReferences({RunManualEntityModel.class, RunSuiteEntityModel.class, })
public <T extends RunEntity> T getMyFollowItemsRun(){
    if (wrappedEntityModel.getValue("my_follow_items_run") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel my_follow_items_run = (ReferenceFieldModel) wrappedEntityModel.getValue("my_follow_items_run");
	final EntityModel referenceFieldModel = my_follow_items_run.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("run_suite")) {
			    return (T) new RunSuiteEntityModel(referenceFieldModel);
			}else if (referenceType.equals("run_manual")) {
			    return (T) new RunManualEntityModel(referenceFieldModel);
			}                return (T) new RunEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsRun(final RunSuiteEntityModel myFollowItemsRun){
			if (myFollowItemsRun == null) {
			    wrappedEntityModel.removeValue("my_follow_items_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_run", myFollowItemsRun.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsRun(final RunManualEntityModel myFollowItemsRun){
			if (myFollowItemsRun == null) {
			    wrappedEntityModel.removeValue("my_follow_items_run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_run", myFollowItemsRun.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Linked requirement
	* Description: 
	*/
        public RequirementDocumentEntityModel getMyFollowItemsRequirement(){
    if (wrappedEntityModel.getValue("my_follow_items_requirement") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel my_follow_items_requirement = (ReferenceFieldModel) wrappedEntityModel.getValue("my_follow_items_requirement");
	final EntityModel referenceFieldModel = my_follow_items_requirement.getValue();
            return new RequirementDocumentEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsRequirement(final RequirementDocumentEntityModel myFollowItemsRequirement){
			if (myFollowItemsRequirement == null) {
			    wrappedEntityModel.removeValue("my_follow_items_requirement");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_requirement", myFollowItemsRequirement.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Linked backlog item
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public <T extends WorkItemEntity> T getMyFollowItemsWorkItem(){
    if (wrappedEntityModel.getValue("my_follow_items_work_item") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel my_follow_items_work_item = (ReferenceFieldModel) wrappedEntityModel.getValue("my_follow_items_work_item");
	final EntityModel referenceFieldModel = my_follow_items_work_item.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("defect")) {
			    return (T) new DefectEntityModel(referenceFieldModel);
			}else if (referenceType.equals("feature")) {
			    return (T) new FeatureEntityModel(referenceFieldModel);
			}else if (referenceType.equals("quality_story")) {
			    return (T) new QualityStoryEntityModel(referenceFieldModel);
			}else if (referenceType.equals("story")) {
			    return (T) new StoryEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsWorkItem(final DefectEntityModel myFollowItemsWorkItem){
			if (myFollowItemsWorkItem == null) {
			    wrappedEntityModel.removeValue("my_follow_items_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_work_item", myFollowItemsWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsWorkItem(final FeatureEntityModel myFollowItemsWorkItem){
			if (myFollowItemsWorkItem == null) {
			    wrappedEntityModel.removeValue("my_follow_items_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_work_item", myFollowItemsWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsWorkItem(final QualityStoryEntityModel myFollowItemsWorkItem){
			if (myFollowItemsWorkItem == null) {
			    wrappedEntityModel.removeValue("my_follow_items_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_work_item", myFollowItemsWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsWorkItem(final StoryEntityModel myFollowItemsWorkItem){
			if (myFollowItemsWorkItem == null) {
			    wrappedEntityModel.removeValue("my_follow_items_work_item");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_work_item", myFollowItemsWorkItem.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: User
	* Description: 
	*/
        public WorkspaceUserEntityModel getUser(){
    if (wrappedEntityModel.getValue("user") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel user = (ReferenceFieldModel) wrappedEntityModel.getValue("user");
	final EntityModel referenceFieldModel = user.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setUser(final WorkspaceUserEntityModel user){
			if (user == null) {
			    wrappedEntityModel.removeValue("user");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("user", user.getWrappedEntityModel()));
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
	* Label: Linked test
	* Description: 
	*/
        @AllowedReferences({TestManualEntityModel.class, GherkinTestEntityModel.class, })
public <T extends TestEntity> T getMyFollowItemsTest(){
    if (wrappedEntityModel.getValue("my_follow_items_test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel my_follow_items_test = (ReferenceFieldModel) wrappedEntityModel.getValue("my_follow_items_test");
	final EntityModel referenceFieldModel = my_follow_items_test.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("test_manual")) {
			    return (T) new TestManualEntityModel(referenceFieldModel);
			}else if (referenceType.equals("gherkin_test")) {
			    return (T) new GherkinTestEntityModel(referenceFieldModel);
			}                return (T) new TestEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsTest(final TestManualEntityModel myFollowItemsTest){
			if (myFollowItemsTest == null) {
			    wrappedEntityModel.removeValue("my_follow_items_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_test", myFollowItemsTest.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public UserItemEntityModel setMyFollowItemsTest(final GherkinTestEntityModel myFollowItemsTest){
			if (myFollowItemsTest == null) {
			    wrappedEntityModel.removeValue("my_follow_items_test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("my_follow_items_test", myFollowItemsTest.getWrappedEntityModel()));
            }
            return this;
        }

                }




















