package locatorsxpath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		// xpath by attribute
		
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='flex-1\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();

	}

}
