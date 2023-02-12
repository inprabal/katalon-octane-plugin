package com.hpe.adm.nga.sdk.enums.lists.list_node.defect_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum DefectType {

            PRE_RELEASE("list_node.defect_type.PreRelease")        , ESCAPED("list_node.defect_type.Escaped")    ;

    public static final String ROOT_ID = "list_node.defect_type";

    private final String id;

    DefectType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static DefectType getListNodeFromId(String id) {
        return Arrays.stream(DefectType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static DefectType getFromEntityModel(final EntityModel entityModel) {
        return DefectType.getListNodeFromId(entityModel.getId());
    }
}
