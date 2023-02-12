package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ProgramEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ProgramEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
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
    public ProgramEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ProgramEntities at(String entityId) {
        return new ProgramEntities(entityId);
    }


            public GetProgramEntities get() {
        return new GetProgramEntities(octaneHttpClient, baseDomain);
    }

                public CreateProgramEntities create() {
        return new CreateProgramEntities(octaneHttpClient, baseDomain);
    }

                public UpdateProgramEntities update() {
        return new UpdateProgramEntities(octaneHttpClient, baseDomain);
    }

                public DeleteProgramEntities delete() {
        return new DeleteProgramEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the ProgramEntities object(An object that represent one ProgramEntity )
    */
    public class ProgramEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ProgramEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetProgramEntity object with specific entity
        *
* @return The GetProgramEntity object
*/
public GetProgramEntity get() {
return new GetProgramEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateProgramEntity object with specific entity
        *
* @return The UpdateProgramEntity object
*/
public UpdateProgramEntity update() {
return new UpdateProgramEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteProgramEntity object with specific entity
        *
* @return The DeleteProgramEntity object
*/
public DeleteProgramEntity delete() {
return new DeleteProgramEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetProgramEntities extends GetTypedEntities
<ProgramEntityModel
    , GetProgramEntities    , AvailableFields, SortableFields> {
    GetProgramEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs");
    }
    }

        public final class GetProgramEntity extends GetTypedEntity
<ProgramEntityModel
    , GetProgramEntity    , AvailableFields> {
    GetProgramEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs", entityId);
    }
    }

                public final class CreateProgramEntities extends CreateTypedEntities
<ProgramEntityModel
    , CreateProgramEntities    > {
    CreateProgramEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs");
    }
    }

                public final class UpdateProgramEntities extends UpdateTypedEntities
<ProgramEntityModel
    , UpdateProgramEntities    > {
    UpdateProgramEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs");
    }
    }

        public final class UpdateProgramEntity extends UpdateTypedEntity
<ProgramEntityModel
    , UpdateProgramEntity    > {
    UpdateProgramEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs", entityId);
    }
    }

                public final class DeleteProgramEntities extends DeleteTypedEntities
<ProgramEntityModel
    , DeleteProgramEntities    > {
    DeleteProgramEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs");
    }
    }

        public final class DeleteProgramEntity extends DeleteTypedEntity
<ProgramEntityModel
        > {
    DeleteProgramEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProgramEntityModel.class, octaneHttpClient, baseDomain + "programs", entityId);
    }
    }

    }
