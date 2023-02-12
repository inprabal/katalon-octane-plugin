package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: release</p>
 * <p>Label: Release</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "releases", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class ReleaseEntityModel extends TypedEntityModel implements ReleaseEntity {

    public ReleaseEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "release"));
    }

    public ReleaseEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public ReleaseEntityModel(    final java.time.ZonedDateTime end_date, final String name, final java.time.ZonedDateTime start_date) {
        this();
                    setEndDate(end_date);
            setName(name);
            setStartDate(start_date);
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
	* Label: Expected velocity
	* Description: Expected velocity for the release.
	*/
    public Long getExpectedVelocity(){
	    final FieldModel expected_velocity = wrappedEntityModel.getValue("expected_velocity");
	    return expected_velocity == null ? null : (Long) expected_velocity.getValue();
	}

        /**
	* Label: Sprint duration
	* Description: The duration, in days, of all the sprints in the release.
	*/
    public Long getSprintDuration(){
	    final FieldModel sprint_duration = wrappedEntityModel.getValue("sprint_duration");
	    return sprint_duration == null ? null : (Long) sprint_duration.getValue();
	}

            @FieldMetadata(filterable = false, sortable = true, required = false)
	public ReleaseEntityModel setSprintDuration(final Long sprintDuration){
        if (sprintDuration == null) {
            wrappedEntityModel.removeValue("sprint_duration");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("sprint_duration", sprintDuration));
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
	public ReleaseEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
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
	public ReleaseEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Done work
	* Description: The work in story points done so far in the release.
	*/
    public Long getDoneWork(){
	    final FieldModel done_work = wrappedEntityModel.getValue("done_work");
	    return done_work == null ? null : (Long) done_work.getValue();
	}

        /**
	* Label: Programs
	* Description: The program for this entity. Programs can be used to partition entities by some dev mission, such as by group, sub-product, and so on.
	*/
        public java.util.Collection<ProgramEntityModel> getPrograms(){
        final MultiReferenceFieldModel programs = (MultiReferenceFieldModel) wrappedEntityModel.getValue("programs");
        if (programs == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = programs.getValue();
                        return value.stream().map(ProgramEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public ReleaseEntityModel setPrograms(final java.util.Collection<ProgramEntityModel> programs){
	    if (programs == null) {
	        wrappedEntityModel.removeValue("programs");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = programs.stream().map(entityModel -> {
		    if (entityModel instanceof ProgramEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of programs must be of types {ProgramEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("programs", entityModels));
            return this;
	}

    /**
	* Label: End date
	* Description: The end date for the release.
	*/
    public java.time.ZonedDateTime getEndDate(){
	    final FieldModel end_date = wrappedEntityModel.getValue("end_date");
	    return end_date == null ? null : (java.time.ZonedDateTime) end_date.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true)
	public ReleaseEntityModel setEndDate(final java.time.ZonedDateTime endDate){
        if (endDate == null) {
            wrappedEntityModel.removeValue("end_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("end_date", endDate));
        }
        return this;
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
    	public ReleaseEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Features estimation
	* Description: The estimation, in story points, for completing all the features in the release.
	*/
    public Long getFeaturesEstimation(){
	    final FieldModel features_estimation = wrappedEntityModel.getValue("features_estimation");
	    return features_estimation == null ? null : (Long) features_estimation.getValue();
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
	public ReleaseEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Active status
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public ReleaseEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Active status
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public ReleaseEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Num of sprints
	* Description: The number of sprints in the release.
	*/
    public Long getNumOfSprints(){
	    final FieldModel num_of_sprints = wrappedEntityModel.getValue("num_of_sprints");
	    return num_of_sprints == null ? null : (Long) num_of_sprints.getValue();
	}

        /**
	* Label: Start date
	* Description: The start date for the release.
	*/
    public java.time.ZonedDateTime getStartDate(){
	    final FieldModel start_date = wrappedEntityModel.getValue("start_date");
	    return start_date == null ? null : (java.time.ZonedDateTime) start_date.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true)
	public ReleaseEntityModel setStartDate(final java.time.ZonedDateTime startDate){
        if (startDate == null) {
            wrappedEntityModel.removeValue("start_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("start_date", startDate));
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
	* Label: Remaining work
	* Description: The remaining work, in story points, for the release.
	*/
    public Long getRemainingWork(){
	    final FieldModel remaining_work = wrappedEntityModel.getValue("remaining_work");
	    return remaining_work == null ? null : (Long) remaining_work.getValue();
	}

        /**
	* Label: Type
	* Description: The Agile type for the release, such as Scrum and Kanban.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.release_agile_type.AgileType getAgileType() {
    if (wrappedEntityModel.getValue("agile_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel agile_type = (ReferenceFieldModel) wrappedEntityModel.getValue("agile_type");
    final EntityModel referenceFieldModel = agile_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.release_agile_type.AgileType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public ReleaseEntityModel setAgileType(final com.hpe.adm.nga.sdk.enums.lists.list_node.release_agile_type.AgileType agile_type) {
    if (agile_type == null) {
	    wrappedEntityModel.removeValue("agile_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("agile_type", agile_type.getAsEntityModel()));
    }
    return this;
	}
}




















