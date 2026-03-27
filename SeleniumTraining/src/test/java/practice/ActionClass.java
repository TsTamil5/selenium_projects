package practice;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		// using clickAndHold
		WebElement ele=driver.findElement(By.id("circle"));
		Actions act=new Actions(driver);
		
		// clickAndHold
//		act.clickAndHold(ele).build().perform();// selenium 3
//		act.clickAndHold(ele).perform();// selenium 4
		
		// clickAndHold,pause,release
//		act.clickAndHold(ele).pause(4000).release().perform();
		act.moveToElement(ele).clickAndHold().pause(4000).release().perform();

	}

}
