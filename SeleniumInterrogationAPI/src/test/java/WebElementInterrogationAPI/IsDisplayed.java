package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		WebElement btn=driver.findElement(By.xpath("//button[.='Register']"));
		
		// Verifying the button is displayed or not
		System.out.println("Is the button is displayed?: "+btn.isDisplayed());

	}

}
