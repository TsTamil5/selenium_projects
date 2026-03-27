package GenericUtility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DemoBaseClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing BeforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing AfterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Executing AfterTest");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing AfterSuite");
	}


}
