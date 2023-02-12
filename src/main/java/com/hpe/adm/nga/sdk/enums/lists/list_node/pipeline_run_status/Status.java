package com.hpe.adm.nga.sdk.enums.lists.list_node.pipeline_run_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Status {

            SUCCESS("list_node.pipeline_run_status.success")        , FAILURE("list_node.pipeline_run_status.failure")        , UNSTABLE("list_node.pipeline_run_status.unstable")        , RUNNING("list_node.pipeline_run_status.running")        , ABORTED("list_node.pipeline_run_status.aborted")        , QUEUED("list_node.pipeline_run_status.queued")        , UNAVAILABLE("list_node.pipeline_run_status.unavailable")    ;

    public static final String ROOT_ID = "list_node.pipeline_run_status";

    private final String id;

    Status(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Status getListNodeFromId(String id) {
        return Arrays.stream(Status.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Status getFromEntityModel(final EntityModel entityModel) {
        return Status.getListNodeFromId(entityModel.getId());
    }
}
