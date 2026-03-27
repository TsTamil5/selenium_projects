package practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ahmed");
		Thread.sleep(10000);
		WebElement we=driver.findElement(By.xpath("//div[@role='option']"));
		if(we.isDisplayed() && we.getText().contains("Ahmed")) {
			we.click();
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
