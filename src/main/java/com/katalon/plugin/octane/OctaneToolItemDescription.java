package com.katalon.plugin.octane;

import com.katalon.platform.api.extension.ToolItemDescription;
import com.katalon.platform.api.service.ApplicationManager;
import com.katalon.platform.api.ui.DialogActionService;

public class OctaneToolItemDescription implements ToolItemDescription {

    @Override
    public String name() {
        return "Octane";
    }

    @Override
    public String toolItemId() {
        return OctaneConstants.PLUGIN_ID + ".octaneToolItem";
    }

    @Override
    public String iconUrl() {
        return "platform:/plugin/" + OctaneConstants.PLUGIN_ID + "/icons/icon.png";
    }

    @Override
    public void handleEvent() {
        ApplicationManager.getInstance().getUIServiceManager().getService(DialogActionService.class).openPluginPreferencePage(
                OctaneConstants.PREF_PAGE_ID);
    }

    @Override
    public boolean isItemEnabled() {
        return true;
    }
}
