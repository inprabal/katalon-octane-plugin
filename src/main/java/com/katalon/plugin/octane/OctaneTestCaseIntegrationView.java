package com.katalon.plugin.octane;

import com.katalon.platform.api.extension.TestCaseIntegrationViewDescription;
import com.katalon.platform.api.model.Integration;
import com.katalon.platform.api.model.TestCaseEntity;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

import java.util.Map;

public class OctaneTestCaseIntegrationView implements TestCaseIntegrationViewDescription.TestCaseIntegrationView {

    private Composite container;

    private Text txtId;

    private Boolean isEdited = false;

    @Override
    public Control onCreateView(Composite parent, TestCaseIntegrationViewDescription.PartActionService partActionService, TestCaseEntity testCase) {

        container = new Composite(parent, SWT.NONE);

        createLabel("Test Case ID");
        txtId = createTextbox();

        GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.verticalSpacing = 10;
        gridLayout.horizontalSpacing = 15;
        container.setLayout(gridLayout);

        Integration integration = testCase.getIntegration(OctaneConstants.INTEGRATION_ID);
        if(integration != null) {
            Map<String, String> integrationProps = integration.getProperties();
           if(integrationProps.containsKey(OctaneConstants.INTEGRATION_TESTCASE_ID)){
               txtId.setText(integrationProps.get(OctaneConstants.INTEGRATION_TESTCASE_ID));
           }
        }

        txtId.addModifyListener(modifyEvent -> {
            isEdited = true;
            partActionService.markDirty();
        });

        return container;
    }

    private Text createTextbox() {
        Text text = new Text(container, SWT.BORDER);
        GridData gridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
        gridData.widthHint = 200;
        text.setLayoutData(gridData);
        return text;
    }

    private void createLabel(String text) {
        Label label = new Label(container, SWT.NONE);
        label.setText(text);
        GridData gridData = new GridData(SWT.LEFT, SWT.TOP, false, false);
        label.setLayoutData(gridData);
    }

    @Override
    public Integration getIntegrationBeforeSaving() {
        OctaneTestCaseIntegration integration = new OctaneTestCaseIntegration();
        integration.setTestCaseId(txtId.getText());
        isEdited = false;
        return integration;
    }

    @Override
    public boolean needsSaving() {
        return isEdited;
    }
}
