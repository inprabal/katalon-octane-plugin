package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: pipeline_run</p>
 * <p>Label: Pipeline Run</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "pipeline_runs", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class PipelineRunEntityModel extends TypedEntityModel implements PipelineRunEntity {

    public PipelineRunEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "pipeline_run"));
    }

    public PipelineRunEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public PipelineRunEntityModel(    final String name) {
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
	* Label: SCM commits
	* Description: 
	*/
    public Long getScmCommits(){
	    final FieldModel scm_commits = wrappedEntityModel.getValue("scm_commits");
	    return scm_commits == null ? null : (Long) scm_commits.getValue();
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
	* Description: 
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
        public PipelineRunEntityModel setProgram(final ProgramEntityModel program){
			if (program == null) {
			    wrappedEntityModel.removeValue("program");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("program", program.getWrappedEntityModel()));
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
	* Label: Ci builds
	* Description: 
	*/
        public java.util.Collection<CiBuildEntityModel> getCiBuilds(){
        final MultiReferenceFieldModel ci_builds = (MultiReferenceFieldModel) wrappedEntityModel.getValue("ci_builds");
        if (ci_builds == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = ci_builds.getValue();
                        return value.stream().map(CiBuildEntityModel::new)
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
	public PipelineRunEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Start time
	* Description: 
	*/
    public Long getStartTime(){
	    final FieldModel start_time = wrappedEntityModel.getValue("start_time");
	    return start_time == null ? null : (Long) start_time.getValue();
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
    	public PipelineRunEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public PipelineRunEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Status
	* Description: 
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.pipeline_run_status.Status getStatus() {
    if (wrappedEntityModel.getValue("status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel status = (ReferenceFieldModel) wrappedEntityModel.getValue("status");
    final EntityModel referenceFieldModel = status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.pipeline_run_status.Status.getFromEntityModel(referenceFieldModel);

    }

        /**
	* Label: Duration
	* Description: 
	*/
    public Long getDuration(){
	    final FieldModel duration = wrappedEntityModel.getValue("duration");
	    return duration == null ? null : (Long) duration.getValue();
	}

        /**
	* Label: Pipeline
	* Description: 
	*/
        public PipelineEntityModel getPipeline(){
    if (wrappedEntityModel.getValue("pipeline") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel pipeline = (ReferenceFieldModel) wrappedEntityModel.getValue("pipeline");
	final EntityModel referenceFieldModel = pipeline.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

        /**
	* Label: Milestone
	* Description: 
	*/
        public MilestoneEntityModel getMilestone(){
    if (wrappedEntityModel.getValue("milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("milestone");
	final EntityModel referenceFieldModel = milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

    }




















