package relativeLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class LearningRelativeLocators{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		WebElement firstName=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstName.sendKeys("Tamilselvi");
		Thread.sleep(1000);
		
		WebElement lastName=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstName));
		lastName.sendKeys("V");
		Thread.sleep(1000);
		
		driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(lastName)).sendKeys("Chennai");
		
		
	}

}
