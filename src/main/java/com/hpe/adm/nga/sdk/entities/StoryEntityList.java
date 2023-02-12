package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.StoryEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class StoryEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , COVERINGTESTS("covering_tests")
                    , HASCHILDREN("has_children")
                    , PRIORITY("priority")
                    , USERTAGS("user_tags")
                    , ESTIMATEDHOURS("estimated_hours")
                    , ATTACHMENTS("attachments")
                    , ORDERING("ordering")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , DEPENDENCE("dependence")
                    , HASATTACHMENTS("has_attachments")
                    , LINKEDITEMS2("linked_items2")
                    , STORYPOINTS("story_points")
                    , LINKEDITEMS1("linked_items1")
                    , TEAM("team")
                    , SPRINT("sprint")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , REMAININGHOURS("remaining_hours")
                    , TASKSNUMBER("tasks_number")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , COMMITS("commits")
                    , DEPENDSONCOUNT("depends_on_count")
                    , DESCRIPTION("description")
                    , HASCOVERAGE("has_coverage")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , REQUIREMENTS("requirements")
                    , DEPENDSON("depends_on")
                    , COMMENTS("comments")
                    , MILESTONE("milestone")
                    , BLOCKEDREASON("blocked_reason")
                    , DEPENDENCECOUNT("dependence_count")
                    , VULNERABILITIES("vulnerabilities")
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
                    , PARENT("parent")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , PRIORITY("priority")
                    , ESTIMATEDHOURS("estimated_hours")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , STORYPOINTS("story_points")
                    , TEAM("team")
                    , SPRINT("sprint")
                    , AUTHOR("author")
                    , REMAININGHOURS("remaining_hours")
                    , NAME("name")
                    , HASCOVERAGE("has_coverage")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , MILESTONE("milestone")
                    , VULNERABILITIES("vulnerabilities")
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
    public StoryEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public StoryEntities at(String entityId) {
        return new StoryEntities(entityId);
    }


            public GetStoryEntities get() {
        return new GetStoryEntities(octaneHttpClient, baseDomain);
    }

                public CreateStoryEntities create() {
        return new CreateStoryEntities(octaneHttpClient, baseDomain);
    }

                public UpdateStoryEntities update() {
        return new UpdateStoryEntities(octaneHttpClient, baseDomain);
    }

                public DeleteStoryEntities delete() {
        return new DeleteStoryEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the StoryEntities object(An object that represent one StoryEntity )
    */
    public class StoryEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        StoryEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetStoryEntity object with specific entity
        *
* @return The GetStoryEntity object
*/
public GetStoryEntity get() {
return new GetStoryEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateStoryEntity object with specific entity
        *
* @return The UpdateStoryEntity object
*/
public UpdateStoryEntity update() {
return new UpdateStoryEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteStoryEntity object with specific entity
        *
* @return The DeleteStoryEntity object
*/
public DeleteStoryEntity delete() {
return new DeleteStoryEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetStoryEntities extends GetTypedEntities
<StoryEntityModel
    , GetStoryEntities    , AvailableFields, SortableFields> {
    GetStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories");
    }
    }

        public final class GetStoryEntity extends GetTypedEntity
<StoryEntityModel
    , GetStoryEntity    , AvailableFields> {
    GetStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories", entityId);
    }
    }

                public final class CreateStoryEntities extends CreateTypedEntities
<StoryEntityModel
    , CreateStoryEntities    > {
    CreateStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories");
    }
    }

                public final class UpdateStoryEntities extends UpdateTypedEntities
<StoryEntityModel
    , UpdateStoryEntities    > {
    UpdateStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories");
    }
    }

        public final class UpdateStoryEntity extends UpdateTypedEntity
<StoryEntityModel
    , UpdateStoryEntity    > {
    UpdateStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories", entityId);
    }
    }

                public final class DeleteStoryEntities extends DeleteTypedEntities
<StoryEntityModel
    , DeleteStoryEntities    > {
    DeleteStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories");
    }
    }

        public final class DeleteStoryEntity extends DeleteTypedEntity
<StoryEntityModel
        > {
    DeleteStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(StoryEntityModel.class, octaneHttpClient, baseDomain + "stories", entityId);
    }
    }

    }
