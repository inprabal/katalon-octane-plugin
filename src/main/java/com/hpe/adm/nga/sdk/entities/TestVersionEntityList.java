package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.TestVersionEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class TestVersionEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CREATOR("creator")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , TEST("test")
                    , VERSIONSTAMP("version_stamp")
                    , ISEXTERNAL("is_external")
                    , SCRIPT("script")
                    , RELEASES("releases")
                    , NAME("name")
                    , COMMENT("comment")
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
                    , CREATOR("creator")
                    , VERSIONSTAMP("version_stamp")
                    , ISEXTERNAL("is_external")
                    , NAME("name")
                    , COMMENT("comment")
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
    public TestVersionEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public TestVersionEntities at(String entityId) {
        return new TestVersionEntities(entityId);
    }


            public GetTestVersionEntities get() {
        return new GetTestVersionEntities(octaneHttpClient, baseDomain);
    }

                    public UpdateTestVersionEntities update() {
        return new UpdateTestVersionEntities(octaneHttpClient, baseDomain);
    }

        
    /**
    * This class hold the TestVersionEntities object(An object that represent one TestVersionEntity )
    */
    public class TestVersionEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        TestVersionEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetTestVersionEntity object with specific entity
        *
* @return The GetTestVersionEntity object
*/
public GetTestVersionEntity get() {
return new GetTestVersionEntity(octaneHttpClient, baseDomain, entityId);
}

            /**
        * getter of a UpdateTestVersionEntity object with specific entity
        *
* @return The UpdateTestVersionEntity object
*/
public UpdateTestVersionEntity update() {
return new UpdateTestVersionEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetTestVersionEntities extends GetTypedEntities
<TestVersionEntityModel
    , GetTestVersionEntities    , AvailableFields, SortableFields> {
    GetTestVersionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestVersionEntityModel.class, octaneHttpClient, baseDomain + "test_versions");
    }
    }

        public final class GetTestVersionEntity extends GetTypedEntity
<TestVersionEntityModel
    , GetTestVersionEntity    , AvailableFields> {
    GetTestVersionEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestVersionEntityModel.class, octaneHttpClient, baseDomain + "test_versions", entityId);
    }
    }

                    public final class UpdateTestVersionEntities extends UpdateTypedEntities
<TestVersionEntityModel
    , UpdateTestVersionEntities    > {
    UpdateTestVersionEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(TestVersionEntityModel.class, octaneHttpClient, baseDomain + "test_versions");
    }
    }

        public final class UpdateTestVersionEntity extends UpdateTypedEntity
<TestVersionEntityModel
    , UpdateTestVersionEntity    > {
    UpdateTestVersionEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(TestVersionEntityModel.class, octaneHttpClient, baseDomain + "test_versions", entityId);
    }
    }

        }
