package com.hpe.adm.nga.sdk.enums.lists.list_node.user_criterion_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum CriterionStatus {

            PASSED("list_node.user_criterion_status.passed")        , FAILED("list_node.user_criterion_status.failed")        , NOT_PROCESSED("list_node.user_criterion_status.not_processed")    ;

    public static final String ROOT_ID = "list_node.user_criterion_status";

    private final String id;

    CriterionStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static CriterionStatus getListNodeFromId(String id) {
        return Arrays.stream(CriterionStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static CriterionStatus getFromEntityModel(final EntityModel entityModel) {
        return CriterionStatus.getListNodeFromId(entityModel.getId());
    }
}
