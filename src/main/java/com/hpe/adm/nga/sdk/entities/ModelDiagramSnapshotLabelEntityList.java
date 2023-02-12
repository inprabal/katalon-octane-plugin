package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ModelDiagramSnapshotLabelEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ModelDiagramSnapshotLabelEntityList extends TypedEntityList {

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
    public ModelDiagramSnapshotLabelEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ModelDiagramSnapshotLabelEntities at(String entityId) {
        return new ModelDiagramSnapshotLabelEntities(entityId);
    }


            public GetModelDiagramSnapshotLabelEntities get() {
        return new GetModelDiagramSnapshotLabelEntities(octaneHttpClient, baseDomain);
    }

                public CreateModelDiagramSnapshotLabelEntities create() {
        return new CreateModelDiagramSnapshotLabelEntities(octaneHttpClient, baseDomain);
    }

            
    /**
    * This class hold the ModelDiagramSnapshotLabelEntities object(An object that represent one ModelDiagramSnapshotLabelEntity )
    */
    public class ModelDiagramSnapshotLabelEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ModelDiagramSnapshotLabelEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetModelDiagramSnapshotLabelEntity object with specific entity
        *
* @return The GetModelDiagramSnapshotLabelEntity object
*/
public GetModelDiagramSnapshotLabelEntity get() {
return new GetModelDiagramSnapshotLabelEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetModelDiagramSnapshotLabelEntities extends GetTypedEntities
<ModelDiagramSnapshotLabelEntityModel
    , GetModelDiagramSnapshotLabelEntities    , AvailableFields, SortableFields> {
    GetModelDiagramSnapshotLabelEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ModelDiagramSnapshotLabelEntityModel.class, octaneHttpClient, baseDomain + "model_diagram_snapshot_labels");
    }
    }

        public final class GetModelDiagramSnapshotLabelEntity extends GetTypedEntity
<ModelDiagramSnapshotLabelEntityModel
    , GetModelDiagramSnapshotLabelEntity    , AvailableFields> {
    GetModelDiagramSnapshotLabelEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ModelDiagramSnapshotLabelEntityModel.class, octaneHttpClient, baseDomain + "model_diagram_snapshot_labels", entityId);
    }
    }

                public final class CreateModelDiagramSnapshotLabelEntities extends CreateTypedEntities
<ModelDiagramSnapshotLabelEntityModel
    , CreateModelDiagramSnapshotLabelEntities    > {
    CreateModelDiagramSnapshotLabelEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ModelDiagramSnapshotLabelEntityModel.class, octaneHttpClient, baseDomain + "model_diagram_snapshot_labels");
    }
    }

            }
