package HandlingChildWindowPopup;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		
		String parentId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String childWindowId:allWindowId) {
			// swithching the control to child window popup
			driver.switchTo().window(childWindowId);
		}
		Thread.sleep(2000);
		
		// clicking add to cart in child window
		WebElement addToCart=driver.findElement(By.tagName("button"));
		addToCart.click();
		addToCart.click();
		Thread.sleep(2000);
		
		// click on cart logo
		WebElement cartLogo=driver.findElement(By.xpath("//*[name()='svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		
		// verifying if the shopping list is visible
		WebElement shoppingCart=driver.findElement(By.tagName("h2"));
		if(shoppingCart.isDisplayed()) {
			System.out.println("Testcase passed");
		}
		else {
			System.out.println("TestCases failed");
		}
		
		// close the child window
		driver.close();
		
	}
}
