package com.hpe.adm.nga.sdk.enums.lists.list_node.testing_tool_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum TestingToolType {

            MANUAL_RUNNER("list_node.testing_tool_type.manual")        , SELENIUM("list_node.testing_tool_type.selenium")        , UFT_ONE("list_node.testing_tool_type.uft")        , UFT_DEVELOPER("list_node.testing_tool_type.leanft")        , LOADRUNNER_CLOUD("list_node.testing_tool_type.storm_runner")        , SOAPUI("list_node.testing_tool_type.soapaui")        , PROTRACTOR("list_node.testing_tool_type.protractor")        , LOADRUNNER_PROFESSIONAL("list_node.testing_tool_type.loadrunner")        , LOADRUNNER_ENTERPRISE("list_node.testing_tool_type.performance_center")        , STORMRUNNER_FUNCTIONAL("list_node.testing_tool_type.storm_runner_functional")        , UFT_MOBILE("list_node.testing_tool_type.uft_mobile")    ;

    public static final String ROOT_ID = "list_node.testing_tool_type";

    private final String id;

    TestingToolType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static TestingToolType getListNodeFromId(String id) {
        return Arrays.stream(TestingToolType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static TestingToolType getFromEntityModel(final EntityModel entityModel) {
        return TestingToolType.getListNodeFromId(entityModel.getId());
    }
}
