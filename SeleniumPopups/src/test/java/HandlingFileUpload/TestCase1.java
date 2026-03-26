package HandlingFileUpload;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='main-2' and contains(.,' I have work experience (excluding internships)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='uploadAction']")).sendKeys("C:\\Users\\sivap\\OneDrive\\Desktop\\paper details\\depression Manuscripts.pdf");
		
	}

}
