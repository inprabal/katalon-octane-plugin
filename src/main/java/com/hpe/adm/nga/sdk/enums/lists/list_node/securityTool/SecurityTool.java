package com.hpe.adm.nga.sdk.enums.lists.list_node.securityTool;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum SecurityTool {

            FOD("list_node.securityTool.fod")    ;

    public static final String ROOT_ID = "list_node.securityTool";

    private final String id;

    SecurityTool(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static SecurityTool getListNodeFromId(String id) {
        return Arrays.stream(SecurityTool.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static SecurityTool getFromEntityModel(final EntityModel entityModel) {
        return SecurityTool.getListNodeFromId(entityModel.getId());
    }
}
