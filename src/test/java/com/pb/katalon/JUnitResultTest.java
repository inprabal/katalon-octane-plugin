package com.pb.katalon;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.katalon.plugin.octane.Settings;
import com.katalon.plugin.octane.XmlProcessor;
import com.katalon.plugin.octane.tests.TestResult;

public class JUnitResultTest {
	
	@Test
	public void parseJunitFile() {
		XmlProcessor proc = new  XmlProcessor();
		
		File junitxml = new File(this.getClass().getClassLoader().getResource("JUnit_Report.xml").getFile());
		
		List<TestResult> result=proc.processJunitTestReport(junitxml, null);
		
		System.out.println(result);
		
		Settings settings = new Settings();
		
		File output = new File("D:\\eclipse\\projects\\katalon-octane-plugin\\temp\\out.txt");
		
		proc.writeTestResults(result, settings, output);
		
	}

}
