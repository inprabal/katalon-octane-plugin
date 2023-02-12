package com.hpe.adm.nga.sdk.enums.lists.list_node.search_data_maintenance;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum SearchableDataMaintenanceStatusNode {

            N_A("list_node.search_data_maintenance.na")        , NOT_STARTED("list_node.search_data_maintenance.not_started")        , IN_PROGRESS("list_node.search_data_maintenance.in_progress")        , FAILED("list_node.search_data_maintenance.failed")        , DONE("list_node.search_data_maintenance.done")    ;

    public static final String ROOT_ID = "list_node.search_data_maintenance";

    private final String id;

    SearchableDataMaintenanceStatusNode(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static SearchableDataMaintenanceStatusNode getListNodeFromId(String id) {
        return Arrays.stream(SearchableDataMaintenanceStatusNode.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static SearchableDataMaintenanceStatusNode getFromEntityModel(final EntityModel entityModel) {
        return SearchableDataMaintenanceStatusNode.getListNodeFromId(entityModel.getId());
    }
}
