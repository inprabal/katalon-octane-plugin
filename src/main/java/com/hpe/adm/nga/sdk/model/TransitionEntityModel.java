package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: transition</p>
 * <p>Label: Transition</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "transitions", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TransitionEntityModel extends TypedEntityModel implements TransitionEntity {

    public TransitionEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "transition"));
    }

    public TransitionEntityModel(final EntityModel wrappedEntityModel) {
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
	* Label: Is system
	* Description: A boolean indicates whether a transition is defined by system
	*/
    public Boolean getIsSystem(){
	    final FieldModel is_system = wrappedEntityModel.getValue("is_system");
	    return is_system == null ? null : (Boolean) is_system.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TransitionEntityModel setIsSystem(final Boolean isSystem){
        if (isSystem == null) {
            wrappedEntityModel.removeValue("is_system");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("is_system", isSystem));
        }
        return this;
	}

    /**
	* Label: Logical name
	* Description: A logical name for an entity defines a unique meaning for the entity cross all shared spaces. An entity with the same logical name on different shared spaces is used for the same matter. For example list_node.serverity represents the severity of a defect and has the same logical name cross different sharedspaces.
	*/
    public String getLogicalName(){
	    final FieldModel logical_name = wrappedEntityModel.getValue("logical_name");
	    return logical_name == null ? null : (String) logical_name.getValue();
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
	public TransitionEntityModel setClientLockStamp(final Long clientLockStamp){
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
	* Label: Target phase
	* Description: A reference field to the phase entity to which the item is transitioning.
	*/
        public PhaseEntityModel getTargetPhase(){
    if (wrappedEntityModel.getValue("target_phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel target_phase = (ReferenceFieldModel) wrappedEntityModel.getValue("target_phase");
	final EntityModel referenceFieldModel = target_phase.getValue();
            return new PhaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public TransitionEntityModel setTargetPhase(final PhaseEntityModel targetPhase){
			if (targetPhase == null) {
			    wrappedEntityModel.removeValue("target_phase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("target_phase", targetPhase.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Source phase
	* Description: A reference field to the phase entity from which the item is transitioning.
	*/
        public PhaseEntityModel getSourcePhase(){
    if (wrappedEntityModel.getValue("source_phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel source_phase = (ReferenceFieldModel) wrappedEntityModel.getValue("source_phase");
	final EntityModel referenceFieldModel = source_phase.getValue();
            return new PhaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public TransitionEntityModel setSourcePhase(final PhaseEntityModel sourcePhase){
			if (sourcePhase == null) {
			    wrappedEntityModel.removeValue("source_phase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("source_phase", sourcePhase.getWrappedEntityModel()));
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
	* Label: Entity
	* Description: The name of the entity type or subtype a transition belongs to
	*/
    public String getEntity(){
	    final FieldModel entity = wrappedEntityModel.getValue("entity");
	    return entity == null ? null : (String) entity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public TransitionEntityModel setEntity(final String entity){
        if (entity == null) {
            wrappedEntityModel.removeValue("entity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("entity", entity));
        }
        return this;
	}

}




















