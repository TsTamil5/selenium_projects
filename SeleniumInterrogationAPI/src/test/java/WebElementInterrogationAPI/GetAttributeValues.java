package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// Locating search field
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		// fetching value for static attribute
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		System.out.println();
		
		// fetching value for dynamic attribute
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		System.out.println();
		
		// typing toys to change the data of the value Attribute 
		search.sendKeys("Toys");
		System.out.println(search.getAttribute("value"));// it gives current value
		System.out.println(search.getDomAttribute("value"));// it gives default value
		System.out.println(search.getDomProperty("value"));// it gives current value
		
		driver.quit();
	}

}
