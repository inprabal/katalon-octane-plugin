package com.katalon.plugin.octane;

import com.katalon.platform.api.exception.ResourceException;
import com.katalon.platform.api.extension.TestSuiteIntegrationViewDescription;
import com.katalon.platform.api.model.ProjectEntity;
import com.katalon.platform.api.preference.PluginPreference;
import com.katalon.platform.api.service.ApplicationManager;

public class OctaneTestSuiteIntegrationViewDescription implements TestSuiteIntegrationViewDescription {

	@Override
	public String getName() {
		return "Octane";
	}

	@Override
	public Class<? extends TestSuiteIntegrationView> getTestSuiteIntegrationView() {
		
		return OctaneTestSuiteIntegrationView.class;
	}

	@Override
	public boolean isEnabled(ProjectEntity projectEntity) {
		try {
            PluginPreference pluginPreference = ApplicationManager.getInstance()
                    .getPreferenceManager()
                    .getPluginPreference(projectEntity.getId(), OctaneConstants.PLUGIN_ID);
            if (pluginPreference == null) {
                return false;
            }
            return pluginPreference.getBoolean(OctaneConstants.PREF_OCTANE_ENABLED, false);
        } catch (ResourceException e) {
            return false;
        }
	}

}
