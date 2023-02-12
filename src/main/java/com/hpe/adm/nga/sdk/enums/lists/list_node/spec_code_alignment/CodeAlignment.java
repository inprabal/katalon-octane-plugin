package com.hpe.adm.nga.sdk.enums.lists.list_node.spec_code_alignment;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum CodeAlignment {

            N_A("list_node.spec_code_alignment.na")        , ALIGNED("list_node.spec_code_alignment.aligned")        , APPROVE_EXTERNAL_UPDATES("list_node.spec_code_alignment.approve_external_updates")        , UPDATE_EXTERNAL_CODE("list_node.spec_code_alignment.update_external_code")    ;

    public static final String ROOT_ID = "list_node.spec_code_alignment";

    private final String id;

    CodeAlignment(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static CodeAlignment getListNodeFromId(String id) {
        return Arrays.stream(CodeAlignment.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static CodeAlignment getFromEntityModel(final EntityModel entityModel) {
        return CodeAlignment.getListNodeFromId(entityModel.getId());
    }
}
