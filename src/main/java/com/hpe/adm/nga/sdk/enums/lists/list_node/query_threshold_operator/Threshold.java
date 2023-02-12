package com.hpe.adm.nga.sdk.enums.lists.list_node.query_threshold_operator;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Threshold {

            GREATER_THAN("list_node.query_threshold_operator.greater_than")        , LESS_THAN("list_node.query_threshold_operator.less_than")        , EQUALS("list_node.query_threshold_operator.equals")        , NOT_EQUALS("list_node.query_threshold_operator.not_equals")    ;

    public static final String ROOT_ID = "list_node.query_threshold_operator";

    private final String id;

    Threshold(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Threshold getListNodeFromId(String id) {
        return Arrays.stream(Threshold.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Threshold getFromEntityModel(final EntityModel entityModel) {
        return Threshold.getListNodeFromId(entityModel.getId());
    }
}
