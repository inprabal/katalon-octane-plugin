package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: sprint</p>
 * <p>Label: Sprint</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "sprints", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class SprintEntityModel extends TypedEntityModel implements SprintEntity {

    public SprintEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "sprint"));
    }

    public SprintEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public SprintEntityModel(    final java.time.ZonedDateTime end_date, final String name, final ReleaseEntityModel release, final java.time.ZonedDateTime start_date) {
        this();
                    setEndDate(end_date);
            setName(name);
            setRelease(release);
            setStartDate(start_date);
        }
    



    /**
	* Label: End date
	* Description: The end date for the sprint.
	*/
    public java.time.ZonedDateTime getEndDate(){
	    final FieldModel end_date = wrappedEntityModel.getValue("end_date");
	    return end_date == null ? null : (java.time.ZonedDateTime) end_date.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true)
	public SprintEntityModel setEndDate(final java.time.ZonedDateTime endDate){
        if (endDate == null) {
            wrappedEntityModel.removeValue("end_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("end_date", endDate));
        }
        return this;
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
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public SprintEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Work days
	* Description: Total number of working days in the sprint.
	*/
    public Long getWorkingDays(){
	    final FieldModel working_days = wrappedEntityModel.getValue("working_days");
	    return working_days == null ? null : (Long) working_days.getValue();
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
	* Description: The release of the sprint.
	*/
        public ReleaseEntityModel getRelease(){
    if (wrappedEntityModel.getValue("release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel release = (ReferenceFieldModel) wrappedEntityModel.getValue("release");
	final EntityModel referenceFieldModel = release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public SprintEntityModel setRelease(final ReleaseEntityModel release){
			if (release == null) {
			    wrappedEntityModel.removeValue("release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("release", release.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Work days till
	* Description: The number of work days from today till the start of the sprint
	*/
    public Long getNumberOfWorkDaysTill(){
	    final FieldModel number_of_work_days_till = wrappedEntityModel.getValue("number_of_work_days_till");
	    return number_of_work_days_till == null ? null : (Long) number_of_work_days_till.getValue();
	}

        /**
	* Label: Remaining work days
	* Description: The number of remaining work days from today till the end of the sprint
	*/
    public Long getNumberOfRemainingWorkDays(){
	    final FieldModel number_of_remaining_work_days = wrappedEntityModel.getValue("number_of_remaining_work_days");
	    return number_of_remaining_work_days == null ? null : (Long) number_of_remaining_work_days.getValue();
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
	public SprintEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
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
	* Label: Start date
	* Description: The start date for the sprint.
	*/
    public java.time.ZonedDateTime getStartDate(){
	    final FieldModel start_date = wrappedEntityModel.getValue("start_date");
	    return start_date == null ? null : (java.time.ZonedDateTime) start_date.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true)
	public SprintEntityModel setStartDate(final java.time.ZonedDateTime startDate){
        if (startDate == null) {
            wrappedEntityModel.removeValue("start_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("start_date", startDate));
        }
        return this;
	}

}




















