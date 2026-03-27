package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		// navigate to youtube
		// driver.get("https://www.youtube.com/");
		// driver.get("https://www.google.com/");

		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		// fetching the title of the webpage
		System.out.println(driver.getTitle());
		
		// get current url
		System.out.println(driver.getCurrentUrl());

		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		
		// fetch the source code of the page
		System.out.println(driver.getPageSource());
		
		// closing the driver controlled window
		// driver.close();
	}

}
