package com.hpe.adm.nga.sdk.enums.lists.list_node.waste_category;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum WasteCategory {

            NONE("list_node.waste_category.none")        , WAITING_TIME("list_node.waste_category.waiting_time")        , OVERPROCESSING("list_node.waste_category.overprocessing")        , REWORK("list_node.waste_category.rework")        , PARTIALLY_DONE_WORK("list_node.waste_category.partially_done_work")    ;

    public static final String ROOT_ID = "list_node.waste_category";

    private final String id;

    WasteCategory(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static WasteCategory getListNodeFromId(String id) {
        return Arrays.stream(WasteCategory.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static WasteCategory getFromEntityModel(final EntityModel entityModel) {
        return WasteCategory.getListNodeFromId(entityModel.getId());
    }
}
