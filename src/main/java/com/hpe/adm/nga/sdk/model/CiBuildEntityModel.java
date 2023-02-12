package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: ci_build</p>
 * <p>Label: Ci Build</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "ci_builds", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class CiBuildEntityModel extends TypedEntityModel implements CiBuildEntity {

    public CiBuildEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "ci_build"));
    }

    public CiBuildEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public CiBuildEntityModel(    final String name) {
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
	* Label: Result
	* Description: 
	*/
    public String getResult(){
	    final FieldModel result = wrappedEntityModel.getValue("result");
	    return result == null ? null : (String) result.getValue();
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
	* Label: Pipeline node
	* Description: 
	*/
        public java.util.Collection<PipelineNodeEntityModel> getPipelineNode(){
        final MultiReferenceFieldModel pipeline_node = (MultiReferenceFieldModel) wrappedEntityModel.getValue("pipeline_node");
        if (pipeline_node == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = pipeline_node.getValue();
                        return value.stream().map(PipelineNodeEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
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
	public CiBuildEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
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
	* Label: Estimated duration
	* Description: 
	*/
    public Long getEstimatedDuration(){
	    final FieldModel estimated_duration = wrappedEntityModel.getValue("estimated_duration");
	    return estimated_duration == null ? null : (Long) estimated_duration.getValue();
	}

        /**
	* Label: Console log
	* Description: Console log
	*/
    public String getConsoleLog(){
	    final FieldModel console_log = wrappedEntityModel.getValue("console_log");
	    return console_log == null ? null : (String) console_log.getValue();
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
	* Label: Name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public CiBuildEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Commits
	* Description: 
	*/
        public java.util.Collection<ScmCommitEntityModel> getCommits(){
        final MultiReferenceFieldModel commits = (MultiReferenceFieldModel) wrappedEntityModel.getValue("commits");
        if (commits == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = commits.getValue();
                        return value.stream().map(ScmCommitEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Status
	* Description: 
	*/
    public String getStatus(){
	    final FieldModel status = wrappedEntityModel.getValue("status");
	    return status == null ? null : (String) status.getValue();
	}

    }




















