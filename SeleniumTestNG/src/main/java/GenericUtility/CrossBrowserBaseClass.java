package GenericUtility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserBaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing Suite-- and connecting to the database", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("--Executing System Testcases--", true);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--incognito");
		copt.addArguments("--headless");
		
		EdgeOptions eopt = new EdgeOptions();
		eopt.addArguments("--inprivate");
		eopt.addArguments("--headless");
		
		FirefoxOptions fopt = new FirefoxOptions();
		fopt.addArguments("--headless=new");
		fopt.addArguments("--headless");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(copt);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(eopt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(fopt);
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
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
