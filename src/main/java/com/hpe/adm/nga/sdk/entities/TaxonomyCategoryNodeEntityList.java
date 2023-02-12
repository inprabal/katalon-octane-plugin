package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TaxonomyCategoryNodeEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TaxonomyCategoryNodeEntityList extends TypedEntityList {

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
    public TaxonomyCategoryNodeEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TaxonomyCategoryNodeEntities at(String entityId) {
        return new TaxonomyCategoryNodeEntities(entityId);
    }


            public GetTaxonomyCategoryNodeEntities get() {
        return new GetTaxonomyCategoryNodeEntities(octaneHttpClient, baseDomain);
    }

                public CreateTaxonomyCategoryNodeEntities create() {
        return new CreateTaxonomyCategoryNodeEntities(octaneHttpClient, baseDomain);
    }

                public UpdateTaxonomyCategoryNodeEntities update() {
        return new UpdateTaxonomyCategoryNodeEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TaxonomyCategoryNodeEntities object(An object that represent one TaxonomyCategoryNodeEntity )
    */
    public class TaxonomyCategoryNodeEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TaxonomyCategoryNodeEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTaxonomyCategoryNodeEntity object with specific entity
        *
* @return The GetTaxonomyCategoryNodeEntity object
*/
public GetTaxonomyCategoryNodeEntity get() {
return new GetTaxonomyCategoryNodeEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTaxonomyCategoryNodeEntity object with specific entity
        *
* @return The UpdateTaxonomyCategoryNodeEntity object
*/
public UpdateTaxonomyCategoryNodeEntity update() {
return new UpdateTaxonomyCategoryNodeEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTaxonomyCategoryNodeEntities extends GetTypedEntities
<TaxonomyCategoryNodeEntityModel
    , GetTaxonomyCategoryNodeEntities    , AvailableFields, SortableFields> {
    GetTaxonomyCategoryNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyCategoryNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_category_nodes");
    }
    }

        public final class GetTaxonomyCategoryNodeEntity extends GetTypedEntity
<TaxonomyCategoryNodeEntityModel
    , GetTaxonomyCategoryNodeEntity    , AvailableFields> {
    GetTaxonomyCategoryNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyCategoryNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_category_nodes", entityId);
    }
    }

                public final class CreateTaxonomyCategoryNodeEntities extends CreateTypedEntities
<TaxonomyCategoryNodeEntityModel
    , CreateTaxonomyCategoryNodeEntities    > {
    CreateTaxonomyCategoryNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyCategoryNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_category_nodes");
    }
    }

                public final class UpdateTaxonomyCategoryNodeEntities extends UpdateTypedEntities
<TaxonomyCategoryNodeEntityModel
    , UpdateTaxonomyCategoryNodeEntities    > {
    UpdateTaxonomyCategoryNodeEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TaxonomyCategoryNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_category_nodes");
    }
    }

        public final class UpdateTaxonomyCategoryNodeEntity extends UpdateTypedEntity
<TaxonomyCategoryNodeEntityModel
    , UpdateTaxonomyCategoryNodeEntity    > {
    UpdateTaxonomyCategoryNodeEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TaxonomyCategoryNodeEntityModel.class, octaneHttpClient, baseDomain + "taxonomy_category_nodes", entityId);
    }
    }

        }
