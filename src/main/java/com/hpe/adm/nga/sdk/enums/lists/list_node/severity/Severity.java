package com.hpe.adm.nga.sdk.enums.lists.list_node.severity;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Severity {

            LOW("list_node.severity.low")        , MEDIUM("list_node.severity.medium")        , HIGH("list_node.severity.high")        , VERY_HIGH("list_node.severity.very_high")        , CRITICAL("list_node.severity.urgent")    ;

    public static final String ROOT_ID = "list_node.severity";

    private final String id;

    Severity(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Severity getListNodeFromId(String id) {
        return Arrays.stream(Severity.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Severity getFromEntityModel(final EntityModel entityModel) {
        return Severity.getListNodeFromId(entityModel.getId());
    }
}
