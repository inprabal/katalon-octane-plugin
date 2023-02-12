package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ListNodeEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ListNodeEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , LISTNODES("list_nodes")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , NAME("name")
                    , LOGICALNAME("logical_name")
                    , LISTROOT("list_root")
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
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , LOGICALNAME("logical_name")
                    , LISTROOT("list_root")
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
    public ListNodeEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ListNodeEntities at(String entityId) {
        return new ListNodeEntities(entityId);
    }


            public GetListNodeEntities get() {
        return new GetListNodeEntities(octaneHttpClient, baseDomain);
    }

                public CreateListNodeEntities create() {
        return new CreateListNodeEntities(octaneHttpClient, baseDomain);
    }

                public UpdateListNodeEntities update() {
        return new UpdateListNodeEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the ListNodeEntities object(An object that represent one ListNodeEntity )
    */
    public class ListNodeEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ListNodeEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetListNodeEntity object with specific entity
        *
* @return The GetListNodeEntity object
*/
public GetListNodeEntity get() {
return new GetListNodeEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateListNodeEntity object with specific entity
        *
* @return The UpdateListNodeEntity object
*/
public UpdateListNodeEntity update() {
return new UpdateListNodeEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetListNodeEntities extends GetTypedEntities
<ListNodeEntityModel
    , GetListNodeEntities    , AvailableFields, SortableFields> {
    GetListNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ListNodeEntityModel.class, octaneHttpClient, baseDomain + "list_nodes");
    }
    }

        public final class GetListNodeEntity extends GetTypedEntity
<ListNodeEntityModel
    , GetListNodeEntity    , AvailableFields> {
    GetListNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ListNodeEntityModel.class, octaneHttpClient, baseDomain + "list_nodes", entityId);
    }
    }

                public final class CreateListNodeEntities extends CreateTypedEntities
<ListNodeEntityModel
    , CreateListNodeEntities    > {
    CreateListNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ListNodeEntityModel.class, octaneHttpClient, baseDomain + "list_nodes");
    }
    }

                public final class UpdateListNodeEntities extends UpdateTypedEntities
<ListNodeEntityModel
    , UpdateListNodeEntities    > {
    UpdateListNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ListNodeEntityModel.class, octaneHttpClient, baseDomain + "list_nodes");
    }
    }

        public final class UpdateListNodeEntity extends UpdateTypedEntity
<ListNodeEntityModel
    , UpdateListNodeEntity    > {
    UpdateListNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ListNodeEntityModel.class, octaneHttpClient, baseDomain + "list_nodes", entityId);
    }
    }

        }
