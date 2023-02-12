package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: scm_commit</p>
 * <p>Label: Scm Commit</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "scm_commits", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class ScmCommitEntityModel extends TypedEntityModel implements ScmCommitEntity {

    public ScmCommitEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "scm_commit"));
    }

    public ScmCommitEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public ScmCommitEntityModel(    final String name) {
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
	public ScmCommitEntityModel setClientLockStamp(final Long clientLockStamp){
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
	* Label: CI build
	* Description: 
	*/
        public java.util.Collection<CiBuildEntityModel> getCiBuild(){
        final MultiReferenceFieldModel ci_build = (MultiReferenceFieldModel) wrappedEntityModel.getValue("ci_build");
        if (ci_build == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = ci_build.getValue();
                        return value.stream().map(CiBuildEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public ScmCommitEntityModel setCiBuild(final java.util.Collection<CiBuildEntityModel> ciBuild){
	    if (ciBuild == null) {
	        wrappedEntityModel.removeValue("ci_build");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = ciBuild.stream().map(entityModel -> {
		    if (entityModel instanceof CiBuildEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of ciBuild must be of types {CiBuildEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("ci_build", entityModels));
            return this;
	}

    /**
	* Label: Code coverage
	* Description: has_coverage
	*/
    public Boolean getHasCoverage(){
	    final FieldModel has_coverage = wrappedEntityModel.getValue("has_coverage");
	    return has_coverage == null ? null : (Boolean) has_coverage.getValue();
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
	public ScmCommitEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Risk
	* Description: 
	*/
    public Boolean getRisk(){
	    final FieldModel risk = wrappedEntityModel.getValue("risk");
	    return risk == null ? null : (Boolean) risk.getValue();
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




















