package com.hpe.adm.nga.sdk.enums.lists.list_node.scheduler_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum SchedulerStatus {

            ACTIVE("list_node.scheduler_status.active")        , INACTIVE("list_node.scheduler_status.inactive")        , COMPLETED("list_node.scheduler_status.completed")    ;

    public static final String ROOT_ID = "list_node.scheduler_status";

    private final String id;

    SchedulerStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static SchedulerStatus getListNodeFromId(String id) {
        return Arrays.stream(SchedulerStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static SchedulerStatus getFromEntityModel(final EntityModel entityModel) {
        return SchedulerStatus.getListNodeFromId(entityModel.getId());
    }
}
