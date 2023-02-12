package com.hpe.adm.nga.sdk.enums.lists.list_node.epic_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum EpicType {

            ARCHITECTURE("list_node.epic_type.Architecture")        , BUSINESS("list_node.epic_type.Business")    ;

    public static final String ROOT_ID = "list_node.epic_type";

    private final String id;

    EpicType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static EpicType getListNodeFromId(String id) {
        return Arrays.stream(EpicType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static EpicType getFromEntityModel(final EntityModel entityModel) {
        return EpicType.getListNodeFromId(entityModel.getId());
    }
}
