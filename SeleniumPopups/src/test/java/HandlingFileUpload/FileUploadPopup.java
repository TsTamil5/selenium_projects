package HandlingFileUpload;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		// Avoiding the file upload popup
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\sivap\\OneDrive\\Desktop\\paper details\\depression Manuscripts.pdf");
	}

}
