package com.hpe.adm.nga.sdk.enums.lists.list_node.run_problem;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum Problem {

            CONTINUOUSLY_FAILING("list_node.run_problem.continuously_failing")        , OSCILLATING("list_node.run_problem.oscillating")        , REGRESSION("list_node.run_problem.regression")        , CONTINUOUSLY_SKIPPED("list_node.run_problem.continuously_skipped")        , UNSTABLE("list_node.run_problem.unstable")    ;

    public static final String ROOT_ID = "list_node.run_problem";

    private final String id;

    Problem(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static Problem getListNodeFromId(String id) {
        return Arrays.stream(Problem.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static Problem getFromEntityModel(final EntityModel entityModel) {
        return Problem.getListNodeFromId(entityModel.getId());
    }
}
