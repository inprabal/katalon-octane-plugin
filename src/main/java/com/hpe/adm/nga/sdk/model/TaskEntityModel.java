package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: task</p>
 * <p>Label: Task</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "tasks", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TaskEntityModel extends TypedEntityModel implements TaskEntity {

    public TaskEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "task"));
    }

    public TaskEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TaskEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.Phases.TaskPhase phase, final DefectEntityModel story) {
        this();
                    setName(name);
            setPhase(phase);
            setStory(story);
        }
        public TaskEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.Phases.TaskPhase phase, final QualityStoryEntityModel story) {
        this();
                    setName(name);
            setPhase(phase);
            setStory(story);
        }
        public TaskEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.Phases.TaskPhase phase, final StoryEntityModel story) {
        this();
                    setName(name);
            setPhase(phase);
            setStory(story);
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
    	public TaskEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
	}

        /**
	* Label: Release
	* Description: Reference to the ID of the release associated with the task.
	*/
    public String getRelease(){
	    final FieldModel release = wrappedEntityModel.getValue("release");
	    return release == null ? null : (String) release.getValue();
	}

        /**
	* Label: Type
	* Description: The type of the task, which can be research, develop, document, or test.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.task_item_type.TaskItemType getItemType() {
    if (wrappedEntityModel.getValue("item_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel item_type = (ReferenceFieldModel) wrappedEntityModel.getValue("item_type");
    final EntityModel referenceFieldModel = item_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.task_item_type.TaskItemType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public TaskEntityModel setItemType(final com.hpe.adm.nga.sdk.enums.lists.list_node.task_item_type.TaskItemType item_type) {
    if (item_type == null) {
	    wrappedEntityModel.removeValue("item_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("item_type", item_type.getAsEntityModel()));
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

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public TaskEntityModel setDescription(final String description){
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
	public TaskEntityModel setActivityLevel(final Long activityLevel){
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
	public TaskEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Invested hours
	* Description: Number of hours already invested in completing the task.
	*/
    public Long getInvestedHours(){
	    final FieldModel invested_hours = wrappedEntityModel.getValue("invested_hours");
	    return invested_hours == null ? null : (Long) invested_hours.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TaskEntityModel setInvestedHours(final Long investedHours){
        if (investedHours == null) {
            wrappedEntityModel.removeValue("invested_hours");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("invested_hours", investedHours));
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
	* Label: Owner
	* Description: Reference to the ID of the owner assigned to the task.
	*/
        public WorkspaceUserEntityModel getOwner(){
    if (wrappedEntityModel.getValue("owner") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner = (ReferenceFieldModel) wrappedEntityModel.getValue("owner");
	final EntityModel referenceFieldModel = owner.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public TaskEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Phase
	* Description: The status of an entity, such as New, Open, or Closed.
	*/
    public com.hpe.adm.nga.sdk.enums.Phases.TaskPhase getPhase() {
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
    final EntityModel referenceFieldModel = phase.getValue();
    return com.hpe.adm.nga.sdk.enums.Phases.TaskPhase.getFromEntityModel(referenceFieldModel);
}


            @FieldMetadata(filterable = true, sortable = true, required = true)
	public TaskEntityModel setPhase(final com.hpe.adm.nga.sdk.enums.Phases.TaskPhase phase) {
        if (phase == null) {
	        wrappedEntityModel.removeValue("phase");
        } else {
	        wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getAsEntityModel()));
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
	public TaskEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
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
        public TaskEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Remaining hours
	* Description: Number of hours left for completing the task.
	*/
    public Long getRemainingHours(){
	    final FieldModel remaining_hours = wrappedEntityModel.getValue("remaining_hours");
	    return remaining_hours == null ? null : (Long) remaining_hours.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TaskEntityModel setRemainingHours(final Long remainingHours){
        if (remainingHours == null) {
            wrappedEntityModel.removeValue("remaining_hours");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("remaining_hours", remainingHours));
        }
        return this;
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
	* Label: Name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public TaskEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Estimated hours
	* Description: Number of hours estimated to complete the task.
	*/
    public Long getEstimatedHours(){
	    final FieldModel estimated_hours = wrappedEntityModel.getValue("estimated_hours");
	    return estimated_hours == null ? null : (Long) estimated_hours.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TaskEntityModel setEstimatedHours(final Long estimatedHours){
        if (estimatedHours == null) {
            wrappedEntityModel.removeValue("estimated_hours");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("estimated_hours", estimatedHours));
        }
        return this;
	}

    /**
	* Label: Backlog item
	* Description: Reference to the ID of the story associated with the task.
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, DefectEntityModel.class, })
public <T extends WorkItemEntity> T getStory(){
    if (wrappedEntityModel.getValue("story") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel story = (ReferenceFieldModel) wrappedEntityModel.getValue("story");
	final EntityModel referenceFieldModel = story.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("defect")) {
			    return (T) new DefectEntityModel(referenceFieldModel);
			}else if (referenceType.equals("quality_story")) {
			    return (T) new QualityStoryEntityModel(referenceFieldModel);
			}else if (referenceType.equals("story")) {
			    return (T) new StoryEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TaskEntityModel setStory(final DefectEntityModel story){
			if (story == null) {
			    wrappedEntityModel.removeValue("story");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("story", story.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TaskEntityModel setStory(final QualityStoryEntityModel story){
			if (story == null) {
			    wrappedEntityModel.removeValue("story");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("story", story.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TaskEntityModel setStory(final StoryEntityModel story){
			if (story == null) {
			    wrappedEntityModel.removeValue("story");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("story", story.getWrappedEntityModel()));
            }
            return this;
        }

                }




















