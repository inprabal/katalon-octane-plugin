package com.hpe.adm.nga.sdk.enums.lists.list_node.test_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum TestType {

            ACCEPTANCE("list_node.test_type.acceptance")        , END_TO_END("list_node.test_type.end_to_end")        , REGRESSION("list_node.test_type.regression")        , SANITY("list_node.test_type.sanity")        , SECURITY("list_node.test_type.security")        , PERFORMANCE("list_node.test_type.performance")        , UI("list_node.test_type.gui")        , API("list_node.test_type.api")    ;

    public static final String ROOT_ID = "list_node.test_type";

    private final String id;

    TestType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static TestType getListNodeFromId(String id) {
        return Arrays.stream(TestType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static TestType getFromEntityModel(final EntityModel entityModel) {
        return TestType.getListNodeFromId(entityModel.getId());
    }
}
