package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TransitionEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TransitionEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , ISSYSTEM("is_system")
                    , LOGICALNAME("logical_name")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , TARGETPHASE("target_phase")
                    , SOURCEPHASE("source_phase")
                    , LASTMODIFIED("last_modified")
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
                    , ISSYSTEM("is_system")
                    , LOGICALNAME("logical_name")
                    , VERSIONSTAMP("version_stamp")
                    , LASTMODIFIED("last_modified")
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
    public TransitionEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TransitionEntities at(String entityId) {
        return new TransitionEntities(entityId);
    }


            public GetTransitionEntities get() {
        return new GetTransitionEntities(octaneHttpClient, baseDomain);
    }

                public CreateTransitionEntities create() {
        return new CreateTransitionEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTransitionEntities update() {
        return new UpdateTransitionEntities(octaneHttpClient, baseDomain);
    }

                public DeleteTransitionEntities delete() {
        return new DeleteTransitionEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the TransitionEntities object(An object that represent one TransitionEntity )
    */
    public class TransitionEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TransitionEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTransitionEntity object with specific entity
        *
* @return The GetTransitionEntity object
*/
public GetTransitionEntity get() {
return new GetTransitionEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTransitionEntity object with specific entity
        *
* @return The UpdateTransitionEntity object
*/
public UpdateTransitionEntity update() {
return new UpdateTransitionEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteTransitionEntity object with specific entity
        *
* @return The DeleteTransitionEntity object
*/
public DeleteTransitionEntity delete() {
return new DeleteTransitionEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTransitionEntities extends GetTypedEntities
<TransitionEntityModel
    , GetTransitionEntities    , AvailableFields, SortableFields> {
    GetTransitionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions");
    }
    }

        public final class GetTransitionEntity extends GetTypedEntity
<TransitionEntityModel
    , GetTransitionEntity    , AvailableFields> {
    GetTransitionEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions", entityId);
    }
    }

                public final class CreateTransitionEntities extends CreateTypedEntities
<TransitionEntityModel
    , CreateTransitionEntities    > {
    CreateTransitionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions");
    }
    }

                public final class UpdateTransitionEntities extends UpdateTypedEntities
<TransitionEntityModel
    , UpdateTransitionEntities    > {
    UpdateTransitionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions");
    }
    }

        public final class UpdateTransitionEntity extends UpdateTypedEntity
<TransitionEntityModel
    , UpdateTransitionEntity    > {
    UpdateTransitionEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions", entityId);
    }
    }

                public final class DeleteTransitionEntities extends DeleteTypedEntities
<TransitionEntityModel
    , DeleteTransitionEntities    > {
    DeleteTransitionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions");
    }
    }

        public final class DeleteTransitionEntity extends DeleteTypedEntity
<TransitionEntityModel
        > {
    DeleteTransitionEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TransitionEntityModel.class, octaneHttpClient, baseDomain + "transitions", entityId);
    }
    }

    }
