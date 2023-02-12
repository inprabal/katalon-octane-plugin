package com.hpe.adm.nga.sdk.enums.lists.list_node.pull_request_state;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum PullRequestState {

            OPEN("list_node.pull_request_state.open")        , CLOSED("list_node.pull_request_state.closed")    ;

    public static final String ROOT_ID = "list_node.pull_request_state";

    private final String id;

    PullRequestState(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static PullRequestState getListNodeFromId(String id) {
        return Arrays.stream(PullRequestState.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static PullRequestState getFromEntityModel(final EntityModel entityModel) {
        return PullRequestState.getListNodeFromId(entityModel.getId());
    }
}
