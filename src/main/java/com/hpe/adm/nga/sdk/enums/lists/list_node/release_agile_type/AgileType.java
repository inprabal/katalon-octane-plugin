package com.hpe.adm.nga.sdk.enums.lists.list_node.release_agile_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum AgileType {

            INCLUDES_SPRINTS__E_G__SCRUM_("list_node.release_agile_type.scrum")        , NO_SPRINTS__E_G__KANBAN_("list_node.release_agile_type.kanban")    ;

    public static final String ROOT_ID = "list_node.release_agile_type";

    private final String id;

    AgileType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static AgileType getListNodeFromId(String id) {
        return Arrays.stream(AgileType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static AgileType getFromEntityModel(final EntityModel entityModel) {
        return AgileType.getListNodeFromId(entityModel.getId());
    }
}
