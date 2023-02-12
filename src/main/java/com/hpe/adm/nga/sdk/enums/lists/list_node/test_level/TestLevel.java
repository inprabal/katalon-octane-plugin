package com.hpe.adm.nga.sdk.enums.lists.list_node.test_level;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum TestLevel {

            INTEGRATION_TEST("list_node.test_level.integration")        , SYSTEM_TEST("list_node.test_level.system")        , UNIT_TEST("list_node.test_level.unit")    ;

    public static final String ROOT_ID = "list_node.test_level";

    private final String id;

    TestLevel(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static TestLevel getListNodeFromId(String id) {
        return Arrays.stream(TestLevel.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static TestLevel getFromEntityModel(final EntityModel entityModel) {
        return TestLevel.getListNodeFromId(entityModel.getId());
    }
}
