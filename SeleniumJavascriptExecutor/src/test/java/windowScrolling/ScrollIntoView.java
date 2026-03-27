package windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://doodles.google/");
		WebElement a=d.findElement(By.xpath("//div[text()='When is your birthday?']"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(2000);
	//	js.executeScript("arguments[0].scrollIntoView(true)",a);
		js.executeScript("arguments[0].scrollIntoView(false)",a);
		
		//do not pass arguement by default takes true
		
//		js.executeScript("arguments[0].scrollIntoView()",a);
		
		

	}

}
