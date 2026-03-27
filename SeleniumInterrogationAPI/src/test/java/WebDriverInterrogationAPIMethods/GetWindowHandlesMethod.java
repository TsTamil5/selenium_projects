package WebDriverInterrogationAPIMethods;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
//		Fetching the window ID of parent window
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
//		click on a tab to get a child window
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		
		// remove the parent id
		allWindowIds.remove(parentId);
		// printing the child id after removing parent id
		System.out.println(allWindowIds);
		
		// iteration mandatory for switch driver control
		for(String s:allWindowIds) {
			System.out.println(s);
		}
		
		driver.quit();

	}

}
