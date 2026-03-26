package HandlingJavaScriptPopup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// clicking on the search button without typing anything
		WebElement search=driver.findElement(By.cssSelector("[class='button-1 search-box-button']"));
		search.click();
		Thread.sleep(2000);
		
		// Handling the popup
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// search computers
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		Thread.sleep(1000);
		search.click();

	}

}
