package seleniumWait;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		//Username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Password
		driver.findElement(By.id("password")).sendKeys("admin");
		//Login
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		//Employee module
		driver.findElement(By.id("menu_admin_Employees")).click();
		//Employees link
		WebElement emp = driver.findElement(By.xpath("//li[@id='menu_admin_Employees']/descendant::a[contains(.,'Employees') and @style='margin-left: 10px;']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(emp));
		emp.click();
		//Filter employee
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		//Department
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='department']/../..//input")).click();

	}

}
