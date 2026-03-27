package ActionOnHiddenElement;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionOnHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class='xwoeoq x1s9qjmn x71vvrb x7gj0x1 x167l43f x11lwdb5 xfxe0gy x1szzd0g xh2argp x13fuv20 x18b5jzi x1q0q8m5 x1t7ytsu x178xt8z x1lun4ml xso031l xpilrb4 x9f619 x78zum5 xozqiw3 xcvrjo4 x1qughib x6ikm8r x10wlt62 xz9dl7a xsag5q8 xf7dkkf xv54qhq x1n2onr6 xh8yej3 x1ja2u2z xggcdpo xzxmhi2 x1bhcc0k x1poa18a'])[4]")).click();
		d.findElement(By.xpath("//div[.='Custom']")).click();
		Thread.sleep(2000);
		WebElement ele=d.findElement(By.cssSelector("[id=\"r_q\"]"));
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("arguments[0].value='Female'", ele);
	}

}
