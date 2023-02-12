package com.hpe.adm.nga.sdk.enums.lists.list_node.pipeline_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum PipelineType {

            BUILD("list_node.pipeline_type.build")        , TEST("list_node.pipeline_type.test")        , INTEGRATION("list_node.pipeline_type.integration")        , DEPLOY("list_node.pipeline_type.deploy")        , SECURITY("list_node.pipeline_type.security")        , CUSTOM_BRANCH("list_node.pipeline_type.custom_branch")    ;

    public static final String ROOT_ID = "list_node.pipeline_type";

    private final String id;

    PipelineType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static PipelineType getListNodeFromId(String id) {
        return Arrays.stream(PipelineType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static PipelineType getFromEntityModel(final EntityModel entityModel) {
        return PipelineType.getListNodeFromId(entityModel.getId());
    }
}
