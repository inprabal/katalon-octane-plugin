package com.katalon.plugin.octane;

import org.eclipse.jface.preference.PreferencePage;

import com.katalon.platform.api.extension.PluginPreferencePage;

public class OctanePluginPreferencePage implements PluginPreferencePage {

    @Override
    public String getName() {
        return "Octane";
    }

    @Override
    public String getPageId() {
        return "com.katalon.plugin.octane.OctanePluginPreferencePage";
    }

    @Override
    public Class<? extends PreferencePage> getPreferencePageClass() {
        return OctanePreferencePage.class;
    }

}
