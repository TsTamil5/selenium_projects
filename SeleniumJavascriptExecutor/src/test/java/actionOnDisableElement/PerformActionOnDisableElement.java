package actionOnDisableElement;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class PerformActionOnDisableElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		
		//click on the link
		driver.findElement(By.linkText("jdk-25.0.2_doc-all.zip")).click();
		Thread.sleep(3000);
		
		//locate the disabled button
		WebElement disableBtn=driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disableBtn);

	}

}
