package com.hpe.adm.nga.sdk.enums.lists.list_node.quality_story_type;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum QualityStoryType {

            TEST_AUTHORING("list_node.quality_story_type.test_authoring")    ;

    public static final String ROOT_ID = "list_node.quality_story_type";

    private final String id;

    QualityStoryType(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static QualityStoryType getListNodeFromId(String id) {
        return Arrays.stream(QualityStoryType.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static QualityStoryType getFromEntityModel(final EntityModel entityModel) {
        return QualityStoryType.getListNodeFromId(entityModel.getId());
    }
}
