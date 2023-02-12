package com.hpe.adm.nga.sdk.entities;

import com.hpe.adm.nga.sdk.entities.create.CreateTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntities;
import com.hpe.adm.nga.sdk.entities.delete.DeleteTypedEntity;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntities;
import com.hpe.adm.nga.sdk.entities.get.GetTypedEntity;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntities;
import com.hpe.adm.nga.sdk.entities.update.UpdateTypedEntity;
import com.hpe.adm.nga.sdk.model.ScmCommitEntityModel;
import com.hpe.adm.nga.sdk.network.OctaneHttpClient;

/**
* Generated file.  Do not edit!
*/
public final class ScmCommitEntityList extends TypedEntityList {

    private final OctaneHttpClient octaneHttpClient;
    private final String baseDomain;

    public enum AvailableFields implements TypedEntityList.AvailableFields {
                    CREATIONTIME("creation_time")
                    , CLIENTLOCKSTAMP("client_lock_stamp")
                    , VERSIONSTAMP("version_stamp")
                    , CIBUILD("ci_build")
                    , HASCOVERAGE("has_coverage")
                    , NAME("name")
                    , RISK("risk")
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
                    , HASCOVERAGE("has_coverage")
                    , NAME("name")
                    , RISK("risk")
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
    public ScmCommitEntityList(final OctaneHttpClient octaneHttpClient, final String baseDomain) {
        this.octaneHttpClient = octaneHttpClient;
        this.baseDomain = baseDomain;
    }

    public ScmCommitEntities at(String entityId) {
        return new ScmCommitEntities(entityId);
    }


            public GetScmCommitEntities get() {
        return new GetScmCommitEntities(octaneHttpClient, baseDomain);
    }

                
    /**
    * This class hold the ScmCommitEntities object(An object that represent one ScmCommitEntity )
    */
    public class ScmCommitEntities {

        private final String entityId;

        /**
        * Set entityId parameter
        *
        * @param entityId The entity id
        */
        ScmCommitEntities(String entityId) {
            this.entityId = entityId;
        }


            /**
        * getter of a GetScmCommitEntity object with specific entity
        *
* @return The GetScmCommitEntity object
*/
public GetScmCommitEntity get() {
return new GetScmCommitEntity(octaneHttpClient, baseDomain, entityId);
}

}


            public final class GetScmCommitEntities extends GetTypedEntities
<ScmCommitEntityModel
    , GetScmCommitEntities    , AvailableFields, SortableFields> {
    GetScmCommitEntities(final OctaneHttpClient octaneHttpClient, final String
    baseDomain) {
    super(ScmCommitEntityModel.class, octaneHttpClient, baseDomain + "scm_commits");
    }
    }

        public final class GetScmCommitEntity extends GetTypedEntity
<ScmCommitEntityModel
    , GetScmCommitEntity    , AvailableFields> {
    GetScmCommitEntity(final OctaneHttpClient octaneHttpClient, final String
    baseDomain, final String entityId) {
    super(ScmCommitEntityModel.class, octaneHttpClient, baseDomain + "scm_commits", entityId);
    }
    }

                }
