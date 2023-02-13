package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: test</p>
 * <p>Label: Test</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "tests", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TestEntityModel extends TypedEntityModel implements TestEntity {

    public TestEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "test"));
    }

    public TestEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TestEntityModel(    final String name, final PhaseEntityModel phase, final String subtype) {
        this();
                    setName(name);
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
	* Label: Version stamp
	* Description: The unique label that identifies the version of the entity.
	*/
    public Long getVersionStamp(){
	    final FieldModel version_stamp = wrappedEntityModel.getValue("version_stamp");
	    return version_stamp == null ? null : (Long) version_stamp.getValue();
	}

        /**
	* Label: Program
	* Description: The program for this entity. Program can be used to partition entities by some dev mission, such as by group, sub-product, and so on.
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
        public TestEntityModel setProgram(final ProgramEntityModel program){
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
        public TestEntityModel setPhase(final PhaseEntityModel phase){
			if (phase == null) {
			    wrappedEntityModel.removeValue("phase");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("phase", phase.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Estimated duration (minutes)
	* Description: Number of minutes estimated to complete the run.
	*/
    public Long getEstimatedDuration(){
	    final FieldModel estimated_duration = wrappedEntityModel.getValue("estimated_duration");
	    return estimated_duration == null ? null : (Long) estimated_duration.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TestEntityModel setEstimatedDuration(final Long estimatedDuration){
        if (estimatedDuration == null) {
            wrappedEntityModel.removeValue("estimated_duration");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("estimated_duration", estimatedDuration));
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
    	public TestEntityModel setUserTags(final java.util.Collection<UserTagEntityModel> userTags){
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
	* Label: Link to test
	* Description: A list of link_to_test entities, used for linking this test to suites.
	*/
        @AllowedReferences({TestSuiteLinkToGherkinEntityModel.class, TestSuiteLinkToManualEntityModel.class, TestSuiteLinkToAutomatedEntityModel.class, })
public java.util.Collection<TestSuiteLinkToTestEntity> getLinkToTest(){
        final MultiReferenceFieldModel link_to_test = (MultiReferenceFieldModel) wrappedEntityModel.getValue("link_to_test");
        if (link_to_test == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = link_to_test.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("test_suite_link_to_manual")) {
				    return new TestSuiteLinkToManualEntityModel(entityModel);
				}                else if (referenceType.equals("test_suite_link_to_gherkin")) {
				    return new TestSuiteLinkToGherkinEntityModel(entityModel);
				}                else if (referenceType.equals("test_suite_link_to_automated")) {
				    return new TestSuiteLinkToAutomatedEntityModel(entityModel);
				}else {
			        return new TestSuiteLinkToTestEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Automation status
	* Description: Whether the test is ready for automation, was automated as expected, or whether it requires update or approval.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.automation_status.AutomationStatus getAutomationStatus() {
    if (wrappedEntityModel.getValue("automation_status") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel automation_status = (ReferenceFieldModel) wrappedEntityModel.getValue("automation_status");
    final EntityModel referenceFieldModel = automation_status.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.automation_status.AutomationStatus.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public TestEntityModel setAutomationStatus(final com.hpe.adm.nga.sdk.enums.lists.list_node.automation_status.AutomationStatus automation_status) {
    if (automation_status == null) {
	    wrappedEntityModel.removeValue("automation_status");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("automation_status", automation_status.getAsEntityModel()));
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
    	public TestEntityModel setAttachments(final java.util.Collection<AttachmentEntityModel> attachments){
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
	* Label: Steps num
	* Description: The number of Gherkin scenarios in the test script.
	*/
    public Long getStepsNum(){
	    final FieldModel steps_num = wrappedEntityModel.getValue("steps_num");
	    return steps_num == null ? null : (Long) steps_num.getValue();
	}

        /**
	* Label: Class name
	* Description: The class for pipeline which contains the automated test.
	*/
    public String getClassName(){
	    final FieldModel class_name = wrappedEntityModel.getValue("class_name");
	    return class_name == null ? null : (String) class_name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public TestEntityModel setClassName(final String className){
        if (className == null) {
            wrappedEntityModel.removeValue("class_name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("class_name", className));
        }
        return this;
	}

    /**
	* Label: Contained Tests
	* Description: A list of link_to_test entities, used for linking tests to this suite.
	*/
        @AllowedReferences({TestSuiteLinkToGherkinEntityModel.class, TestSuiteLinkToManualEntityModel.class, TestSuiteLinkToAutomatedEntityModel.class, })
public java.util.Collection<TestSuiteLinkToTestEntity> getLinkToTestSuite(){
        final MultiReferenceFieldModel link_to_test_suite = (MultiReferenceFieldModel) wrappedEntityModel.getValue("link_to_test_suite");
        if (link_to_test_suite == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = link_to_test_suite.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("test_suite_link_to_manual")) {
				    return new TestSuiteLinkToManualEntityModel(entityModel);
				}                else if (referenceType.equals("test_suite_link_to_gherkin")) {
				    return new TestSuiteLinkToGherkinEntityModel(entityModel);
				}                else if (referenceType.equals("test_suite_link_to_automated")) {
				    return new TestSuiteLinkToAutomatedEntityModel(entityModel);
				}else {
			        return new TestSuiteLinkToTestEntityModel(entityModel);
                 }
		})
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
	* Label: Quality Stories
	* Description: The quality stories which are linked to this test.
	*/
        public java.util.Collection<QualityStoryEntityModel> getQualityStories(){
        final MultiReferenceFieldModel quality_stories = (MultiReferenceFieldModel) wrappedEntityModel.getValue("quality_stories");
        if (quality_stories == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = quality_stories.getValue();
                        return value.stream().map(QualityStoryEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TestEntityModel setQualityStories(final java.util.Collection<QualityStoryEntityModel> qualityStories){
	    if (qualityStories == null) {
	        wrappedEntityModel.removeValue("quality_stories");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = qualityStories.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of qualityStories must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("quality_stories", entityModels));
            return this;
	}

    /**
	* Label: Test level
	* Description: The level of the test, such as Integration Test, System Test, and Unit Test.
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel getTestLevel() {
    if (wrappedEntityModel.getValue("test_level") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel test_level = (ReferenceFieldModel) wrappedEntityModel.getValue("test_level");
    final EntityModel referenceFieldModel = test_level.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public TestEntityModel setTestLevel(final com.hpe.adm.nga.sdk.enums.lists.list_node.test_level.TestLevel test_level) {
    if (test_level == null) {
	    wrappedEntityModel.removeValue("test_level");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("test_level", test_level.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Test type
	* Description: The test's type. For example Acceptance, End to End, Regression, Sanity, Security or Performance.
	*/
        public java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType> getTestType() {
    final MultiReferenceFieldModel test_type = (MultiReferenceFieldModel) wrappedEntityModel.getValue("test_type");
    if (test_type == null) {
return new java.util.ArrayList();
}
final java.util.Collection
<EntityModel> value = test_type.getValue();
	return value.stream().map(com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType::getFromEntityModel)
	    .collect(java.util.stream.Collectors.toList());

    }

                @FieldMetadata(filterable = true, sortable = false, required = false)
	public TestEntityModel setTestType(final java.util.Collection<com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType> test_type) {
        if (test_type == null) {
            wrappedEntityModel.removeValue("test_type");
            return this;
        }

        java.util.Collection<EntityModel> entityModels = test_type.stream()
            .map(com.hpe.adm.nga.sdk.enums.lists.list_node.test_type.TestType::getAsEntityModel).collect(java.util.stream.Collectors.toList());
        wrappedEntityModel.setValue(new MultiReferenceFieldModel("test_type", entityModels));
        return this;
	}
    /**
	* Label: Component
	* Description: The component of the automated test.
	*/
    public String getComponent(){
	    final FieldModel component = wrappedEntityModel.getValue("component");
	    return component == null ? null : (String) component.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public TestEntityModel setComponent(final String component){
        if (component == null) {
            wrappedEntityModel.removeValue("component");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("component", component));
        }
        return this;
	}

    /**
	* Label: Framework
	* Description: The framework for the test, such as TestNG, JUnit, and UFT. 
	*/
        public com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework.Framework getFramework() {
    if (wrappedEntityModel.getValue("framework") instanceof EmptyFieldModel) {
        return null;
    }

    final ReferenceFieldModel framework = (ReferenceFieldModel) wrappedEntityModel.getValue("framework");
    final EntityModel referenceFieldModel = framework.getValue();
    return com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework.Framework.getFromEntityModel(referenceFieldModel);

    }

                @FieldMetadata(filterable = true, sortable = true, required = false)
	public TestEntityModel setFramework(final com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework.Framework framework) {
    if (framework == null) {
	    wrappedEntityModel.removeValue("framework");
    } else {
	    wrappedEntityModel.setValue(new ReferenceFieldModel("framework", framework.getAsEntityModel()));
    }
    return this;
	}
    /**
	* Label: Modified by
	* Description: The user who last modified the test.
	*/
        public WorkspaceUserEntityModel getModifiedBy(){
    if (wrappedEntityModel.getValue("modified_by") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel modified_by = (ReferenceFieldModel) wrappedEntityModel.getValue("modified_by");
	final EntityModel referenceFieldModel = modified_by.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public TestEntityModel setModifiedBy(final WorkspaceUserEntityModel modifiedBy){
			if (modifiedBy == null) {
			    wrappedEntityModel.removeValue("modified_by");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("modified_by", modifiedBy.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Test runner
	* Description: 
	*/
        @AllowedReferences({TestRunnerEntityModel.class, UftTestRunnerEntityModel.class, })
public <T extends ExecutorEntity> T getTestRunner(){
    if (wrappedEntityModel.getValue("test_runner") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test_runner = (ReferenceFieldModel) wrappedEntityModel.getValue("test_runner");
	final EntityModel referenceFieldModel = test_runner.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("test_runner")) {
			    return (T) new TestRunnerEntityModel(referenceFieldModel);
			}else if (referenceType.equals("uft_test_runner")) {
			    return (T) new UftTestRunnerEntityModel(referenceFieldModel);
			}                return (T) new ExecutorEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = false)
        public TestEntityModel setTestRunner(final TestRunnerEntityModel testRunner){
			if (testRunner == null) {
			    wrappedEntityModel.removeValue("test_runner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test_runner", testRunner.getWrappedEntityModel()));
            }
            return this;
        }

        @FieldMetadata(filterable = true, sortable = false, required = false)
        public TestEntityModel setTestRunner(final UftTestRunnerEntityModel testRunner){
			if (testRunner == null) {
			    wrappedEntityModel.removeValue("test_runner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test_runner", testRunner.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Backlog Coverage
	* Description: The items (such as a story, epic, feature, defect) whose requirements the test covers.
	*/
        @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getCoveredContent(){
        final MultiReferenceFieldModel covered_content = (MultiReferenceFieldModel) wrappedEntityModel.getValue("covered_content");
        if (covered_content == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = covered_content.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public TestEntityModel setCoveredContent(final java.util.Collection<WorkItemEntity> coveredContent){
	    if (coveredContent == null) {
	        wrappedEntityModel.removeValue("covered_content");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = coveredContent.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of coveredContent must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("covered_content", entityModels));
            return this;
	}

    /**
	* Label: Backlog Coverage
	* Description: The items (such as a story, epic, feature, defect) whose requirements the test covers.
	*/
        @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getBacklogCoverage(){
        final MultiReferenceFieldModel backlog_coverage = (MultiReferenceFieldModel) wrappedEntityModel.getValue("backlog_coverage");
        if (backlog_coverage == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = backlog_coverage.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("defect")) {
				    return new DefectEntityModel(entityModel);
				}                else if (referenceType.equals("feature")) {
				    return new FeatureEntityModel(entityModel);
				}                else if (referenceType.equals("story")) {
				    return new StoryEntityModel(entityModel);
				}else {
			        return new WorkItemEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
	public TestEntityModel setBacklogCoverage(final java.util.Collection<WorkItemEntity> backlogCoverage){
	    if (backlogCoverage == null) {
	        wrappedEntityModel.removeValue("backlog_coverage");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = backlogCoverage.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of backlogCoverage must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("backlog_coverage", entityModels));
            return this;
	}

    /**
	* Label: Run
	* Description: This test's runs.
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
				}                else if (referenceType.equals("run_automated")) {
				    return new RunAutomatedEntityModel(entityModel);
				}                else if (referenceType.equals("run_manual")) {
				    return new RunManualEntityModel(entityModel);
				}                else if (referenceType.equals("gherkin_automated_run")) {
				    return new GherkinAutomatedRunEntityModel(entityModel);
				}else {
			        return new RunEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
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
	public TestEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Package
	* Description: The package of the automated test.
	*/
    public String getPackage(){
	    final FieldModel _package = wrappedEntityModel.getValue("package");
	    return _package == null ? null : (String) _package.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public TestEntityModel setPackage(final String _package){
        if (_package == null) {
            wrappedEntityModel.removeValue("package");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("package", _package));
        }
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
        public TestEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Application modules
	* Description: Also known as application modules, the functional areas of the product or application you are developing  that relate to the feature.
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
    	public TestEntityModel setProductAreas(final java.util.Collection<ProductAreaEntityModel> productAreas){
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
	* Description: Also known as application modules, the functional areas of the product or application you are developing  that relate to the feature.
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
    	public TestEntityModel setApplicationModules(final java.util.Collection<ApplicationModuleEntityModel> applicationModules){
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
	* Label: Last runs
	* Description: 
	*/
        @AllowedReferences({GherkinAutomatedRunEntityModel.class, RunManualEntityModel.class, RunSuiteEntityModel.class, RunAutomatedEntityModel.class, })
public java.util.Collection<RunEntity> getLastRuns(){
        final MultiReferenceFieldModel last_runs = (MultiReferenceFieldModel) wrappedEntityModel.getValue("last_runs");
        if (last_runs == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = last_runs.getValue();
                        return value.stream().map(entityModel -> {
            final StringFieldModel type = (StringFieldModel) entityModel.getValue("type");
            final String referenceType = type.getValue();
                            if (referenceType.equals("run_suite")) {
				    return new RunSuiteEntityModel(entityModel);
				}                else if (referenceType.equals("run_automated")) {
				    return new RunAutomatedEntityModel(entityModel);
				}                else if (referenceType.equals("run_manual")) {
				    return new RunManualEntityModel(entityModel);
				}                else if (referenceType.equals("gherkin_automated_run")) {
				    return new GherkinAutomatedRunEntityModel(entityModel);
				}else {
			        return new RunEntityModel(entityModel);
                 }
		})
        .collect(java.util.stream.Collectors.toList());
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
	public TestEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
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
	public TestEntityModel setDescription(final String description){
        if (description == null) {
            wrappedEntityModel.removeValue("description");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("description", description));
        }
        return this;
	}

    /**
	* Label: Subtype
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
	public TestEntityModel setSubtype(final String subtype){
        if (subtype == null) {
            wrappedEntityModel.removeValue("subtype");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("subtype", subtype));
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
        public TestEntityModel setOwner(final WorkspaceUserEntityModel owner){
			if (owner == null) {
			    wrappedEntityModel.removeValue("owner");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("owner", owner.getWrappedEntityModel()));
            }
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
	* Label: Designer
	* Description: The user who designed the test
	*/
        public WorkspaceUserEntityModel getDesigner(){
    if (wrappedEntityModel.getValue("designer") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel designer = (ReferenceFieldModel) wrappedEntityModel.getValue("designer");
	final EntityModel referenceFieldModel = designer.getValue();
            return new WorkspaceUserEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public TestEntityModel setDesigner(final WorkspaceUserEntityModel designer){
			if (designer == null) {
			    wrappedEntityModel.removeValue("designer");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("designer", designer.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Covered requirement
	* Description: The requirements covering this test.
	*/
        public java.util.Collection<RequirementDocumentEntityModel> getCoveredRequirement(){
        final MultiReferenceFieldModel covered_requirement = (MultiReferenceFieldModel) wrappedEntityModel.getValue("covered_requirement");
        if (covered_requirement == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = covered_requirement.getValue();
                        return value.stream().map(RequirementDocumentEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TestEntityModel setCoveredRequirement(final java.util.Collection<RequirementDocumentEntityModel> coveredRequirement){
	    if (coveredRequirement == null) {
	        wrappedEntityModel.removeValue("covered_requirement");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = coveredRequirement.stream().map(entityModel -> {
		    if (entityModel instanceof RequirementEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of coveredRequirement must be of types {RequirementEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("covered_requirement", entityModels));
            return this;
	}

}




















