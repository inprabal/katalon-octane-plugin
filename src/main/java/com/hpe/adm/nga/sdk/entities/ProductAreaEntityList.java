package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ProductAreaEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ProductAreaEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , PARENT("parent")
                    , ATTACHMENTS("attachments")
                    , VERSIONSTAMP("version_stamp")
                    , DESCRIPTION("description")
                    , PROGRAM("program")
                    , CHILDREN("children")
                    , LASTMODIFIED("last_modified")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , HASATTACHMENTS("has_attachments")
                    , HASCHILDREN("has_children")
                    , AUTHOR("author")
                    , BUSINESSIMPACT("business_impact")
                    , NAME("name")
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
                    , VERSIONSTAMP("version_stamp")
                    , PROGRAM("program")
                    , LASTMODIFIED("last_modified")
                    , AUTHOR("author")
                    , BUSINESSIMPACT("business_impact")
                    , NAME("name")
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
    public ProductAreaEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ProductAreaEntities at(String entityId) {
        return new ProductAreaEntities(entityId);
    }


            public GetProductAreaEntities get() {
        return new GetProductAreaEntities(octaneHttpClient, baseDomain);
    }

                public CreateProductAreaEntities create() {
        return new CreateProductAreaEntities(octaneHttpClient, baseDomain);
    }

                public UpdateProductAreaEntities update() {
        return new UpdateProductAreaEntities(octaneHttpClient, baseDomain);
    }

                public DeleteProductAreaEntities delete() {
        return new DeleteProductAreaEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the ProductAreaEntities object(An object that represent one ProductAreaEntity )
    */
    public class ProductAreaEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ProductAreaEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetProductAreaEntity object with specific entity
        *
* @return The GetProductAreaEntity object
*/
public GetProductAreaEntity get() {
return new GetProductAreaEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateProductAreaEntity object with specific entity
        *
* @return The UpdateProductAreaEntity object
*/
public UpdateProductAreaEntity update() {
return new UpdateProductAreaEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteProductAreaEntity object with specific entity
        *
* @return The DeleteProductAreaEntity object
*/
public DeleteProductAreaEntity delete() {
return new DeleteProductAreaEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetProductAreaEntities extends GetTypedEntities
<ProductAreaEntityModel
    , GetProductAreaEntities    , AvailableFields, SortableFields> {
    GetProductAreaEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas");
    }
    }

        public final class GetProductAreaEntity extends GetTypedEntity
<ProductAreaEntityModel
    , GetProductAreaEntity    , AvailableFields> {
    GetProductAreaEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas", entityId);
    }
    }

                public final class CreateProductAreaEntities extends CreateTypedEntities
<ProductAreaEntityModel
    , CreateProductAreaEntities    > {
    CreateProductAreaEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas");
    }
    }

                public final class UpdateProductAreaEntities extends UpdateTypedEntities
<ProductAreaEntityModel
    , UpdateProductAreaEntities    > {
    UpdateProductAreaEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas");
    }
    }

        public final class UpdateProductAreaEntity extends UpdateTypedEntity
<ProductAreaEntityModel
    , UpdateProductAreaEntity    > {
    UpdateProductAreaEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas", entityId);
    }
    }

                public final class DeleteProductAreaEntities extends DeleteTypedEntities
<ProductAreaEntityModel
    , DeleteProductAreaEntities    > {
    DeleteProductAreaEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas");
    }
    }

        public final class DeleteProductAreaEntity extends DeleteTypedEntity
<ProductAreaEntityModel
        > {
    DeleteProductAreaEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ProductAreaEntityModel.class, octaneHttpClient, baseDomain + "product_areas", entityId);
    }
    }

    }
