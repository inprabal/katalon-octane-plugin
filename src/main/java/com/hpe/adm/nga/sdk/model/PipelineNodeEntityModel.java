package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: pipeline_node</p>
 * <p>Label: Pipeline Node</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "pipeline_nodes", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class PipelineNodeEntityModel extends TypedEntityModel implements PipelineNodeEntity {

    public PipelineNodeEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "pipeline_node"));
    }

    public PipelineNodeEntityModel(final EntityModel wrappedEntityModel) {
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
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
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
	public PipelineNodeEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
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

    }




















