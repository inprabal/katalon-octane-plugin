package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ApplicationModuleEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ApplicationModuleEntityList extends TypedEntityList {

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
    public ApplicationModuleEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ApplicationModuleEntities at(String entityId) {
        return new ApplicationModuleEntities(entityId);
    }


            public GetApplicationModuleEntities get() {
        return new GetApplicationModuleEntities(octaneHttpClient, baseDomain);
    }

                public CreateApplicationModuleEntities create() {
        return new CreateApplicationModuleEntities(octaneHttpClient, baseDomain);
    }

                public UpdateApplicationModuleEntities update() {
        return new UpdateApplicationModuleEntities(octaneHttpClient, baseDomain);
    }

                public DeleteApplicationModuleEntities delete() {
        return new DeleteApplicationModuleEntities(octaneHttpClient, baseDomain);
    }

    
    /**
    * This class hold the ApplicationModuleEntities object(An object that represent one ApplicationModuleEntity )
    */
    public class ApplicationModuleEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ApplicationModuleEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetApplicationModuleEntity object with specific entity
        *
* @return The GetApplicationModuleEntity object
*/
public GetApplicationModuleEntity get() {
return new GetApplicationModuleEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateApplicationModuleEntity object with specific entity
        *
* @return The UpdateApplicationModuleEntity object
*/
public UpdateApplicationModuleEntity update() {
return new UpdateApplicationModuleEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a DeleteApplicationModuleEntity object with specific entity
        *
* @return The DeleteApplicationModuleEntity object
*/
public DeleteApplicationModuleEntity delete() {
return new DeleteApplicationModuleEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetApplicationModuleEntities extends GetTypedEntities
<ApplicationModuleEntityModel
    , GetApplicationModuleEntities    , AvailableFields, SortableFields> {
    GetApplicationModuleEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules");
    }
    }

        public final class GetApplicationModuleEntity extends GetTypedEntity
<ApplicationModuleEntityModel
    , GetApplicationModuleEntity    , AvailableFields> {
    GetApplicationModuleEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules", entityId);
    }
    }

                public final class CreateApplicationModuleEntities extends CreateTypedEntities
<ApplicationModuleEntityModel
    , CreateApplicationModuleEntities    > {
    CreateApplicationModuleEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules");
    }
    }

                public final class UpdateApplicationModuleEntities extends UpdateTypedEntities
<ApplicationModuleEntityModel
    , UpdateApplicationModuleEntities    > {
    UpdateApplicationModuleEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules");
    }
    }

        public final class UpdateApplicationModuleEntity extends UpdateTypedEntity
<ApplicationModuleEntityModel
    , UpdateApplicationModuleEntity    > {
    UpdateApplicationModuleEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules", entityId);
    }
    }

                public final class DeleteApplicationModuleEntities extends DeleteTypedEntities
<ApplicationModuleEntityModel
    , DeleteApplicationModuleEntities    > {
    DeleteApplicationModuleEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules");
    }
    }

        public final class DeleteApplicationModuleEntity extends DeleteTypedEntity
<ApplicationModuleEntityModel
        > {
    DeleteApplicationModuleEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ApplicationModuleEntityModel.class, octaneHttpClient, baseDomain + "application_modules", entityId);
    }
    }

    }
