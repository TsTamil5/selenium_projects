package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	//Capture Web page
		public String captureScreenshot(WebDriver driver, String testName) throws IOException {
			// Creating a method for time-stamp
			String timestamp = new SimpleDateFormat("yyyy-mm-dd[hh-ss]").format(new Date());
			String path ="./Reports/" +testName+"_"+timestamp + ".png";
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File temp = ts.getScreenshotAs(OutputType.FILE);
//			File temp = ts.getScreenshotAs(OutputType.FILE);
			try {
				File perm = new File(path);
				FileHandler.copy(temp, perm);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return path;
		}
		
		//capture web element
		public String captureScreenshot(WebElement element,String elementName) {
			String timestamp = new SimpleDateFormat("yyyy-mm-dd[hh-ss]").format(new Date());
			String path = "./Reports/" +elementName+"_"+timestamp + ".png";
			
			File temp = element.getScreenshotAs(OutputType.FILE);
			try {
				File perm = new File(path);
				FileHandler.copy(temp, perm);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return path;
		}
	
	
}
