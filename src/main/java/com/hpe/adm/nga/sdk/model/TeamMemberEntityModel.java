package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: team_member</p>
 * <p>Label: Team Member</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "team_members", availableMethods = {EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TeamMemberEntityModel extends TypedEntityModel implements TeamMemberEntity {

    public TeamMemberEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "team_member"));
    }

    public TeamMemberEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TeamMemberEntityModel(    final TeamEntityModel team, final WorkspaceUserEntityModel workspace_user) {
        this();
                    setTeam(team);
            setWorkspaceUser(workspace_user);
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
	public TeamMemberEntityModel setClientLockStamp(final Long clientLockStamp){
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
	* Label: Workspace user
	* Description: 
	*/
        public WorkspaceUserEntityModel getWorkspaceUser(){
    if (wrappedEntityModel.getValue("workspace_user") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel workspace_user = (ReferenceFieldModel) wrappedEntityModel.getValue("workspace_user");
	final EntityModel referenceFieldModel = workspace_user.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TeamMemberEntityModel setWorkspaceUser(final WorkspaceUserEntityModel workspaceUser){
			if (workspaceUser == null) {
			    wrappedEntityModel.removeValue("workspace_user");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("workspace_user", workspaceUser.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Team
	* Description: Reference to the team associated with the member.
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
        public TeamMemberEntityModel setTeam(final TeamEntityModel team){
			if (team == null) {
			    wrappedEntityModel.removeValue("team");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("team", team.getWrappedEntityModel()));
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
	* Label: Capacity
	* Description: The overall capacity of a team member, measured in story points.
	*/
    public Long getCapacity(){
	    final FieldModel capacity = wrappedEntityModel.getValue("capacity");
	    return capacity == null ? null : (Long) capacity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TeamMemberEntityModel setCapacity(final Long capacity){
        if (capacity == null) {
            wrappedEntityModel.removeValue("capacity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("capacity", capacity));
        }
        return this;
	}

}




















