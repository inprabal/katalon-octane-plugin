package com.hpe.adm.nga.sdk.enums;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public final class Phases {

    public enum ProcessActionPhase {
                SCHEDULED("phase.process_action.scheduled")        , IN_PROGRESS("phase.process_action.inprogress")        , FAILED("phase.process_action.failed")        , SKIPPED("phase.process_action.skipped")        , PLANNED("phase.process_action.planned")        , COMPLETED("phase.process_action.completed")        , PENDING("phase.process_action.pending")        , ABORTED("phase.process_action.aborted");

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
                IN_PROGRESS("phase.task.inprogress")        , NEW("phase.task.new")        , COMPLETED("phase.task.completed");

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
                DONE("phase.epic.done")        , IN_PROGRESS("phase.epic.inprogress")        , NEW("phase.epic.new")        , IN_TESTING("phase.epic.intesting");

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
                DONE("phase.quality_story.done")        , IN_PROGRESS("phase.quality_story.inprogress")        , NEW("phase.quality_story.new");

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
                SKIPPED("phase.release_stage.skipped")        , COMPLETED("phase.release_stage.completed")        , FAILED("phase.release_stage.failed")        , FAILING("phase.release_stage.failing")        , ABORTED("phase.release_stage.aborted")        , SCHEDULED("phase.release_stage.scheduled")        , PLANNED("phase.release_stage.planned")        , IN_PROGRESS("phase.release_stage.inprogress");

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
                OBSOLETE("phase.unit.obsolete")        , READY("phase.unit.ready")        , AWAITING_REVIEW("phase.unit.awaitingreview")        , IN_DESIGN("phase.unit.indesign")        , NEW("phase.unit.new");

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
                IN_PROGRESS("phase.feature.inprogress")        , IN_TESTING("phase.feature.intesting")        , DONE("phase.feature.done")        , NEW("phase.feature.new");

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
                IN_DESIGN("phase.gherkin_test.indesign")        , OBSOLETE("phase.gherkin_test.obsolete")        , READY("phase.gherkin_test.ready")        , AWAITING_REVIEW("phase.gherkin_test.awaitingreview")        , NEW("phase.gherkin_test.new");

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
                READY("phase.bdd_spec.ready")        , IN_DESIGN("phase.bdd_spec.indesign")        , OBSOLETE("phase.bdd_spec.obsolete")        , AWAITING_REVIEW("phase.bdd_spec.awaitingreview")        , NEW("phase.bdd_spec.new");

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
                IN_DESIGN("phase.model.indesign")        , OBSOLETE("phase.model.obsolete")        , AWAITING_REVIEW("phase.model.awaitingreview")        , NEW("phase.model.new")        , READY("phase.model.ready");

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
                SCHEDULED("phase.process_group.scheduled")        , ABORTED("phase.process_group.aborted")        , PLANNED("phase.process_group.planned")        , FAILING("phase.process_group.failing")        , SKIPPED("phase.process_group.skipped")        , IN_PROGRESS("phase.process_group.inprogress")        , COMPLETED("phase.process_group.completed")        , FAILED("phase.process_group.failed");

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
                NEW("phase.model_based_test.new")        , OBSOLETE("phase.model_based_test.obsolete")        , READY("phase.model_based_test.ready")        , AWAITING_REVIEW("phase.model_based_test.awaitingreview")        , IN_DESIGN("phase.model_based_test.indesign");

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
                NEW("phase.defect.new")        , REJECTED("phase.defect.rejected")        , FIXED("phase.defect.fixed")        , PROPOSED_CLOSED("phase.defect.proposeclose")        , CLOSED("phase.defect.closed")        , DUPLICATE("phase.defect.duplicate")        , OPENED("phase.defect.opened")        , DEFERRED("phase.defect.deferred");

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
                OBSOLETE("phase.test_manual.obsolete")        , AWAITING_REVIEW("phase.test_manual.awaitingreview")        , READY("phase.test_manual.ready")        , NEW("phase.test_manual.new")        , IN_DESIGN("phase.test_manual.indesign");

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
                NEW("phase.story.new")        , DONE("phase.story.done")        , IN_PROGRESS("phase.story.inprogress")        , IN_TESTING("phase.story.intesting");

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
                FAILED("phase.process_auto_action.failed")        , PLANNED("phase.process_auto_action.planned")        , PENDING("phase.process_auto_action.pending")        , SKIPPED("phase.process_auto_action.skipped")        , ABORTED("phase.process_auto_action.aborted")        , COMPLETED("phase.process_auto_action.completed")        , SCHEDULED("phase.process_auto_action.scheduled")        , IN_PROGRESS("phase.process_auto_action.inprogress");

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
                COMPLETED("phase.release_process.completed")        , FAILING("phase.release_process.failing")        , PLANNED("phase.release_process.planned")        , FAILED("phase.release_process.failed")        , ABORTED("phase.release_process.aborted")        , IN_PROGRESS("phase.release_process.inprogress")        , SCHEDULED("phase.release_process.scheduled");

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
                APPROVED("phase.requirement_document.approved")        , ACCEPTED("phase.requirement_document.accepted")        , REJECTED("phase.requirement_document.rejected")        , IN_REVIEW("phase.requirement_document.inreview")        , DRAFT("phase.requirement_document.draft")        , IN_DESIGN("phase.requirement_document.indesign")        , DEFERRED("phase.requirement_document.deferred");

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
                SCHEDULED("phase.process_quality_gate.scheduled")        , COMPLETED("phase.process_quality_gate.completed")        , SKIPPED("phase.process_quality_gate.skipped")        , PENDING("phase.process_quality_gate.pending")        , FAILED("phase.process_quality_gate.failed")        , PLANNED("phase.process_quality_gate.planned")        , IN_PROGRESS("phase.process_quality_gate.inprogress")        , ABORTED("phase.process_quality_gate.aborted");

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
