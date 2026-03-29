package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ListenerImplementation implements ITestListener{
	ExtentReports extent = ExtentReportsUtility.ExtentInstance();
//	ExtentReports extent=new ExtentReports();
	ThreadLocal<ExtentTest> test=new ThreadLocal<>();
	
//	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_result.html");
//	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et=extent.createTest(result.getMethod().getMethodName());
		test.set(et);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status : Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		
		Object obj=result.getInstance();
		BaseClass bsc=(BaseClass)obj;
		WebDriver driver=bsc.driver;
		ScreenshotUtility sc=new ScreenshotUtility();
		try {
			String path=sc.captureScreenshot(driver,result.getMethod().getMethodName());
			//Attach screenshot on report
			test.get().addScreenCaptureFromPath(path);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		extent.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Status : Skip");
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	
}
