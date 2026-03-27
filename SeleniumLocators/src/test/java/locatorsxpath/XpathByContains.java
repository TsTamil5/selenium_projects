package locatorsxpath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		// xpath by contains

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Shop')]")).click();
		// selects complete text content including child elements
		
//		driver.findElement(By.xpath("//span[contains(text(),'Shop')]")).click(); 
		// selects direct text node of an element

	}

}
