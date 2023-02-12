package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: list_node</p>
 * <p>Label: List Node</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "list_nodes", availableMethods = {EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class ListNodeEntityModel extends TypedEntityModel implements ListNodeEntity {

    public ListNodeEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "list_node"));
    }

    public ListNodeEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public ListNodeEntityModel(    final String name) {
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
	* Label: Last modified
	* Description: The date and time the entity was last modified, according to the ISO-8601 date format.
	*/
    public java.time.ZonedDateTime getLastModified(){
	    final FieldModel last_modified = wrappedEntityModel.getValue("last_modified");
	    return last_modified == null ? null : (java.time.ZonedDateTime) last_modified.getValue();
	}

        /**
	* Label: List items
	* Description: A reference field that points to the node items of the list.
	*/
        public java.util.Collection<ListNodeEntityModel> getListNodes(){
        final MultiReferenceFieldModel list_nodes = (MultiReferenceFieldModel) wrappedEntityModel.getValue("list_nodes");
        if (list_nodes == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = list_nodes.getValue();
                        return value.stream().map(ListNodeEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

        /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI, 3: inactive status
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public ListNodeEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Activity level
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI, 3: inactive status
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false)
	public ListNodeEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
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
	public ListNodeEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Name
	* Description: 
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = true, maxLength = 255L)
	public ListNodeEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Logical name
	* Description: A logical name for an entity defines a unique meaning for the entity cross all shared spaces. An entity with the same logical name on different shared spaces is used for the same matter. For example list_node.serverity represents the severity of a defect and has the same logical name cross different sharedspaces.
	*/
    public String getLogicalName(){
	    final FieldModel logical_name = wrappedEntityModel.getValue("logical_name");
	    return logical_name == null ? null : (String) logical_name.getValue();
	}

        /**
	* Label: List root
	* Description: A reference field that points to the root node of the list item (list_node).
	*/
        public ListNodeEntityModel getListRoot(){
    if (wrappedEntityModel.getValue("list_root") instanceof EmptyFieldModel) {
        return null;
    }
    final ReferenceFieldModel list_root = (ReferenceFieldModel) wrappedEntityModel.getValue("list_root");
	final EntityModel referenceFieldModel = list_root.getValue();
            return new ListNodeEntityModel(referenceFieldModel);
    }

                        @FieldMetadata(filterable = true, sortable = true, required = false)
        public ListNodeEntityModel setListRoot(final ListNodeEntityModel listRoot){
			if (listRoot == null) {
			    wrappedEntityModel.removeValue("list_root");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("list_root", listRoot.getWrappedEntityModel()));
            }
            return this;
        }

                }




















