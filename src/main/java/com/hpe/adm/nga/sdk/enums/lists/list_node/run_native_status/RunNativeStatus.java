package com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum RunNativeStatus {

            PASSED("list_node.run_native_status.passed")        , FAILED("list_node.run_native_status.failed")        , BLOCKED("list_node.run_native_status.blocked")        , SKIPPED("list_node.run_native_status.skipped")        , IN_PROGRESS("list_node.run_native_status.not_completed")        , PLANNED("list_node.run_native_status.planned")    ;

    public static final String ROOT_ID = "list_node.run_native_status";

    private final String id;

    RunNativeStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static RunNativeStatus getListNodeFromId(String id) {
        return Arrays.stream(RunNativeStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static RunNativeStatus getFromEntityModel(final EntityModel entityModel) {
        return RunNativeStatus.getListNodeFromId(entityModel.getId());
    }
}
