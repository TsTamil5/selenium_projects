package locatorsxpath;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// xpath by text() function/ .

		
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 Thread.sleep(2000); // clicking on xpath
		 driver.findElement(By.xpath("//section[.='X Path']")).click();
		 Thread.sleep(2000); // login 3.0
		 driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		 

		
//		 driver.get("https://demowebshop.tricentis.com/"); Thread.sleep(2000);
//		 List<WebElement>links=driver.findElements(By.xpath("//input[@type='radio']")); 
//		 for(WebElement link:links) { 
//			 link.click(); 
//			 Thread.sleep(1000);
//		 }
		 

	}

}
