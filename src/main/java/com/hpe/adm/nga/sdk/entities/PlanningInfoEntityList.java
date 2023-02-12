package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.PlanningInfoEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class PlanningInfoEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASATTACHMENTS("has_attachments")
                    , COMMENTS("comments")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , RELEASE("release")
                    , SPRINT("sprint")
                    , PROGRAM("program")
                    , HASCOMMENTS("has_comments")
                    , MILESTONE("milestone")
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
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
                    , NAME("name")
                    , LASTMODIFIED("last_modified")
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
    public PlanningInfoEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public PlanningInfoEntities at(String entityId) {
        return new PlanningInfoEntities(entityId);
    }


            public GetPlanningInfoEntities get() {
        return new GetPlanningInfoEntities(octaneHttpClient, baseDomain);
    }

                    public UpdatePlanningInfoEntities update() {
        return new UpdatePlanningInfoEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the PlanningInfoEntities object(An object that represent one PlanningInfoEntity )
    */
    public class PlanningInfoEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        PlanningInfoEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetPlanningInfoEntity object with specific entity
        *
* @return The GetPlanningInfoEntity object
*/
public GetPlanningInfoEntity get() {
return new GetPlanningInfoEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdatePlanningInfoEntity object with specific entity
        *
* @return The UpdatePlanningInfoEntity object
*/
public UpdatePlanningInfoEntity update() {
return new UpdatePlanningInfoEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetPlanningInfoEntities extends GetTypedEntities
<PlanningInfoEntityModel
    , GetPlanningInfoEntities    , AvailableFields, SortableFields> {
    GetPlanningInfoEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PlanningInfoEntityModel.class, octaneHttpClient, baseDomain + "planning_info");
    }
    }

        public final class GetPlanningInfoEntity extends GetTypedEntity
<PlanningInfoEntityModel
    , GetPlanningInfoEntity    , AvailableFields> {
    GetPlanningInfoEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PlanningInfoEntityModel.class, octaneHttpClient, baseDomain + "planning_info", entityId);
    }
    }

                    public final class UpdatePlanningInfoEntities extends UpdateTypedEntities
<PlanningInfoEntityModel
    , UpdatePlanningInfoEntities    > {
    UpdatePlanningInfoEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PlanningInfoEntityModel.class, octaneHttpClient, baseDomain + "planning_info");
    }
    }

        public final class UpdatePlanningInfoEntity extends UpdateTypedEntity
<PlanningInfoEntityModel
    , UpdatePlanningInfoEntity    > {
    UpdatePlanningInfoEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PlanningInfoEntityModel.class, octaneHttpClient, baseDomain + "planning_info", entityId);
    }
    }

        }
