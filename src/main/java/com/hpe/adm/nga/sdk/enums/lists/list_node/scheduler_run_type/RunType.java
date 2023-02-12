package com.hpe.adm.nga.sdk.enums.lists.list_node.scheduler_run_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum RunType {

            ONCE("list_node.scheduler_run_type.once")        , RECURRING("list_node.scheduler_run_type.reoccurring")    ;

    public static final String ROOT_ID = "list_node.scheduler_run_type";

    private final String id;

    RunType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static RunType getListNodeFromId(String id) {
        return Arrays.stream(RunType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static RunType getFromEntityModel(final EntityModel entityModel) {
        return RunType.getListNodeFromId(entityModel.getId());
    }
}
