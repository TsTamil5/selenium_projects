package practice;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("[href='http://www.orangehrm.com']")).click();
		Thread.sleep(4000);
		
		String parentId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String childWindowId:allWindowId) {
			driver.switchTo().window(childWindowId);
		}
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().contains("orangehrm.com")) {
			System.out.println("Url contains orangehrm.com");
		}
		else {
			System.out.println("Url not contains orangehrm.com");
		}
		
		String title=driver.getTitle();
		System.out.println(title.isEmpty());
		
		driver.switchTo().window(parentId);
		WebElement login=driver.findElement(By.cssSelector("[class='oxd-text oxd-text--h5 orangehrm-login-title']"));
		Thread.sleep(2000);
		System.out.println(login.isDisplayed());
		
		driver.close();

	}

}
