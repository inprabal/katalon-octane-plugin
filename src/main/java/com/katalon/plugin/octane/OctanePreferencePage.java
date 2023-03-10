package com.katalon.plugin.octane;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.hpe.adm.nga.sdk.Octane;
import com.hpe.adm.nga.sdk.authentication.SimpleClientAuthentication;
import com.katalon.platform.api.exception.CryptoException;
import com.katalon.platform.api.exception.InvalidDataTypeFormatException;
import com.katalon.platform.api.exception.ResourceException;
import com.katalon.platform.api.preference.PluginPreference;
import com.katalon.platform.api.service.ApplicationManager;
import com.katalon.platform.api.ui.UISynchronizeService;

public class OctanePreferencePage extends PreferencePage implements OctaneComponent {

	private Button chckEnableIntegration;

	private Group grpAuthentication;

	private Text txtClientID;

	private Text txtClientSecret;

	private Text txtUrl;

	private Text txtSpace;

	private Text txtWorkspace;

	private Composite container;

	private Button btnTestConnection;

	private Label lblConnectionStatus;

	private Thread thread;

	@Override
	protected Control createContents(Composite composite) {
		container = new Composite(composite, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		chckEnableIntegration = new Button(container, SWT.CHECK);
		chckEnableIntegration.setText("Using Octane");

		grpAuthentication = new Group(container, SWT.NONE);
		grpAuthentication.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		GridLayout glAuthentication = new GridLayout(2, false);
		glAuthentication.horizontalSpacing = 15;
		glAuthentication.verticalSpacing = 10;
		grpAuthentication.setLayout(glAuthentication);
		grpAuthentication.setText("Authentication");

		createLabel("URL");
		txtUrl = createTextbox();

		createLabel("Client ID");
		txtClientID = createTextbox();

		createLabel("Client Secret");
		txtClientSecret = createPasswordTextbox();

		createLabel("Sharedspace");
		txtSpace = createTextbox();

		createLabel("Workspace");
		txtWorkspace = createTextbox();

		btnTestConnection = new Button(grpAuthentication, SWT.PUSH);
		btnTestConnection.setText("Test Connection");
		btnTestConnection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				testOctaneConnection(txtClientID.getText(), txtClientSecret.getText(), txtUrl.getText(),
						txtSpace.getText(), txtWorkspace.getText());
			}
		});

		lblConnectionStatus = new Label(grpAuthentication, SWT.WRAP);
		lblConnectionStatus.setText("");
		lblConnectionStatus.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));

		handleControlModifyEventListeners();
		initializeInput();

		return container;
	}

	private Text createTextbox() {
		Text text = new Text(grpAuthentication, SWT.BORDER);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gridData.widthHint = 200;
		text.setLayoutData(gridData);
		return text;
	}

	private Text createPasswordTextbox() {
		Text text = new Text(grpAuthentication, SWT.PASSWORD | SWT.BORDER);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gridData.widthHint = 200;
		text.setLayoutData(gridData);
		return text;
	}

	private void createLabel(String text) {
		Label label = new Label(grpAuthentication, SWT.NONE);
		label.setText(text);
		GridData gridData = new GridData(SWT.LEFT, SWT.TOP, false, false);
		label.setLayoutData(gridData);
	}

	private void testOctaneConnection(String clientID, String clientSecret, String url, String space,
			String workspace) {
		btnTestConnection.setEnabled(false);
		lblConnectionStatus.setForeground(lblConnectionStatus.getDisplay().getSystemColor(SWT.COLOR_DARK_YELLOW));
		lblConnectionStatus.setText("Connecting...");
		lblConnectionStatus.requestLayout();
		thread = new Thread(() -> {
			try {
				// test connection here
				SimpleClientAuthentication authentication = new SimpleClientAuthentication(clientID, clientSecret);

				// get instance of Octane Builder
				final Octane.Builder octaneBuilder = new Octane.Builder(authentication);
				
				// now we can add the server
				octaneBuilder.Server(url);
				// the sharedspace
				octaneBuilder.sharedSpace(Integer.parseInt(space));
				// the workspace
				octaneBuilder.workSpace(Integer.parseInt(workspace));

				// finally we build the context and get an Octane instance:
				
				Octane octane = octaneBuilder.build();
				
				syncExec(() -> {
					lblConnectionStatus
							.setForeground(lblConnectionStatus.getDisplay().getSystemColor(SWT.COLOR_DARK_GREEN));
					lblConnectionStatus.setText("Succeeded!");
					lblConnectionStatus.requestLayout();
				});
			} catch (Exception e) {
				System.err.println("Cannot connect to Octane." + ExceptionUtils.getStackTrace(e));
				e.printStackTrace(System.err);
				syncExec(() -> {
					lblConnectionStatus
							.setForeground(lblConnectionStatus.getDisplay().getSystemColor(SWT.COLOR_DARK_RED));
					lblConnectionStatus.setText("Failed: " + e.getMessage());
					lblConnectionStatus.requestLayout();
				});
			} finally {
				syncExec(() -> btnTestConnection.setEnabled(true));
			}
		});
		thread.start();
	}

	void syncExec(Runnable runnable) {
		if (lblConnectionStatus != null && !lblConnectionStatus.isDisposed()) {
			ApplicationManager.getInstance().getUIServiceManager().getService(UISynchronizeService.class)
					.syncExec(runnable);
		}
	}

	private void handleControlModifyEventListeners() {
		chckEnableIntegration.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				recursiveSetEnabled(grpAuthentication, chckEnableIntegration.getSelection());
			}
		});
	}

	public static void recursiveSetEnabled(Control ctrl, boolean enabled) {
		if (ctrl instanceof Composite) {
			Composite comp = (Composite) ctrl;
			for (Control c : comp.getChildren()) {
				recursiveSetEnabled(c, enabled);
				c.setEnabled(enabled);
			}
		} else {
			ctrl.setEnabled(enabled);
		}
	}

	@Override
	public boolean performOk() {
		try {
			PluginPreference pluginStore = getPluginStore();

			if (!super.isControlCreated()) {
				return super.performOk();
			}

			pluginStore.setBoolean(OctaneConstants.PREF_OCTANE_ENABLED, chckEnableIntegration.getSelection());
			pluginStore.setString(OctaneConstants.PREF_OCTANE_CLIENT_ID, txtClientID.getText());
			pluginStore.setString(OctaneConstants.PREF_OCTANE_URL, txtUrl.getText());
			pluginStore.setString(OctaneConstants.PREF_OCTANE_SPACE_ID, txtSpace.getText());
			pluginStore.setString(OctaneConstants.PREF_OCTANE_WORKSPACE_ID, txtWorkspace.getText());
			try {
				pluginStore.setString(OctaneConstants.PREF_OCTANE_CLIENT_SECRET, txtClientSecret.getText(), true);
			} catch (CryptoException e) {
				// Cannot encrypt the password
				e.printStackTrace();
			}

			pluginStore.save();

			return super.performOk();
		} catch (ResourceException e) {
			MessageDialog.openWarning(getShell(), "Warning", "Unable to update Octane Integration Settings.");
			return false;
		}
	}

	private void initializeInput() {
		try {
			PluginPreference pluginStore = getPluginStore();

			chckEnableIntegration.setSelection(pluginStore.getBoolean(OctaneConstants.PREF_OCTANE_ENABLED, false));
			chckEnableIntegration.notifyListeners(SWT.Selection, new Event());

			txtClientID.setText(pluginStore.getString(OctaneConstants.PREF_OCTANE_CLIENT_ID, ""));
			txtUrl.setText(pluginStore.getString(OctaneConstants.PREF_OCTANE_URL, ""));
			txtSpace.setText(pluginStore.getString(OctaneConstants.PREF_OCTANE_SPACE_ID, ""));
			txtWorkspace.setText(pluginStore.getString(OctaneConstants.PREF_OCTANE_WORKSPACE_ID, ""));
			try {
				txtClientSecret.setText(pluginStore.getString(OctaneConstants.PREF_OCTANE_CLIENT_SECRET, "", true));
			} catch (InvalidDataTypeFormatException | CryptoException e) {
				// Cannot decrypt the password
				e.printStackTrace();
			}

			container.layout(true, true);
		} catch (ResourceException e) {
			MessageDialog.openWarning(getShell(), "Warning", "Unable to update Octane Integration Settings.");
		}
	}
}
