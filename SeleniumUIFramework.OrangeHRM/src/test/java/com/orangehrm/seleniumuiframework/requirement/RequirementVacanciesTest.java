package com.orangehrm.seleniumuiframework.requirement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RequirementVacanciesTest {

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
	public void requirement() throws InterruptedException {
		driver.findElement(By.cssSelector("[href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		driver.findElement(By.linkText("Vacancies")).click();
		// click add
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		// vacancy name
		driver.findElement(By.xpath("//label[.='Vacancy Name']/../..//input")).sendKeys("Account Assistant");
		// job title
		WebElement drop=driver.findElement(By.cssSelector("[class='oxd-select-text oxd-select-text--active']"));
		Actions action=new Actions(driver);
		action.click(drop).pause(2000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		// description
		driver.findElement(By.xpath("//label[.='Description']/../..//textarea")).sendKeys("i miss deviiiiiiii");
		// hiring manager
		WebElement sendName=driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		sendName.sendKeys("Th");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Thomas Kutty Benny']")).click();
		// No of popsitions
		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//input")).sendKeys("30");
		Thread.sleep(2000);
		// click save
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
}
