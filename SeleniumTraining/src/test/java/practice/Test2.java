package practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		WebElement we=driver.findElement(By.xpath("//div[@role='option']//span[.='Admin']"));
		System.out.println(we.getText());
		we.click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		WebElement we2=driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']"));
		System.out.println(we2.getText());
		we2.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //button[@type='button' and contains(.,'Cancel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
