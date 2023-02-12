package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: ci_server</p>
 * <p>Label: Ci Server</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "ci_servers", availableMethods = {EntityMetadata.AvailableMethods.DELETE, EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class CiServerEntityModel extends TypedEntityModel implements CiServerEntity {

    public CiServerEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "ci_server"));
    }

    public CiServerEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public CiServerEntityModel(    final String name) {
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
	* Label: Plugin Version
	* Description: Version of the Plugin.
	*/
    public String getPluginVersion(){
	    final FieldModel plugin_version = wrappedEntityModel.getValue("plugin_version");
	    return plugin_version == null ? null : (String) plugin_version.getValue();
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
	* Label: Suspended
	* Description: Whether the CI server is suspended 
	*/
    public Boolean getIsSuspended(){
	    final FieldModel is_suspended = wrappedEntityModel.getValue("is_suspended");
	    return is_suspended == null ? null : (Boolean) is_suspended.getValue();
	}

        /**
	* Label: Client Id
	* Description: Client ID used for logging into the ALM Octane server
	*/
    public String getClientId(){
	    final FieldModel client_id = wrappedEntityModel.getValue("client_id");
	    return client_id == null ? null : (String) client_id.getValue();
	}

        /**
	* Label: CI Server user
	* Description: The user to impersonate (CI server jobs will be executed on behalf of this user)
	*/
    public String getCiServerUser(){
	    final FieldModel ci_server_user = wrappedEntityModel.getValue("ci_server_user");
	    return ci_server_user == null ? null : (String) ci_server_user.getValue();
	}

        /**
	* Label: SDK Version
	* Description: Version of the SDK.
	*/
    public String getSdkVersion(){
	    final FieldModel sdk_version = wrappedEntityModel.getValue("sdk_version");
	    return sdk_version == null ? null : (String) sdk_version.getValue();
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
	* Label: Connected
	* Description: Whether the CI server is connected to ALM Octane.
	*/
    public Boolean getIsConnected(){
	    final FieldModel is_connected = wrappedEntityModel.getValue("is_connected");
	    return is_connected == null ? null : (Boolean) is_connected.getValue();
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
	public CiServerEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
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
        public CiServerEntityModel setAuthor(final WorkspaceUserEntityModel author){
			if (author == null) {
			    wrappedEntityModel.removeValue("author");
			} else {
                wrappedEntityModel.setValue(new ReferenceFieldModel("author", author.getWrappedEntityModel()));
            }
            return this;
        }

                    /**
	* Label: Is Supported SDK Version
	* Description: Whether the SDK is supported and can see data from this CI server
	*/
    public String getIsSupportedSdkVersion(){
	    final FieldModel is_supported_sdk_version = wrappedEntityModel.getValue("is_supported_sdk_version");
	    return is_supported_sdk_version == null ? null : (String) is_supported_sdk_version.getValue();
	}

        /**
	* Label: API Version
	* Description: Version of the API.
	*/
    public Long getApiVersion(){
	    final FieldModel api_version = wrappedEntityModel.getValue("api_version");
	    return api_version == null ? null : (Long) api_version.getValue();
	}

        /**
	* Label: URL
	* Description: CI server URL.
	*/
    public String getUrl(){
	    final FieldModel url = wrappedEntityModel.getValue("url");
	    return url == null ? null : (String) url.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public CiServerEntityModel setUrl(final String url){
        if (url == null) {
            wrappedEntityModel.removeValue("url");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("url", url));
        }
        return this;
	}

    /**
	* Label: Pipelines
	* Description: 
	*/
        public java.util.Collection<PipelineEntityModel> getPipeline(){
        final MultiReferenceFieldModel pipeline = (MultiReferenceFieldModel) wrappedEntityModel.getValue("pipeline");
        if (pipeline == null) {
    return new java.util.ArrayList();
    }
    final java.util.Collection
<EntityModel> value = pipeline.getValue();
                        return value.stream().map(PipelineEntityModel::new)
        .collect(java.util.stream.Collectors.toList());
            }

                @FieldMetadata(filterable = true, sortable = false, required = false)
    	public CiServerEntityModel setPipeline(final java.util.Collection<PipelineEntityModel> pipeline){
	    if (pipeline == null) {
	        wrappedEntityModel.removeValue("pipeline");
	        return this;
	    }
    		final java.util.Collection<EntityModel> entityModels = pipeline.stream().map(entityModel -> {
		    if (entityModel instanceof PipelineEntity) {
		        return ((TypedEntityModel) entityModel).getWrappedEntityModel();
		    }  else {
		        throw new IllegalArgumentException("Members of pipeline must be of types {PipelineEntity, ");
		    }
		}).collect(java.util.stream.Collectors.toList());
		wrappedEntityModel.setValue(new MultiReferenceFieldModel("pipeline", entityModels));
            return this;
	}

    /**
	* Label: Is supported
	* Description: Whether the operations for the CI server type can be performed directly by ALM Octane.
	*/
    public Boolean getIsSupported(){
	    final FieldModel is_supported = wrappedEntityModel.getValue("is_supported");
	    return is_supported == null ? null : (Boolean) is_supported.getValue();
	}

        /**
	* Label: Instance ID
	* Description: ID for the instance of the CI server, automatically generated by ALM Octane.
	*/
    public String getInstanceId(){
	    final FieldModel instance_id = wrappedEntityModel.getValue("instance_id");
	    return instance_id == null ? null : (String) instance_id.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public CiServerEntityModel setInstanceId(final String instanceId){
        if (instanceId == null) {
            wrappedEntityModel.removeValue("instance_id");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("instance_id", instanceId));
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
	public CiServerEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: Server type
	* Description: CI Server type (such as Jenkins, Bamboo, and so on).
	*/
    public String getServerType(){
	    final FieldModel server_type = wrappedEntityModel.getValue("server_type");
	    return server_type == null ? null : (String) server_type.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public CiServerEntityModel setServerType(final String serverType){
        if (serverType == null) {
            wrappedEntityModel.removeValue("server_type");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("server_type", serverType));
        }
        return this;
	}

}




















