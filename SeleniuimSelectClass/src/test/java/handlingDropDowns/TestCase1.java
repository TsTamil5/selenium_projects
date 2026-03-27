package handlingDropDowns;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		// checking the listbox is a multiselect
		WebElement listbox=driver.findElement(By.id("cars"));
		Select sel=new Select(listbox);
		System.out.println(sel.isMultiple());
		
		// checking the dropdown is a multiselect
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		Select sel2=new Select(dropdown);
		System.out.println(sel2.isMultiple());
		

	}

}
