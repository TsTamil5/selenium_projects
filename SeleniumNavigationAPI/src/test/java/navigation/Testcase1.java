package navigation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Automation");
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tools");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
	}

}
