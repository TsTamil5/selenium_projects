package HandlingChildWindowPopup;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		// Searching the laptop
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		// clicking on first product
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(2000);
		Set<String> allWindowId=driver.getWindowHandles();
		String parentId=driver.getWindowHandle();
		allWindowId.remove(parentId);
		
		// switching the tool control to child tab
		for(String childId:allWindowId) {
			driver.switchTo().window(childId);
		}
		
		// clicking on add to cart button on the child tab
		driver.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		Thread.sleep(2000);
		
		// closing the tool controlled tab
		driver.close();

	}

}
