package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: phase</p>
 * <p>Label: Phase</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "phases", availableMethods = {EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class PhaseEntityModel extends TypedEntityModel implements PhaseEntity {

    public PhaseEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "phase"));
    }

    public PhaseEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public PhaseEntityModel(    final String entity, final MetaphaseEntityModel metaphase, final String name) {
        this();
                    setEntity(entity);
            setMetaphase(metaphase);
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
	* Label: Master phase
	* Description: A reference field that points to the root node of the phase.
	*/
        public PhaseEntityModel getMasterPhase(){
    if (wrappedEntityModel.getValue("master_phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel master_phase = (ReferenceFieldModel) wrappedEntityModel.getValue("master_phase");
	final EntityModel referenceFieldModel = master_phase.getValue();
            return new PhaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public PhaseEntityModel setMasterPhase(final PhaseEntityModel masterPhase){
			if (masterPhase == null) {
			    wrappedEntityModel.removeValue("master_phase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("master_phase", masterPhase.getWrappedEntityModel()));
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
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
	}

        /**
	* Label: Is start phase
	* Description: A boolean field indicating whether a phase is a start phase of the workflow
	*/
    public Boolean getIsStartPhase(){
	    final FieldModel is_start_phase = wrappedEntityModel.getValue("is_start_phase");
	    return is_start_phase == null ? null : (Boolean) is_start_phase.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public PhaseEntityModel setIsStartPhase(final Boolean isStartPhase){
        if (isStartPhase == null) {
            wrappedEntityModel.removeValue("is_start_phase");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("is_start_phase", isStartPhase));
        }
        return this;
	}

    /**
	* Label: Description
	* Description: A description of the phase.
	*/
    public String getDescription(){
	    final FieldModel description = wrappedEntityModel.getValue("description");
	    return description == null ? null : (String) description.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public PhaseEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public PhaseEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public PhaseEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Sub phases
	* Description: A reference field that points to the sub phases of the phase.
	*/
        public java.util.Collection<PhaseEntityModel> getSubPhases(){
        final MultiReferenceFieldModel sub_phases = (MultiReferenceFieldModel) wrappedEntityModel.getValue("sub_phases");
        if (sub_phases == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = sub_phases.getValue();
                        return value.stream().map(PhaseEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public PhaseEntityModel setSubPhases(final java.util.Collection<PhaseEntityModel> subPhases){
	    if (subPhases == null) {
	        wrappedEntityModel.removeValue("sub_phases");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = subPhases.stream().map(entityModel -> {
		    if (entityModel instanceof PhaseEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of subPhases must be of types {PhaseEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("sub_phases", entityModels));
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
	* Label: Is system
	* Description: A boolean field indicating whether a phase is defined by system
	*/
    public Boolean getIsSystem(){
	    final FieldModel is_system = wrappedEntityModel.getValue("is_system");
	    return is_system == null ? null : (Boolean) is_system.getValue();
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
	public PhaseEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Name
	* Description: 
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = true, maxLength = 255L)
	public PhaseEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Metaphase
	* Description: The logical category for the phase. Metaphases are New, In progress, In testing, and Done. All phases are associated with one of these metaphases.
	*/
        public MetaphaseEntityModel getMetaphase(){
    if (wrappedEntityModel.getValue("metaphase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel metaphase = (ReferenceFieldModel) wrappedEntityModel.getValue("metaphase");
	final EntityModel referenceFieldModel = metaphase.getValue();
            return new MetaphaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public PhaseEntityModel setMetaphase(final MetaphaseEntityModel metaphase){
			if (metaphase == null) {
			    wrappedEntityModel.removeValue("metaphase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("metaphase", metaphase.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Entity
	* Description: The name of the entity type or subtype a phase belongs to
	*/
    public String getEntity(){
	    final FieldModel entity = wrappedEntityModel.getValue("entity");
	    return entity == null ? null : (String) entity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public PhaseEntityModel setEntity(final String entity){
        if (entity == null) {
            wrappedEntityModel.removeValue("entity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("entity", entity));
        }
        return this;
	}

}




















