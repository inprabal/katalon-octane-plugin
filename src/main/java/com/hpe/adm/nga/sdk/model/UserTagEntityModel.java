package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: user_tag</p>
 * <p>Label: User Tag</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "user_tags", availableMethods = {EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, } )
public class UserTagEntityModel extends TypedEntityModel implements UserTagEntity {

    public UserTagEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "user_tag"));
    }

    public UserTagEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public UserTagEntityModel(    final String name) {
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
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public UserTagEntityModel setClientLockStamp(final Long clientLockStamp){
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
        public UserTagEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Tags
	* Description: A user-defined label for an entity.  Tags for a entity might be 'Showstopper' or 'Limitation.'
	*/
        @AllowedReferences({GherkinAutomatedRunEntityModel.class, RunManualEntityModel.class, RunSuiteEntityModel.class, RunAutomatedEntityModel.class, })
public java.util.Collection<RunEntity> getRun(){
        final MultiReferenceFieldModel run = (MultiReferenceFieldModel) wrappedEntityModel.getValue("run");
        if (run == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = run.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("run_suite")) {
				    return new RunSuiteEntityModel(entityModel);
				}                else if (referenceType.equals("run_manual")) {
				    return new RunManualEntityModel(entityModel);
				}                else if (referenceType.equals("run_automated")) {
				    return new RunAutomatedEntityModel(entityModel);
				}                else if (referenceType.equals("gherkin_automated_run")) {
				    return new GherkinAutomatedRunEntityModel(entityModel);
				}else {
			        return new RunEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({GherkinAutomatedRunEntityModel.class, RunManualEntityModel.class, RunSuiteEntityModel.class, RunAutomatedEntityModel.class, })
	public UserTagEntityModel setRun(final java.util.Collection<RunEntity> run){
	    if (run == null) {
	        wrappedEntityModel.removeValue("run");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = run.stream().map(entityModel -> {
		    if (entityModel instanceof RunEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of run must be of types {RunEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("run", entityModels));
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
	public UserTagEntityModel setName(final String name){
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

    }




















