package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// Locating the search text field
		WebElement search=driver.findElement(By.name("q"));
		// Fetching the location
		Point loc=search.getLocation();
		// Fetch x Offset
		System.out.println(loc.getX());
		System.out.println(loc.x);
		// Fetch y Offset
		System.out.println(loc.getY());
		System.out.println(loc.y);
	}

}
