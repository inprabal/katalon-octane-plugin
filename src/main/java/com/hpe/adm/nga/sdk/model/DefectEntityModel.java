package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: defect</p>
 * <p>Label: Defect</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "defects", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class DefectEntityModel extends TypedEntityModel implements DefectEntity {

    public DefectEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "defect"));
    }

    public DefectEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public DefectEntityModel(    final String name, final WorkItemRootEntityModel parent, final com.hpe.adm.nga.sdk.enums.Phases.DefectPhase phase) {
        this();
                    setName(name);
            setParent(parent);
            setPhase(phase);
        }
        public DefectEntityModel(    final String name, final FeatureEntityModel parent, final com.hpe.adm.nga.sdk.enums.Phases.DefectPhase phase) {
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
	* Label: Feature
	* Description: A reference to the item under which an entity was opened.
	*/
        @AllowedReferences({WorkItemRootEntityModel.class, FeatureEntityModel.class, })
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
			}else if (referenceType.equals("work_item_root")) {
			    return (T) new WorkItemRootEntityModel(referenceFieldModel);
			}                return (T) new WorkItemEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = true)
        public DefectEntityModel setParent(final FeatureEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = true, required = true)
        public DefectEntityModel setParent(final WorkItemRootEntityModel parent){
			if (parent == null) {
			    wrappedEntityModel.removeValue("parent");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("parent", parent.getWrappedEntityModel()));
            }
            return this;
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
	public DefectEntityModel setDefectRootLevel(final com.hpe.adm.nga.sdk.enums.lists.list_node.defect_root_level.DefectRootCause defect_root_level) {
    if (defect_root_level == null) {
	    wrappedEntityModel.removeValue("defect_root_level");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("defect_root_level", defect_root_level.getAsEntityModel()));
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
        public DefectEntityModel setRelease(final ReleaseEntityModel release){
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
        public DefectEntityModel setProgram(final ProgramEntityModel program){
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
    public com.hpe.adm.nga.sdk.enums.Phases.DefectPhase getPhase() {
    if (wrappedEntityModel.getValue("phase") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel phase = (ReferenceFieldModel) wrappedEntityModel.getValue("phase");
    final EntityModel referenceFieldModel = phase.getValue();
    return com.hpe.adm.nga.sdk.enums.Phases.DefectPhase.getFromEntityModel(referenceFieldModel);
}


            @FieldMetadata(filterable = true, sortable = true, required = true)
	public DefectEntityModel setPhase(final com.hpe.adm.nga.sdk.enums.Phases.DefectPhase phase) {
        if (phase == null) {
	        wrappedEntityModel.removeValue("phase");
        } else {
	        wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getAsEntityModel()));
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
	public DefectEntityModel setFixedOn(final java.time.ZonedDateTime fixedOn){
        if (fixedOn == null) {
            wrappedEntityModel.removeValue("fixed_on");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("fixed_on", fixedOn));
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
	* Label: Reopens
	* Description: A numeric field that shows the number of times this defect was reopened
	*/
    public Long getReopens(){
	    final FieldModel reopens = wrappedEntityModel.getValue("reopens");
	    return reopens == null ? null : (Long) reopens.getValue();
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
	public DefectEntityModel setPriority(final com.hpe.adm.nga.sdk.enums.lists.list_node.priority.Priority priority) {
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
    	public DefectEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
    	public DefectEntityModel setTaxonomies(final java.util.Collection<TaxonomyItemNodeEntityModel> taxonomies){
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
	* Label: Estimated hours
	* Description: Number of hours estimated to implement the entity.
	*/
    public Long getEstimatedHours(){
	    final FieldModel estimated_hours = wrappedEntityModel.getValue("estimated_hours");
	    return estimated_hours == null ? null : (Long) estimated_hours.getValue();
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
    	public DefectEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	public DefectEntityModel setOrdering(final String ordering){
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
	public DefectEntityModel setActivityLevel(final Long activityLevel){
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
	public DefectEntityModel setUserActivationStatus(final Long userActivationStatus){
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
	public DefectEntityModel setBlocked(final Boolean blocked){
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
	public DefectEntityModel setDependence(final java.util.Collection<WorkItemEntity> dependence){
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
	* Label: Defect(Trace from)
	* Description: 
	*/
        public java.util.Collection<DefectEntityModel> getLinkedItems2(){
        final MultiReferenceFieldModel linked_items2 = (MultiReferenceFieldModel) wrappedEntityModel.getValue("linked_items2");
        if (linked_items2 == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = linked_items2.getValue();
                        return value.stream().map(DefectEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public DefectEntityModel setLinkedItems2(final java.util.Collection<DefectEntityModel> linkedItems2){
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
	public DefectEntityModel setStoryPoints(final Long storyPoints){
        if (storyPoints == null) {
            wrappedEntityModel.removeValue("story_points");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("story_points", storyPoints));
        }
        return this;
	}

    /**
	* Label: Backlog Items
	* Description: 
	*/
        @AllowedReferences({QualityStoryEntityModel.class, StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
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
	public DefectEntityModel setLinkedItems1(final java.util.Collection<WorkItemEntity> linkedItems1){
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
        public DefectEntityModel setTeam(final TeamEntityModel team){
			if (team == null) {
			    wrappedEntityModel.removeValue("team");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("team", team.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Sprint
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
        public DefectEntityModel setSprint(final SprintEntityModel sprint){
			if (sprint == null) {
			    wrappedEntityModel.removeValue("sprint");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("sprint", sprint.getWrappedEntityModel()));
            }
            return this;
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
	public DefectEntityModel setRun(final java.util.Collection<RunEntity> run){
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
	public DefectEntityModel setFixedInBuild(final Long fixedInBuild){
        if (fixedInBuild == null) {
            wrappedEntityModel.removeValue("fixed_in_build");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("fixed_in_build", fixedInBuild));
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
	public DefectEntityModel setDefectType(final com.hpe.adm.nga.sdk.enums.lists.list_node.defect_type.DefectType defect_type) {
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
	public DefectEntityModel setClientLockStamp(final Long clientLockStamp){
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
    	public DefectEntityModel setRunStep(final java.util.Collection<RunStepEntityModel> runStep){
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
	public DefectEntityModel setTest(final java.util.Collection<TestEntity> test){
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
        public DefectEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
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
    	public DefectEntityModel setProductAreas(final java.util.Collection<ProductAreaEntityModel> productAreas){
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
    	public DefectEntityModel setApplicationModules(final java.util.Collection<ApplicationModuleEntityModel> applicationModules){
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
	* Label: Task Count
	* Description: The number of tasks associated with this work item.
	*/
    public Long getTasksNumber(){
	    final FieldModel tasks_number = wrappedEntityModel.getValue("tasks_number");
	    return tasks_number == null ? null : (Long) tasks_number.getValue();
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
	public DefectEntityModel setName(final String name){
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
    	public DefectEntityModel setCommits(final java.util.Collection<ScmCommitEntityModel> commits){
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
	public DefectEntityModel setDetectedInBuild(final Long detectedInBuild){
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
	public DefectEntityModel setDescription(final String description){
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
        public DefectEntityModel setDetectedInRelease(final ReleaseEntityModel detectedInRelease){
			if (detectedInRelease == null) {
			    wrappedEntityModel.removeValue("detected_in_release");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("detected_in_release", detectedInRelease.getWrappedEntityModel()));
            }
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
	* Label: Detected by
	* Description: The workspace user that detected and reported the defect.
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
        public DefectEntityModel setDetectedBy(final WorkspaceUserEntityModel detectedBy){
			if (detectedBy == null) {
			    wrappedEntityModel.removeValue("detected_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("detected_by", detectedBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: QA owner
	* Description: The workspace user assigned to test that the defect is fixed.
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
        public DefectEntityModel setQaOwner(final WorkspaceUserEntityModel qaOwner){
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
	public DefectEntityModel setClosedOn(final java.time.ZonedDateTime closedOn){
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
	public DefectEntityModel setDoneDate(final java.time.ZonedDateTime doneDate){
        if (doneDate == null) {
            wrappedEntityModel.removeValue("done_date");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.DateFieldModel("done_date", doneDate));
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
	public DefectEntityModel setSeverity(final com.hpe.adm.nga.sdk.enums.lists.list_node.severity.Severity severity) {
    if (severity == null) {
	    wrappedEntityModel.removeValue("severity");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("severity", severity.getAsEntityModel()));
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
        public DefectEntityModel setOwner(final WorkspaceUserEntityModel owner){
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
    	public DefectEntityModel setRequirements(final java.util.Collection<RequirementDocumentEntityModel> requirements){
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
	public DefectEntityModel setDependsOn(final java.util.Collection<WorkItemEntity> dependsOn){
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
        public DefectEntityModel setMilestone(final MilestoneEntityModel milestone){
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
	public DefectEntityModel setBlockedReason(final String blockedReason){
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
	* Label: Open Vulnerabilities
	* Description: Total number of relevant (not closed and real issues) vulnerabilities related to the work item.
	*/
    public Long getVulnerabilities(){
	    final FieldModel vulnerabilities = wrappedEntityModel.getValue("vulnerabilities");
	    return vulnerabilities == null ? null : (Long) vulnerabilities.getValue();
	}

    }




















