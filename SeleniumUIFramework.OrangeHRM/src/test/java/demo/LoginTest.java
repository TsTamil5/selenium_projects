package demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.generic_utility.FileUtility;
import com.orangehrm.seleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login Test");
		
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu=new WebDriverUtility(driver);
		FileUtility fiu=new FileUtility();
		LoginPage lp=new LoginPage(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(20);
		
		String url=fiu.getPropertyKeyValue("url");
		String un=fiu.getPropertyKeyValue("username");
		String pass=fiu.getPropertyKeyValue("password");
		
		// Navigating to application
		wdu.navigateToApplication(url);
		test.log(Status.INFO,"Navigated to OrangeHRM login page");
	//	test.info("Navigating to OrangeHRM login page");
		lp.login(un, pass);
		test.log(Status.PASS,"Login Successful");
	//	test.pass("Login Successful");
		extent.flush();
	}
}
