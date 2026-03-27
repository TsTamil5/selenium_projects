package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class NearRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		// near() [here 100 is pixel size,it is optional]
		WebElement firstName = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(firstName, 100)).sendKeys("V");
		

	}

}
