package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.EpicEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class EpicEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , VERSIONSTAMP("version_stamp")
                    , FEATURES("features")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , RROE("rroe")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , USERTAGS("user_tags")
                    , HASCOMMENTS("has_comments")
                    , NAME("name")
                    , ATTACHMENTS("attachments")
                    , ORDERING("ordering")
                    , DESCRIPTION("description")
                    , WSJFSCORE("wsjf_score")
                    , OWNER("owner")
                    , REQUIREMENTS("requirements")
                    , COMMENTS("comments")
                    , HASATTACHMENTS("has_attachments")
                    , EPICTYPE("epic_type")
                    , LINKEDITEMS2("linked_items2")
                    , STORYPOINTS("story_points")
                    , LINKEDITEMS1("linked_items1")
                    , MILESTONE("milestone")
                    , TIMECRITICALITY("time_criticality")
                    , JOBSIZE("job_size")
                    , BUSINESSVALUE("business_value")
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
                    , ACTUALSTORYPOINTS("actual_story_points")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
                    , PHASE("phase")
                    , RROE("rroe")
                    , AUTHOR("author")
                    , NAME("name")
                    , WSJFSCORE("wsjf_score")
                    , OWNER("owner")
                    , EPICTYPE("epic_type")
                    , STORYPOINTS("story_points")
                    , MILESTONE("milestone")
                    , TIMECRITICALITY("time_criticality")
                    , JOBSIZE("job_size")
                    , BUSINESSVALUE("business_value")
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
    public EpicEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public EpicEntities at(String entityId) {
        return new EpicEntities(entityId);
    }


            public GetEpicEntities get() {
        return new GetEpicEntities(octaneHttpClient, baseDomain);
    }

                public CreateEpicEntities create() {
        return new CreateEpicEntities(octaneHttpClient, baseDomain);
    }

                public UpdateEpicEntities update() {
        return new UpdateEpicEntities(octaneHttpClient, baseDomain);
    }

                public DeleteEpicEntities delete() {
        return new DeleteEpicEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the EpicEntities object(An object that represent one EpicEntity )
    */
    public class EpicEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        EpicEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetEpicEntity object with specific entity
        *
* @return The GetEpicEntity object
*/
public GetEpicEntity get() {
return new GetEpicEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateEpicEntity object with specific entity
        *
* @return The UpdateEpicEntity object
*/
public UpdateEpicEntity update() {
return new UpdateEpicEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteEpicEntity object with specific entity
        *
* @return The DeleteEpicEntity object
*/
public DeleteEpicEntity delete() {
return new DeleteEpicEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetEpicEntities extends GetTypedEntities
<EpicEntityModel
    , GetEpicEntities    , AvailableFields, SortableFields> {
    GetEpicEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics");
    }
    }

        public final class GetEpicEntity extends GetTypedEntity
<EpicEntityModel
    , GetEpicEntity    , AvailableFields> {
    GetEpicEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics", entityId);
    }
    }

                public final class CreateEpicEntities extends CreateTypedEntities
<EpicEntityModel
    , CreateEpicEntities    > {
    CreateEpicEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics");
    }
    }

                public final class UpdateEpicEntities extends UpdateTypedEntities
<EpicEntityModel
    , UpdateEpicEntities    > {
    UpdateEpicEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics");
    }
    }

        public final class UpdateEpicEntity extends UpdateTypedEntity
<EpicEntityModel
    , UpdateEpicEntity    > {
    UpdateEpicEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics", entityId);
    }
    }

                public final class DeleteEpicEntities extends DeleteTypedEntities
<EpicEntityModel
    , DeleteEpicEntities    > {
    DeleteEpicEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics");
    }
    }

        public final class DeleteEpicEntity extends DeleteTypedEntity
<EpicEntityModel
        > {
    DeleteEpicEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(EpicEntityModel.class, octaneHttpClient, baseDomain + "epics", entityId);
    }
    }

    }
