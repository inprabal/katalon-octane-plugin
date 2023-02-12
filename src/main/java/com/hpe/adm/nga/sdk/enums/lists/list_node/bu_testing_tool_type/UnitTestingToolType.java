package com.hpe.adm.nga.sdk.enums.lists.list_node.bu_testing_tool_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum UnitTestingToolType {

            UFT_ONE("list_node.bu_testing_tool_type.uft")        , CODELESS("list_node.bu_testing_tool_type.codeless")    ;

    public static final String ROOT_ID = "list_node.bu_testing_tool_type";

    private final String id;

    UnitTestingToolType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static UnitTestingToolType getListNodeFromId(String id) {
        return Arrays.stream(UnitTestingToolType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static UnitTestingToolType getFromEntityModel(final EntityModel entityModel) {
        return UnitTestingToolType.getListNodeFromId(entityModel.getId());
    }
}
