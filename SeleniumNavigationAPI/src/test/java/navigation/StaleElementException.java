package navigation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Mobile");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
//		search.sendKeys("Mobile"); // staleElementReferenceException
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Samsung Mobile");
	}

}
