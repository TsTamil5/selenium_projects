package HandlingChildWindowPopup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		// to open new tab and parallely switching the tool control
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		

	}

}
