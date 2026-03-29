package com.orangehrm.seleniumuiframework.pim;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class PimAddUserTest {
	WebDriver driver=null;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test(dependsOnMethods = "login")
	public void pimTestCase1() throws InterruptedException {
		
		driver.findElement(By.cssSelector("[href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.cssSelector("[class='oxd-icon bi-plus oxd-button-icon']")).click();
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("Tamil");
		driver.findElement(By.name("middleName")).sendKeys("selvi");
		driver.findElement(By.name("lastName")).sendKeys("V");
		
		// send value 
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(firstName)).sendKeys("123");
		Thread.sleep(2000);
		
		// click toggle
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		
		WebElement userName=driver.findElement(By.xpath("//label[.='Username']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName)).sendKeys("Dharani");
		
		WebElement password=driver.findElement(By.xpath("//label[.='Password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(password)).sendKeys("dharani@123");
		
		WebElement confirmPassword=driver.findElement(By.xpath("//label[.='Confirm Password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(confirmPassword)).sendKeys("dharani@123");
		Thread.sleep(2000);
		// click save
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		
		// click admin
		driver.findElement(By.cssSelector("[href='/web/index.php/admin/viewAdminModule']")).click();
		
		WebElement userName2=driver.findElement(By.xpath("//label[.='Username']"));
		
		WebElement sendName=driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName2));
		sendName.sendKeys("Dharani");
		WebElement drop=driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(sendName));
		// select Ess
		Actions action=new Actions(driver);
		action.click(drop).pause(2000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		
		WebElement empName=driver.findElement(By.xpath("//label[.='Employee Name']"));
		WebElement sendEmpName=driver.findElement(RelativeLocator.with(By.tagName("input")).below(empName));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Tamil selvi V'", sendEmpName);
		
		WebElement statusDrop=driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(sendEmpName));
		// select status
		Actions action1=new Actions(driver);
		action1.click(statusDrop).pause(2000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		// verifying
		WebElement record=driver.findElement(By.xpath("//span[.='(1) Record Found']"));
		System.out.println("Is the user added successfully: "+record.isDisplayed());
		
		// logout
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
}
