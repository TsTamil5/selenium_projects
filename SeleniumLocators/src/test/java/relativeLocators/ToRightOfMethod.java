package relativeLocators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToRightOfMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		WebElement search=driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("Computers");
//		Thread.sleep(2000);
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).click();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement web=driver.findElement(By.linkText("WebTable"));
		Thread.sleep(2000);
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(web)).click();
		
		

	}

}
