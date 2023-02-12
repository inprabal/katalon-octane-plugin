package com.hpe.adm.nga.sdk.enums.lists.list_node.visible_to_roles;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum VisibleToRoles {

            CUSTOMER("list_node.visible_to_roles.customer")        , SUPPORT("list_node.visible_to_roles.support")        , RND("list_node.visible_to_roles.rnd")    ;

    public static final String ROOT_ID = "list_node.visible_to_roles";

    private final String id;

    VisibleToRoles(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static VisibleToRoles getListNodeFromId(String id) {
        return Arrays.stream(VisibleToRoles.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static VisibleToRoles getFromEntityModel(final EntityModel entityModel) {
        return VisibleToRoles.getListNodeFromId(entityModel.getId());
    }
}
