package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: requirement_document</p>
 * <p>Label: Requirement Document</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "requirement_documents", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class RequirementDocumentEntityModel extends TypedEntityModel implements RequirementDocumentEntity {

    public RequirementDocumentEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "requirement_document"));
    }

    public RequirementDocumentEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public RequirementDocumentEntityModel(    final String name, final RequirementDocumentEntityModel parent, final com.hpe.adm.nga.sdk.enums.Phases.RequirementDocumentPhase phase) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
        }
        public RequirementDocumentEntityModel(    final String name, final RequirementFolderEntityModel parent, final com.hpe.adm.nga.sdk.enums.Phases.RequirementDocumentPhase phase) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
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
	* Label: Parent
	* Description: The parent requirement (requirement module) under which this requirement is defined.
	*/
        @AllowedReferences({RequirementDocumentEntityModel.class, RequirementFolderEntityModel.class, })
public <T extends RequirementEntity> T getParent(){
    if (wrappedEntityModel.getValue("parent") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel parent = (ReferenceFieldModel) wrappedEntityModel.getValue("parent");
	final EntityModel referenceFieldModel = parent.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("requirement_folder")) {
			    return (T) new RequirementFolderEntityModel(referenceFieldModel);
			}else if (referenceType.equals("requirement_document")) {
			    return (T) new RequirementDocumentEntityModel(referenceFieldModel);
			}                return (T) new RequirementEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public RequirementDocumentEntityModel setParent(final RequirementFolderEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = true, required = true)
        public RequirementDocumentEntityModel setParent(final RequirementDocumentEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
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
	* Label: Release
	* Description: A reference to the release in which the entity is related.
	*/
        public java.util.Collection<ReleaseEntityModel> getRelease(){
        final MultiReferenceFieldModel release = (MultiReferenceFieldModel) wrappedEntityModel.getValue("release");
        if (release == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = release.getValue();
                        return value.stream().map(ReleaseEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RequirementDocumentEntityModel setRelease(final java.util.Collection<ReleaseEntityModel> release){
	    if (release == null) {
	        wrappedEntityModel.removeValue("release");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = release.stream().map(entityModel -> {
		    if (entityModel instanceof ReleaseEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of release must be of types {ReleaseEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("release", entityModels));
            return this;
	}

    /**
	* Label: Backlog implementation
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, EpicEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getFeatures(){
        final MultiReferenceFieldModel features = (MultiReferenceFieldModel) wrappedEntityModel.getValue("features");
        if (features == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = features.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("quality_story")) {
				    return new QualityStoryEntityModel(entityModel);
				}                else if (referenceType.equals("epic")) {
				    return new EpicEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({QualityStoryEntityModel.class, EpicEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public RequirementDocumentEntityModel setFeatures(final java.util.Collection<WorkItemEntity> features){
	    if (features == null) {
	        wrappedEntityModel.removeValue("features");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = features.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of features must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("features", entityModels));
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
	* Label: Phase
	* Description: The status of an entity, such as New, Open, or Closed.
	*/
    public com.hpe.adm.nga.sdk.enums.Phases.RequirementDocumentPhase getPhase() {
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
    final EntityModel referenceFieldModel = phase.getValue();
    return com.hpe.adm.nga.sdk.enums.Phases.RequirementDocumentPhase.getFromEntityModel(referenceFieldModel);
}


            @FieldMetadata(filterable = true, sortable = true, required = true)
	public RequirementDocumentEntityModel setPhase(final com.hpe.adm.nga.sdk.enums.Phases.RequirementDocumentPhase phase) {
        if (phase == null) {
	        wrappedEntityModel.removeValue("phase");
        } else {
	        wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getAsEntityModel()));
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
	public RequirementDocumentEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Covering Tests
	* Description: 
	*/
        @AllowedReferences({TestManualEntityModel.class, TestSuiteEntityModel.class, GherkinTestEntityModel.class, TestAutomatedEntityModel.class, })
public java.util.Collection<TestEntity> getTest(){
        final MultiReferenceFieldModel test = (MultiReferenceFieldModel) wrappedEntityModel.getValue("test");
        if (test == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = test.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("test_automated")) {
				    return new TestAutomatedEntityModel(entityModel);
				}                else if (referenceType.equals("test_suite")) {
				    return new TestSuiteEntityModel(entityModel);
				}                else if (referenceType.equals("test_manual")) {
				    return new TestManualEntityModel(entityModel);
				}                else if (referenceType.equals("gherkin_test")) {
				    return new GherkinTestEntityModel(entityModel);
				}else {
			        return new TestEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({TestManualEntityModel.class, TestSuiteEntityModel.class, GherkinTestEntityModel.class, TestAutomatedEntityModel.class, })
	public RequirementDocumentEntityModel setTest(final java.util.Collection<TestEntity> test){
	    if (test == null) {
	        wrappedEntityModel.removeValue("test");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = test.stream().map(entityModel -> {
		    if (entityModel instanceof TestEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of test must be of types {TestEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("test", entityModels));
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
        public RequirementDocumentEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Related from requirements
	* Description: Other requirements that this requirement is associated to.
	*/
        public java.util.Collection<RequirementDocumentEntityModel> getRelatedFromRequirements(){
        final MultiReferenceFieldModel related_from_requirements = (MultiReferenceFieldModel) wrappedEntityModel.getValue("related_from_requirements");
        if (related_from_requirements == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = related_from_requirements.getValue();
                        return value.stream().map(RequirementDocumentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RequirementDocumentEntityModel setRelatedFromRequirements(final java.util.Collection<RequirementDocumentEntityModel> relatedFromRequirements){
	    if (relatedFromRequirements == null) {
	        wrappedEntityModel.removeValue("related_from_requirements");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = relatedFromRequirements.stream().map(entityModel -> {
		    if (entityModel instanceof RequirementEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of relatedFromRequirements must be of types {RequirementEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("related_from_requirements", entityModels));
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
    	public RequirementDocumentEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Related to requirement
	* Description: 
	*/
        public java.util.Collection<RequirementDocumentEntityModel> getRelatedToRequirement(){
        final MultiReferenceFieldModel related_to_requirement = (MultiReferenceFieldModel) wrappedEntityModel.getValue("related_to_requirement");
        if (related_to_requirement == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = related_to_requirement.getValue();
                        return value.stream().map(RequirementDocumentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public RequirementDocumentEntityModel setRelatedToRequirement(final java.util.Collection<RequirementDocumentEntityModel> relatedToRequirement){
	    if (relatedToRequirement == null) {
	        wrappedEntityModel.removeValue("related_to_requirement");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = relatedToRequirement.stream().map(entityModel -> {
		    if (entityModel instanceof RequirementEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of relatedToRequirement must be of types {RequirementEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("related_to_requirement", entityModels));
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
	public RequirementDocumentEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
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
    	public RequirementDocumentEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Ordering
	* Description: Ordering
	*/
    public String getOrdering(){
	    final FieldModel ordering = wrappedEntityModel.getValue("ordering");
	    return ordering == null ? null : (String) ordering.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public RequirementDocumentEntityModel setOrdering(final String ordering){
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
	public RequirementDocumentEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Is root
	* Description: Is this the root requirement of the requirement document?
	*/
    public Boolean getIsRoot(){
	    final FieldModel is_root = wrappedEntityModel.getValue("is_root");
	    return is_root == null ? null : (Boolean) is_root.getValue();
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
        public RequirementDocumentEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
            }
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

    }




















