package com.katalon.plugin.octane;

import com.katalon.platform.api.Plugin;
import com.katalon.platform.api.extension.PluginActivationListener;

public class OctaneActivationListener implements PluginActivationListener {

	@Override
	public void afterActivation(Plugin plugin) {

		System.out.println("Hello, Octane plugin is: " + plugin.getPluginId());
	}
	
	

}
