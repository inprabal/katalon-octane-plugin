package com.hpe.adm.nga.sdk.enums.lists.list_node.bfc;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum BuildClassification {

            ENVIRONMENT___NETWORK("list_node.bfc.environment_network")        , ENVIRONMENT___DISK("list_node.bfc.environment_disk")        , ENVIRONMENT___PERMISSIONS("list_node.bfc.environment_permissions")        , ENVIRONMENT___DATABASE("list_node.bfc.environment_dataBase")        , ENVIRONMENT___OTHER("list_node.bfc.environment_other")        , CODE_ISSUE("list_node.bfc.code_issue")        , TEST_CODE_ISSUE("list_node.bfc.test_code_issue")        , TEST_STABILITY_ISSUE("list_node.bfc.test_stability_issue")        , NONE("list_node.bfc.no_issue")        , COMPILATION_ISSUE("list_node.bfc.compilation_issue")    ;

    public static final String ROOT_ID = "list_node.bfc";

    private final String id;

    BuildClassification(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static BuildClassification getListNodeFromId(String id) {
        return Arrays.stream(BuildClassification.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static BuildClassification getFromEntityModel(final EntityModel entityModel) {
        return BuildClassification.getListNodeFromId(entityModel.getId());
    }
}
