package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		// Locate the search button
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Dimension dims=search.getSize();
		System.out.println("The dimension of search button is: "+dims);
		// Fetch the height
		System.out.println(dims.getHeight());
		System.out.println(dims.height);
		//Fetch the width
		System.out.println(dims.getWidth());
		System.out.println(dims.height);
		System.out.println(search.getCssValue("height"));

	}

}
