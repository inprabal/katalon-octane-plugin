package com.hpe.adm.nga.sdk.enums.lists.list_node.priority;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Priority {

            LOW("list_node.priority.low")        , MEDIUM("list_node.priority.medium")        , HIGH("list_node.priority.high")        , VERY_HIGH("list_node.priority.very_high")        , URGENT("list_node.priority.urgent")    ;

    public static final String ROOT_ID = "list_node.priority";

    private final String id;

    Priority(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Priority getListNodeFromId(String id) {
        return Arrays.stream(Priority.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Priority getFromEntityModel(final EntityModel entityModel) {
        return Priority.getListNodeFromId(entityModel.getId());
    }
}
