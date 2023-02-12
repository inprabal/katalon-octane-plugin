package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TaxonomyNodeEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TaxonomyNodeEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , AUTHOR("author")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , SUBTYPE("subtype")
                    , NAME("name")
                    , CATEGORY("category")
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
                    , AUTHOR("author")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
                    , SUBTYPE("subtype")
                    , NAME("name")
                    , CATEGORY("category")
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
    public TaxonomyNodeEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TaxonomyNodeEntities at(String entityId) {
        return new TaxonomyNodeEntities(entityId);
    }


            public GetTaxonomyNodeEntities get() {
        return new GetTaxonomyNodeEntities(octaneHttpClient, baseDomain);
    }

                public CreateTaxonomyNodeEntities create() {
        return new CreateTaxonomyNodeEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTaxonomyNodeEntities update() {
        return new UpdateTaxonomyNodeEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TaxonomyNodeEntities object(An object that represent one TaxonomyNodeEntity )
    */
    public class TaxonomyNodeEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TaxonomyNodeEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTaxonomyNodeEntity object with specific entity
        *
* @return The GetTaxonomyNodeEntity object
*/
public GetTaxonomyNodeEntity get() {
return new GetTaxonomyNodeEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTaxonomyNodeEntity object with specific entity
        *
* @return The UpdateTaxonomyNodeEntity object
*/
public UpdateTaxonomyNodeEntity update() {
return new UpdateTaxonomyNodeEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTaxonomyNodeEntities extends GetTypedEntities
<TaxonomyNodeEntityModel
    , GetTaxonomyNodeEntities    , AvailableFields, SortableFields> {
    GetTaxonomyNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_nodes");
    }
    }

        public final class GetTaxonomyNodeEntity extends GetTypedEntity
<TaxonomyNodeEntityModel
    , GetTaxonomyNodeEntity    , AvailableFields> {
    GetTaxonomyNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_nodes", entityId);
    }
    }

                public final class CreateTaxonomyNodeEntities extends CreateTypedEntities
<TaxonomyNodeEntityModel
    , CreateTaxonomyNodeEntities    > {
    CreateTaxonomyNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_nodes");
    }
    }

                public final class UpdateTaxonomyNodeEntities extends UpdateTypedEntities
<TaxonomyNodeEntityModel
    , UpdateTaxonomyNodeEntities    > {
    UpdateTaxonomyNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_nodes");
    }
    }

        public final class UpdateTaxonomyNodeEntity extends UpdateTypedEntity
<TaxonomyNodeEntityModel
    , UpdateTaxonomyNodeEntity    > {
    UpdateTaxonomyNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_nodes", entityId);
    }
    }

        }
