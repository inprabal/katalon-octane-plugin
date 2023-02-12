package com.hpe.adm.nga.sdk.enums.lists.list_node.quality_gate_status;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum QualityGateStatus {

            PASSED("list_node.quality_gate_status.passed")        , FAILED("list_node.quality_gate_status.failed")        , NOT_EVALUATED("list_node.quality_gate_status.not_evaluated")    ;

    public static final String ROOT_ID = "list_node.quality_gate_status";

    private final String id;

    QualityGateStatus(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static QualityGateStatus getListNodeFromId(String id) {
        return Arrays.stream(QualityGateStatus.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static QualityGateStatus getFromEntityModel(final EntityModel entityModel) {
        return QualityGateStatus.getListNodeFromId(entityModel.getId());
    }
}
