package handlingDropDowns;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		// Locating the skills Dropdown
		WebElement dropDown=driver.findElement(By.id("Skills"));
		// Making object of select class
		Select sel=new Select(dropDown);
		// calling select method by index
		sel.selectByIndex(9);
		Thread.sleep(2000);
		// By value Attribute
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		// By visible Text
		sel.selectByVisibleText("Implementation");
		Thread.sleep(2000);
		// by containsVisibleText
		sel.selectByContainsVisibleText("script");
		
		// fetching options from the dropdown
		List<WebElement> options=sel.getOptions();
		for(WebElement o:options) {
			System.out.println(o.getText());
		}
	}

}
