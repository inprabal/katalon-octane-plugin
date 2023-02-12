package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.QualityStoryEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class QualityStoryEntityList extends TypedEntityList {

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
                    , HASCHILDREN("has_children")
                    , LINKEDTESTS("linked_tests")
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
                    , QUALITYSTORYTYPE("quality_story_type")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , LINKEDRUNS("linked_runs")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , REMAININGHOURS("remaining_hours")
                    , TASKSNUMBER("tasks_number")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , COMMITS("commits")
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
                    , QUALITYSTORYTYPE("quality_story_type")
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
    public QualityStoryEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public QualityStoryEntities at(String entityId) {
        return new QualityStoryEntities(entityId);
    }


            public GetQualityStoryEntities get() {
        return new GetQualityStoryEntities(octaneHttpClient, baseDomain);
    }

                public CreateQualityStoryEntities create() {
        return new CreateQualityStoryEntities(octaneHttpClient, baseDomain);
    }

                public UpdateQualityStoryEntities update() {
        return new UpdateQualityStoryEntities(octaneHttpClient, baseDomain);
    }

                public DeleteQualityStoryEntities delete() {
        return new DeleteQualityStoryEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the QualityStoryEntities object(An object that represent one QualityStoryEntity )
    */
    public class QualityStoryEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        QualityStoryEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetQualityStoryEntity object with specific entity
        *
* @return The GetQualityStoryEntity object
*/
public GetQualityStoryEntity get() {
return new GetQualityStoryEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateQualityStoryEntity object with specific entity
        *
* @return The UpdateQualityStoryEntity object
*/
public UpdateQualityStoryEntity update() {
return new UpdateQualityStoryEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteQualityStoryEntity object with specific entity
        *
* @return The DeleteQualityStoryEntity object
*/
public DeleteQualityStoryEntity delete() {
return new DeleteQualityStoryEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetQualityStoryEntities extends GetTypedEntities
<QualityStoryEntityModel
    , GetQualityStoryEntities    , AvailableFields, SortableFields> {
    GetQualityStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories");
    }
    }

        public final class GetQualityStoryEntity extends GetTypedEntity
<QualityStoryEntityModel
    , GetQualityStoryEntity    , AvailableFields> {
    GetQualityStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories", entityId);
    }
    }

                public final class CreateQualityStoryEntities extends CreateTypedEntities
<QualityStoryEntityModel
    , CreateQualityStoryEntities    > {
    CreateQualityStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories");
    }
    }

                public final class UpdateQualityStoryEntities extends UpdateTypedEntities
<QualityStoryEntityModel
    , UpdateQualityStoryEntities    > {
    UpdateQualityStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories");
    }
    }

        public final class UpdateQualityStoryEntity extends UpdateTypedEntity
<QualityStoryEntityModel
    , UpdateQualityStoryEntity    > {
    UpdateQualityStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories", entityId);
    }
    }

                public final class DeleteQualityStoryEntities extends DeleteTypedEntities
<QualityStoryEntityModel
    , DeleteQualityStoryEntities    > {
    DeleteQualityStoryEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories");
    }
    }

        public final class DeleteQualityStoryEntity extends DeleteTypedEntity
<QualityStoryEntityModel
        > {
    DeleteQualityStoryEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(QualityStoryEntityModel.class, octaneHttpClient, baseDomain + "quality_stories", entityId);
    }
    }

    }
