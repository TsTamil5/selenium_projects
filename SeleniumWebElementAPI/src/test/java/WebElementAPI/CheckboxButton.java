package WebElementAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement cricket=d.findElement(By.id("checkbox1"));
		cricket.click();
		Thread.sleep(2000);
//		cricket.clear();// InvalidElementStateException
		cricket.click();
	}

}
