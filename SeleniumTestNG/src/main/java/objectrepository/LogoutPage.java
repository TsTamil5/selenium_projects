package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// menu
	By menu=By.id("react-burger-menu-btn");
	// logout
	By logout=By.id("logout_sidebar_link");
	
	
	public void clickLogout() {
		driver.findElement(menu).click();
		driver.findElement(logout).click();
	}
	
}
