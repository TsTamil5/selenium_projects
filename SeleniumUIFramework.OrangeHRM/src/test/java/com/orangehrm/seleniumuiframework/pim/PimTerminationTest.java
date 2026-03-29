package com.orangehrm.seleniumuiframework.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PimTerminationTest {
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
		driver.findElement(By.xpath("//span[.='Configuration ']")).click();
		driver.findElement(By.linkText("Termination Reasons")).click();
		driver.findElement(By.cssSelector("[class='oxd-icon bi-plus oxd-button-icon']")).click();
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("dhaaarani is tooooo baaaaaaaaad");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		WebElement msg=driver.findElement(By.xpath("//div[.='dhaaarani is tooooo baaaaaaaaad']"));
		System.out.println("Is termination is found or not: "+msg.isDisplayed());
		
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
