package handlingDropDowns;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
//		deselect by index
		sel.deselectByIndex(6);
		Thread.sleep(2000);
//		deselect by value
		sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
		Thread.sleep(2000);
//		deselect by visible text
		sel.deselectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
//		deselect by Contains visible text
		sel.deSelectByContainsVisibleText("Pierced Owl");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
		
		sel.deselectAll();
	}

}
