package HandlingJavaScriptPopup;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[placeholder='Search for products, brands and more']")).sendKeys("Dresses");
		driver.findElement(By.cssSelector("[class='desktop-submit']")).click();
		driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		
		String parentId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String childWindowId:allWindowId) {
			driver.switchTo().window(childWindowId);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
		Thread.sleep(5000);
		WebElement signup=driver.findElement(By.cssSelector("[class='welcome-header']"));
		if(signup.isDisplayed()) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}

	}

}
