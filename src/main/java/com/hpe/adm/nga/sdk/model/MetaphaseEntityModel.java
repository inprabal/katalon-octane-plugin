package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: metaphase</p>
 * <p>Label: Metaphase</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "metaphases", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class MetaphaseEntityModel extends TypedEntityModel implements MetaphaseEntity {

    public MetaphaseEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "metaphase"));
    }

    public MetaphaseEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public MetaphaseEntityModel(    final String name) {
        this();
                    setName(name);
        }
    



    /**
	* Label: Phase
	* Description: The phases related to this metaphase in the workflow.
	*/
        public java.util.Collection<PhaseEntityModel> getPhase(){
        final MultiReferenceFieldModel phase = (MultiReferenceFieldModel) wrappedEntityModel.getValue("phase");
        if (phase == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = phase.getValue();
                        return value.stream().map(PhaseEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public MetaphaseEntityModel setPhase(final java.util.Collection<PhaseEntityModel> phase){
	    if (phase == null) {
	        wrappedEntityModel.removeValue("phase");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = phase.stream().map(entityModel -> {
		    if (entityModel instanceof PhaseEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of phase must be of types {PhaseEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("phase", entityModels));
            return this;
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
	* Description: A boolean field indicating whether the metaphase is defined by the system.
	*/
    public Boolean getIsSystem(){
	    final FieldModel is_system = wrappedEntityModel.getValue("is_system");
	    return is_system == null ? null : (Boolean) is_system.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public MetaphaseEntityModel setIsSystem(final Boolean isSystem){
        if (isSystem == null) {
            wrappedEntityModel.removeValue("is_system");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("is_system", isSystem));
        }
        return this;
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
	public MetaphaseEntityModel setClientLockStamp(final Long clientLockStamp){
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
	* Label: Name
	* Description: 
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = true, maxLength = 255L)
	public MetaphaseEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
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
	* Description: The entity for which the metaphase is defined.
	*/
    public String getEntity(){
	    final FieldModel entity = wrappedEntityModel.getValue("entity");
	    return entity == null ? null : (String) entity.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public MetaphaseEntityModel setEntity(final String entity){
        if (entity == null) {
            wrappedEntityModel.removeValue("entity");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("entity", entity));
        }
        return this;
	}

    /**
	* Label: Order
	* Description: 
	*/
    public Long getOrder(){
	    final FieldModel order = wrappedEntityModel.getValue("order");
	    return order == null ? null : (Long) order.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public MetaphaseEntityModel setOrder(final Long order){
        if (order == null) {
            wrappedEntityModel.removeValue("order");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("order", order));
        }
        return this;
	}

}




















