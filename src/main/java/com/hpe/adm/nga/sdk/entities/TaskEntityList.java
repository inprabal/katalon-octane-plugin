package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TaskEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TaskEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , ITEMTYPE("item_type")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , INVESTEDHOURS("invested_hours")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
                    , PHASE("phase")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , AUTHOR("author")
                    , REMAININGHOURS("remaining_hours")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , ESTIMATEDHOURS("estimated_hours")
                    , STORY("story")
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
                    , ITEMTYPE("item_type")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , INVESTEDHOURS("invested_hours")
                    , LASTMODIFIED("last_modified")
                    , OWNER("owner")
                    , PHASE("phase")
                    , AUTHOR("author")
                    , REMAININGHOURS("remaining_hours")
                    , NAME("name")
                    , ESTIMATEDHOURS("estimated_hours")
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
    public TaskEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TaskEntities at(String entityId) {
        return new TaskEntities(entityId);
    }


            public GetTaskEntities get() {
        return new GetTaskEntities(octaneHttpClient, baseDomain);
    }

                public CreateTaskEntities create() {
        return new CreateTaskEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTaskEntities update() {
        return new UpdateTaskEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTaskEntities delete() {
        return new DeleteTaskEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TaskEntities object(An object that represent one TaskEntity )
    */
    public class TaskEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TaskEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTaskEntity object with specific entity
        *
* @return The GetTaskEntity object
*/
public GetTaskEntity get() {
return new GetTaskEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTaskEntity object with specific entity
        *
* @return The UpdateTaskEntity object
*/
public UpdateTaskEntity update() {
return new UpdateTaskEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTaskEntity object with specific entity
        *
* @return The DeleteTaskEntity object
*/
public DeleteTaskEntity delete() {
return new DeleteTaskEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTaskEntities extends GetTypedEntities
<TaskEntityModel
    , GetTaskEntities    , AvailableFields, SortableFields> {
    GetTaskEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks");
    }
    }

        public final class GetTaskEntity extends GetTypedEntity
<TaskEntityModel
    , GetTaskEntity    , AvailableFields> {
    GetTaskEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks", entityId);
    }
    }

                public final class CreateTaskEntities extends CreateTypedEntities
<TaskEntityModel
    , CreateTaskEntities    > {
    CreateTaskEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks");
    }
    }

                public final class UpdateTaskEntities extends UpdateTypedEntities
<TaskEntityModel
    , UpdateTaskEntities    > {
    UpdateTaskEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks");
    }
    }

        public final class UpdateTaskEntity extends UpdateTypedEntity
<TaskEntityModel
    , UpdateTaskEntity    > {
    UpdateTaskEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks", entityId);
    }
    }

                public final class DeleteTaskEntities extends DeleteTypedEntities
<TaskEntityModel
    , DeleteTaskEntities    > {
    DeleteTaskEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks");
    }
    }

        public final class DeleteTaskEntity extends DeleteTypedEntity
<TaskEntityModel
        > {
    DeleteTaskEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaskEntityModel.class, octaneHttpClient, baseDomain + "tasks", entityId);
    }
    }

    }
