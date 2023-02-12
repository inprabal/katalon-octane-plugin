package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.DefectEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class DefectEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , DEFECTROOTLEVEL("defect_root_level")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , FIXEDON("fixed_on")
                    , COVERINGTESTS("covering_tests")
                    , HASCHILDREN("has_children")
                    , REOPENS("reopens")
                    , PRIORITY("priority")
                    , USERTAGS("user_tags")
                    , TAXONOMIES("taxonomies")
                    , ESTIMATEDHOURS("estimated_hours")
                    , ATTACHMENTS("attachments")
                    , ORDERING("ordering")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , DEPENDENCE("dependence")
                    , HASATTACHMENTS("has_attachments")
                    , LINKEDITEMS2("linked_items2")
                    , STORYPOINTS("story_points")
                    , LINKEDITEMS1("linked_items1")
                    , TEAM("team")
                    , SPRINT("sprint")
                    , RUN("run")
                    , FIXEDINBUILD("fixed_in_build")
                    , DEFECTTYPE("defect_type")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , RUNSTEP("run_step")
                    , TEST("test")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , REMAININGHOURS("remaining_hours")
                    , TASKSNUMBER("tasks_number")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , COMMITS("commits")
                    , DETECTEDINBUILD("detected_in_build")
                    , DEPENDSONCOUNT("depends_on_count")
                    , DESCRIPTION("description")
                    , DETECTEDINRELEASE("detected_in_release")
                    , HASCOVERAGE("has_coverage")
                    , DETECTEDBY("detected_by")
                    , QAOWNER("qa_owner")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , SEVERITY("severity")
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
                    , DEFECTROOTLEVEL("defect_root_level")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , FIXEDON("fixed_on")
                    , REOPENS("reopens")
                    , PRIORITY("priority")
                    , ESTIMATEDHOURS("estimated_hours")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , BLOCKED("blocked")
                    , INVESTEDHOURS("invested_hours")
                    , STORYPOINTS("story_points")
                    , TEAM("team")
                    , SPRINT("sprint")
                    , FIXEDINBUILD("fixed_in_build")
                    , DEFECTTYPE("defect_type")
                    , AUTHOR("author")
                    , REMAININGHOURS("remaining_hours")
                    , NAME("name")
                    , DETECTEDINBUILD("detected_in_build")
                    , DETECTEDINRELEASE("detected_in_release")
                    , HASCOVERAGE("has_coverage")
                    , DETECTEDBY("detected_by")
                    , QAOWNER("qa_owner")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , SEVERITY("severity")
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
    public DefectEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public DefectEntities at(String entityId) {
        return new DefectEntities(entityId);
    }


            public GetDefectEntities get() {
        return new GetDefectEntities(octaneHttpClient, baseDomain);
    }

                public CreateDefectEntities create() {
        return new CreateDefectEntities(octaneHttpClient, baseDomain);
    }

                public UpdateDefectEntities update() {
        return new UpdateDefectEntities(octaneHttpClient, baseDomain);
    }

                public DeleteDefectEntities delete() {
        return new DeleteDefectEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the DefectEntities object(An object that represent one DefectEntity )
    */
    public class DefectEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        DefectEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetDefectEntity object with specific entity
        *
* @return The GetDefectEntity object
*/
public GetDefectEntity get() {
return new GetDefectEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateDefectEntity object with specific entity
        *
* @return The UpdateDefectEntity object
*/
public UpdateDefectEntity update() {
return new UpdateDefectEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteDefectEntity object with specific entity
        *
* @return The DeleteDefectEntity object
*/
public DeleteDefectEntity delete() {
return new DeleteDefectEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetDefectEntities extends GetTypedEntities
<DefectEntityModel
    , GetDefectEntities    , AvailableFields, SortableFields> {
    GetDefectEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects");
    }
    }

        public final class GetDefectEntity extends GetTypedEntity
<DefectEntityModel
    , GetDefectEntity    , AvailableFields> {
    GetDefectEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects", entityId);
    }
    }

                public final class CreateDefectEntities extends CreateTypedEntities
<DefectEntityModel
    , CreateDefectEntities    > {
    CreateDefectEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects");
    }
    }

                public final class UpdateDefectEntities extends UpdateTypedEntities
<DefectEntityModel
    , UpdateDefectEntities    > {
    UpdateDefectEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects");
    }
    }

        public final class UpdateDefectEntity extends UpdateTypedEntity
<DefectEntityModel
    , UpdateDefectEntity    > {
    UpdateDefectEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects", entityId);
    }
    }

                public final class DeleteDefectEntities extends DeleteTypedEntities
<DefectEntityModel
    , DeleteDefectEntities    > {
    DeleteDefectEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects");
    }
    }

        public final class DeleteDefectEntity extends DeleteTypedEntity
<DefectEntityModel
        > {
    DeleteDefectEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(DefectEntityModel.class, octaneHttpClient, baseDomain + "defects", entityId);
    }
    }

    }
