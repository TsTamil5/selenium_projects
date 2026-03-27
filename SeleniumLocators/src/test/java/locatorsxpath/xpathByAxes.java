package locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']/child::input")).click();
		
//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//p[text()='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div/child::div[@class='sliderFoot']/child::div/child::a")).click();

	}

}
