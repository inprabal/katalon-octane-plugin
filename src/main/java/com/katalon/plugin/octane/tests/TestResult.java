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
package com.katalon.plugin.octane.tests;

import java.io.Serializable;

final public class TestResult implements Serializable {

    private final TestSuite testSuite;
	private final String packageName;
    private final String className;
    private final String testName;
    private TestResultStatus result;
    private final long duration;
    private final long started;
    private String errorType;
    private String errorMsg;
    private String errorDetail;
    private String stackTraceStr;

    public TestResult(TestSuite testSuite,String packageName, String className, String testName, TestResultStatus result, long duration, long started) {
        this.packageName = packageName;
        this.className = className;
        this.testName = testName;
        this.result = result;
        this.duration = duration;
        this.started = started;
        this.testSuite=testSuite;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getTestName() {
        return testName;
    }

    public TestResultStatus getResult() {
        return result;
    }

    public long getDuration() {
        return duration;
    }

    public long getStarted() {
        return started;
    }

    public void setFailedInfo(String errorType, String errorMsg, String stackTraceStr) {
        this.errorType = errorType;
        this.errorMsg = errorMsg;
        this.stackTraceStr = stackTraceStr;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getStackTraceStr() {
        return stackTraceStr;
    }
    
  
	public TestSuite getTestSuite() {
		return testSuite;
	}

	@Override
	public String toString() {
		return "TestResult [testSuite=" + testSuite + ", packageName=" + packageName + ", className=" + className
				+ ", testName=" + testName + ", result=" + result + ", duration=" + duration + ", started=" + started
				+ ", errorType=" + errorType + ", errorMsg=" + errorMsg + ", stackTraceStr=" + stackTraceStr + "]";
	}
	

	
    
}
