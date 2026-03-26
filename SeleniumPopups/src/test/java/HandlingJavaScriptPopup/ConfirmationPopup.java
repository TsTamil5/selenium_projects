package HandlingJavaScriptPopup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href='#CancelTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		// handle the popup and print the msg on
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
//		alt.dismiss();//click cancel
		alt.accept();//click ok

	}

}
