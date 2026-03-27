package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
		// step1 Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		// step2 Navigate to web page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		
		// step3 Enter the username and password
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement homepage=driver.findElement(By.xpath("//h6"));
		if(homepage.isDisplayed()) {
			System.out.println("The home page is Displayed");
		}
		else {
			System.out.println("The home page is not displayed");
		}
	}
}
