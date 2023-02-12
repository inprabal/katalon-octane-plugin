package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: run_step</p>
 * <p>Label: Run Step</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "run_steps", availableMethods = {EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class RunStepEntityModel extends TypedEntityModel implements RunStepEntity {

    public RunStepEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "run_step"));
    }

    public RunStepEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RunStepEntityModel(    final RunManualEntityModel run) {
        this();
                    setRun(run);
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
	* Label: Actual
	* Description: The outcome description of the run step.
	*/
    public String getActual(){
	    final FieldModel actual = wrappedEntityModel.getValue("actual");
	    return actual == null ? null : (String) actual.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RunStepEntityModel setActual(final String actual){
        if (actual == null) {
            wrappedEntityModel.removeValue("actual");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("actual", actual));
        }
        return this;
	}

    /**
	* Label: Num of defects
	* Description: The number of defects associated with this step.
	*/
    public Long getNumOfDefects(){
	    final FieldModel num_of_defects = wrappedEntityModel.getValue("num_of_defects");
	    return num_of_defects == null ? null : (Long) num_of_defects.getValue();
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
	public RunStepEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
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
    	public RunStepEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Has attachments
	* Description: Whether the entity has an attachment.
	*/
    public Boolean getHasAttachments(){
	    final FieldModel has_attachments = wrappedEntityModel.getValue("has_attachments");
	    return has_attachments == null ? null : (Boolean) has_attachments.getValue();
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
	* Label: Step type
	* Description: The run step's type. For example simple step, validation step or call to test step.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.manual_test_run_step_type.ManualTestRunStepType getStepType() {
    if (wrappedEntityModel.getValue("step_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel step_type = (ReferenceFieldModel) wrappedEntityModel.getValue("step_type");
    final EntityModel referenceFieldModel = step_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.manual_test_run_step_type.ManualTestRunStepType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public RunStepEntityModel setStepType(final com.hpe.adm.nga.sdk.enums.lists.list_node.manual_test_run_step_type.ManualTestRunStepType step_type) {
    if (step_type == null) {
	    wrappedEntityModel.removeValue("step_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("step_type", step_type.getAsEntityModel()));
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
	public RunStepEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Run
	* Description: The run that this step is associated with.
	*/
        public RunManualEntityModel getRun(){
    if (wrappedEntityModel.getValue("run") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel run = (ReferenceFieldModel) wrappedEntityModel.getValue("run");
	final EntityModel referenceFieldModel = run.getValue();
            return new RunManualEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public RunStepEntityModel setRun(final RunManualEntityModel run){
			if (run == null) {
			    wrappedEntityModel.removeValue("run");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("run", run.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Result
	* Description: The run step status. For example Planned, Passed, Failed, Not completed or Blocked.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus getResult() {
    if (wrappedEntityModel.getValue("result") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel result = (ReferenceFieldModel) wrappedEntityModel.getValue("result");
    final EntityModel referenceFieldModel = result.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public RunStepEntityModel setResult(final com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus result) {
    if (result == null) {
	    wrappedEntityModel.removeValue("result");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("result", result.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Defect
	* Description: The defects associated with this run step.
	*/
        public java.util.Collection<DefectEntityModel> getDefect(){
        final MultiReferenceFieldModel defect = (MultiReferenceFieldModel) wrappedEntityModel.getValue("defect");
        if (defect == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = defect.getValue();
                        return value.stream().map(DefectEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RunStepEntityModel setDefect(final java.util.Collection<DefectEntityModel> defect){
	    if (defect == null) {
	        wrappedEntityModel.removeValue("defect");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = defect.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of defect must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("defect", entityModels));
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

    }




















