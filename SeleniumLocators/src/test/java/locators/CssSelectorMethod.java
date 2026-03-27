package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		// cssSelector Method

		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Tamilselvi");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("V");
				
				
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("[type='submit']")).click();
		

	}

}
