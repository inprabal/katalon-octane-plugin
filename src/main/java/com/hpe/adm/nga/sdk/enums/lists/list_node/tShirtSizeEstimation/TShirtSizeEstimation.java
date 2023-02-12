package com.hpe.adm.nga.sdk.enums.lists.list_node.tShirtSizeEstimation;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum TShirtSizeEstimation {

            XS("list_node.tShirtSizeEstimation.xs")        , S("list_node.tShirtSizeEstimation.s")        , M("list_node.tShirtSizeEstimation.m")        , L("list_node.tShirtSizeEstimation.l")        , XL("list_node.tShirtSizeEstimation.xl")    ;

    public static final String ROOT_ID = "list_node.tShirtSizeEstimation";

    private final String id;

    TShirtSizeEstimation(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static TShirtSizeEstimation getListNodeFromId(String id) {
        return Arrays.stream(TShirtSizeEstimation.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static TShirtSizeEstimation getFromEntityModel(final EntityModel entityModel) {
        return TShirtSizeEstimation.getListNodeFromId(entityModel.getId());
    }
}
