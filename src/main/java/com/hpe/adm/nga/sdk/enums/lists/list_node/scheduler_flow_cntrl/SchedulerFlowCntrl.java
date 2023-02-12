package com.hpe.adm.nga.sdk.enums.lists.list_node.scheduler_flow_cntrl;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum SchedulerFlowCntrl {

            PARALLEL("list_node.scheduler_flow_cntrl.parallel")        , INDEX_BASED("list_node.scheduler_flow_cntrl.serial")    ;

    public static final String ROOT_ID = "list_node.scheduler_flow_cntrl";

    private final String id;

    SchedulerFlowCntrl(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static SchedulerFlowCntrl getListNodeFromId(String id) {
        return Arrays.stream(SchedulerFlowCntrl.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static SchedulerFlowCntrl getFromEntityModel(final EntityModel entityModel) {
        return SchedulerFlowCntrl.getListNodeFromId(entityModel.getId());
    }
}
