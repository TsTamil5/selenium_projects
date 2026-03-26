package HandlingHiddenDivisionPopup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c69-9 ng-star-inserted' and .='11']")).click();

	}

}
