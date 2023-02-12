package com.hpe.adm.nga.sdk.enums.lists.list_node.dependency_problem_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum DependencyProblemType {

            TIMELINE("list_node.dependency_problem_type.timeline")    ;

    public static final String ROOT_ID = "list_node.dependency_problem_type";

    private final String id;

    DependencyProblemType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static DependencyProblemType getListNodeFromId(String id) {
        return Arrays.stream(DependencyProblemType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static DependencyProblemType getFromEntityModel(final EntityModel entityModel) {
        return DependencyProblemType.getListNodeFromId(entityModel.getId());
    }
}
