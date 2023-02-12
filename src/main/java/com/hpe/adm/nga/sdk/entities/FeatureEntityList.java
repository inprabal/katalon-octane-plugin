package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.FeatureEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class FeatureEntityList extends TypedEntityList {

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
                    , RROE("rroe")
                    , COVERINGTESTS("covering_tests")
                    , HASCHILDREN("has_children")
                    , PRIORITY("priority")
                    , USERTAGS("user_tags")
                    , DEFECTS("defects")
                    , USERSTORIES("user_stories")
                    , ATTACHMENTS("attachments")
                    , INITIALESTIMATE("initial_estimate")
                    , ORDERING("ordering")
                    , DEPENDENCE("dependence")
                    , HASATTACHMENTS("has_attachments")
                    , LINKEDITEMS2("linked_items2")
                    , STORYPOINTS("story_points")
                    , QUALITYSTORIES("quality_stories")
                    , LINKEDITEMS1("linked_items1")
                    , TEAM("team")
                    , TIMECRITICALITY("time_criticality")
                    , BUSINESSVALUE("business_value")
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , SPRINT("sprint")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , HASVULNERABILITIES("has_vulnerabilities")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , HASCOMMENTS("has_comments")
                    , AGGREGATEDCOVERAGE("aggregated_coverage")
                    , NAME("name")
                    , DEPENDSONCOUNT("depends_on_count")
                    , DESCRIPTION("description")
                    , WSJFSCORE("wsjf_score")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , REQUIREMENTS("requirements")
                    , DEPENDSON("depends_on")
                    , COMMENTS("comments")
                    , FEATURETYPE("feature_type")
                    , MILESTONE("milestone")
                    , JOBSIZE("job_size")
                    , DEPENDENCECOUNT("dependence_count")
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
                    , RROE("rroe")
                    , PRIORITY("priority")
                    , INITIALESTIMATE("initial_estimate")
                    , STORYPOINTS("story_points")
                    , TEAM("team")
                    , TIMECRITICALITY("time_criticality")
                    , BUSINESSVALUE("business_value")
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , SPRINT("sprint")
                    , AUTHOR("author")
                    , HASVULNERABILITIES("has_vulnerabilities")
                    , NAME("name")
                    , WSJFSCORE("wsjf_score")
                    , CLOSEDON("closed_on")
                    , DONEDATE("done_date")
                    , OWNER("owner")
                    , FEATURETYPE("feature_type")
                    , MILESTONE("milestone")
                    , JOBSIZE("job_size")
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
    public FeatureEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public FeatureEntities at(String entityId) {
        return new FeatureEntities(entityId);
    }


            public GetFeatureEntities get() {
        return new GetFeatureEntities(octaneHttpClient, baseDomain);
    }

                public CreateFeatureEntities create() {
        return new CreateFeatureEntities(octaneHttpClient, baseDomain);
    }

                public UpdateFeatureEntities update() {
        return new UpdateFeatureEntities(octaneHttpClient, baseDomain);
    }

                public DeleteFeatureEntities delete() {
        return new DeleteFeatureEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the FeatureEntities object(An object that represent one FeatureEntity )
    */
    public class FeatureEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        FeatureEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetFeatureEntity object with specific entity
        *
* @return The GetFeatureEntity object
*/
public GetFeatureEntity get() {
return new GetFeatureEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateFeatureEntity object with specific entity
        *
* @return The UpdateFeatureEntity object
*/
public UpdateFeatureEntity update() {
return new UpdateFeatureEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteFeatureEntity object with specific entity
        *
* @return The DeleteFeatureEntity object
*/
public DeleteFeatureEntity delete() {
return new DeleteFeatureEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetFeatureEntities extends GetTypedEntities
<FeatureEntityModel
    , GetFeatureEntities    , AvailableFields, SortableFields> {
    GetFeatureEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features");
    }
    }

        public final class GetFeatureEntity extends GetTypedEntity
<FeatureEntityModel
    , GetFeatureEntity    , AvailableFields> {
    GetFeatureEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features", entityId);
    }
    }

                public final class CreateFeatureEntities extends CreateTypedEntities
<FeatureEntityModel
    , CreateFeatureEntities    > {
    CreateFeatureEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features");
    }
    }

                public final class UpdateFeatureEntities extends UpdateTypedEntities
<FeatureEntityModel
    , UpdateFeatureEntities    > {
    UpdateFeatureEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features");
    }
    }

        public final class UpdateFeatureEntity extends UpdateTypedEntity
<FeatureEntityModel
    , UpdateFeatureEntity    > {
    UpdateFeatureEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features", entityId);
    }
    }

                public final class DeleteFeatureEntities extends DeleteTypedEntities
<FeatureEntityModel
    , DeleteFeatureEntities    > {
    DeleteFeatureEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features");
    }
    }

        public final class DeleteFeatureEntity extends DeleteTypedEntity
<FeatureEntityModel
        > {
    DeleteFeatureEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(FeatureEntityModel.class, octaneHttpClient, baseDomain + "features", entityId);
    }
    }

    }
