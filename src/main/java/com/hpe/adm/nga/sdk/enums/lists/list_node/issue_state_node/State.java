package com.hpe.adm.nga.sdk.enums.lists.list_node.issue_state_node;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum State {

            NEW("list_node.issue_state_node.new")        , EXISTING("list_node.issue_state_node.existing")        , CLOSED("list_node.issue_state_node.closed")        , REOPEN("list_node.issue_state_node.reopen")    ;

    public static final String ROOT_ID = "list_node.issue_state_node";

    private final String id;

    State(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static State getListNodeFromId(String id) {
        return Arrays.stream(State.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static State getFromEntityModel(final EntityModel entityModel) {
        return State.getListNodeFromId(entityModel.getId());
    }
}
