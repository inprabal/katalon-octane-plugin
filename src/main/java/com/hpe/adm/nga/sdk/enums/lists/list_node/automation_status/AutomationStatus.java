package com.hpe.adm.nga.sdk.enums.lists.list_node.automation_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum AutomationStatus {

            NOT_AUTOMATED("list_node.automation_status.not_automated")        , READY_FOR_AUTOMATION("list_node.automation_status.ready_for_automation")        , AUTOMATED("list_node.automation_status.automated")        , REQUIRES_UPDATE("list_node.automation_status.requires_update")        , REQUIRES_APPROVAL("list_node.automation_status.requires_approval")    ;

    public static final String ROOT_ID = "list_node.automation_status";

    private final String id;

    AutomationStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static AutomationStatus getListNodeFromId(String id) {
        return Arrays.stream(AutomationStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static AutomationStatus getFromEntityModel(final EntityModel entityModel) {
        return AutomationStatus.getListNodeFromId(entityModel.getId());
    }
}
