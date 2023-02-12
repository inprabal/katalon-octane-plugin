package com.hpe.adm.nga.sdk.enums.lists.list_node.item_origin;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum ItemOrigin {

            SERVICE_ANYWHERE("list_node.item_origin.service_anywhere")        , ALM("list_node.item_origin.alm")        , AGM("list_node.item_origin.agm")        , JIRA("list_node.item_origin.jira")        , XL_RELEASE("list_node.item_origin.xl_release")    ;

    public static final String ROOT_ID = "list_node.item_origin";

    private final String id;

    ItemOrigin(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static ItemOrigin getListNodeFromId(String id) {
        return Arrays.stream(ItemOrigin.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static ItemOrigin getFromEntityModel(final EntityModel entityModel) {
        return ItemOrigin.getListNodeFromId(entityModel.getId());
    }
}
