package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndTag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		// Locating about Link
		WebElement aboutlink=driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of the link: "+aboutlink.getText());
		
		// fetching the tagname
		System.out.println("The tag name of the link: "+aboutlink.getTagName());
		

	}

}
