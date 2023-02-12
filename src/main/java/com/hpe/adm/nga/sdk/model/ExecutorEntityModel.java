package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: executor</p>
 * <p>Label: Executor</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "executors", availableMethods = {EntityMetadata.AvailableMethods.GET, } )
public class ExecutorEntityModel extends TypedEntityModel implements ExecutorEntity {

    public ExecutorEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "executor"));
    }

    public ExecutorEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public ExecutorEntityModel(    final String name, final String subtype) {
        this();
                    setName(name);
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
	public ExecutorEntityModel setSubtype(final String subtype){
        if (subtype == null) {
            wrappedEntityModel.removeValue("subtype");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("subtype", subtype));
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
	* Label: Client lock stamp
	* Description: The client version of the entity for locking purposes.
	*/
    public Long getClientLockStamp(){
	    final FieldModel client_lock_stamp = wrappedEntityModel.getValue("client_lock_stamp");
	    return client_lock_stamp == null ? null : (Long) client_lock_stamp.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false)
	public ExecutorEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
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
	public ExecutorEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

}




















