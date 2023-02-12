package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: team_sprint</p>
 * <p>Label: Team Sprint</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "team_sprints", availableMethods = {EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TeamSprintEntityModel extends TypedEntityModel implements TeamSprintEntity {

    public TeamSprintEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "team_sprint"));
    }

    public TeamSprintEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TeamSprintEntityModel(    final SprintEntityModel sprint, final TeamEntityModel team) {
        this();
                    setSprint(sprint);
            setTeam(team);
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
	public TeamSprintEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: To improve
	* Description: Some ideas, in rich text using html codes, to adopt in future sprints.
	*/
    public String getToImprove(){
	    final FieldModel to_improve = wrappedEntityModel.getValue("to_improve");
	    return to_improve == null ? null : (String) to_improve.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public TeamSprintEntityModel setToImprove(final String toImprove){
        if (toImprove == null) {
            wrappedEntityModel.removeValue("to_improve");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("to_improve", toImprove));
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
	* Label: Release
	* Description: Reference to the release related to this entity.
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
	* Label: Sprint
	* Description: Reference to the sprint related to this entity.
	*/
        public SprintEntityModel getSprint(){
    if (wrappedEntityModel.getValue("sprint") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel sprint = (ReferenceFieldModel) wrappedEntityModel.getValue("sprint");
	final EntityModel referenceFieldModel = sprint.getValue();
            return new SprintEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public TeamSprintEntityModel setSprint(final SprintEntityModel sprint){
			if (sprint == null) {
			    wrappedEntityModel.removeValue("sprint");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("sprint", sprint.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Team
	* Description: Reference to the team of a specific team and sprint.
	*/
        public TeamEntityModel getTeam(){
    if (wrappedEntityModel.getValue("team") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel team = (ReferenceFieldModel) wrappedEntityModel.getValue("team");
	final EntityModel referenceFieldModel = team.getValue();
            return new TeamEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TeamSprintEntityModel setTeam(final TeamEntityModel team){
			if (team == null) {
			    wrappedEntityModel.removeValue("team");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("team", team.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Expected velocity
	* Description: Expected velocity for a specific team and sprint.
	*/
    public Long getExpectedVelocity(){
	    final FieldModel expected_velocity = wrappedEntityModel.getValue("expected_velocity");
	    return expected_velocity == null ? null : (Long) expected_velocity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TeamSprintEntityModel setExpectedVelocity(final Long expectedVelocity){
        if (expectedVelocity == null) {
            wrappedEntityModel.removeValue("expected_velocity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("expected_velocity", expectedVelocity));
        }
        return this;
	}

    /**
	* Label: What went well
	* Description: Some ideas, in rich text using html codes, to preserve for future sprints.
	*/
    public String getToPreserve(){
	    final FieldModel to_preserve = wrappedEntityModel.getValue("to_preserve");
	    return to_preserve == null ? null : (String) to_preserve.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public TeamSprintEntityModel setToPreserve(final String toPreserve){
        if (toPreserve == null) {
            wrappedEntityModel.removeValue("to_preserve");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("to_preserve", toPreserve));
        }
        return this;
	}

    /**
	* Label: Actual velocity
	* Description: Actual velocity for a specific team and sprint.
	*/
    public Long getActualVelocity(){
	    final FieldModel actual_velocity = wrappedEntityModel.getValue("actual_velocity");
	    return actual_velocity == null ? null : (Long) actual_velocity.getValue();
	}

        /**
	* Label: Last modified
	* Description: The date and time the entity was last modified, according to the ISO-8601 date format.
	*/
    public java.time.ZonedDateTime getLastModified(){
	    final FieldModel last_modified = wrappedEntityModel.getValue("last_modified");
	    return last_modified == null ? null : (java.time.ZonedDateTime) last_modified.getValue();
	}

    }




















