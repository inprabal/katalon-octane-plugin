package com.hpe.adm.nga.sdk.enums.lists.list_node.je.status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum ExecutionStatus {

            INITIALIZE("list_node.je.status.initialize")        , STARTED("list_node.je.status.started")        , FINISHED("list_node.je.status.finished")        , ABORTED("list_node.je.status.aborted")        , FAILED("list_node.je.status.failed")    ;

    public static final String ROOT_ID = "list_node.je.status";

    private final String id;

    ExecutionStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static ExecutionStatus getListNodeFromId(String id) {
        return Arrays.stream(ExecutionStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static ExecutionStatus getFromEntityModel(final EntityModel entityModel) {
        return ExecutionStatus.getListNodeFromId(entityModel.getId());
    }
}
