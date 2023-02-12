package com.hpe.adm.nga.sdk.enums.lists.list_node.task_item_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum TaskItemType {

            RESEARCH("list_node.task_item_type.research")        , DEVELOP("list_node.task_item_type.develop")        , DOCUMENT("list_node.task_item_type.document")        , TEST("list_node.task_item_type.test")    ;

    public static final String ROOT_ID = "list_node.task_item_type";

    private final String id;

    TaskItemType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static TaskItemType getListNodeFromId(String id) {
        return Arrays.stream(TaskItemType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static TaskItemType getFromEntityModel(final EntityModel entityModel) {
        return TaskItemType.getListNodeFromId(entityModel.getId());
    }
}
