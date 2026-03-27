package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WeeklyAssessment3Testase2 {
	WebDriver driver=null;
	@Test(priority=1)
	public void login() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		
		driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(dependsOnMethods = "login",priority=2)
	public void verification() {
		String expectedLogo="Swag Labs";
		String actualLogo=driver.findElement(By.cssSelector("[class='app_logo']")).getText();
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualLogo.contains(expectedLogo));
		if(actualLogo.contains(expectedLogo)) {
			System.out.println("product page is displayed Successfully");
		}
		else {
			System.out.println("Product page is displayed");
		}
		sa.assertAll();
	}
	@Test(dependsOnMethods = "login",priority=3)
	public void sortedAddToCart() {
		
		WebElement drop=driver.findElement(By.cssSelector("[class='product_sort_container']"));
		drop.click();
		Select s=new Select(drop);
		s.selectByVisibleText("Price (low to high)");
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
		
		// cart verification
		boolean flag=true;
		List<WebElement> productsInTheCart=driver.findElements(By.cssSelector("[class='cart_list']"));
		for (WebElement cartitems : productsInTheCart) {
			if (!(cartitems.getText().contains("Sauce Labs Onesie") || cartitems.getText().contains("Sauce Labs Bike Light"))) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Products added in the cart");
		}
		else {
			System.out.println("product doesn't added");
		}
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Tami");
		driver.findElement(By.id("last-name")).sendKeys("V");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		
		// summary verification
		boolean flag1=true;
		List<WebElement> productsInTheSummary=driver.findElements(By.cssSelector("[class='cart_list']"));
		for (WebElement cartitems : productsInTheSummary) {
			if (!(cartitems.getText().contains("Sauce Labs Onesie") || cartitems.getText().contains("Sauce Labs Bike Light"))) {
				flag1 = false;
				break;
			}
		}
		if (flag1) {
			System.out.println("Products added properly in the summary");
		}
		else {
			System.out.println("product doesn't added");
		}
		
		driver.findElement(By.id("finish"));
		
	}
	
	@Test(dependsOnMethods = "login",priority=4)
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
