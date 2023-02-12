package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: test_suite_link_to_manual</p>
 * <p>Label: Test Suite Link To Manual</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "test_suite_link_to_manual_tests", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TestSuiteLinkToManualEntityModel extends TypedEntityModel implements TestSuiteLinkToManualEntity {

    public TestSuiteLinkToManualEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "test_suite_link_to_manual"));
    }

    public TestSuiteLinkToManualEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public TestSuiteLinkToManualEntityModel(    final TestManualEntityModel test, final TestSuiteEntityModel test_suite) {
        this();
                    setTest(test);
            setTestSuite(test_suite);
        }
    



    /**
	* Label: Date added to suite
	* Description: The time the entity was created.
	*/
    public java.time.ZonedDateTime getCreationTime(){
	    final FieldModel creation_time = wrappedEntityModel.getValue("creation_time");
	    return creation_time == null ? null : (java.time.ZonedDateTime) creation_time.getValue();
	}

        /**
	* Label: Include in next run
	* Description: 
	*/
    public Boolean getIncludeInNextRun(){
	    final FieldModel include_in_next_run = wrappedEntityModel.getValue("include_in_next_run");
	    return include_in_next_run == null ? null : (Boolean) include_in_next_run.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public TestSuiteLinkToManualEntityModel setIncludeInNextRun(final Boolean includeInNextRun){
        if (includeInNextRun == null) {
            wrappedEntityModel.removeValue("include_in_next_run");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.BooleanFieldModel("include_in_next_run", includeInNextRun));
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
	* Label: Last modified in suite
	* Description: The date and time the entity was last modified, according to the ISO-8601 date format.
	*/
    public java.time.ZonedDateTime getLastModified(){
	    final FieldModel last_modified = wrappedEntityModel.getValue("last_modified");
	    return last_modified == null ? null : (java.time.ZonedDateTime) last_modified.getValue();
	}

        /**
	* Label: Order
	* Description: 
	*/
    public Long getOrder(){
	    final FieldModel order = wrappedEntityModel.getValue("order");
	    return order == null ? null : (Long) order.getValue();
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
	public TestSuiteLinkToManualEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Test suite
	* Description: A reference to a test suite entity.
	*/
        public TestSuiteEntityModel getTestSuite(){
    if (wrappedEntityModel.getValue("test_suite") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test_suite = (ReferenceFieldModel) wrappedEntityModel.getValue("test_suite");
	final EntityModel referenceFieldModel = test_suite.getValue();
            return new TestSuiteEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TestSuiteLinkToManualEntityModel setTestSuite(final TestSuiteEntityModel testSuite){
			if (testSuite == null) {
			    wrappedEntityModel.removeValue("test_suite");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test_suite", testSuite.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Test
	* Description: The test that this entity is associated with.
	*/
        public TestManualEntityModel getTest(){
    if (wrappedEntityModel.getValue("test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test = (ReferenceFieldModel) wrappedEntityModel.getValue("test");
	final EntityModel referenceFieldModel = test.getValue();
            return new TestManualEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = false, required = true)
        public TestSuiteLinkToManualEntityModel setTest(final TestManualEntityModel test){
			if (test == null) {
			    wrappedEntityModel.removeValue("test");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("test", test.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Added to suite by
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
        public TestSuiteLinkToManualEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Backlog Coverage
	* Description: A list of work items that have test suite linked test covered.
	*/
        @AllowedReferences({StoryEntityModel.class, FeatureEntityModel.class, DefectEntityModel.class, })
public java.util.Collection<WorkItemEntity> getCoveredWorkitem(){
        final MultiReferenceFieldModel covered_workitem = (MultiReferenceFieldModel) wrappedEntityModel.getValue("covered_workitem");
        if (covered_workitem == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = covered_workitem.getValue();
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
	public TestSuiteLinkToManualEntityModel setCoveredWorkitem(final java.util.Collection<WorkItemEntity> coveredWorkitem){
	    if (coveredWorkitem == null) {
	        wrappedEntityModel.removeValue("covered_workitem");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = coveredWorkitem.stream().map(entityModel -> {
		    if (entityModel instanceof WorkItemEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of coveredWorkitem must be of types {WorkItemEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("covered_workitem", entityModels));
            return this;
	}

}




















