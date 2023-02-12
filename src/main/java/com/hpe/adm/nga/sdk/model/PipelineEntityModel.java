package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: pipeline</p>
 * <p>Label: Pipeline</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "pipelines", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class PipelineEntityModel extends TypedEntityModel implements PipelineEntity {

    public PipelineEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "pipeline"));
    }

    public PipelineEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public PipelineEntityModel(    final String name) {
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
        public PipelineEntityModel setProgram(final ProgramEntityModel program){
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
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public PipelineEntityModel setClientLockStamp(final Long clientLockStamp){
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
        public PipelineEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Root job ID
	* Description: Pipeline root job. Use for creating pipeline only.
	*/
    public String getRootJobCiId(){
	    final FieldModel root_job_ci_id = wrappedEntityModel.getValue("root_job_ci_id");
	    return root_job_ci_id == null ? null : (String) root_job_ci_id.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false, maxLength = 4000L)
	public PipelineEntityModel setRootJobCiId(final String rootJobCiId){
        if (rootJobCiId == null) {
            wrappedEntityModel.removeValue("root_job_ci_id");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("root_job_ci_id", rootJobCiId));
        }
        return this;
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
    	public PipelineEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	public PipelineEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Current release
	* Description: Release to which the pipeline is related.
	*/
        public ReleaseEntityModel getCurrentRelease(){
    if (wrappedEntityModel.getValue("current_release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel current_release = (ReferenceFieldModel) wrappedEntityModel.getValue("current_release");
	final EntityModel referenceFieldModel = current_release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public PipelineEntityModel setCurrentRelease(final ReleaseEntityModel currentRelease){
			if (currentRelease == null) {
			    wrappedEntityModel.removeValue("current_release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("current_release", currentRelease.getWrappedEntityModel()));
            }
            return this;
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
	* Label: Jobs
	* Description: Array of pipeline jobs. Use for creating pipeline only.
	*/
    public String getJobs(){
	    final FieldModel jobs = wrappedEntityModel.getValue("jobs");
	    return jobs == null ? null : (String) jobs.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public PipelineEntityModel setJobs(final String jobs){
        if (jobs == null) {
            wrappedEntityModel.removeValue("jobs");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("jobs", jobs));
        }
        return this;
	}

    /**
	* Label: Referral pipeline
	* Description: Pipeline referral
	*/
        public PipelineEntityModel getReferralPipeline(){
    if (wrappedEntityModel.getValue("referral_pipeline") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel referral_pipeline = (ReferenceFieldModel) wrappedEntityModel.getValue("referral_pipeline");
	final EntityModel referenceFieldModel = referral_pipeline.getValue();
            return new PipelineEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public PipelineEntityModel setReferralPipeline(final PipelineEntityModel referralPipeline){
			if (referralPipeline == null) {
			    wrappedEntityModel.removeValue("referral_pipeline");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("referral_pipeline", referralPipeline.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Pipeline run
	* Description: 
	*/
        public java.util.Collection<PipelineRunEntityModel> getPipelineRun(){
        final MultiReferenceFieldModel pipeline_run = (MultiReferenceFieldModel) wrappedEntityModel.getValue("pipeline_run");
        if (pipeline_run == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = pipeline_run.getValue();
                        return value.stream().map(PipelineRunEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Current milestone
	* Description: Milestone to which the pipeline is related.
	*/
        public MilestoneEntityModel getCurrentMilestone(){
    if (wrappedEntityModel.getValue("current_milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel current_milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("current_milestone");
	final EntityModel referenceFieldModel = current_milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public PipelineEntityModel setCurrentMilestone(final MilestoneEntityModel currentMilestone){
			if (currentMilestone == null) {
			    wrappedEntityModel.removeValue("current_milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("current_milestone", currentMilestone.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Nodes
	* Description: 
	*/
        public java.util.Collection<PipelineNodeEntityModel> getNodes(){
        final MultiReferenceFieldModel nodes = (MultiReferenceFieldModel) wrappedEntityModel.getValue("nodes");
        if (nodes == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = nodes.getValue();
                        return value.stream().map(PipelineNodeEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: CI server
	* Description: CI Server on which the pipeline is running.
	*/
        public CiServerEntityModel getCiServer(){
    if (wrappedEntityModel.getValue("ci_server") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel ci_server = (ReferenceFieldModel) wrappedEntityModel.getValue("ci_server");
	final EntityModel referenceFieldModel = ci_server.getValue();
            return new CiServerEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public PipelineEntityModel setCiServer(final CiServerEntityModel ciServer){
			if (ciServer == null) {
			    wrappedEntityModel.removeValue("ci_server");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("ci_server", ciServer.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: CI server ID
	* Description: Pipeline root job. Use for creating pipeline only.
	*/
    public String getServerCiId(){
	    final FieldModel server_ci_id = wrappedEntityModel.getValue("server_ci_id");
	    return server_ci_id == null ? null : (String) server_ci_id.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false, maxLength = 4000L)
	public PipelineEntityModel setServerCiId(final String serverCiId){
        if (serverCiId == null) {
            wrappedEntityModel.removeValue("server_ci_id");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("server_ci_id", serverCiId));
        }
        return this;
	}

}




















