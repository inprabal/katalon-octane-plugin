package com.hpe.adm.nga.sdk.enums.lists.list_node.build_issue;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum BuildIssue {

            COMPILE("list_node.build_issue.compile")        , ENVIRONMENT("list_node.build_issue.environment")        , QUALITY("list_node.build_issue.quality")    ;

    public static final String ROOT_ID = "list_node.build_issue";

    private final String id;

    BuildIssue(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static BuildIssue getListNodeFromId(String id) {
        return Arrays.stream(BuildIssue.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static BuildIssue getFromEntityModel(final EntityModel entityModel) {
        return BuildIssue.getListNodeFromId(entityModel.getId());
    }
}
