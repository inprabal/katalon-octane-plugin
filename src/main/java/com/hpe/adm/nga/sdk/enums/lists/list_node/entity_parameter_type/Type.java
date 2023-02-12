package com.hpe.adm.nga.sdk.enums.lists.list_node.entity_parameter_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Type {

            INPUT("list_node.entity_parameter_type.input")        , OUTPUT("list_node.entity_parameter_type.output")    ;

    public static final String ROOT_ID = "list_node.entity_parameter_type";

    private final String id;

    Type(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Type getListNodeFromId(String id) {
        return Arrays.stream(Type.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Type getFromEntityModel(final EntityModel entityModel) {
        return Type.getListNodeFromId(entityModel.getId());
    }
}
