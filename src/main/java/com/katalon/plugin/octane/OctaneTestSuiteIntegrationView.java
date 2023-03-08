package com.katalon.plugin.octane;

import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.katalon.platform.api.extension.TestSuiteIntegrationViewDescription.PartActionService;
import com.katalon.platform.api.extension.TestSuiteIntegrationViewDescription.TestSuiteIntegrationView;
import com.katalon.platform.api.model.Integration;
import com.katalon.platform.api.model.TestSuiteEntity;

public class OctaneTestSuiteIntegrationView implements TestSuiteIntegrationView {

	private Composite container;

	private Text txtSuiteId;
	
	private Text txtReleaseId;
	
	private Text txtProductAreasId;
	
	private Text txtBacklogsId;
	
	private Combo txtTestLevel;
	
	private Combo txtTestType;

	private Boolean isEdited = false;

	@Override
	public Control onCreateView(Composite parent, PartActionService partActionService, TestSuiteEntity testSuite) {
		container = new Composite(parent, SWT.NONE);

		createLabel("Suite ID");
		txtSuiteId = createTextbox();
		
		createLabel("Release ID");
		txtReleaseId = createTextbox();
		
		createLabel("Product Area IDs (Comma seperated)");
		txtProductAreasId = createTextbox();
		
		createLabel("Backlog IDs (Comma seperated)");
		txtBacklogsId = createTextbox();
		
		createLabel("Test Level");
		String[] item_levels= {"","Unit Test","System Test","Integration Test"};
		txtTestLevel = createComboBox(item_levels);
		
		createLabel("Test Type");
		String[] item_types= {"","Acceptance","Regression","End to End","Sanity","Security","UI","API"};
		txtTestType = createComboBox(item_types);

		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.verticalSpacing = 10;
		gridLayout.horizontalSpacing = 15;
		container.setLayout(gridLayout);
		
		Integration integration=null;
		
		try {
			integration = testSuite.getIntegration(OctaneConstants.INTEGRATION_ID);
		}
		catch(NullPointerException np) {
			integration = new OctaneTestCaseIntegration();
		}
		
		
		if (integration != null) {
			Map<String, String> integrationProps = integration.getProperties();
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_TESTSUITE_ID)) {
				txtSuiteId.setText(integrationProps.get(OctaneConstants.INTEGRATION_TESTSUITE_ID)!=null?integrationProps.get(OctaneConstants.INTEGRATION_TESTSUITE_ID):"");
			}
			
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_RELEASE_ID)) {
				txtReleaseId.setText(integrationProps.get(OctaneConstants.INTEGRATION_RELEASE_ID)!=null?integrationProps.get(OctaneConstants.INTEGRATION_RELEASE_ID):"");
			}
			
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_PRODUCT_AREA_ID)) {
				txtProductAreasId.setText(integrationProps.get(OctaneConstants.INTEGRATION_PRODUCT_AREA_ID)!=null?integrationProps.get(OctaneConstants.INTEGRATION_PRODUCT_AREA_ID):"");
			}
			
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_BACKLOGS_ID)) {
				txtBacklogsId.setText(integrationProps.get(OctaneConstants.INTEGRATION_BACKLOGS_ID)!=null?integrationProps.get(OctaneConstants.INTEGRATION_BACKLOGS_ID):"");
			}
			
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_TEST_LEVEL)) {
				txtTestLevel.setText(integrationProps.get(OctaneConstants.INTEGRATION_TEST_LEVEL)!=null?integrationProps.get(OctaneConstants.INTEGRATION_TEST_LEVEL):"");
			}
			
			if (integrationProps.containsKey(OctaneConstants.INTEGRATION_TEST_TYPE)) {
				txtTestType.setText(integrationProps.get(OctaneConstants.INTEGRATION_TEST_TYPE)!=null?integrationProps.get(OctaneConstants.INTEGRATION_TEST_TYPE):"");
			}
			
		
		}

		txtSuiteId.addModifyListener(modifyEvent -> {
			isEdited = true;
			partActionService.markDirty();
		});
		
		txtReleaseId.addModifyListener(modifyEvent -> {
			isEdited = true;
			partActionService.markDirty();
		});
		
		txtProductAreasId.addModifyListener(modifyEvent -> {
			isEdited = true;
			partActionService.markDirty();
		});
		
		txtBacklogsId.addModifyListener(modifyEvent -> {
			isEdited = true;
			partActionService.markDirty();
		});
		
		txtTestLevel.addModifyListener(modifyEvent -> {
			isEdited = true;
			partActionService.markDirty();
		});
		
		txtTestType.addModifyListener(modifyEvent -> {
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
	
	private Combo createComboBox(String[] items) {
		Combo combo = new Combo(container, SWT.DROP_DOWN|SWT.READ_ONLY);
		combo.setItems(items);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		gridData.widthHint=100;
		combo.setLayoutData(gridData);
		return combo;
	}

	@Override
	public Integration getIntegrationBeforeSaving() {
		OctaneTestSuiteIntegration integration = new OctaneTestSuiteIntegration();
		integration.setTestSuiteId(txtSuiteId.getText());
		integration.setReleaseId(txtReleaseId.getText());
		integration.setProductAreasId(txtProductAreasId.getText());
		integration.setBacklogsId(txtBacklogsId.getText());
		integration.setTestLevel(txtTestLevel.getText());
		integration.setTestType(txtTestType.getText());
		isEdited = false;
		return integration;
	}

	@Override
	public boolean needsSaving() {
		 return isEdited;
	}

}
