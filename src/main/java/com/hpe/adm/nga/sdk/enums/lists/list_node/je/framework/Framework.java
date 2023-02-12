package com.hpe.adm.nga.sdk.enums.lists.list_node.je.framework;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Framework {

            JUNIT("list_node.je.framework.junit")        , TESTNG("list_node.je.framework.testng")        , UFT("list_node.je.framework.uft")        , NUNIT("list_node.je.framework.nunit")        , JBEHAVE("list_node.je.framework.jbehave")        , KARMA("list_node.je.framework.karma")        , JASMINE("list_node.je.framework.jasmine")        , MOCHA("list_node.je.framework.mocha")        , CUCUMBER("list_node.je.framework.cucumber")        , MBT("list_node.je.framework.mbt")    ;

    public static final String ROOT_ID = "list_node.je.framework";

    private final String id;

    Framework(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Framework getListNodeFromId(String id) {
        return Arrays.stream(Framework.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Framework getFromEntityModel(final EntityModel entityModel) {
        return Framework.getListNodeFromId(entityModel.getId());
    }
}
