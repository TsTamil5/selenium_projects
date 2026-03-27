package WebDriverInterrogationAPIMethods;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskUsingSwitchTo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		d.findElement(By.partialLinkText("Facebook")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Twitter")).click();
		Thread.sleep(2000);
		
		Set<String> set=d.getWindowHandles();
		for(String str:set) {
			d.switchTo().window(str);
			String tittle=d.getTitle();
			Thread.sleep(2000);
			System.out.println("Id: "+str);
			System.out.println("Tittle: "+tittle);
			System.out.println();
		}
		d.quit();

	}

}
