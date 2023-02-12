package com.hpe.adm.nga.sdk.enums.lists.list_node.epic_level;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum EpicLevel {

            PORTFOLIO_EPIC("list_node.epic_level.portfolio")        , LOCAL("list_node.epic_level.local")    ;

    public static final String ROOT_ID = "list_node.epic_level";

    private final String id;

    EpicLevel(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static EpicLevel getListNodeFromId(String id) {
        return Arrays.stream(EpicLevel.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static EpicLevel getFromEntityModel(final EntityModel entityModel) {
        return EpicLevel.getListNodeFromId(entityModel.getId());
    }
}
