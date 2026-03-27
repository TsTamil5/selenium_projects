package webDriverMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetPosition {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		// getPosition

		// fetch the default position of chrome browser
		System.out.println(driver.manage().window().getPosition());
		// returns (int x,int y)

		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(2000);

		// setPosition

		driver.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(400, 100));

	}

}
