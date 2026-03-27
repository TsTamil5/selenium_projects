package seleniumWait;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allId=driver.getWindowHandles();
		for(String s:allId) {
			if(s.contains("youtube")) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.name("search_query")).sendKeys("Kaadhal aasai yaarai vitatho");
		driver.findElement(By.cssSelector("[title='Search']")).click();
		

	}

}
