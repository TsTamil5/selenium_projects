package practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("hmm");
		driver.findElement(By.id("password")).sendKeys("hmm");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and @type='button']")).click();
		
		WebElement we=driver.findElement(By.cssSelector("[class='fa fa-theater-masks']"));
		System.out.println("Is error message is displayed: "+we.isDisplayed());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase' and @type='button']")).click();
		
		String url=driver.getCurrentUrl();
		if(url.contains("dashboard")) {
			System.out.println("Sucessfully logged in");
		}
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.cssSelector("[href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.id("tabEmployeeSkill")).click();
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		
		WebElement we3=driver.findElement(By.xpath("//span[.='Cancel']"));
		System.out.println("is Dialog box is appear or not:"+we3.isDisplayed());
		we3.click();
		driver.findElement(By.cssSelector("[class='dropdown user user-menu']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
	}

}
