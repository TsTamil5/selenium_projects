package locatorsxpath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBySurroundings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/ecommerce?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Samsung']/..//input[@class='mr-2 h-5 w-5']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[.='RedMi']/..//input[@class='mr-2 h-5 w-5']")).click();
	}

}
