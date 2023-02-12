package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.GherkinTestEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class GherkinTestEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    TESTRUNNER("test_runner")
                    , CREATIONTIME("creation_time")
                    , COVEREDCONTENT("covered_content")
                    , BACKLOGCOVERAGE("backlog_coverage")
                    , VERSIONSTAMP("version_stamp")
                    , RUN("run")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , AUTHOR("author")
                    , PRODUCTAREAS("product_areas")
                    , APPLICATIONMODULES("application_modules")
                    , ESTIMATEDDURATION("estimated_duration")
                    , LASTRUNS("last_runs")
                    , USERTAGS("user_tags")
                    , LINKTOTEST("link_to_test")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , AUTOMATIONSTATUS("automation_status")
                    , ATTACHMENTS("attachments")
                    , DESCRIPTION("description")
                    , STEPSNUM("steps_num")
                    , OWNER("owner")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , QUALITYSTORIES("quality_stories")
                    , DESIGNER("designer")
                    , COVEREDREQUIREMENT("covered_requirement")
                    , TESTTYPE("test_type")
                    , MODIFIEDBY("modified_by")
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
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , AUTHOR("author")
                    , ESTIMATEDDURATION("estimated_duration")
                    , NAME("name")
                    , AUTOMATIONSTATUS("automation_status")
                    , STEPSNUM("steps_num")
                    , OWNER("owner")
                    , DESIGNER("designer")
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
    public GherkinTestEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public GherkinTestEntities at(String entityId) {
        return new GherkinTestEntities(entityId);
    }


            public GetGherkinTestEntities get() {
        return new GetGherkinTestEntities(octaneHttpClient, baseDomain);
    }

                public CreateGherkinTestEntities create() {
        return new CreateGherkinTestEntities(octaneHttpClient, baseDomain);
    }

                public UpdateGherkinTestEntities update() {
        return new UpdateGherkinTestEntities(octaneHttpClient, baseDomain);
    }

                public DeleteGherkinTestEntities delete() {
        return new DeleteGherkinTestEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the GherkinTestEntities object(An object that represent one GherkinTestEntity )
    */
    public class GherkinTestEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        GherkinTestEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetGherkinTestEntity object with specific entity
        *
* @return The GetGherkinTestEntity object
*/
public GetGherkinTestEntity get() {
return new GetGherkinTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateGherkinTestEntity object with specific entity
        *
* @return The UpdateGherkinTestEntity object
*/
public UpdateGherkinTestEntity update() {
return new UpdateGherkinTestEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteGherkinTestEntity object with specific entity
        *
* @return The DeleteGherkinTestEntity object
*/
public DeleteGherkinTestEntity delete() {
return new DeleteGherkinTestEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetGherkinTestEntities extends GetTypedEntities
<GherkinTestEntityModel
    , GetGherkinTestEntities    , AvailableFields, SortableFields> {
    GetGherkinTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests");
    }
    }

        public final class GetGherkinTestEntity extends GetTypedEntity
<GherkinTestEntityModel
    , GetGherkinTestEntity    , AvailableFields> {
    GetGherkinTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests", entityId);
    }
    }

                public final class CreateGherkinTestEntities extends CreateTypedEntities
<GherkinTestEntityModel
    , CreateGherkinTestEntities    > {
    CreateGherkinTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests");
    }
    }

                public final class UpdateGherkinTestEntities extends UpdateTypedEntities
<GherkinTestEntityModel
    , UpdateGherkinTestEntities    > {
    UpdateGherkinTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests");
    }
    }

        public final class UpdateGherkinTestEntity extends UpdateTypedEntity
<GherkinTestEntityModel
    , UpdateGherkinTestEntity    > {
    UpdateGherkinTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests", entityId);
    }
    }

                public final class DeleteGherkinTestEntities extends DeleteTypedEntities
<GherkinTestEntityModel
    , DeleteGherkinTestEntities    > {
    DeleteGherkinTestEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests");
    }
    }

        public final class DeleteGherkinTestEntity extends DeleteTypedEntity
<GherkinTestEntityModel
        > {
    DeleteGherkinTestEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinTestEntityModel.class, octaneHttpClient, baseDomain + "gherkin_tests", entityId);
    }
    }

    }
