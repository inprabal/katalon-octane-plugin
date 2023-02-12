package com.hpe.adm.nga.sdk.enums.lists.list_node.run_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum RunStatus {

            PASSED("list_node.run_status.passed")        , FAILED("list_node.run_status.failed")        , SKIPPED("list_node.run_status.skipped")        , REQUIRES_ATTENTION("list_node.run_status.requires_attention")        , PLANNED("list_node.run_status.planned")    ;

    public static final String ROOT_ID = "list_node.run_status";

    private final String id;

    RunStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static RunStatus getListNodeFromId(String id) {
        return Arrays.stream(RunStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static RunStatus getFromEntityModel(final EntityModel entityModel) {
        return RunStatus.getListNodeFromId(entityModel.getId());
    }
}
