package com.hpe.adm.nga.sdk.enums.lists.list_node.business_impact;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum BusinessImpact {

            NO_IMPACT("list_node.business_impact.no_impact")        , LOW("list_node.business_impact.low")        , MEDIUM("list_node.business_impact.medium")        , HIGH("list_node.business_impact.high")        , CRITICAL("list_node.business_impact.critical")    ;

    public static final String ROOT_ID = "list_node.business_impact";

    private final String id;

    BusinessImpact(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static BusinessImpact getListNodeFromId(String id) {
        return Arrays.stream(BusinessImpact.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static BusinessImpact getFromEntityModel(final EntityModel entityModel) {
        return BusinessImpact.getListNodeFromId(entityModel.getId());
    }
}
