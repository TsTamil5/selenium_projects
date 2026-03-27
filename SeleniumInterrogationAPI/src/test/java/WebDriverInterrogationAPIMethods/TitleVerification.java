package WebDriverInterrogationAPIMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// Fetching the title
		String ExpectedTitle="Demo Web Shop";
		String title=driver.getTitle();
		if(title.equals(ExpectedTitle)) {
			System.out.println("The Navigation is Success");
		}
		else {
			System.out.println("Navigation Failed");
		}
		driver.quit();

	}

}
