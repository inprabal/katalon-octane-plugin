package com.hpe.adm.nga.sdk.enums.lists.list_node.autocomplete_category;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum AutoCompleteCategory {

            MAIN("list_node.autocomplete_category.main")    ;

    public static final String ROOT_ID = "list_node.autocomplete_category";

    private final String id;

    AutoCompleteCategory(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static AutoCompleteCategory getListNodeFromId(String id) {
        return Arrays.stream(AutoCompleteCategory.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static AutoCompleteCategory getFromEntityModel(final EntityModel entityModel) {
        return AutoCompleteCategory.getListNodeFromId(entityModel.getId());
    }
}
