package com.hpe.adm.nga.sdk.model;

/**
 * <p>Entity Name: workspace_user</p>
 * <p>Label: Workspace User</p>
 *
 * Generated class.  <b>Do not manually edit.</b>
 */
@EntityMetadata(url = "workspace_users", availableMethods = {EntityMetadata.AvailableMethods.CREATE, EntityMetadata.AvailableMethods.GET, EntityMetadata.AvailableMethods.UPDATE, } )
public class WorkspaceUserEntityModel extends TypedEntityModel implements WorkspaceUserEntity {

    public WorkspaceUserEntityModel() {
        super();
        wrappedEntityModel.setValue(new StringFieldModel("type", "workspace_user"));
    }

    public WorkspaceUserEntityModel(final EntityModel wrappedEntityModel) {
        super(wrappedEntityModel);
    }

            public WorkspaceUserEntityModel(    final String email, final String first_name, final String last_name, final String phone1) {
        this();
                    setEmail(email);
            setFirstName(first_name);
            setLastName(last_name);
            setPhone1(phone1);
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
	* Label: Ws user activation status
	* Description: 
	*/
    public Long getWsUserActivationStatus(){
	    final FieldModel ws_user_activation_status = wrappedEntityModel.getValue("ws_user_activation_status");
	    return ws_user_activation_status == null ? null : (Long) ws_user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public WorkspaceUserEntityModel setWsUserActivationStatus(final Long wsUserActivationStatus){
        if (wsUserActivationStatus == null) {
            wrappedEntityModel.removeValue("ws_user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("ws_user_activation_status", wsUserActivationStatus));
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
	* Label: Password
	* Description: The password of the workspace user.
	*/
    public String getPassword(){
	    final FieldModel password = wrappedEntityModel.getValue("password");
	    return password == null ? null : (String) password.getValue();
	}

            @FieldMetadata(filterable = false, sortable = false, required = false, maxLength = 4000L)
	public WorkspaceUserEntityModel setPassword(final String password){
        if (password == null) {
            wrappedEntityModel.removeValue("password");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("password", password));
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
	* Label: Full name
	* Description: 
	*/
    public String getFullName(){
	    final FieldModel full_name = wrappedEntityModel.getValue("full_name");
	    return full_name == null ? null : (String) full_name.getValue();
	}

        /**
	* Label: Uid
	* Description: The unique id of the user. This ID is unique across all the site for the entity.
	*/
    public String getUid(){
	    final FieldModel uid = wrappedEntityModel.getValue("uid");
	    return uid == null ? null : (String) uid.getValue();
	}

        /**
	* Label: Deactivated
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI
	*/
    public Long getActivityLevel(){
	    final FieldModel activity_level = wrappedEntityModel.getValue("activity_level");
	    return activity_level == null ? null : (Long) activity_level.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public WorkspaceUserEntityModel setActivityLevel(final Long activityLevel){
        if (activityLevel == null) {
            wrappedEntityModel.removeValue("activity_level");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("activity_level", activityLevel));
        }
        return this;
	}

    /**
	* Label: Deactivated
	* Description: The active level. , 0: active status, 1: deprecated status, no more reference to entity in this status, 2: invisible from UI
	*/
    public Long getUserActivationStatus(){
	    final FieldModel user_activation_status = wrappedEntityModel.getValue("user_activation_status");
	    return user_activation_status == null ? null : (Long) user_activation_status.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public WorkspaceUserEntityModel setUserActivationStatus(final Long userActivationStatus){
        if (userActivationStatus == null) {
            wrappedEntityModel.removeValue("user_activation_status");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("user_activation_status", userActivationStatus));
        }
        return this;
	}

    /**
	* Label: Email
	* Description: The email of the workspace user.
	*/
    public String getEmail(){
	    final FieldModel email = wrappedEntityModel.getValue("email");
	    return email == null ? null : (String) email.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public WorkspaceUserEntityModel setEmail(final String email){
        if (email == null) {
            wrappedEntityModel.removeValue("email");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("email", email));
        }
        return this;
	}

    /**
	* Label: Ldap server id
	* Description: 
	*/
    public Long getLdapServerId(){
	    final FieldModel ldap_server_id = wrappedEntityModel.getValue("ldap_server_id");
	    return ldap_server_id == null ? null : (Long) ldap_server_id.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false)
	public WorkspaceUserEntityModel setLdapServerId(final Long ldapServerId){
        if (ldapServerId == null) {
            wrappedEntityModel.removeValue("ldap_server_id");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("ldap_server_id", ldapServerId));
        }
        return this;
	}

    /**
	* Label: Last name
	* Description: The last name of the workspace user.
	*/
    public String getLastName(){
	    final FieldModel last_name = wrappedEntityModel.getValue("last_name");
	    return last_name == null ? null : (String) last_name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public WorkspaceUserEntityModel setLastName(final String lastName){
        if (lastName == null) {
            wrappedEntityModel.removeValue("last_name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("last_name", lastName));
        }
        return this;
	}

    /**
	* Label: Ldap dn
	* Description: The LDAP distinguished name of the workspace user.
	*/
    public String getLdapDn(){
	    final FieldModel ldap_dn = wrappedEntityModel.getValue("ldap_dn");
	    return ldap_dn == null ? null : (String) ldap_dn.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false, maxLength = 4000L)
	public WorkspaceUserEntityModel setLdapDn(final String ldapDn){
        if (ldapDn == null) {
            wrappedEntityModel.removeValue("ldap_dn");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("ldap_dn", ldapDn));
        }
        return this;
	}

    /**
	* Label: Language
	* Description: 
	*/
    public String getLanguage(){
	    final FieldModel language = wrappedEntityModel.getValue("language");
	    return language == null ? null : (String) language.getValue();
	}

            @FieldMetadata(filterable = true, sortable = false, required = false, maxLength = 255L)
	public WorkspaceUserEntityModel setLanguage(final String language){
        if (language == null) {
            wrappedEntityModel.removeValue("language");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("language", language));
        }
        return this;
	}

    /**
	* Label: Phone
	* Description: The phone number of the workspace user.
	*/
    public String getPhone1(){
	    final FieldModel phone1 = wrappedEntityModel.getValue("phone1");
	    return phone1 == null ? null : (String) phone1.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public WorkspaceUserEntityModel setPhone1(final String phone1){
        if (phone1 == null) {
            wrappedEntityModel.removeValue("phone1");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("phone1", phone1));
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
	public WorkspaceUserEntityModel setClientLockStamp(final Long clientLockStamp){
        if (clientLockStamp == null) {
            wrappedEntityModel.removeValue("client_lock_stamp");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.LongFieldModel("client_lock_stamp", clientLockStamp));
        }
        return this;
	}

    /**
	* Label: Login name
	* Description: A summary of the entity, which is also used as the entity name.
	*/
    public String getName(){
	    final FieldModel name = wrappedEntityModel.getValue("name");
	    return name == null ? null : (String) name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = false, maxLength = 255L)
	public WorkspaceUserEntityModel setName(final String name){
        if (name == null) {
            wrappedEntityModel.removeValue("name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("name", name));
        }
        return this;
	}

    /**
	* Label: First name
	* Description: The first name of the workspace user.
	*/
    public String getFirstName(){
	    final FieldModel first_name = wrappedEntityModel.getValue("first_name");
	    return first_name == null ? null : (String) first_name.getValue();
	}

            @FieldMetadata(filterable = true, sortable = true, required = true, maxLength = 255L)
	public WorkspaceUserEntityModel setFirstName(final String firstName){
        if (firstName == null) {
            wrappedEntityModel.removeValue("first_name");
        } else {
	        wrappedEntityModel.setValue(new com.hpe.adm.nga.sdk.model.StringFieldModel("first_name", firstName));
        }
        return this;
	}

}




















