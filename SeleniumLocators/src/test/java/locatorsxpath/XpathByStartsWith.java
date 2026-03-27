package locatorsxpath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathByStartsWith {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();
		
//		driver.get("https://www.ebay.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@id,'g')]")).sendKeys("remote control car");
		
	}

}
