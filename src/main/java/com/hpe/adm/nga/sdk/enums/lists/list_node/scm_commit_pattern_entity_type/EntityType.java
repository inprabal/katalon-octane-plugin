package com.hpe.adm.nga.sdk.enums.lists.list_node.scm_commit_pattern_entity_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum EntityType {

            DEFECT("list_node.scm_commit_pattern_entity_type.defect")        , USER_STORY("list_node.scm_commit_pattern_entity_type.user_story")        , QUALITY_STORY("list_node.scm_commit_pattern_entity_type.quality_story")        , FEATURE("list_node.scm_commit_pattern_entity_type.feature")    ;

    public static final String ROOT_ID = "list_node.scm_commit_pattern_entity_type";

    private final String id;

    EntityType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static EntityType getListNodeFromId(String id) {
        return Arrays.stream(EntityType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static EntityType getFromEntityModel(final EntityModel entityModel) {
        return EntityType.getListNodeFromId(entityModel.getId());
    }
}
