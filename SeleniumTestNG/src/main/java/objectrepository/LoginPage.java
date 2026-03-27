package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	// username
	By username=By.id("user-name");
	//password
	By password=By.id("password");
	// login
	By loginbtn=By.id("login-button");
	
	// business logic(Logic action)
	
	public void enterUrl(String url) {
		driver.get(url);
	}
	public void enterCredentials(String un,String pwd) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}
}
