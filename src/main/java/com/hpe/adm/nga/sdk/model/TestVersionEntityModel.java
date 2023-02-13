package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: test_version</p>
 * <p>Label: Test Version</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "test_versions", availableMethods = {EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class TestVersionEntityModel extends TypedEntityModel implements TestVersionEntity {

    public TestVersionEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "test_version"));
    }

    public TestVersionEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
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
	* Label: Author
	* Description: 
	*/
    public String getCreator(){
	    final FieldModel creator = wrappedEntityModel.getValue("creator");
	    return creator == null ? null : (String) creator.getValue();
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
	public TestVersionEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Test
	* Description: 
	*/
        @AllowedReferences({TestManualEntityModel.class, GherkinTestEntityModel.class, })
public <T extends TestEntity> T getTest(){
    if (wrappedEntityModel.getValue("test") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel test = (ReferenceFieldModel) wrappedEntityModel.getValue("test");
	final EntityModel referenceFieldModel = test.getValue();
        final StringFieldModel type = (StringFieldModel) referenceFieldModel.getValue("type");
	final String referenceType = type.getValue();
            if (referenceType.equals("test_manual")) {
			    return (T) new TestManualEntityModel(referenceFieldModel);
			}else if (referenceType.equals("gherkin_test")) {
			    return (T) new GherkinTestEntityModel(referenceFieldModel);
			}                return (T) new TestEntityModel(referenceFieldModel);
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
	* Label: Is external
	* Description: 
	*/
    public Boolean getIsExternal(){
	    final FieldModel is_external = wrappedEntityModel.getValue("is_external");
	    return is_external == null ? null : (Boolean) is_external.getValue();
	}

        /**
	* Label: Script
	* Description: 
	*/
    public String getScript(){
	    final FieldModel script = wrappedEntityModel.getValue("script");
	    return script == null ? null : (String) script.getValue();
	}

        /**
	* Label: Releases
	* Description: 
	*/
        public java.util.Collection<ReleaseEntityModel> getReleases(){
        final MultiReferenceFieldModel releases = (MultiReferenceFieldModel) wrappedEntityModel.getValue("releases");
        if (releases == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = releases.getValue();
                        return value.stream().map(ReleaseEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public TestVersionEntityModel setReleases(final java.util.Collection<ReleaseEntityModel> releases){
	    if (releases == null) {
	        wrappedEntityModel.removeValue("releases");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = releases.stream().map(entityModel -> {
		    if (entityModel instanceof ReleaseEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of releases must be of types {ReleaseEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("releases", entityModels));
            return this;
	}

    /**
	* Label: Revision
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

        /**
	* Label: Version Name
	* Description: 
	*/
    public String getComment(){
	    final FieldModel comment = wrappedEntityModel.getValue("comment");
	    return comment == null ? null : (String) comment.getValue();
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




















