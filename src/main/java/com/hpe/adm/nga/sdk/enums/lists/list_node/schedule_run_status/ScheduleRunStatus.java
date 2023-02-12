package com.hpe.adm.nga.sdk.enums.lists.list_node.schedule_run_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum ScheduleRunStatus {

            PLANNED("list_node.schedule_run_status.planned")        , IN_PROGRESS("list_node.schedule_run_status.inprogress")        , SKIPPED("list_node.schedule_run_status.skipped")        , COMPLETED("list_node.schedule_run_status.completed")    ;

    public static final String ROOT_ID = "list_node.schedule_run_status";

    private final String id;

    ScheduleRunStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static ScheduleRunStatus getListNodeFromId(String id) {
        return Arrays.stream(ScheduleRunStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static ScheduleRunStatus getFromEntityModel(final EntityModel entityModel) {
        return ScheduleRunStatus.getListNodeFromId(entityModel.getId());
    }
}
