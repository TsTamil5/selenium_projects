package com.orangehrm.seleniumuiframework.generic_utility;

import org.testng.annotations.AfterClass;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

@Listeners(com.orangehrm.seleniumuiframework.generic_utility.ListenerImplementation.class)
public class BaseClass {
	
	public WebDriver driver;
	LoginPage lp;
	FileInputStream fis;
	FileUtility fiu;
	public WebDriverUtility wdu;
	public String browser;
	public DashBoardPage dsp;
	
	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("Executing BeforeSuite",true);
	}

	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("Executing BeforeTest",true);
	}

	@Parameters("BROWSER") // for parallel execution on different browsers
	@BeforeClass(groups= {"Regression","Smoke"})
	public void beforeClass() throws IOException {
		Reporter.log("--Launching the browser--",true);
		fiu=new FileUtility();
		browser=fiu.getPropertyKeyValue("browser");
		
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.contains("firefox")){
			driver=new FirefoxDriver();
		}
		wdu=new WebDriverUtility(driver);
		lp=new LoginPage(driver);
		dsp=new DashBoardPage(driver);
		
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(30);
		
	}

	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		
		Reporter.log("Executing BeforeMethod",true);
		String url=fiu.getPropertyKeyValue("url");
		String validUserName=fiu.getPropertyKeyValue("username");
		String validPassword=fiu.getPropertyKeyValue("password");
		
		//login 
		wdu.navigateToApplication(url);
		lp.login(validUserName, validPassword);
		
	}

	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("Logging out",true);
		dsp.logout();
	}

	@AfterClass
	public void configAfterClass() {
		Reporter.log("--Closing the Browser--",true);
		driver.quit();
	}

	@AfterTest
	public void configAfterTest() {
		Reporter.log("Executing AfterTest",true);
	}

	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("Executing AfterSuite",true);
	}
}
