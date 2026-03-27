package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/33");
		Thread.sleep(5000);
		WebElement check=driver.findElement(By.id("Check"));
		System.out.println("Is my check button is enabled: "+check.isEnabled());
	}

}
