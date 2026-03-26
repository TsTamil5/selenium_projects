package HandlingJavaScriptPopup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href='#Textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("Tamil");
		popup.accept();

	}

}
