package locatorsxpath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathByMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.ebay.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class='vl-flyout-nav__link-container' and @href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545']")).click();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstName")).sendKeys("Tamilselvi");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys("V");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("tamil@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='oxd-icon bi-trash']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Logout")).click();
	}

}
