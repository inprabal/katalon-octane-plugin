package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: epic</p>
 * <p>Label: Epic</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "epics", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class EpicEntityModel extends TypedEntityModel implements EpicEntity {

    public EpicEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "epic"));
    }

    public EpicEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public EpicEntityModel(    final String name, final WorkItemRootEntityModel parent, final com.hpe.adm.nga.sdk.enums.Phases.EpicPhase phase) {
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
	* Description: A reference to the item under which an entity was opened.
	*/
        public WorkItemRootEntityModel getParent(){
    if (wrappedEntityModel.getValue("parent") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel parent = (ReferenceFieldModel) wrappedEntityModel.getValue("parent");
	final EntityModel referenceFieldModel = parent.getValue();
            return new WorkItemRootEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public EpicEntityModel setParent(final WorkItemRootEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Actual story points
	* Description: The actual number of story points that were needed to implement the entity.
	*/
    public Long getActualStoryPoints(){
	    final FieldModel actual_story_points = wrappedEntityModel.getValue("actual_story_points");
	    return actual_story_points == null ? null : (Long) actual_story_points.getValue();
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
	* Label: Features
	* Description: The number of features associated with the epic.
	*/
    public Long getFeatures(){
	    final FieldModel features = wrappedEntityModel.getValue("features");
	    return features == null ? null : (Long) features.getValue();
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
    public com.hpe.adm.nga.sdk.enums.Phases.EpicPhase getPhase() {
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
    final EntityModel referenceFieldModel = phase.getValue();
    return com.hpe.adm.nga.sdk.enums.Phases.EpicPhase.getFromEntityModel(referenceFieldModel);
}


            @FieldMetadata(filterable = true, sortable = true, required = true)
	public EpicEntityModel setPhase(final com.hpe.adm.nga.sdk.enums.Phases.EpicPhase phase) {
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
	public EpicEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: WSJF time RR | OE
	* Description: The RROE (Risk Recution-Opportunity Enablement) value, used to calculate  the WSJF score. This value is accessed by referencing a list of RROE values.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale getRroe() {
    if (wrappedEntityModel.getValue("rroe") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel rroe = (ReferenceFieldModel) wrappedEntityModel.getValue("rroe");
    final EntityModel referenceFieldModel = rroe.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setRroe(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale rroe) {
    if (rroe == null) {
	    wrappedEntityModel.removeValue("rroe");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("rroe", rroe.getAsEntityModel()));
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
        public EpicEntityModel setAuthor(final WorkspaceUserEntityModel author){
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
    	public EpicEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public EpicEntityModel setName(final String name){
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
    	public EpicEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	public EpicEntityModel setOrdering(final String ordering){
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
	public EpicEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: WSJF score
	* Description: The calculated WSJF (Weighted Shortest Job First) score for prioritizing backlogs.
	*/
    public Long getWsjfScore(){
	    final FieldModel wsjf_score = wrappedEntityModel.getValue("wsjf_score");
	    return wsjf_score == null ? null : (Long) wsjf_score.getValue();
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
        public EpicEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Requirements
	* Description: The requirements covering this entity.
	*/
        public java.util.Collection<RequirementDocumentEntityModel> getRequirements(){
        final MultiReferenceFieldModel requirements = (MultiReferenceFieldModel) wrappedEntityModel.getValue("requirements");
        if (requirements == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = requirements.getValue();
                        return value.stream().map(RequirementDocumentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public EpicEntityModel setRequirements(final java.util.Collection<RequirementDocumentEntityModel> requirements){
	    if (requirements == null) {
	        wrappedEntityModel.removeValue("requirements");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = requirements.stream().map(entityModel -> {
		    if (entityModel instanceof RequirementEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of requirements must be of types {RequirementEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("requirements", entityModels));
            return this;
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

        /**
	* Label: Has attachments
	* Description: Whether the entity has an attachment.
	*/
    public Boolean getHasAttachments(){
	    final FieldModel has_attachments = wrappedEntityModel.getValue("has_attachments");
	    return has_attachments == null ? null : (Boolean) has_attachments.getValue();
	}

        /**
	* Label: Epic type
	* Description: The type of the epic, such as Architecture or Business.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.epic_type.EpicType getEpicType() {
    if (wrappedEntityModel.getValue("epic_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel epic_type = (ReferenceFieldModel) wrappedEntityModel.getValue("epic_type");
    final EntityModel referenceFieldModel = epic_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.epic_type.EpicType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setEpicType(final com.hpe.adm.nga.sdk.enums.lists.list_node.epic_type.EpicType epic_type) {
    if (epic_type == null) {
	    wrappedEntityModel.removeValue("epic_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("epic_type", epic_type.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Epic(Trace from)
	* Description: 
	*/
        public java.util.Collection<EpicEntityModel> getLinkedItems2(){
        final MultiReferenceFieldModel linked_items2 = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_items2");
        if (linked_items2 == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_items2.getValue();
                        return value.stream().map(EpicEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public EpicEntityModel setLinkedItems2(final java.util.Collection<EpicEntityModel> linkedItems2){
	    if (linkedItems2 == null) {
	        wrappedEntityModel.removeValue("linked_items2");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = linkedItems2.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of linkedItems2 must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("linked_items2", entityModels));
            return this;
	}

    /**
	* Label: Story points
	* Description: The number of story points representing the effort required to implement the entity.
	*/
    public Long getStoryPoints(){
	    final FieldModel story_points = wrappedEntityModel.getValue("story_points");
	    return story_points == null ? null : (Long) story_points.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setStoryPoints(final Long storyPoints){
        if (storyPoints == null) {
            wrappedEntityModel.removeValue("story_points");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("story_points", storyPoints));
        }
        return this;
	}

    /**
	* Label: Epic(Trace to)
	* Description: 
	*/
        public java.util.Collection<EpicEntityModel> getLinkedItems1(){
        final MultiReferenceFieldModel linked_items1 = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_items1");
        if (linked_items1 == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_items1.getValue();
                        return value.stream().map(EpicEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public EpicEntityModel setLinkedItems1(final java.util.Collection<EpicEntityModel> linkedItems1){
	    if (linkedItems1 == null) {
	        wrappedEntityModel.removeValue("linked_items1");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = linkedItems1.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of linkedItems1 must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("linked_items1", entityModels));
            return this;
	}

    /**
	* Label: Milestone
	* Description: A reference to the milestone in which the entity is related.
	*/
        public MilestoneEntityModel getMilestone(){
    if (wrappedEntityModel.getValue("milestone") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel milestone = (ReferenceFieldModel) wrappedEntityModel.getValue("milestone");
	final EntityModel referenceFieldModel = milestone.getValue();
            return new MilestoneEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public EpicEntityModel setMilestone(final MilestoneEntityModel milestone){
			if (milestone == null) {
			    wrappedEntityModel.removeValue("milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("milestone", milestone.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: WSJF time criticality
	* Description: The Time Criticality value, used to calculate  the WSJF score. This value is accessed by referencing a list of time criticality values.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale getTimeCriticality() {
    if (wrappedEntityModel.getValue("time_criticality") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel time_criticality = (ReferenceFieldModel) wrappedEntityModel.getValue("time_criticality");
    final EntityModel referenceFieldModel = time_criticality.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setTimeCriticality(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale time_criticality) {
    if (time_criticality == null) {
	    wrappedEntityModel.removeValue("time_criticality");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("time_criticality", time_criticality.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: WSJF job size
	* Description: How large of a job it is to implement the features in this epic. Specified as a  whole integer number. This is used to calculate the WSJF score.
	*/
    public Long getJobSize(){
	    final FieldModel job_size = wrappedEntityModel.getValue("job_size");
	    return job_size == null ? null : (Long) job_size.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setJobSize(final Long jobSize){
        if (jobSize == null) {
            wrappedEntityModel.removeValue("job_size");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("job_size", jobSize));
        }
        return this;
	}

    /**
	* Label: WSJF business value
	* Description: The User-Business value, used to calculate  the WSJF score. This value is accessed by referencing a list of User-Business values.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale getBusinessValue() {
    if (wrappedEntityModel.getValue("business_value") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel business_value = (ReferenceFieldModel) wrappedEntityModel.getValue("business_value");
    final EntityModel referenceFieldModel = business_value.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public EpicEntityModel setBusinessValue(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale business_value) {
    if (business_value == null) {
	    wrappedEntityModel.removeValue("business_value");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("business_value", business_value.getAsEntityModel()));
    }
    return this;
	}
}




















