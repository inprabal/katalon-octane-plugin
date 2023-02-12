package com.hpe.adm.nga.sdk.enums.lists.list_node.run_mode;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum RunMode {

            MANUALLY("list_node.run_mode.manually")        , AUTOMATICALLY("list_node.run_mode.automatically")    ;

    public static final String ROOT_ID = "list_node.run_mode";

    private final String id;

    RunMode(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static RunMode getListNodeFromId(String id) {
        return Arrays.stream(RunMode.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static RunMode getFromEntityModel(final EntityModel entityModel) {
        return RunMode.getListNodeFromId(entityModel.getId());
    }
}
