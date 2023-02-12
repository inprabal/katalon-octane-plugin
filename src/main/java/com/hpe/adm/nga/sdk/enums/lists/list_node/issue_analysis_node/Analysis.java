package com.hpe.adm.nga.sdk.enums.lists.list_node.issue_analysis_node;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Analysis {

            NOT_AN_ISSUE("list_node.issue_analysis_node.not_an_issue")        , MAYBE_AN_ISSUE("list_node.issue_analysis_node.maybe_an_issue")        , BUG_SUBMITTED("list_node.issue_analysis_node.bug_submitted")        , REVIEWED("list_node.issue_analysis_node.reviewed")        , ISSUE("list_node.issue_analysis_node.is_an_issue")    ;

    public static final String ROOT_ID = "list_node.issue_analysis_node";

    private final String id;

    Analysis(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Analysis getListNodeFromId(String id) {
        return Arrays.stream(Analysis.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Analysis getFromEntityModel(final EntityModel entityModel) {
        return Analysis.getListNodeFromId(entityModel.getId());
    }
}
