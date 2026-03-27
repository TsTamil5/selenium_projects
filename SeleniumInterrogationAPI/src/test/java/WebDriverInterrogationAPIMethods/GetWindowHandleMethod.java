package WebDriverInterrogationAPIMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
				
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			// Fetching 32 char unique session ID
			System.out.println(driver.getWindowHandle()); // Parent Id
			
			// refreshing the same web page
			driver.navigate().refresh();
			Thread.sleep(2000);
			System.out.println(driver.getWindowHandle()); // Parent Id
			
			// navigate to different website
			driver.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
			System.out.println(driver.getWindowHandle()); // Parent Id
			
			driver.quit();

	}

}
