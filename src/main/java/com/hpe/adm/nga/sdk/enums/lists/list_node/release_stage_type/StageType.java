package com.hpe.adm.nga.sdk.enums.lists.list_node.release_stage_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum StageType {

            PLAN("list_node.release_stage_type.plan")        , DEV("list_node.release_stage_type.dev")        , TEST("list_node.release_stage_type.test")        , DEPLOY("list_node.release_stage_type.deploy")    ;

    public static final String ROOT_ID = "list_node.release_stage_type";

    private final String id;

    StageType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static StageType getListNodeFromId(String id) {
        return Arrays.stream(StageType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static StageType getFromEntityModel(final EntityModel entityModel) {
        return StageType.getListNodeFromId(entityModel.getId());
    }
}
