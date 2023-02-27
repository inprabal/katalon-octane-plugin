/*
 *     Copyright 2017 EntIT Software LLC, a Micro Focus company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.katalon.plugin.octane.xml;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.commons.lang3.StringUtils;

import com.hpe.adm.nga.sdk.enums.lists.list_node.run_native_status.RunNativeStatus;
import com.katalon.plugin.octane.tests.TestResult;
import com.katalon.plugin.octane.tests.TestResultStatus;
import com.katalon.plugin.octane.tests.TestSuite;

public class JunitXmlIterator extends AbstractXmlIterator<TestResult> {
	

	final String cStart = "<![CDATA[";
	final String cEnd = "]]>";
	
	private String suiteID;
	private Map<String,String> suiteProps = new HashMap<>();
    private String packageName;
    private String className;
    private String testName;
    private TestResultStatus status;
    private long duration;
    private long started;    
    private String stackTraceStr;
    private String errorType;
    private String errorMsg;
    private boolean allowStackTraceAggregation;

    
    public JunitXmlIterator(File junitXmlFile, Long started) throws XMLStreamException, IOException {
        super(junitXmlFile);
        this.started = (started == null) ? System.currentTimeMillis() : started;
    }

    @Override
    protected void onEvent(XMLEvent event) throws IOException {
        Iterator attrIterator;
        if (event instanceof StartElement) {
            StartElement element = (StartElement) event;
            String localName = element.getName().getLocalPart();
            if("testsuite".equals(localName)) {
            	attrIterator = element.getAttributes();
            	 while (attrIterator.hasNext()) {
                     Attribute attribute = (Attribute) attrIterator.next();
                     if ("id".equals(attribute.getName().toString())) {
                         suiteID=restrictSizeTo255(attribute.getValue());;
                     } 
                 }
            	
            }
            else if("property".equals(localName)) {
            	String key=null;
            	String value=null;
            	attrIterator = element.getAttributes();
                while (attrIterator.hasNext()) {
                	 Attribute attribute = (Attribute) attrIterator.next();
                     if ("name".equals(attribute.getName().toString())) {
                    	 key=attribute.getValue();
                     } 
                     else if("value".equals(attribute.getName().toString())) {
                    	 value=attribute.getValue();
                     }
                } 
                if(StringUtils.isNoneBlank(key)) {
                	suiteProps.put(key, value);
                }
            }
            else if ("testcase".equals(localName)) { // NON-NLS
                packageName = "";
                className = "";
                testName = "";
                status = TestResultStatus.PASSED;
                duration = 0;

                attrIterator = element.getAttributes();
                while (attrIterator.hasNext()) {
                    Attribute attribute = (Attribute) attrIterator.next();
                    if ("classname".equals(attribute.getName().toString())) {
                        parseClassname(attribute.getValue());
                    } else if ("name".equals(attribute.getName().toString())) {
                    	//updated by prabal for Katalon
                        //testName = restrictSizeTo255(attribute.getValue());
                    } else if ("time".equals(attribute.getName().toString())) {
                        duration = parseDuration(attribute.getValue());
                    }
                }
            } else if ("skipped".equals(localName)) { // NON-NLS
                status = TestResultStatus.SKIPPED;
            } else if ("failure".equals(localName)) { // NON-NLS
                allowStackTraceAggregation = true;
                status = TestResultStatus.FAILED;
                stackTraceStr = "";
                attrIterator = element.getAttributes();
                while (attrIterator.hasNext()) {
                    Attribute attribute = (Attribute) attrIterator.next();
                    if ("message".equals(attribute.getName().toString())) {
                    	errorMsg = attribute.getValue();
                    } else if ("type".equals(attribute.getName().toString())) {
                        errorType = attribute.getValue();
                    }
                }
            }
            else if ("error".equals(localName)) { // NON-NLS
                allowStackTraceAggregation = true;
                status = TestResultStatus.FAILED;
                stackTraceStr = "";
                attrIterator = element.getAttributes();
                while (attrIterator.hasNext()) {
                    Attribute attribute = (Attribute) attrIterator.next();
                    if ("message".equals(attribute.getName().toString())) {
                        errorMsg = attribute.getValue();
                    } else if ("type".equals(attribute.getName().toString())) {
                        errorType = attribute.getValue();
                    }
                }
            }
            
        } else if (event instanceof EndElement) {
            EndElement element = (EndElement) event;
            String localName = element.getName().getLocalPart();
            allowStackTraceAggregation = false;
            if ("testcase".equals(localName) && StringUtils.isNotEmpty(testName)) { // NON-NLS
            	TestSuite ts = new TestSuite(suiteID, suiteProps);
                TestResult tr = new TestResult(ts,packageName, className, testName, status, duration, started);
                if(TestResultStatus.FAILED.equals(status)){
                    tr.setFailedInfo(errorType, errorMsg, stackTraceStr);
                }
                addItem(tr);
            }
        } else if (event instanceof Characters) {
            if (allowStackTraceAggregation) {
                stackTraceStr += ((Characters) event).getData();
            }
        }
    }

    private String restrictSizeTo255(String value) {
        int RESTRICT_SIZE = 255;
        String result = value;
        if (value != null && value.length() > RESTRICT_SIZE) {
            result = value.substring(0, RESTRICT_SIZE);
        }
        return result;
    }

    private long parseDuration(String timeString) {
        try {
            float seconds = Float.parseFloat(timeString);
            return (long) (seconds * 1000);
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse test duration: " + timeString);
        }
        return 0;
    }

    private void parseClassname(String fqn) {
        int p = fqn.lastIndexOf("/");
        className = fqn.substring(p + 1);
        // added by prabal for Katalon
        testName = restrictSizeTo255(className);
        if (p > 0) {
            packageName = fqn.substring(0, p);
        } else {
            packageName = "";
        }
    }
}
