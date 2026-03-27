package WebElementAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		// writing firstname
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("Tamil");
		// writing lastname
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("V");
		Thread.sleep(2000);
		// clearing the firstname
		firstname.clear();
		Thread.sleep(2000);
		// rewrite the firstname
		firstname.sendKeys("Tamilselvi");
		
		
	}

}
