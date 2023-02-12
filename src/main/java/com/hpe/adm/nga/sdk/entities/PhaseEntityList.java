package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.PhaseEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class PhaseEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , MASTERPHASE("master_phase")
                    , LOGICALNAME("logical_name")
                    , VERSIONSTAMP("version_stamp")
                    , ISSTARTPHASE("is_start_phase")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , SUBPHASES("sub_phases")
                    , LASTMODIFIED("last_modified")
                    , ISSYSTEM("is_system")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , NAME("name")
                    , METAPHASE("metaphase")
                    , ENTITY("entity")
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
                    , LOGICALNAME("logical_name")
                    , VERSIONSTAMP("version_stamp")
                    , ISSTARTPHASE("is_start_phase")
                    , DESCRIPTION("description")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , LASTMODIFIED("last_modified")
                    , ISSYSTEM("is_system")
                    , ENTITY("entity")
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
    public PhaseEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public PhaseEntities at(String entityId) {
        return new PhaseEntities(entityId);
    }


            public GetPhaseEntities get() {
        return new GetPhaseEntities(octaneHttpClient, baseDomain);
    }

                public CreatePhaseEntities create() {
        return new CreatePhaseEntities(octaneHttpClient, baseDomain);
    }

                public UpdatePhaseEntities update() {
        return new UpdatePhaseEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the PhaseEntities object(An object that represent one PhaseEntity )
    */
    public class PhaseEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        PhaseEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetPhaseEntity object with specific entity
        *
* @return The GetPhaseEntity object
*/
public GetPhaseEntity get() {
return new GetPhaseEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdatePhaseEntity object with specific entity
        *
* @return The UpdatePhaseEntity object
*/
public UpdatePhaseEntity update() {
return new UpdatePhaseEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetPhaseEntities extends GetTypedEntities
<PhaseEntityModel
    , GetPhaseEntities    , AvailableFields, SortableFields> {
    GetPhaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PhaseEntityModel.class, octaneHttpClient, baseDomain + "phases");
    }
    }

        public final class GetPhaseEntity extends GetTypedEntity
<PhaseEntityModel
    , GetPhaseEntity    , AvailableFields> {
    GetPhaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PhaseEntityModel.class, octaneHttpClient, baseDomain + "phases", entityId);
    }
    }

                public final class CreatePhaseEntities extends CreateTypedEntities
<PhaseEntityModel
    , CreatePhaseEntities    > {
    CreatePhaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PhaseEntityModel.class, octaneHttpClient, baseDomain + "phases");
    }
    }

                public final class UpdatePhaseEntities extends UpdateTypedEntities
<PhaseEntityModel
    , UpdatePhaseEntities    > {
    UpdatePhaseEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(PhaseEntityModel.class, octaneHttpClient, baseDomain + "phases");
    }
    }

        public final class UpdatePhaseEntity extends UpdateTypedEntity
<PhaseEntityModel
    , UpdatePhaseEntity    > {
    UpdatePhaseEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(PhaseEntityModel.class, octaneHttpClient, baseDomain + "phases", entityId);
    }
    }

        }
