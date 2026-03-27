package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LinkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		// linkText method

//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		// locate fb link
//		driver.findElement(By.linkText("Facebook")).click();

		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();

	}

}
