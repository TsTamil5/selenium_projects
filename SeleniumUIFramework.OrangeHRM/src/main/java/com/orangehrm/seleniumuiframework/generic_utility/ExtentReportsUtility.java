package com.orangehrm.seleniumuiframework.generic_utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsUtility {
	
	public static ExtentReports extent;
	
	public static ExtentReports ExtentInstance() {
		if(extent==null) {
			ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_reports.html");
			//ReporterConfiguration
			spark.config().setReportName("OrangeHRM UI Automation Report");
			spark.config().setDocumentTitle("Test Results");
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Automation Tester", "Tamil");
			extent.setSystemInfo("UI_Automation_Faramework", "SeleniumTestNG");
		}
		return extent;
	}
	
}
