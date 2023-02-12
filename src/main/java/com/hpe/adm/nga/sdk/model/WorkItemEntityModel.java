package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: work_item</p>
 * <p>Label: Work Item</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "work_items", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class WorkItemEntityModel extends TypedEntityModel implements WorkItemEntity {

    public WorkItemEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "work_item"));
    }

    public WorkItemEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public WorkItemEntityModel(    final String name, final FeatureEntityModel parent, final PhaseEntityModel phase, final String subtype) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
            setSubtype(subtype);
        }
        public WorkItemEntityModel(    final String name, final WorkItemRootEntityModel parent, final PhaseEntityModel phase, final String subtype) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
            setSubtype(subtype);
        }
        public WorkItemEntityModel(    final String name, final EpicEntityModel parent, final PhaseEntityModel phase, final String subtype) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
            setSubtype(subtype);
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
        @AllowedReferences({EpicEntityModel.class, WorkItemRootEntityModel.class, FeatureEntityModel.class, })
public <T extends WorkItemEntity> T getParent(){
    if (wrappedEntityModel.getValue("parent") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel parent = (ReferenceFieldModel) wrappedEntityModel.getValue("parent");
	final EntityModel referenceFieldModel = parent.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("feature")) {
			    return (T) new FeatureEntityModel(referenceFieldModel);
			}else if (referenceType.equals("epic")) {
			    return (T) new EpicEntityModel(referenceFieldModel);
			}else if (referenceType.equals("work_item_root")) {
			    return (T) new WorkItemRootEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public WorkItemEntityModel setParent(final FeatureEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = true, required = true)
        public WorkItemEntityModel setParent(final EpicEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = true, required = true)
        public WorkItemEntityModel setParent(final WorkItemRootEntityModel parent){
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
	* Label: Defect root cause
	* Description: The root cause of the defect.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.defect_root_level.DefectRootCause getDefectRootLevel() {
    if (wrappedEntityModel.getValue("defect_root_level") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel defect_root_level = (ReferenceFieldModel) wrappedEntityModel.getValue("defect_root_level");
    final EntityModel referenceFieldModel = defect_root_level.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.defect_root_level.DefectRootCause.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setDefectRootLevel(final com.hpe.adm.nga.sdk.enums.lists.list_node.defect_root_level.DefectRootCause defect_root_level) {
    if (defect_root_level == null) {
	    wrappedEntityModel.removeValue("defect_root_level");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("defect_root_level", defect_root_level.getAsEntityModel()));
    }
    return this;
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
        public WorkItemEntityModel setRelease(final ReleaseEntityModel release){
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
        public WorkItemEntityModel setProgram(final ProgramEntityModel program){
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
        public PhaseEntityModel getPhase(){
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
	final EntityModel referenceFieldModel = phase.getValue();
            return new PhaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public WorkItemEntityModel setPhase(final PhaseEntityModel phase){
			if (phase == null) {
			    wrappedEntityModel.removeValue("phase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Fixed on
	* Description: The date on which the defect was fixed.
	*/
    public java.time.ZonedDateTime getFixedOn(){
	    final FieldModel fixed_on = wrappedEntityModel.getValue("fixed_on");
	    return fixed_on == null ? null : (java.time.ZonedDateTime) fixed_on.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setFixedOn(final java.time.ZonedDateTime fixedOn){
        if (fixedOn == null) {
            wrappedEntityModel.removeValue("fixed_on");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("fixed_on", fixedOn));
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
	public WorkItemEntityModel setRroe(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale rroe) {
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
	* Label: Covering tests
	* Description: A numeric field that shows the number of tests linked to this defect
	*/
    public Long getCoveringTests(){
	    final FieldModel covering_tests = wrappedEntityModel.getValue("covering_tests");
	    return covering_tests == null ? null : (Long) covering_tests.getValue();
	}

        /**
	* Label: Reopens
	* Description: A numeric field that shows the number of times this defect was reopened
	*/
    public Long getReopens(){
	    final FieldModel reopens = wrappedEntityModel.getValue("reopens");
	    return reopens == null ? null : (Long) reopens.getValue();
	}

        /**
	* Label: Linked Tests
	* Description: The tests linked to this quality story.
	*/
        @AllowedReferences({TestManualEntityModel.class, TestSuiteEntityModel.class, GherkinTestEntityModel.class, TestAutomatedEntityModel.class, })
public java.util.Collection<TestEntity> getLinkedTests(){
        final MultiReferenceFieldModel linked_tests = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_tests");
        if (linked_tests == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_tests.getValue();
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
	public WorkItemEntityModel setLinkedTests(final java.util.Collection<TestEntity> linkedTests){
	    if (linkedTests == null) {
	        wrappedEntityModel.removeValue("linked_tests");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = linkedTests.stream().map(entityModel -> {
		    if (entityModel instanceof TestEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of linkedTests must be of types {TestEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("linked_tests", entityModels));
            return this;
	}

    /**
	* Label: Priority
	* Description: The priority of the defect, from 5 (Low) to 1 (Urgent).
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
	public WorkItemEntityModel setPriority(final com.hpe.adm.nga.sdk.enums.lists.list_node.priority.Priority priority) {
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
    	public WorkItemEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Environment
	* Description: Also known as environments, tags that describe the environment on which the defect was found.
	*/
        public java.util.Collection<TaxonomyItemNodeEntityModel> getTaxonomies(){
        final MultiReferenceFieldModel taxonomies = (MultiReferenceFieldModel) wrappedEntityModel.getValue("taxonomies");
        if (taxonomies == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = taxonomies.getValue();
                        return value.stream().map(TaxonomyItemNodeEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public WorkItemEntityModel setTaxonomies(final java.util.Collection<TaxonomyItemNodeEntityModel> taxonomies){
	    if (taxonomies == null) {
	        wrappedEntityModel.removeValue("taxonomies");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = taxonomies.stream().map(entityModel -> {
		    if (entityModel instanceof TaxonomyNodeEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of taxonomies must be of types {TaxonomyNodeEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("taxonomies", entityModels));
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
	* Label: Estimated hours
	* Description: Number of hours estimated to implement the entity.
	*/
    public Long getEstimatedHours(){
	    final FieldModel estimated_hours = wrappedEntityModel.getValue("estimated_hours");
	    return estimated_hours == null ? null : (Long) estimated_hours.getValue();
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
    	public WorkItemEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	public WorkItemEntityModel setInitialEstimate(final Long initialEstimate){
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
	public WorkItemEntityModel setOrdering(final String ordering){
        if (ordering == null) {
            wrappedEntityModel.removeValue("ordering");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("ordering", ordering));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Blocked
	* Description: Sometimes, when working on an entity, you find that you cannot proceed in your work. In these cases, set the entity to "Blocked".
	*/
    public Boolean getBlocked(){
	    final FieldModel blocked = wrappedEntityModel.getValue("blocked");
	    return blocked == null ? null : (Boolean) blocked.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setBlocked(final Boolean blocked){
        if (blocked == null) {
            wrappedEntityModel.removeValue("blocked");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("blocked", blocked));
        }
        return this;
	}

    /**
	* Label: Invested hours
	* Description: Number of hours invested in implementing the entity so far.
	*/
    public Long getInvestedHours(){
	    final FieldModel invested_hours = wrappedEntityModel.getValue("invested_hours");
	    return invested_hours == null ? null : (Long) invested_hours.getValue();
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
	public WorkItemEntityModel setDependence(final java.util.Collection<WorkItemEntity> dependence){
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
	public WorkItemEntityModel setEpicType(final com.hpe.adm.nga.sdk.enums.lists.list_node.epic_type.EpicType epic_type) {
    if (epic_type == null) {
	    wrappedEntityModel.removeValue("epic_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("epic_type", epic_type.getAsEntityModel()));
    }
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
	public WorkItemEntityModel setStoryPoints(final Long storyPoints){
        if (storyPoints == null) {
            wrappedEntityModel.removeValue("story_points");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("story_points", storyPoints));
        }
        return this;
	}

    /**
	* Label: Linked Defect
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, EpicEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
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
	public WorkItemEntityModel setLinkedItems2(final java.util.Collection<WorkItemEntity> linkedItems2){
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
	* Label: Linked items1
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, EpicEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
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
	public WorkItemEntityModel setLinkedItems1(final java.util.Collection<WorkItemEntity> linkedItems1){
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
	* Label: Quality stories
	* Description: The number of quality stories associated with the feature.
	*/
    public Long getQualityStories(){
	    final FieldModel quality_stories = wrappedEntityModel.getValue("quality_stories");
	    return quality_stories == null ? null : (Long) quality_stories.getValue();
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
        public WorkItemEntityModel setTeam(final TeamEntityModel team){
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
	public WorkItemEntityModel setTimeCriticality(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale time_criticality) {
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
	public WorkItemEntityModel setBusinessValue(final com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type.WSJFScale business_value) {
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
	* Label: Linked Runs (to Defect)
	* Description: The runs associated with this defect.
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
	public WorkItemEntityModel setRun(final java.util.Collection<RunEntity> run){
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
	* Label: Fixed in build
	* Description: The build in which the defect was fixed.
	*/
    public Long getFixedInBuild(){
	    final FieldModel fixed_in_build = wrappedEntityModel.getValue("fixed_in_build");
	    return fixed_in_build == null ? null : (Long) fixed_in_build.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setFixedInBuild(final Long fixedInBuild){
        if (fixedInBuild == null) {
            wrappedEntityModel.removeValue("fixed_in_build");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("fixed_in_build", fixedInBuild));
        }
        return this;
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
	* Label: Quality story type
	* Description: The type of quality story, such as Test Authoring.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.quality_story_type.QualityStoryType getQualityStoryType() {
    if (wrappedEntityModel.getValue("quality_story_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel quality_story_type = (ReferenceFieldModel) wrappedEntityModel.getValue("quality_story_type");
    final EntityModel referenceFieldModel = quality_story_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.quality_story_type.QualityStoryType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setQualityStoryType(final com.hpe.adm.nga.sdk.enums.lists.list_node.quality_story_type.QualityStoryType quality_story_type) {
    if (quality_story_type == null) {
	    wrappedEntityModel.removeValue("quality_story_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("quality_story_type", quality_story_type.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Defect type
	* Description: The type of the defect, such as whether the defect was discovered before the product was delivered (Pre-release) or after (Escaped).
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.defect_type.DefectType getDefectType() {
    if (wrappedEntityModel.getValue("defect_type") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel defect_type = (ReferenceFieldModel) wrappedEntityModel.getValue("defect_type");
    final EntityModel referenceFieldModel = defect_type.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.defect_type.DefectType.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setDefectType(final com.hpe.adm.nga.sdk.enums.lists.list_node.defect_type.DefectType defect_type) {
    if (defect_type == null) {
	    wrappedEntityModel.removeValue("defect_type");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("defect_type", defect_type.getAsEntityModel()));
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
	public WorkItemEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Run step
	* Description: The defects associated with this run step.
	*/
        public java.util.Collection<RunStepEntityModel> getRunStep(){
        final MultiReferenceFieldModel run_step = (MultiReferenceFieldModel) wrappedEntityModel.getValue("run_step");
        if (run_step == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = run_step.getValue();
                        return value.stream().map(RunStepEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public WorkItemEntityModel setRunStep(final java.util.Collection<RunStepEntityModel> runStep){
	    if (runStep == null) {
	        wrappedEntityModel.removeValue("run_step");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = runStep.stream().map(entityModel -> {
		    if (entityModel instanceof RunStepEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of runStep must be of types {RunStepEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("run_step", entityModels));
            return this;
	}

    /**
	* Label: Linked Runs (to Quality Story)
	* Description: The runs linked to this quality story.
	*/
        @AllowedReferences({GherkinAutomatedRunEntityModel.class, RunManualEntityModel.class, RunSuiteEntityModel.class, RunAutomatedEntityModel.class, })
public java.util.Collection<RunEntity> getLinkedRuns(){
        final MultiReferenceFieldModel linked_runs = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_runs");
        if (linked_runs == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_runs.getValue();
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
	public WorkItemEntityModel setLinkedRuns(final java.util.Collection<RunEntity> linkedRuns){
	    if (linkedRuns == null) {
	        wrappedEntityModel.removeValue("linked_runs");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = linkedRuns.stream().map(entityModel -> {
		    if (entityModel instanceof RunEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of linkedRuns must be of types {RunEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("linked_runs", entityModels));
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
	public WorkItemEntityModel setTest(final java.util.Collection<TestEntity> test){
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
        public WorkItemEntityModel setAuthor(final WorkspaceUserEntityModel author){
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
    	public WorkItemEntityModel setProductAreas(final java.util.Collection<ProductAreaEntityModel> productAreas){
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
    	public WorkItemEntityModel setApplicationModules(final java.util.Collection<ApplicationModuleEntityModel> applicationModules){
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
	* Label: Remaining hours
	* Description: Number of hours remaining to implement the entity.
	*/
    public Long getRemainingHours(){
	    final FieldModel remaining_hours = wrappedEntityModel.getValue("remaining_hours");
	    return remaining_hours == null ? null : (Long) remaining_hours.getValue();
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
	* Label: Task Count
	* Description: The number of tasks associated with this work item.
	*/
    public Long getTasksNumber(){
	    final FieldModel tasks_number = wrappedEntityModel.getValue("tasks_number");
	    return tasks_number == null ? null : (Long) tasks_number.getValue();
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
	public WorkItemEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Commits
	* Description: 
	*/
        public java.util.Collection<ScmCommitEntityModel> getCommits(){
        final MultiReferenceFieldModel commits = (MultiReferenceFieldModel) wrappedEntityModel.getValue("commits");
        if (commits == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = commits.getValue();
                        return value.stream().map(ScmCommitEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public WorkItemEntityModel setCommits(final java.util.Collection<ScmCommitEntityModel> commits){
	    if (commits == null) {
	        wrappedEntityModel.removeValue("commits");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = commits.stream().map(entityModel -> {
		    if (entityModel instanceof ScmCommitEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of commits must be of types {ScmCommitEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("commits", entityModels));
            return this;
	}

    /**
	* Label: Detected in build
	* Description: The build in which the defect was detected. 
	*/
    public Long getDetectedInBuild(){
	    final FieldModel detected_in_build = wrappedEntityModel.getValue("detected_in_build");
	    return detected_in_build == null ? null : (Long) detected_in_build.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setDetectedInBuild(final Long detectedInBuild){
        if (detectedInBuild == null) {
            wrappedEntityModel.removeValue("detected_in_build");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("detected_in_build", detectedInBuild));
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
	public WorkItemEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Detected in release
	* Description: The release in which the defect was discovered.
	*/
        public ReleaseEntityModel getDetectedInRelease(){
    if (wrappedEntityModel.getValue("detected_in_release") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel detected_in_release = (ReferenceFieldModel) wrappedEntityModel.getValue("detected_in_release");
	final EntityModel referenceFieldModel = detected_in_release.getValue();
            return new ReleaseEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public WorkItemEntityModel setDetectedInRelease(final ReleaseEntityModel detectedInRelease){
			if (detectedInRelease == null) {
			    wrappedEntityModel.removeValue("detected_in_release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("detected_in_release", detectedInRelease.getWrappedEntityModel()));
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
	* Label: Code coverage
	* Description: has_coverage
	*/
    public Boolean getHasCoverage(){
	    final FieldModel has_coverage = wrappedEntityModel.getValue("has_coverage");
	    return has_coverage == null ? null : (Boolean) has_coverage.getValue();
	}

        /**
	* Label: Type
	* Description: Some items are aggregated. This means that they encompass several types of items, which are called subtypes. 

Examples:  
•	The Tests aggregated item includes the following test subtypes: Automated, Manual, Test suite, and Gherkin.
•	The Work Items aggregation includes epics, features, user stories, quality stories, and defects.

This field indicates the subtype for this item. 

	*/
    public String getSubtype(){
	    final FieldModel subtype = wrappedEntityModel.getValue("subtype");
	    return subtype == null ? null : (String) subtype.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public WorkItemEntityModel setSubtype(final String subtype){
        if (subtype == null) {
            wrappedEntityModel.removeValue("subtype");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("subtype", subtype));
        }
        return this;
	}

    /**
	* Label: Detected by
	* Description: 
	*/
        public WorkspaceUserEntityModel getDetectedBy(){
    if (wrappedEntityModel.getValue("detected_by") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel detected_by = (ReferenceFieldModel) wrappedEntityModel.getValue("detected_by");
	final EntityModel referenceFieldModel = detected_by.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public WorkItemEntityModel setDetectedBy(final WorkspaceUserEntityModel detectedBy){
			if (detectedBy == null) {
			    wrappedEntityModel.removeValue("detected_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("detected_by", detectedBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: QA owner
	* Description: 
	*/
        public WorkspaceUserEntityModel getQaOwner(){
    if (wrappedEntityModel.getValue("qa_owner") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel qa_owner = (ReferenceFieldModel) wrappedEntityModel.getValue("qa_owner");
	final EntityModel referenceFieldModel = qa_owner.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public WorkItemEntityModel setQaOwner(final WorkspaceUserEntityModel qaOwner){
			if (qaOwner == null) {
			    wrappedEntityModel.removeValue("qa_owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("qa_owner", qaOwner.getWrappedEntityModel()));
            }
            return this;
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
	public WorkItemEntityModel setClosedOn(final java.time.ZonedDateTime closedOn){
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
	public WorkItemEntityModel setDoneDate(final java.time.ZonedDateTime doneDate){
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
        public WorkItemEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Severity
	* Description: The severity of the defect.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.severity.Severity getSeverity() {
    if (wrappedEntityModel.getValue("severity") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel severity = (ReferenceFieldModel) wrappedEntityModel.getValue("severity");
    final EntityModel referenceFieldModel = severity.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.severity.Severity.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setSeverity(final com.hpe.adm.nga.sdk.enums.lists.list_node.severity.Severity severity) {
    if (severity == null) {
	    wrappedEntityModel.removeValue("severity");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("severity", severity.getAsEntityModel()));
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
    	public WorkItemEntityModel setRequirements(final java.util.Collection<RequirementDocumentEntityModel> requirements){
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
	public WorkItemEntityModel setDependsOn(final java.util.Collection<WorkItemEntity> dependsOn){
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
	public WorkItemEntityModel setFeatureType(final com.hpe.adm.nga.sdk.enums.lists.list_node.feature_type.FeatureType feature_type) {
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
        public WorkItemEntityModel setMilestone(final MilestoneEntityModel milestone){
			if (milestone == null) {
			    wrappedEntityModel.removeValue("milestone");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("milestone", milestone.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Blocked reason
	* Description: The reason why you cannot proceed in your work, causing you to block the entity. Enter the reason in free-text.
	*/
    public String getBlockedReason(){
	    final FieldModel blocked_reason = wrappedEntityModel.getValue("blocked_reason");
	    return blocked_reason == null ? null : (String) blocked_reason.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false, maxLength = 255L)
	public WorkItemEntityModel setBlockedReason(final String blockedReason){
        if (blockedReason == null) {
            wrappedEntityModel.removeValue("blocked_reason");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("blocked_reason", blockedReason));
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

        /**
	* Label: WSJF job size
	* Description: How large of a job it is to implement the features in this epic. Specified as a  whole integer number. This is used to calculate the WSJF score.
	*/
    public Long getJobSize(){
	    final FieldModel job_size = wrappedEntityModel.getValue("job_size");
	    return job_size == null ? null : (Long) job_size.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public WorkItemEntityModel setJobSize(final Long jobSize){
        if (jobSize == null) {
            wrappedEntityModel.removeValue("job_size");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("job_size", jobSize));
        }
        return this;
	}

    /**
	* Label: Open Vulnerabilities
	* Description: Total number of relevant (not closed and real issues) vulnerabilities related to the work item.
	*/
    public Long getVulnerabilities(){
	    final FieldModel vulnerabilities = wrappedEntityModel.getValue("vulnerabilities");
	    return vulnerabilities == null ? null : (Long) vulnerabilities.getValue();
	}

    }




















