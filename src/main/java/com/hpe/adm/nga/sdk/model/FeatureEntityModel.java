package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: feature</p>
 * <p>Label: Feature</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "features", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class FeatureEntityModel extends TypedEntityModel implements FeatureEntity {

    public FeatureEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "feature"));
    }

    public FeatureEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public FeatureEntityModel(    final String name, final com.hpe.adm.nga.sdk.enums.Phases.FeaturePhase phase) {
        this();
                    setName(name);
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
	* Label: Epic
	* Description: A reference to the item under which an entity was opened.
	*/
        @AllowedReferences({EpicEntityModel.class, WorkItemRootEntityModel.class, })
public <T extends WorkItemEntity> T getParent(){
    if (wrappedEntityModel.getValue("parent") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel parent = (ReferenceFieldModel) wrappedEntityModel.getValue("parent");
	final EntityModel referenceFieldModel = parent.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("epic")) {
			    return (T) new EpicEntityModel(referenceFieldModel);
			}else if (referenceType.equals("work_item_root")) {
			    return (T) new WorkItemRootEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setParent(final EpicEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setParent(final WorkItemRootEntityModel parent){
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
        public ReleaseEntityModel getRelease(){
    if (wrappedEntityModel.getValue("release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel release = (ReferenceFieldModel) wrappedEntityModel.getValue("release");
	final EntityModel referenceFieldModel = release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setRelease(final ReleaseEntityModel release){
			if (release == null) {
			    wrappedEntityModel.removeValue("release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("release", release.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Program
	* Description: The program for this entity. Programs can be used to partition entities by some dev mission, such as by group, sub-product, and so on.
	*/
        public ProgramEntityModel getProgram(){
    if (wrappedEntityModel.getValue("program") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel program = (ReferenceFieldModel) wrappedEntityModel.getValue("program");
	final EntityModel referenceFieldModel = program.getValue();
            return new ProgramEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setProgram(final ProgramEntityModel program){
			if (program == null) {
			    wrappedEntityModel.removeValue("program");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("program", program.getWrappedEntityModel()));
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
	* Label: Phase
	* Description: The status of an entity, such as New, Open, or Closed.
	*/
    public com.hpe.adm.nga.sdk.enums.Phases.FeaturePhase getPhase() {
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
    final EntityModel referenceFieldModel = phase.getValue();
    return com.hpe.adm.nga.sdk.enums.Phases.FeaturePhase.getFromEntityModel(referenceFieldModel);
}


            @FieldMetadata(filterable = true, sortable = true, required = true)
	public FeatureEntityModel setPhase(final com.hpe.adm.nga.sdk.enums.Phases.FeaturePhase phase) {
        if (phase == null) {
	        wrappedEntityModel.removeValue("phase");
        } else {
	        wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getAsEntityModel()));
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
	public FeatureEntityModel setRroe(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale rroe) {
    if (rroe == null) {
	    wrappedEntityModel.removeValue("rroe");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("rroe", rroe.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Covering tests
	* Description: A numeric field that shows the number of tests linked to this defect
	*/
    public Long getCoveringTests(){
	    final FieldModel covering_tests = wrappedEntityModel.getValue("covering_tests");
	    return covering_tests == null ? null : (Long) covering_tests.getValue();
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
	* Label: Priority
	* Description: The priority of the feature, from 5 (Low) to 1 (Urgent).
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.priority.Priority getPriority() {
    if (wrappedEntityModel.getValue("priority") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel priority = (ReferenceFieldModel) wrappedEntityModel.getValue("priority");
    final EntityModel referenceFieldModel = priority.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.priority.Priority.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public FeatureEntityModel setPriority(final com.hpe.adm.nga.sdk.enums.lists.list_node.priority.Priority priority) {
    if (priority == null) {
	    wrappedEntityModel.removeValue("priority");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("priority", priority.getAsEntityModel()));
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
    	public FeatureEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Defects
	* Description: The number of defects associated with the feature.
	*/
    public Long getDefects(){
	    final FieldModel defects = wrappedEntityModel.getValue("defects");
	    return defects == null ? null : (Long) defects.getValue();
	}

        /**
	* Label: User stories
	* Description: The number of stories associated with the feature.
	*/
    public Long getUserStories(){
	    final FieldModel user_stories = wrappedEntityModel.getValue("user_stories");
	    return user_stories == null ? null : (Long) user_stories.getValue();
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
    	public FeatureEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Initial estimate
	* Description: initial_estimate
	*/
    public Long getInitialEstimate(){
	    final FieldModel initial_estimate = wrappedEntityModel.getValue("initial_estimate");
	    return initial_estimate == null ? null : (Long) initial_estimate.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public FeatureEntityModel setInitialEstimate(final Long initialEstimate){
        if (initialEstimate == null) {
            wrappedEntityModel.removeValue("initial_estimate");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("initial_estimate", initialEstimate));
        }
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
	public FeatureEntityModel setOrdering(final String ordering){
        if (ordering == null) {
            wrappedEntityModel.removeValue("ordering");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("ordering", ordering));
        }
        return this;
	}

    /**
	* Label: Direct Successors
	* Description: The work items that depends on the entity.
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getDependence(){
        final MultiReferenceFieldModel dependence = (MultiReferenceFieldModel) wrappedEntityModel.getValue("dependence");
        if (dependence == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = dependence.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("quality_story")) {
				    return new QualityStoryEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public FeatureEntityModel setDependence(final java.util.Collection<WorkItemEntity> dependence){
	    if (dependence == null) {
	        wrappedEntityModel.removeValue("dependence");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = dependence.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of dependence must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("dependence", entityModels));
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
	* Label: Feature(Trace from)
	* Description: 
	*/
        @AllowedReferences({FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getLinkedItems2(){
        final MultiReferenceFieldModel linked_items2 = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_items2");
        if (linked_items2 == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_items2.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({FeatureEntityModel.class, DefectEntityModel.class, })
	public FeatureEntityModel setLinkedItems2(final java.util.Collection<WorkItemEntity> linkedItems2){
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
	public FeatureEntityModel setStoryPoints(final Long storyPoints){
        if (storyPoints == null) {
            wrappedEntityModel.removeValue("story_points");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("story_points", storyPoints));
        }
        return this;
	}

    /**
	* Label: Quality stories
	* Description: The number of quality stories associated with the feature.
	*/
    public Long getQualityStories(){
	    final FieldModel quality_stories = wrappedEntityModel.getValue("quality_stories");
	    return quality_stories == null ? null : (Long) quality_stories.getValue();
	}

        /**
	* Label: Feature(Trace to)
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, })
public java.util.Collection<WorkItemEntity> getLinkedItems1(){
        final MultiReferenceFieldModel linked_items1 = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_items1");
        if (linked_items1 == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_items1.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("quality_story")) {
				    return new QualityStoryEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, })
	public FeatureEntityModel setLinkedItems1(final java.util.Collection<WorkItemEntity> linkedItems1){
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
	* Label: Team
	* Description: The team assigned to handle the entity.
	*/
        public TeamEntityModel getTeam(){
    if (wrappedEntityModel.getValue("team") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel team = (ReferenceFieldModel) wrappedEntityModel.getValue("team");
	final EntityModel referenceFieldModel = team.getValue();
            return new TeamEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setTeam(final TeamEntityModel team){
			if (team == null) {
			    wrappedEntityModel.removeValue("team");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("team", team.getWrappedEntityModel()));
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
	public FeatureEntityModel setTimeCriticality(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale time_criticality) {
    if (time_criticality == null) {
	    wrappedEntityModel.removeValue("time_criticality");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("time_criticality", time_criticality.getAsEntityModel()));
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
	public FeatureEntityModel setBusinessValue(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale business_value) {
    if (business_value == null) {
	    wrappedEntityModel.removeValue("business_value");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("business_value", business_value.getAsEntityModel()));
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
	* Label: Target Sprint
	* Description: A reference to a sprint during which the entity is meant to be handled.
	*/
        public SprintEntityModel getSprint(){
    if (wrappedEntityModel.getValue("sprint") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel sprint = (ReferenceFieldModel) wrappedEntityModel.getValue("sprint");
	final EntityModel referenceFieldModel = sprint.getValue();
            return new SprintEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public FeatureEntityModel setSprint(final SprintEntityModel sprint){
			if (sprint == null) {
			    wrappedEntityModel.removeValue("sprint");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("sprint", sprint.getWrappedEntityModel()));
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
	public FeatureEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Tests
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
	public FeatureEntityModel setTest(final java.util.Collection<TestEntity> test){
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
        public FeatureEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Has Open Vulnerabilities
	* Description: Total number of a feature’s descendants (user stories/defects/quality stories) that have vulnerabilities which are significant and not closed.
	*/
    public Boolean getHasVulnerabilities(){
	    final FieldModel has_vulnerabilities = wrappedEntityModel.getValue("has_vulnerabilities");
	    return has_vulnerabilities == null ? null : (Boolean) has_vulnerabilities.getValue();
	}

        /**
	* Label: Application modules
	* Description: Also known as application modules, the functional areas of the product or application you are developing.
	*/
        public java.util.Collection<ProductAreaEntityModel> getProductAreas(){
        final MultiReferenceFieldModel product_areas = (MultiReferenceFieldModel) wrappedEntityModel.getValue("product_areas");
        if (product_areas == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = product_areas.getValue();
                        return value.stream().map(ProductAreaEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public FeatureEntityModel setProductAreas(final java.util.Collection<ProductAreaEntityModel> productAreas){
	    if (productAreas == null) {
	        wrappedEntityModel.removeValue("product_areas");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = productAreas.stream().map(entityModel -> {
		    if (entityModel instanceof ProductAreaEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of productAreas must be of types {ProductAreaEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("product_areas", entityModels));
            return this;
	}

    /**
	* Label: Application modules
	* Description: Also known as application modules, the functional areas of the product or application you are developing.
	*/
        public java.util.Collection<ApplicationModuleEntityModel> getApplicationModules(){
        final MultiReferenceFieldModel application_modules = (MultiReferenceFieldModel) wrappedEntityModel.getValue("application_modules");
        if (application_modules == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = application_modules.getValue();
                        return value.stream().map(ApplicationModuleEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public FeatureEntityModel setApplicationModules(final java.util.Collection<ApplicationModuleEntityModel> applicationModules){
	    if (applicationModules == null) {
	        wrappedEntityModel.removeValue("application_modules");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = applicationModules.stream().map(entityModel -> {
		    if (entityModel instanceof ApplicationModuleEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of applicationModules must be of types {ApplicationModuleEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("application_modules", entityModels));
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
	* Label: Code coverage
	* Description: has_coverage
	*/
    public Boolean getAggregatedCoverage(){
	    final FieldModel aggregated_coverage = wrappedEntityModel.getValue("aggregated_coverage");
	    return aggregated_coverage == null ? null : (Boolean) aggregated_coverage.getValue();
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
	public FeatureEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Depends on count
	* Description: The number of work items that the work item depends on.
	*/
    public Long getDependsOnCount(){
	    final FieldModel depends_on_count = wrappedEntityModel.getValue("depends_on_count");
	    return depends_on_count == null ? null : (Long) depends_on_count.getValue();
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
	public FeatureEntityModel setDescription(final String description){
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
	* Label: Done date
	* Description: The date on which the entity reach done metaphase.
	*/
    public java.time.ZonedDateTime getClosedOn(){
	    final FieldModel closed_on = wrappedEntityModel.getValue("closed_on");
	    return closed_on == null ? null : (java.time.ZonedDateTime) closed_on.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public FeatureEntityModel setClosedOn(final java.time.ZonedDateTime closedOn){
        if (closedOn == null) {
            wrappedEntityModel.removeValue("closed_on");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("closed_on", closedOn));
        }
        return this;
	}

    /**
	* Label: Done date
	* Description: The date on which the entity reach done metaphase.
	*/
    public java.time.ZonedDateTime getDoneDate(){
	    final FieldModel done_date = wrappedEntityModel.getValue("done_date");
	    return done_date == null ? null : (java.time.ZonedDateTime) done_date.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public FeatureEntityModel setDoneDate(final java.time.ZonedDateTime doneDate){
        if (doneDate == null) {
            wrappedEntityModel.removeValue("done_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("done_date", doneDate));
        }
        return this;
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
        public FeatureEntityModel setOwner(final WorkspaceUserEntityModel owner){
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
    	public FeatureEntityModel setRequirements(final java.util.Collection<RequirementDocumentEntityModel> requirements){
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
	* Label: Direct Predecessors
	* Description: The work items that the entity depends on.
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getDependsOn(){
        final MultiReferenceFieldModel depends_on = (MultiReferenceFieldModel) wrappedEntityModel.getValue("depends_on");
        if (depends_on == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = depends_on.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("quality_story")) {
				    return new QualityStoryEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public FeatureEntityModel setDependsOn(final java.util.Collection<WorkItemEntity> dependsOn){
	    if (dependsOn == null) {
	        wrappedEntityModel.removeValue("depends_on");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = dependsOn.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of dependsOn must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("depends_on", entityModels));
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
	* Label: Feature type
	* Description: The type of the feature, such as Architecture or Business.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.feature_type.FeatureType getFeatureType() {
    if (wrappedEntityModel.getValue("feature_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel feature_type = (ReferenceFieldModel) wrappedEntityModel.getValue("feature_type");
    final EntityModel referenceFieldModel = feature_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.feature_type.FeatureType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public FeatureEntityModel setFeatureType(final com.hpe.adm.nga.sdk.enums.lists.list_node.feature_type.FeatureType feature_type) {
    if (feature_type == null) {
	    wrappedEntityModel.removeValue("feature_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("feature_type", feature_type.getAsEntityModel()));
    }
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
        public FeatureEntityModel setMilestone(final MilestoneEntityModel milestone){
			if (milestone == null) {
			    wrappedEntityModel.removeValue("milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("milestone", milestone.getWrappedEntityModel()));
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
	public FeatureEntityModel setJobSize(final Long jobSize){
        if (jobSize == null) {
            wrappedEntityModel.removeValue("job_size");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("job_size", jobSize));
        }
        return this;
	}

    /**
	* Label: Dependents count
	* Description: The number of work items that depends on the work item.
	*/
    public Long getDependenceCount(){
	    final FieldModel dependence_count = wrappedEntityModel.getValue("dependence_count");
	    return dependence_count == null ? null : (Long) dependence_count.getValue();
	}

    }




















