package WebDriverInterrogationAPIMethods;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentId=driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> set=driver.getWindowHandles();
		String faceBookId="";
		set.remove(parentId);
		for(String s:set) {
			System.out.println("facebook Id:"+s);
			faceBookId=s;
		}
		
		driver.findElement(By.linkText("Twitter")).click();
		set=driver.getWindowHandles();
		set.remove(parentId);
		set.remove(faceBookId);
		for(String s:set) {
			System.out.println("Twitter Id:"+s);
		}
		
	}

}
