package relativeLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BelowMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Tamilselvi");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("tamil@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		password.sendKeys("@1234567");
		Thread.sleep(2000);
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();

	}

}
