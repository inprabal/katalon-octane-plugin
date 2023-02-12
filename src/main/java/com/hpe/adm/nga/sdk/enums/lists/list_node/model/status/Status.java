package com.hpe.adm.nga.sdk.enums.lists.list_node.model.status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Status {

            NOT_STARTED("list_node.model.status.notstarted")        , IN_PROGRESS("list_node.model.status.inprogress")        , READY("list_node.model.status.ready")    ;

    public static final String ROOT_ID = "list_node.model.status";

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
