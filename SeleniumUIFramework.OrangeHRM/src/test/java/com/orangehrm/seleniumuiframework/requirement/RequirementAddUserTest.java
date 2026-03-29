package com.orangehrm.seleniumuiframework.requirement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RequirementAddUserTest {
	WebDriver driver = null;

	@Test
	public void login() {
		driver = new ChromeDriver();
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
		// click add
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		// full name
		driver.findElement(By.name("firstName")).sendKeys("Tamilselvi");
		driver.findElement(By.name("middleName")).sendKeys("Dharani");
		driver.findElement(By.name("lastName")).sendKeys("V");
		// vacancy
		WebElement vacancy = driver.findElement(By.cssSelector("[class='oxd-select-text-input']"));
		Actions action = new Actions(driver);
		action.click(vacancy).pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER)
				.perform();
		// email
		driver.findElement(By.xpath("//label[.='Email']/../..//input")).sendKeys("dharani@gmail.com");
		// mobile no
		driver.findElement(By.xpath("//label[.='Contact Number']/../..//input")).sendKeys("9876543210");
		// resume upload
		driver.findElement(By.cssSelector("[type='file']"))
				.sendKeys("C:\\Users\\sivap\\Downloads\\STA -UNIT I-notes (1).pdf");
		// date
		driver.findElement(By.xpath("//label[.='Date of Application']/../..//input")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		// save
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		// click candidates
		driver.findElement(By.linkText("Candidates")).click();
		
		
//		// jobtitle
//		WebElement jobtitle = driver.findElement(By.xpath("//label[.='Job Title']/../../..//div[@class='oxd-select-wrapper']"));
//		Actions action2 = new Actions(driver);
//		action2.click(jobtitle).pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		
		// vacancy
		WebElement vacancy2 = driver.findElement(By.xpath("//label[.='Vacancy']/../../..//div[@class='oxd-select-wrapper']"));
		Actions action3 = new Actions(driver);
		action3.click(vacancy2).pause(4000).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		
//		// hiringManager
//		WebElement hiringManager = driver.findElement(By.xpath("//label[.='Hiring Manager']/../../..//div[@class='oxd-select-wrapper']"));
//		Actions action4 = new Actions(driver);
//		action4.click(hiringManager).pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		
		// status
		WebElement status = driver.findElement(By.xpath("//label[.='Status']/../../..//div[@class='oxd-select-wrapper']"));
		Actions action5 = new Actions(driver);
		action5.click(status).pause(2000).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
		
		// candidate name
		WebElement name = driver.findElement(By.cssSelector("[placeholder='Type for hints...']"));
		name.sendKeys("Ta");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Tamilselvi Dharani V']")).click();
		
		// date
		driver.findElement(By.xpath("//label[.='Date of Application']/../..//input")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		
		// search
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		// verifying
		WebElement record=driver.findElement(By.xpath("//span[.='(1) Record Found']"));
		System.out.println("Is the user added successfully: "+record.isDisplayed());

		// logout
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Logout")).click();

	}
}
