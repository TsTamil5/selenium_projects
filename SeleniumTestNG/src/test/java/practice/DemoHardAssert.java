package practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		// Hard Assertion
		
//		Assert.assertEquals(actualTitle, expectedTitle);
//		Assert.assertEquals(expectedTitle.equals(actualTitle),true);
		Assert.assertTrue(expectedTitle.equals(actualTitle));
		
		
		// if the condition fails the if else statement will not be validated
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Status: Pass");
//		}
//		else {
//			System.out.println("Status: Fail");
//		}
	}
}
