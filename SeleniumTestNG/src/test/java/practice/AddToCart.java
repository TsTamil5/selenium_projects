package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass {

	@Test(priority = 1)
	public void login() {

		// Verfification
		WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if (swagLabsText.getText().contains("Swag Labs")) {
			Reporter.log("Login Successful");
		} else {
			Reporter.log("Login Failed");
		}

	}

	@Test(priority = 2)
	public void addToCart() {
		// Adding to cart
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
		// Verifying
		boolean flag = true;
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> productsInTheCart = driver.findElements(By.cssSelector("[class='inventory_item_name']"));
		for (WebElement cartitems : productsInTheCart) {
			System.out.println(cartitems.getText());
			if (!(cartitems.getText().contains("Labs Backpack") || cartitems.getText().contains("Labs Bike Light"))) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Products added in the cart");
		} else {
			System.out.println("product doesn't added");
		}
	}

}
