package objectrepository_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// it automaticallyy initialized
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;

	
	// getters and setters
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String un) {
		getUsername().sendKeys(un);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String pwd) {
		getPassword().sendKeys(pwd);
	}
	
	
	// Business logic to login
	
	public void enterUrl(String url) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	public void enterCredentials(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	
}
