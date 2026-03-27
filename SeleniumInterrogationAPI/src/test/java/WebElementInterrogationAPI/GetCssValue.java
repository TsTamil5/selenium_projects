package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']"));
		System.out.println(logo.getCssValue("display"));
		System.out.println(logo.getCssValue("margin"));
		System.out.println(logo.getCssValue("height"));
		System.out.println(logo.getCssValue("background-color"));
	}

}
