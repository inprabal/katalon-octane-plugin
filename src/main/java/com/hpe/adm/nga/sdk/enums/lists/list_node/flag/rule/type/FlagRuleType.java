package com.hpe.adm.nga.sdk.enums.lists.list_node.flag.rule.type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum FlagRuleType {

            NOT_RUN_TEST("list_node.flag.rule.type.unused.test")        , STUCK_IN_PHASE("list_node.flag.rule.type.stuck.in.phase")        , MANY_OWNERS("list_node.flag.rule.type.many.owners")    ;

    public static final String ROOT_ID = "list_node.flag.rule.type";

    private final String id;

    FlagRuleType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static FlagRuleType getListNodeFromId(String id) {
        return Arrays.stream(FlagRuleType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static FlagRuleType getFromEntityModel(final EntityModel entityModel) {
        return FlagRuleType.getListNodeFromId(entityModel.getId());
    }
}
