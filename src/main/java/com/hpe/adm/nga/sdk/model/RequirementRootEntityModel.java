package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: requirement_root</p>
 * <p>Label: Requirement Root</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "requirement_roots", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class RequirementRootEntityModel extends TypedEntityModel implements RequirementRootEntity {

    public RequirementRootEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "requirement_root"));
    }

    public RequirementRootEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RequirementRootEntityModel(    final String name) {
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
	* Label: Ordering
	* Description: Ordering
	*/
    public String getOrdering(){
	    final FieldModel ordering = wrappedEntityModel.getValue("ordering");
	    return ordering == null ? null : (String) ordering.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RequirementRootEntityModel setOrdering(final String ordering){
        if (ordering == null) {
            wrappedEntityModel.removeValue("ordering");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("ordering", ordering));
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
	public RequirementRootEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
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
	* Label: Owner
	* Description: The workspace user assigned to handle the entity.
	*/
        public WorkspaceUserEntityModel getOwner(){
    if (wrappedEntityModel.getValue("owner") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel owner = (ReferenceFieldModel) wrappedEntityModel.getValue("owner");
	final EntityModel referenceFieldModel = owner.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public RequirementRootEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
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
	public RequirementRootEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Has children
	* Description: Whether the entity has children associated with it.
	*/
    public Boolean getHasChildren(){
	    final FieldModel has_children = wrappedEntityModel.getValue("has_children");
	    return has_children == null ? null : (Boolean) has_children.getValue();
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
        public RequirementRootEntityModel setAuthor(final WorkspaceUserEntityModel author){
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
    	public RequirementRootEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	public RequirementRootEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

}




















