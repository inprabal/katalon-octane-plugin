package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.WorkItemRootEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class WorkItemRootEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , ORDERING("ordering")
                    , DESCRIPTION("description")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , COMMENTS("comments")
                    , HASATTACHMENTS("has_attachments")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , STORYPOINTS("story_points")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
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
                    , OWNER("owner")
                    , AUTHOR("author")
                    , STORYPOINTS("story_points")
                    , NAME("name")
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
    public WorkItemRootEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public WorkItemRootEntities at(String entityId) {
        return new WorkItemRootEntities(entityId);
    }


            public GetWorkItemRootEntities get() {
        return new GetWorkItemRootEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the WorkItemRootEntities object(An object that represent one WorkItemRootEntity )
    */
    public class WorkItemRootEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        WorkItemRootEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetWorkItemRootEntity object with specific entity
        *
* @return The GetWorkItemRootEntity object
*/
public GetWorkItemRootEntity get() {
return new GetWorkItemRootEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetWorkItemRootEntities extends GetTypedEntities
<WorkItemRootEntityModel
    , GetWorkItemRootEntities    , AvailableFields, SortableFields> {
    GetWorkItemRootEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkItemRootEntityModel.class, octaneHttpClient, baseDomain + "work_item_roots");
    }
    }

        public final class GetWorkItemRootEntity extends GetTypedEntity
<WorkItemRootEntityModel
    , GetWorkItemRootEntity    , AvailableFields> {
    GetWorkItemRootEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkItemRootEntityModel.class, octaneHttpClient, baseDomain + "work_item_roots", entityId);
    }
    }

                }
