package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		// Id method
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
//		WebElement we=driver.findElement(By.id("APjFqb"));
//		we.sendKeys("tamil");
		
//		driver.get("https://chatgpt.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("prompt-textarea")).sendKeys("selenium");
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("selenium");
		
//		driver.get("https://github.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("hero_user_email")).sendKeys("selenium");
	
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bracelet");

//		driver.get("https://www.netflix.com/in/");
//		Thread.sleep(2000);
//		driver.findElement(By.id(":r0:")).sendKeys("movie");

//		driver.get("https://www.hackerrank.com/work/free-trial");
//		Thread.sleep(2000);
//		driver.findElement(By.id("first_name")).sendKeys("Tamilselvi");

//		driver.get("https://in.bookmyshow.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("dummy")).sendKeys("Chennai");
		
	}

}
