package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.WorkItemEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class WorkItemEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , VERSIONSTAMP("version_stamp")
                    , DEFECTROOTLEVEL("defect_root_level")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , FIXEDON("fixed_on")
                    , RROE("rroe")
                    , HASCHILDREN("has_children")
                    , COVERINGTESTS("covering_tests")
                    , REOPENS("reopens")
                    , LINKEDTESTS("linked_tests")
                    , PRIORITY("priority")
                    , USERTAGS("user_tags")
                    , TAXONOMIES("taxonomies")
                    , DEFECTS("defects")
                    , ESTIMATEDHOURS("estimated_hours")
                    , USERSTORIES("user_stories")
                    , ATTACHMENTS("attachments")
                    , INITIALESTIMATE("initial_estimate")
                    , ORDERING("ordering")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , DEPENDENCE("dependence")
                    , HASATTACHMENTS("has_attachments")
                    , EPICTYPE("epic_type")
                    , STORYPOINTS("story_points")
                    , LINKEDITEMS2("linked_items2")
                    , LINKEDITEMS1("linked_items1")
                    , QUALITYSTORIES("quality_stories")
                    , TEAM("team")
                    , TIMECRITICALITY("time_criticality")
                    , BUSINESSVALUE("business_value")
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , RUN("run")
                    , FIXEDINBUILD("fixed_in_build")
                    , FEATURES("features")
                    , QUALITYSTORYTYPE("quality_story_type")
                    , DEFECTTYPE("defect_type")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , RUNSTEP("run_step")
                    , LINKEDRUNS("linked_runs")
                    , TEST("test")
                    , AUTHOR("author")
                    , HASVULNERABILITIES("has_vulnerabilities")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , REMAININGHOURS("remaining_hours")
                    , HASCOMMENTS("has_comments")
                    , TASKSNUMBER("tasks_number")
                    , AGGREGATEDCOVERAGE("aggregated_coverage")
                    , NAME("name")
                    , COMMITS("commits")
                    , DETECTEDINBUILD("detected_in_build")
                    , DEPENDSONCOUNT("depends_on_count")
                    , DESCRIPTION("description")
                    , DETECTEDINRELEASE("detected_in_release")
                    , WSJFSCORE("wsjf_score")
                    , HASCOVERAGE("has_coverage")
                    , SUBTYPE("subtype")
                    , DETECTEDBY("detected_by")
                    , QAOWNER("qa_owner")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , SEVERITY("severity")
                    , REQUIREMENTS("requirements")
                    , DEPENDSON("depends_on")
                    , COMMENTS("comments")
                    , FEATURETYPE("feature_type")
                    , MILESTONE("milestone")
                    , BLOCKEDREASON("blocked_reason")
                    , DEPENDENCECOUNT("dependence_count")
                    , JOBSIZE("job_size")
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
                    , DEFECTROOTLEVEL("defect_root_level")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , FIXEDON("fixed_on")
                    , RROE("rroe")
                    , REOPENS("reopens")
                    , PRIORITY("priority")
                    , ESTIMATEDHOURS("estimated_hours")
                    , INITIALESTIMATE("initial_estimate")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , EPICTYPE("epic_type")
                    , STORYPOINTS("story_points")
                    , TEAM("team")
                    , TIMECRITICALITY("time_criticality")
                    , BUSINESSVALUE("business_value")
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , FIXEDINBUILD("fixed_in_build")
                    , QUALITYSTORYTYPE("quality_story_type")
                    , DEFECTTYPE("defect_type")
                    , AUTHOR("author")
                    , HASVULNERABILITIES("has_vulnerabilities")
                    , REMAININGHOURS("remaining_hours")
                    , NAME("name")
                    , DETECTEDINBUILD("detected_in_build")
                    , DETECTEDINRELEASE("detected_in_release")
                    , WSJFSCORE("wsjf_score")
                    , HASCOVERAGE("has_coverage")
                    , SUBTYPE("subtype")
                    , DETECTEDBY("detected_by")
                    , QAOWNER("qa_owner")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , SEVERITY("severity")
                    , FEATURETYPE("feature_type")
                    , MILESTONE("milestone")
                    , JOBSIZE("job_size")
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
    public WorkItemEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public WorkItemEntities at(String entityId) {
        return new WorkItemEntities(entityId);
    }


            public GetWorkItemEntities get() {
        return new GetWorkItemEntities(octaneHttpClient, baseDomain);
    }

                public CreateWorkItemEntities create() {
        return new CreateWorkItemEntities(octaneHttpClient, baseDomain);
    }

                public UpdateWorkItemEntities update() {
        return new UpdateWorkItemEntities(octaneHttpClient, baseDomain);
    }

                public DeleteWorkItemEntities delete() {
        return new DeleteWorkItemEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the WorkItemEntities object(An object that represent one WorkItemEntity )
    */
    public class WorkItemEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        WorkItemEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetWorkItemEntity object with specific entity
        *
* @return The GetWorkItemEntity object
*/
public GetWorkItemEntity get() {
return new GetWorkItemEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateWorkItemEntity object with specific entity
        *
* @return The UpdateWorkItemEntity object
*/
public UpdateWorkItemEntity update() {
return new UpdateWorkItemEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteWorkItemEntity object with specific entity
        *
* @return The DeleteWorkItemEntity object
*/
public DeleteWorkItemEntity delete() {
return new DeleteWorkItemEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetWorkItemEntities extends GetTypedEntities
<WorkItemEntityModel
    , GetWorkItemEntities    , AvailableFields, SortableFields> {
    GetWorkItemEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items");
    }
    }

        public final class GetWorkItemEntity extends GetTypedEntity
<WorkItemEntityModel
    , GetWorkItemEntity    , AvailableFields> {
    GetWorkItemEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items", entityId);
    }
    }

                public final class CreateWorkItemEntities extends CreateTypedEntities
<WorkItemEntityModel
    , CreateWorkItemEntities    > {
    CreateWorkItemEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items");
    }
    }

                public final class UpdateWorkItemEntities extends UpdateTypedEntities
<WorkItemEntityModel
    , UpdateWorkItemEntities    > {
    UpdateWorkItemEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items");
    }
    }

        public final class UpdateWorkItemEntity extends UpdateTypedEntity
<WorkItemEntityModel
    , UpdateWorkItemEntity    > {
    UpdateWorkItemEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items", entityId);
    }
    }

                public final class DeleteWorkItemEntities extends DeleteTypedEntities
<WorkItemEntityModel
    , DeleteWorkItemEntities    > {
    DeleteWorkItemEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items");
    }
    }

        public final class DeleteWorkItemEntity extends DeleteTypedEntity
<WorkItemEntityModel
        > {
    DeleteWorkItemEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(WorkItemEntityModel.class, octaneHttpClient, baseDomain + "work_items", entityId);
    }
    }

    }
