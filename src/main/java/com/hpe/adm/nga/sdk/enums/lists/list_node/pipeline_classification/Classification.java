package com.hpe.adm.nga.sdk.enums.lists.list_node.pipeline_classification;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Classification {

            NONE("list_node.pipeline_classification.none")        , COMPILE("list_node.pipeline_classification.compile")        , PACKAGE("list_node.pipeline_classification.package")        , DEPLOY("list_node.pipeline_classification.deploy")        , TEST("list_node.pipeline_classification.test")        , SECURITY("list_node.pipeline_classification.security")    ;

    public static final String ROOT_ID = "list_node.pipeline_classification";

    private final String id;

    Classification(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Classification getListNodeFromId(String id) {
        return Arrays.stream(Classification.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Classification getFromEntityModel(final EntityModel entityModel) {
        return Classification.getListNodeFromId(entityModel.getId());
    }
}
