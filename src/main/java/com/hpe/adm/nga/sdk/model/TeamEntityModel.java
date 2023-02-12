package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: team</p>
 * <p>Label: Team</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "teams", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TeamEntityModel extends TypedEntityModel implements TeamEntity {

    public TeamEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "team"));
    }

    public TeamEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TeamEntityModel(    final String name) {
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
	* Label: Assign to new releases
	* Description: Whether the team should automatically be assigned to new releases created from now on.
	*/
    public Boolean getAssignToNewReleases(){
	    final FieldModel assign_to_new_releases = wrappedEntityModel.getValue("assign_to_new_releases");
	    return assign_to_new_releases == null ? null : (Boolean) assign_to_new_releases.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public TeamEntityModel setAssignToNewReleases(final Boolean assignToNewReleases){
        if (assignToNewReleases == null) {
            wrappedEntityModel.removeValue("assign_to_new_releases");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("assign_to_new_releases", assignToNewReleases));
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
	* Label: Number of members
	* Description: Number of members in the team.
	*/
    public Long getNumberOfMembers(){
	    final FieldModel number_of_members = wrappedEntityModel.getValue("number_of_members");
	    return number_of_members == null ? null : (Long) number_of_members.getValue();
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
	public TeamEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Default expected velocity
	* Description: Default expected velocity per sprint, which is measured in story points. The velocity is the expected amount of work to be completed in the sprint.
	*/
    public Long getEstimatedVelocity(){
	    final FieldModel estimated_velocity = wrappedEntityModel.getValue("estimated_velocity");
	    return estimated_velocity == null ? null : (Long) estimated_velocity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TeamEntityModel setEstimatedVelocity(final Long estimatedVelocity){
        if (estimatedVelocity == null) {
            wrappedEntityModel.removeValue("estimated_velocity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("estimated_velocity", estimatedVelocity));
        }
        return this;
	}

    /**
	* Label: Planning deadline
	* Description: The number of days after the sprint starts after which planning is no longer allowed.
	*/
    public Long getPlanningDeadline(){
	    final FieldModel planning_deadline = wrappedEntityModel.getValue("planning_deadline");
	    return planning_deadline == null ? null : (Long) planning_deadline.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public TeamEntityModel setPlanningDeadline(final Long planningDeadline){
        if (planningDeadline == null) {
            wrappedEntityModel.removeValue("planning_deadline");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("planning_deadline", planningDeadline));
        }
        return this;
	}

    /**
	* Label: Members
	* Description: Reference to the workspace users associated with the team.
	*/
        public java.util.Collection<WorkspaceUserEntityModel> getMembers(){
        final MultiReferenceFieldModel members = (MultiReferenceFieldModel) wrappedEntityModel.getValue("members");
        if (members == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = members.getValue();
                        return value.stream().map(WorkspaceUserEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TeamEntityModel setMembers(final java.util.Collection<WorkspaceUserEntityModel> members){
	    if (members == null) {
	        wrappedEntityModel.removeValue("members");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = members.stream().map(entityModel -> {
		    if (entityModel instanceof WorkspaceUserEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of members must be of types {WorkspaceUserEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("members", entityModels));
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
	* Label: Team sprint relation
	* Description: Reference to what the team needs to work on in the sprint.
	*/
        public java.util.Collection<TeamSprintEntityModel> getTeamSprintRelation(){
        final MultiReferenceFieldModel team_sprint_relation = (MultiReferenceFieldModel) wrappedEntityModel.getValue("team_sprint_relation");
        if (team_sprint_relation == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = team_sprint_relation.getValue();
                        return value.stream().map(TeamSprintEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
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
	public TeamEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Releases
	* Description: Releases on which the team works.
	*/
        public java.util.Collection<ReleaseEntityModel> getReleases(){
        final MultiReferenceFieldModel releases = (MultiReferenceFieldModel) wrappedEntityModel.getValue("releases");
        if (releases == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = releases.getValue();
                        return value.stream().map(ReleaseEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TeamEntityModel setReleases(final java.util.Collection<ReleaseEntityModel> releases){
	    if (releases == null) {
	        wrappedEntityModel.removeValue("releases");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = releases.stream().map(entityModel -> {
		    if (entityModel instanceof ReleaseEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of releases must be of types {ReleaseEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("releases", entityModels));
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
	public TeamEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Team members
	* Description: Reference to the team members associated with the team.
	*/
        public java.util.Collection<TeamMemberEntityModel> getTeamMembers(){
        final MultiReferenceFieldModel team_members = (MultiReferenceFieldModel) wrappedEntityModel.getValue("team_members");
        if (team_members == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = team_members.getValue();
                        return value.stream().map(TeamMemberEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TeamEntityModel setTeamMembers(final java.util.Collection<TeamMemberEntityModel> teamMembers){
	    if (teamMembers == null) {
	        wrappedEntityModel.removeValue("team_members");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = teamMembers.stream().map(entityModel -> {
		    if (entityModel instanceof TeamMemberEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of teamMembers must be of types {TeamMemberEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("team_members", entityModels));
            return this;
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
    	public TeamEntityModel setPrograms(final java.util.Collection<ProgramEntityModel> programs){
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
	* Label: Team lead
	* Description: Reference to the team leader.
	*/
        public WorkspaceUserEntityModel getTeamLead(){
    if (wrappedEntityModel.getValue("team_lead") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel team_lead = (ReferenceFieldModel) wrappedEntityModel.getValue("team_lead");
	final EntityModel referenceFieldModel = team_lead.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public TeamEntityModel setTeamLead(final WorkspaceUserEntityModel teamLead){
			if (teamLead == null) {
			    wrappedEntityModel.removeValue("team_lead");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("team_lead", teamLead.getWrappedEntityModel()));
            }
            return this;
        }

                }




















