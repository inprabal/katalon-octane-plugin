package com.hpe.adm.nga.sdk.enums.lists.list_node.commit_pattern.applies_to;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum AppliesTo {

            COMMITS("list_node.commit_pattern.applies_to.commit")        , PULL_REQUESTS("list_node.commit_pattern.applies_to.pull_request")        , BRANCHES("list_node.commit_pattern.applies_to.branch")    ;

    public static final String ROOT_ID = "list_node.commit_pattern.applies_to";

    private final String id;

    AppliesTo(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static AppliesTo getListNodeFromId(String id) {
        return Arrays.stream(AppliesTo.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static AppliesTo getFromEntityModel(final EntityModel entityModel) {
        return AppliesTo.getListNodeFromId(entityModel.getId());
    }
}
