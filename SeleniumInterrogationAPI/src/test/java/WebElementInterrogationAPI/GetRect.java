package WebElementInterrogationAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement a=d.findElement(By.partialLinkText("Register"));
		Rectangle r=a.getRect();
		System.out.println(r.getPoint());
		System.out.println(r.getDimension());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());

	}

}
