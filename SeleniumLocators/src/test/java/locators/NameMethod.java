package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		// name maethod

		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("selenium");

		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(10000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");

	}

}
