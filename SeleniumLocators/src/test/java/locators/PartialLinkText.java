package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		// partialLinkText method

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Comp")).click();

		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Cart")).click();

	}

}
