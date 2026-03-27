package handlingDropDowns;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		// Locating the listbox
		WebElement listbox=driver.findElement(By.id("cars"));
		// Select class object
		Select sel=new Select(listbox);
		// Select few options
		sel.selectByVisibleText("Opel");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		System.out.println(sel.getFirstSelectedOption().getText());
		// verifying if all the options above are selected or not
		List<WebElement> seloptions=sel.getAllSelectedOptions();
		System.out.println();
		for(WebElement op:seloptions) {
			System.out.println(op.getText());
		}
		driver.quit();

	}

}
