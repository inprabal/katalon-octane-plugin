package com.hpe.adm.nga.sdk.enums.lists.list_node.manual_test_run_step_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum ManualTestRunStepType {

            VALIDATE("list_node.manual_test_run_step_type.validate")        , NORMAL("list_node.manual_test_run_step_type.normal")        , FEATURE("list_node.manual_test_run_step_type.feature")        , SCENARIO("list_node.manual_test_run_step_type.scenario")        , ITERATION("list_node.manual_test_run_step_type.iteration")    ;

    public static final String ROOT_ID = "list_node.manual_test_run_step_type";

    private final String id;

    ManualTestRunStepType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static ManualTestRunStepType getListNodeFromId(String id) {
        return Arrays.stream(ManualTestRunStepType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static ManualTestRunStepType getFromEntityModel(final EntityModel entityModel) {
        return ManualTestRunStepType.getListNodeFromId(entityModel.getId());
    }
}
