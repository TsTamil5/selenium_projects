package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing Suite-- and connecting to the database", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("--Executing System Testcases--", true);
	}

	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Login with valid credentials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("--Executing method--", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("--Executing method completed--", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("--Executing of addToCart class complated", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("--Executing System Test completed--", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("--Executing Suite completed--", true);
	}

}
