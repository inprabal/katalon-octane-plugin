package com.hpe.adm.nga.sdk.enums.lists.list_node.wsjf_scale_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum WSJFScale {

            $1("list_node.wsjf_scale_type.1")        , $2("list_node.wsjf_scale_type.2")        , $3("list_node.wsjf_scale_type.3")        , $5("list_node.wsjf_scale_type.5")        , $8("list_node.wsjf_scale_type.8")        , $13("list_node.wsjf_scale_type.13")        , $21("list_node.wsjf_scale_type.21")        , $40("list_node.wsjf_scale_type.40")        , $100("list_node.wsjf_scale_type.100")    ;

    public static final String ROOT_ID = "list_node.wsjf_scale_type";

    private final String id;

    WSJFScale(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static WSJFScale getListNodeFromId(String id) {
        return Arrays.stream(WSJFScale.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static WSJFScale getFromEntityModel(final EntityModel entityModel) {
        return WSJFScale.getListNodeFromId(entityModel.getId());
    }
}
