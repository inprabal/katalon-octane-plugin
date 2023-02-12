package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TaxonomyItemNodeEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TaxonomyItemNodeEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , AUTHOR("author")
                    , ACTIVITYLEVEL("activity_level")
                    , USERACTIVATIONSTATUS("user_activation_status")
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
    public TaxonomyItemNodeEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TaxonomyItemNodeEntities at(String entityId) {
        return new TaxonomyItemNodeEntities(entityId);
    }


            public GetTaxonomyItemNodeEntities get() {
        return new GetTaxonomyItemNodeEntities(octaneHttpClient, baseDomain);
    }

                public CreateTaxonomyItemNodeEntities create() {
        return new CreateTaxonomyItemNodeEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTaxonomyItemNodeEntities update() {
        return new UpdateTaxonomyItemNodeEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TaxonomyItemNodeEntities object(An object that represent one TaxonomyItemNodeEntity )
    */
    public class TaxonomyItemNodeEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TaxonomyItemNodeEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTaxonomyItemNodeEntity object with specific entity
        *
* @return The GetTaxonomyItemNodeEntity object
*/
public GetTaxonomyItemNodeEntity get() {
return new GetTaxonomyItemNodeEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTaxonomyItemNodeEntity object with specific entity
        *
* @return The UpdateTaxonomyItemNodeEntity object
*/
public UpdateTaxonomyItemNodeEntity update() {
return new UpdateTaxonomyItemNodeEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTaxonomyItemNodeEntities extends GetTypedEntities
<TaxonomyItemNodeEntityModel
    , GetTaxonomyItemNodeEntities    , AvailableFields, SortableFields> {
    GetTaxonomyItemNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyItemNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_item_nodes");
    }
    }

        public final class GetTaxonomyItemNodeEntity extends GetTypedEntity
<TaxonomyItemNodeEntityModel
    , GetTaxonomyItemNodeEntity    , AvailableFields> {
    GetTaxonomyItemNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyItemNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_item_nodes", entityId);
    }
    }

                public final class CreateTaxonomyItemNodeEntities extends CreateTypedEntities
<TaxonomyItemNodeEntityModel
    , CreateTaxonomyItemNodeEntities    > {
    CreateTaxonomyItemNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyItemNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_item_nodes");
    }
    }

                public final class UpdateTaxonomyItemNodeEntities extends UpdateTypedEntities
<TaxonomyItemNodeEntityModel
    , UpdateTaxonomyItemNodeEntities    > {
    UpdateTaxonomyItemNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyItemNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_item_nodes");
    }
    }

        public final class UpdateTaxonomyItemNodeEntity extends UpdateTypedEntity
<TaxonomyItemNodeEntityModel
    , UpdateTaxonomyItemNodeEntity    > {
    UpdateTaxonomyItemNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyItemNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_item_nodes", entityId);
    }
    }

        }
