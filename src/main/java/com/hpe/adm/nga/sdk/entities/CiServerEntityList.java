package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.CiServerEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class CiServerEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PLUGINVERSION("plugin_version")
                    , VERSIONSTAMP("version_stamp")
                    , ISSUSPENDED("is_suspended")
                    , CLIENTID("client_id")
                    , CISERVERUSER("ci_server_user")
                    , SDKVERSION("sdk_version")
                    , LASTMODIFIED("last_modified")
                    , ISCONNECTED("is_connected")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , ISSUPPORTEDSDKVERSION("is_supported_sdk_version")
                    , APIVERSION("api_version")
                    , URL("url")
                    , PIPELINE("pipeline")
                    , ISSUPPORTED("is_supported")
                    , INSTANCEID("instance_id")
                    , NAME("name")
                    , SERVERTYPE("server_type")
        ;

        private final String fieldName;

        AvailableFields(final String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldName() {
            return fieldName;
        }
    }

    public enum SortableFields implements TypedEntityList.SortableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
                    , URL("url")
                    , INSTANCEID("instance_id")
                    , NAME("name")
                    , SERVERTYPE("server_type")
        ;

        private final String fieldName;

        SortableFields(final String fieldName) {
            this.fieldName = fieldName;
        }

        public String getFieldName() {
            return fieldName;
        }
    }

    /**
    * Creates a new object.  This represents an entity collection
    *
    * @param octaneHttpClient - Http Client
    * @param baseDomain - Domain Name
    */
    public CiServerEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public CiServerEntities at(String entityId) {
        return new CiServerEntities(entityId);
    }


            public GetCiServerEntities get() {
        return new GetCiServerEntities(octaneHttpClient, baseDomain);
    }

                public CreateCiServerEntities create() {
        return new CreateCiServerEntities(octaneHttpClient, baseDomain);
    }

                public UpdateCiServerEntities update() {
        return new UpdateCiServerEntities(octaneHttpClient, baseDomain);
    }

                public DeleteCiServerEntities delete() {
        return new DeleteCiServerEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the CiServerEntities object(An object that represent one CiServerEntity )
    */
    public class CiServerEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        CiServerEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetCiServerEntity object with specific entity
        *
* @return The GetCiServerEntity object
*/
public GetCiServerEntity get() {
return new GetCiServerEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateCiServerEntity object with specific entity
        *
* @return The UpdateCiServerEntity object
*/
public UpdateCiServerEntity update() {
return new UpdateCiServerEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteCiServerEntity object with specific entity
        *
* @return The DeleteCiServerEntity object
*/
public DeleteCiServerEntity delete() {
return new DeleteCiServerEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetCiServerEntities extends GetTypedEntities
<CiServerEntityModel
    , GetCiServerEntities    , AvailableFields, SortableFields> {
    GetCiServerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers");
    }
    }

        public final class GetCiServerEntity extends GetTypedEntity
<CiServerEntityModel
    , GetCiServerEntity    , AvailableFields> {
    GetCiServerEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers", entityId);
    }
    }

                public final class CreateCiServerEntities extends CreateTypedEntities
<CiServerEntityModel
    , CreateCiServerEntities    > {
    CreateCiServerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers");
    }
    }

                public final class UpdateCiServerEntities extends UpdateTypedEntities
<CiServerEntityModel
    , UpdateCiServerEntities    > {
    UpdateCiServerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers");
    }
    }

        public final class UpdateCiServerEntity extends UpdateTypedEntity
<CiServerEntityModel
    , UpdateCiServerEntity    > {
    UpdateCiServerEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers", entityId);
    }
    }

                public final class DeleteCiServerEntities extends DeleteTypedEntities
<CiServerEntityModel
    , DeleteCiServerEntities    > {
    DeleteCiServerEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers");
    }
    }

        public final class DeleteCiServerEntity extends DeleteTypedEntity
<CiServerEntityModel
        > {
    DeleteCiServerEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(CiServerEntityModel.class, octaneHttpClient, baseDomain + "ci_servers", entityId);
    }
    }

    }
