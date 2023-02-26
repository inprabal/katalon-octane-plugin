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

package com.katalon.plugin.octane;



import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import com.katalon.plugin.octane.exception.ValidationException;
import com.katalon.plugin.octane.tests.TestResult;
import com.katalon.plugin.octane.tests.TestSuite;
import com.katalon.plugin.octane.xml.JunitXmlIterator;
import com.katalon.plugin.octane.xml.TestResultXmlWriter;

public class XmlProcessor {
	
	
    public List<TestResult> processJunitTestReport(File junitTestReport, Long started) throws ValidationException {
        if (junitTestReport == null || !junitTestReport.canRead()) {
            String filePathInfo = (junitTestReport == null) ? "" : ": " + junitTestReport.getAbsolutePath();
            throw new ValidationException("Can not read the JUnit XML file" + filePathInfo);
        }
        
        List<TestResult> testResults = new LinkedList<TestResult>();
        try {
            JunitXmlIterator iterator = new JunitXmlIterator(junitTestReport, started);
            while (iterator.hasNext()) {
                testResults.add(iterator.next());
            }
        } catch (IOException e) {
            throw new ValidationException("Unable to process JUnit XML file '" + junitTestReport.getAbsolutePath() + "': " + e.getMessage());
        } catch (XMLStreamException e) {
           throw new ValidationException("Unable to process JUnit XML file '" + junitTestReport.getAbsolutePath() + "', XML stream exception has occurred: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new ValidationException("Unable to process JUnit XML file '" + junitTestReport.getAbsolutePath() + "', thread was interrupted: " + e.getMessage());
        } catch (RuntimeException e) {
            throw new ValidationException("Unable to process JUnit XML file '" + junitTestReport.getAbsolutePath() + "', XSD validation was not successful: " + e.getMessage());
        }

        if (testResults.isEmpty()) {
            System.out.println("No valid test results to push in JUnit XML file '" + junitTestReport.getAbsolutePath() + "'");
            throw new ValidationException("No valid test results to push in JUnit XML file '" + junitTestReport.getAbsolutePath() + "'");
        }
        return testResults;
    }

    public void writeTestResults(List<TestResult> testResults, Settings settings, File targetPath) throws ValidationException {
        
    	if (targetPath == null || !targetPath.canWrite()) {
            String filePathInfo = (targetPath == null) ? "" : ": " + targetPath.getAbsolutePath();
            throw new ValidationException("Can not write test results to file" + filePathInfo);
        }
        TestResultXmlWriter testResultXmlWriter = new TestResultXmlWriter(targetPath);
        try {
            testResultXmlWriter.add(testResults, settings);
        } catch (InterruptedException e) {
            throw new ValidationException("Unable to process test results to file '" + targetPath.getAbsolutePath() + "', thread was interrupted: " + e.getMessage());
        } catch (XMLStreamException e) {
            throw new ValidationException("Unable to process test results to file '" + targetPath.getAbsolutePath() + "', XML stream exception has occurred: " + e.getMessage());
        } catch (IOException e) {
            throw new ValidationException("Unable to process test results to file '" + targetPath.getAbsolutePath() + "': " + e.getMessage());
        } finally {
            try {
                testResultXmlWriter.close();
            } catch (XMLStreamException e) {
                throw new ValidationException("Can not close the XML file'" + targetPath.getAbsolutePath() + "'" + e.getMessage());
            }
        }
    }
}
