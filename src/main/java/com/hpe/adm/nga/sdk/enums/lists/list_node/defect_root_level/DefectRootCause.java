package com.hpe.adm.nga.sdk.enums.lists.list_node.defect_root_level;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum DefectRootCause {

            DEFINITION("list_node.defect_root_level.definition")        , UX("list_node.defect_root_level.ux")        , NEW_CODE("list_node.defect_root_level.new_code")        , TESTING("list_node.defect_root_level.testing")        , REGRESSION("list_node.defect_root_level.regression")        , INTEGRATION("list_node.defect_root_level.integration")    ;

    public static final String ROOT_ID = "list_node.defect_root_level";

    private final String id;

    DefectRootCause(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static DefectRootCause getListNodeFromId(String id) {
        return Arrays.stream(DefectRootCause.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static DefectRootCause getFromEntityModel(final EntityModel entityModel) {
        return DefectRootCause.getListNodeFromId(entityModel.getId());
    }
}
