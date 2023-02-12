package com.hpe.adm.nga.sdk.enums;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public final class Phases {

    public enum ProcessActionPhase {
                IN_PROGRESS("phase.process_action.inprogress")        , ABORTED("phase.process_action.aborted")        , FAILED("phase.process_action.failed")        , COMPLETED("phase.process_action.completed")        , SKIPPED("phase.process_action.skipped")        , PLANNED("phase.process_action.planned")        , SCHEDULED("phase.process_action.scheduled")        , PENDING("phase.process_action.pending");

        private final String id;

        ProcessActionPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ProcessActionPhase getPhaseFromId(String id) {
            return Arrays.stream(ProcessActionPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ProcessActionPhase getFromEntityModel(final EntityModel entityModel) {
            return ProcessActionPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum TaskPhase {
                COMPLETED("phase.task.completed")        , NEW("phase.task.new")        , IN_PROGRESS("phase.task.inprogress");

        private final String id;

        TaskPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static TaskPhase getPhaseFromId(String id) {
            return Arrays.stream(TaskPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static TaskPhase getFromEntityModel(final EntityModel entityModel) {
            return TaskPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum EpicPhase {
                DONE("phase.epic.done")        , IN_TESTING("phase.epic.intesting")        , IN_PROGRESS("phase.epic.inprogress")        , NEW("phase.epic.new");

        private final String id;

        EpicPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static EpicPhase getPhaseFromId(String id) {
            return Arrays.stream(EpicPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static EpicPhase getFromEntityModel(final EntityModel entityModel) {
            return EpicPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum QualityStoryPhase {
                NEW("phase.quality_story.new")        , DONE("phase.quality_story.done")        , IN_PROGRESS("phase.quality_story.inprogress");

        private final String id;

        QualityStoryPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static QualityStoryPhase getPhaseFromId(String id) {
            return Arrays.stream(QualityStoryPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static QualityStoryPhase getFromEntityModel(final EntityModel entityModel) {
            return QualityStoryPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ReleaseStagePhase {
                SKIPPED("phase.release_stage.skipped")        , IN_PROGRESS("phase.release_stage.inprogress")        , PLANNED("phase.release_stage.planned")        , FAILED("phase.release_stage.failed")        , ABORTED("phase.release_stage.aborted")        , COMPLETED("phase.release_stage.completed")        , FAILING("phase.release_stage.failing")        , SCHEDULED("phase.release_stage.scheduled");

        private final String id;

        ReleaseStagePhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ReleaseStagePhase getPhaseFromId(String id) {
            return Arrays.stream(ReleaseStagePhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ReleaseStagePhase getFromEntityModel(final EntityModel entityModel) {
            return ReleaseStagePhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum UnitPhase {
                NEW("phase.unit.new")        , IN_DESIGN("phase.unit.indesign")        , OBSOLETE("phase.unit.obsolete")        , READY("phase.unit.ready")        , AWAITING_REVIEW("phase.unit.awaitingreview");

        private final String id;

        UnitPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static UnitPhase getPhaseFromId(String id) {
            return Arrays.stream(UnitPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static UnitPhase getFromEntityModel(final EntityModel entityModel) {
            return UnitPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum FeaturePhase {
                DONE("phase.feature.done")        , IN_TESTING("phase.feature.intesting")        , IN_PROGRESS("phase.feature.inprogress")        , NEW("phase.feature.new");

        private final String id;

        FeaturePhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static FeaturePhase getPhaseFromId(String id) {
            return Arrays.stream(FeaturePhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static FeaturePhase getFromEntityModel(final EntityModel entityModel) {
            return FeaturePhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum GherkinTestPhase {
                OBSOLETE("phase.gherkin_test.obsolete")        , IN_DESIGN("phase.gherkin_test.indesign")        , READY("phase.gherkin_test.ready")        , AWAITING_REVIEW("phase.gherkin_test.awaitingreview")        , NEW("phase.gherkin_test.new");

        private final String id;

        GherkinTestPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static GherkinTestPhase getPhaseFromId(String id) {
            return Arrays.stream(GherkinTestPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static GherkinTestPhase getFromEntityModel(final EntityModel entityModel) {
            return GherkinTestPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum BddSpecPhase {
                IN_DESIGN("phase.bdd_spec.indesign")        , READY("phase.bdd_spec.ready")        , OBSOLETE("phase.bdd_spec.obsolete")        , AWAITING_REVIEW("phase.bdd_spec.awaitingreview")        , NEW("phase.bdd_spec.new");

        private final String id;

        BddSpecPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static BddSpecPhase getPhaseFromId(String id) {
            return Arrays.stream(BddSpecPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static BddSpecPhase getFromEntityModel(final EntityModel entityModel) {
            return BddSpecPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ModelPhase {
                NEW("phase.model.new")        , READY("phase.model.ready")        , IN_DESIGN("phase.model.indesign")        , OBSOLETE("phase.model.obsolete")        , AWAITING_REVIEW("phase.model.awaitingreview");

        private final String id;

        ModelPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ModelPhase getPhaseFromId(String id) {
            return Arrays.stream(ModelPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ModelPhase getFromEntityModel(final EntityModel entityModel) {
            return ModelPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ProcessGroupPhase {
                FAILED("phase.process_group.failed")        , SKIPPED("phase.process_group.skipped")        , SCHEDULED("phase.process_group.scheduled")        , ABORTED("phase.process_group.aborted")        , IN_PROGRESS("phase.process_group.inprogress")        , COMPLETED("phase.process_group.completed")        , PLANNED("phase.process_group.planned")        , FAILING("phase.process_group.failing");

        private final String id;

        ProcessGroupPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ProcessGroupPhase getPhaseFromId(String id) {
            return Arrays.stream(ProcessGroupPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ProcessGroupPhase getFromEntityModel(final EntityModel entityModel) {
            return ProcessGroupPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ModelBasedTestPhase {
                AWAITING_REVIEW("phase.model_based_test.awaitingreview")        , OBSOLETE("phase.model_based_test.obsolete")        , NEW("phase.model_based_test.new")        , READY("phase.model_based_test.ready")        , IN_DESIGN("phase.model_based_test.indesign");

        private final String id;

        ModelBasedTestPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ModelBasedTestPhase getPhaseFromId(String id) {
            return Arrays.stream(ModelBasedTestPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ModelBasedTestPhase getFromEntityModel(final EntityModel entityModel) {
            return ModelBasedTestPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum DefectPhase {
                NEW("phase.defect.new")        , DEFERRED("phase.defect.deferred")        , PROPOSED_CLOSED("phase.defect.proposeclose")        , OPENED("phase.defect.opened")        , DUPLICATE("phase.defect.duplicate")        , REJECTED("phase.defect.rejected")        , CLOSED("phase.defect.closed")        , FIXED("phase.defect.fixed");

        private final String id;

        DefectPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static DefectPhase getPhaseFromId(String id) {
            return Arrays.stream(DefectPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static DefectPhase getFromEntityModel(final EntityModel entityModel) {
            return DefectPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum TestManualPhase {
                READY("phase.test_manual.ready")        , AWAITING_REVIEW("phase.test_manual.awaitingreview")        , OBSOLETE("phase.test_manual.obsolete")        , NEW("phase.test_manual.new")        , IN_DESIGN("phase.test_manual.indesign");

        private final String id;

        TestManualPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static TestManualPhase getPhaseFromId(String id) {
            return Arrays.stream(TestManualPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static TestManualPhase getFromEntityModel(final EntityModel entityModel) {
            return TestManualPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum StoryPhase {
                DONE("phase.story.done")        , IN_PROGRESS("phase.story.inprogress")        , IN_TESTING("phase.story.intesting")        , NEW("phase.story.new");

        private final String id;

        StoryPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static StoryPhase getPhaseFromId(String id) {
            return Arrays.stream(StoryPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static StoryPhase getFromEntityModel(final EntityModel entityModel) {
            return StoryPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ProcessAutoActionPhase {
                FAILED("phase.process_auto_action.failed")        , PENDING("phase.process_auto_action.pending")        , SKIPPED("phase.process_auto_action.skipped")        , ABORTED("phase.process_auto_action.aborted")        , SCHEDULED("phase.process_auto_action.scheduled")        , IN_PROGRESS("phase.process_auto_action.inprogress")        , COMPLETED("phase.process_auto_action.completed")        , PLANNED("phase.process_auto_action.planned");

        private final String id;

        ProcessAutoActionPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ProcessAutoActionPhase getPhaseFromId(String id) {
            return Arrays.stream(ProcessAutoActionPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ProcessAutoActionPhase getFromEntityModel(final EntityModel entityModel) {
            return ProcessAutoActionPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ReleaseProcessPhase {
                COMPLETED("phase.release_process.completed")        , PLANNED("phase.release_process.planned")        , IN_PROGRESS("phase.release_process.inprogress")        , FAILING("phase.release_process.failing")        , FAILED("phase.release_process.failed")        , ABORTED("phase.release_process.aborted")        , SCHEDULED("phase.release_process.scheduled");

        private final String id;

        ReleaseProcessPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ReleaseProcessPhase getPhaseFromId(String id) {
            return Arrays.stream(ReleaseProcessPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ReleaseProcessPhase getFromEntityModel(final EntityModel entityModel) {
            return ReleaseProcessPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum RequirementDocumentPhase {
                IN_REVIEW("phase.requirement_document.inreview")        , DRAFT("phase.requirement_document.draft")        , ACCEPTED("phase.requirement_document.accepted")        , DEFERRED("phase.requirement_document.deferred")        , APPROVED("phase.requirement_document.approved")        , REJECTED("phase.requirement_document.rejected")        , IN_DESIGN("phase.requirement_document.indesign");

        private final String id;

        RequirementDocumentPhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static RequirementDocumentPhase getPhaseFromId(String id) {
            return Arrays.stream(RequirementDocumentPhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static RequirementDocumentPhase getFromEntityModel(final EntityModel entityModel) {
            return RequirementDocumentPhase.getPhaseFromId(entityModel.getId());
        }
    }

    public enum ProcessQualityGatePhase {
                COMPLETED("phase.process_quality_gate.completed")        , PENDING("phase.process_quality_gate.pending")        , ABORTED("phase.process_quality_gate.aborted")        , SKIPPED("phase.process_quality_gate.skipped")        , IN_PROGRESS("phase.process_quality_gate.inprogress")        , PLANNED("phase.process_quality_gate.planned")        , SCHEDULED("phase.process_quality_gate.scheduled")        , FAILED("phase.process_quality_gate.failed");

        private final String id;

        ProcessQualityGatePhase(final String id) {
            this.id = id;
        }

        public final String getId() {
            return id;
        }

        public static ProcessQualityGatePhase getPhaseFromId(String id) {
            return Arrays.stream(ProcessQualityGatePhase.values()).filter(phase -> phase.id.equals(id)).findFirst().orElse(null);
        }

        public final EntityModel getAsEntityModel() {
            final EntityModel entityModel = new EntityModel();
            entityModel.setValue(new StringFieldModel("id", id));
            entityModel.setValue(new StringFieldModel("type", "phase"));
            return entityModel;
        }

        public static ProcessQualityGatePhase getFromEntityModel(final EntityModel entityModel) {
            return ProcessQualityGatePhase.getPhaseFromId(entityModel.getId());
        }
    }

}
