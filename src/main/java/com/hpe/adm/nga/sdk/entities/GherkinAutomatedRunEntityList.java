package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.GherkinAutomatedRunEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class GherkinAutomatedRunEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLUSTER("cluster")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , DEFECT("defect")
                    , TESTVERSION("test_version")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , LASTMODIFIED("last_modified")
                    , ERRORMESSAGE("error_message")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , PRODUCTAREAS("product_areas")
                    , USERTAGS("user_tags")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , HASCOMMENTS("has_comments")
                    , TAXONOMIES("taxonomies")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ONIT("on_it")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , DESCRIPTION("description")
                    , DURATION("duration")
                    , FULLERRORDETAILS("full_error_details")
                    , FAILEDSINCEBUILDINFO("failed_since_build_info")
                    , ERRORDETAILS("error_details")
                    , COMMENTS("comments")
                    , NATIVESTATUS("native_status")
                    , QUALITYSTORIES("quality_stories")
                    , BDDSPECNAME("bdd_spec_name")
                    , STARTED("started")
                    , LASTMODIFIEDBY("last_modified_by")
                    , TESTTYPE("test_type")
                    , PIPELINE("pipeline")
                    , PARENTSUITE("parent_suite")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , BUILD("build")
                    , TESTFRAMEWORK("test_framework")
                    , STATUSAGE("status_age")
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
                    , CLUSTER("cluster")
                    , VERSIONSTAMP("version_stamp")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , TESTVERSION("test_version")
                    , ERRORTYPE("error_type")
                    , FAILEDBUILDAGE("failed_build_age")
                    , LASTMODIFIED("last_modified")
                    , ERRORMESSAGE("error_message")
                    , AUTHOR("author")
                    , RUNBY("run_by")
                    , TESTINGTOOLTYPE("testing_tool_type")
                    , DRAFTRUN("draft_run")
                    , NAME("name")
                    , TESTNAME("test_name")
                    , STATUS("status")
                    , ONIT("on_it")
                    , LATESTPIPELINERUN("latest_pipeline_run")
                    , FAILEDSINCEBUILD("failed_since_build")
                    , DURATION("duration")
                    , ERRORDETAILS("error_details")
                    , NATIVESTATUS("native_status")
                    , BDDSPECNAME("bdd_spec_name")
                    , STARTED("started")
                    , MERGEDONIT("merged_on_it")
                    , MILESTONE("milestone")
                    , TESTFRAMEWORK("test_framework")
                    , STATUSAGE("status_age")
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
    public GherkinAutomatedRunEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public GherkinAutomatedRunEntities at(String entityId) {
        return new GherkinAutomatedRunEntities(entityId);
    }


            public GetGherkinAutomatedRunEntities get() {
        return new GetGherkinAutomatedRunEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateGherkinAutomatedRunEntities update() {
        return new UpdateGherkinAutomatedRunEntities(octaneHttpClient, baseDomain);
    }

                public DeleteGherkinAutomatedRunEntities delete() {
        return new DeleteGherkinAutomatedRunEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the GherkinAutomatedRunEntities object(An object that represent one GherkinAutomatedRunEntity )
    */
    public class GherkinAutomatedRunEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        GherkinAutomatedRunEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetGherkinAutomatedRunEntity object with specific entity
        *
* @return The GetGherkinAutomatedRunEntity object
*/
public GetGherkinAutomatedRunEntity get() {
return new GetGherkinAutomatedRunEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateGherkinAutomatedRunEntity object with specific entity
        *
* @return The UpdateGherkinAutomatedRunEntity object
*/
public UpdateGherkinAutomatedRunEntity update() {
return new UpdateGherkinAutomatedRunEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteGherkinAutomatedRunEntity object with specific entity
        *
* @return The DeleteGherkinAutomatedRunEntity object
*/
public DeleteGherkinAutomatedRunEntity delete() {
return new DeleteGherkinAutomatedRunEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetGherkinAutomatedRunEntities extends GetTypedEntities
<GherkinAutomatedRunEntityModel
    , GetGherkinAutomatedRunEntities    , AvailableFields, SortableFields> {
    GetGherkinAutomatedRunEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs");
    }
    }

        public final class GetGherkinAutomatedRunEntity extends GetTypedEntity
<GherkinAutomatedRunEntityModel
    , GetGherkinAutomatedRunEntity    , AvailableFields> {
    GetGherkinAutomatedRunEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs", entityId);
    }
    }

                    public final class UpdateGherkinAutomatedRunEntities extends UpdateTypedEntities
<GherkinAutomatedRunEntityModel
    , UpdateGherkinAutomatedRunEntities    > {
    UpdateGherkinAutomatedRunEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs");
    }
    }

        public final class UpdateGherkinAutomatedRunEntity extends UpdateTypedEntity
<GherkinAutomatedRunEntityModel
    , UpdateGherkinAutomatedRunEntity    > {
    UpdateGherkinAutomatedRunEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs", entityId);
    }
    }

                public final class DeleteGherkinAutomatedRunEntities extends DeleteTypedEntities
<GherkinAutomatedRunEntityModel
    , DeleteGherkinAutomatedRunEntities    > {
    DeleteGherkinAutomatedRunEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs");
    }
    }

        public final class DeleteGherkinAutomatedRunEntity extends DeleteTypedEntity
<GherkinAutomatedRunEntityModel
        > {
    DeleteGherkinAutomatedRunEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(GherkinAutomatedRunEntityModel.class, octaneHttpClient, baseDomain + "gherkin_automated_runs", entityId);
    }
    }

    }
