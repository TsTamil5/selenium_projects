package locators;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		// className method
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("ico-register")).click();

		
		// Iterate findElements
		
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		List<WebElement> r = driver.findElements(By.className("ico-register"));
//		for(WebElement i : r) {
//			System.out.println(i.getText());
//			i.click();
//		}
		

	}

}
