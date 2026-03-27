package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment8_Task2 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and @type='button']")).click();
		String url=driver.getCurrentUrl();
		if(url.contains("dashboard")) {
			System.out.println("Sucessfully logged in");
		}
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.cssSelector("[href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		WebElement s=driver.findElement(By.cssSelector("[class='ant-form-item-control-input-content']"));
		s.click();
		s.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		WebElement we=driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content'])[2]"));
		we.click();
		we.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		WebElement emp=driver.findElement(By.cssSelector("[class='ant-list-item-meta-content']"));
		System.out.println("Is Employee info is Displayed or not?: "+emp.isDisplayed());
		driver.findElement(By.cssSelector("[class='dropdown user user-menu']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();

	}

}
