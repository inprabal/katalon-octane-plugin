package com.hpe.adm.nga.sdk.enums.lists.list_node.vulnerabilities_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum VulnerabilitiesStatus {

            SUCCESS("list_node.vulnerabilities_status.success")        , PARTIAL("list_node.vulnerabilities_status.partial")        , FAIL("list_node.vulnerabilities_status.fail")        , FAIL___EXCEED_INJECTION_LIMIT("list_node.vulnerabilities_status.fail_exceed_limit")    ;

    public static final String ROOT_ID = "list_node.vulnerabilities_status";

    private final String id;

    VulnerabilitiesStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static VulnerabilitiesStatus getListNodeFromId(String id) {
        return Arrays.stream(VulnerabilitiesStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static VulnerabilitiesStatus getFromEntityModel(final EntityModel entityModel) {
        return VulnerabilitiesStatus.getListNodeFromId(entityModel.getId());
    }
}
