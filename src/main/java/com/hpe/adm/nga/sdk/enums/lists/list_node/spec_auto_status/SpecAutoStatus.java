package com.hpe.adm.nga.sdk.enums.lists.list_node.spec_auto_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum SpecAutoStatus {

            NOT_AUTOMATED("list_node.spec_auto_status.not_automated")        , PARTIALLY_AUTOMATED("list_node.spec_auto_status.partially_automated")        , FULLY_AUTOMATED("list_node.spec_auto_status.automated")    ;

    public static final String ROOT_ID = "list_node.spec_auto_status";

    private final String id;

    SpecAutoStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static SpecAutoStatus getListNodeFromId(String id) {
        return Arrays.stream(SpecAutoStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static SpecAutoStatus getFromEntityModel(final EntityModel entityModel) {
        return SpecAutoStatus.getListNodeFromId(entityModel.getId());
    }
}
