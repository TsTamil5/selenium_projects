package locators;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		// tagName method
		
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.tagName("a")).click();

		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//locating all the links in the page using findElements
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links){
			System.out.println(link.getText());
		}
		
		//fetch the name of the each link
		for(WebElement link:links) {
			if(link.getText().contains("Store")) {
				link.click();
				break;
			}
		}
		

		
	}

}
