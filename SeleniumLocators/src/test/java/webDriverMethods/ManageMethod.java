package webDriverMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
//		Options ref=driver.manage();
//		Window w=ref.window();
//		w.maximize();
		
		// optimized code
		
		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// minimize
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		// fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
