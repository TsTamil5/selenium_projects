package webDriverMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetSize {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		
		// getSize
		
		System.out.println(driver.manage().window().getSize()); // returns (int width,int height)
		Thread.sleep(2000);
		
		
		// setSize
		
		Dimension dim=new Dimension(1500,500);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.quit();

	}

}
