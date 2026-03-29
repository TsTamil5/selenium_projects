package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//username
	@FindAll({@FindBy(css="[name='username']"),@FindBy(css="[id='user-name']")})
	WebElement userName;
	
	// password
	@FindAll({@FindBy(css="[name='password']"),@FindBy(css="[id='password']")})
	WebElement password;
	
	// login
	@FindAll({@FindBy(css="[type='submit']"),@FindBy(css="[id='login-button']")})
	WebElement loginBtn;
	
//	@FindBy(css="[name='username']")
//	private WebElement userName;
//	
//	@FindBy(css="[type='password']")
//	private WebElement password;
//	
//	@FindBy(css="[type='submit']")
//	private WebElement loginBtn;
	
	@FindBy(xpath="//p[.='Forgot your password? ']")
	private WebElement forgetPwd;
	
	@FindBy(xpath="[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedIn;
	@FindBy(xpath="[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebook ;
	@FindBy(xpath="[href='https://twitter.com/orangehrm?lang=en']")
	private WebElement twitterLink;

	@FindBy(xpath="[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtube;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		getLoginBtn().click();
	}

	public WebElement getForgetPwd() {
		return forgetPwd;
	}

	public void setForgetPwd(WebElement forgetPwd) {
		getForgetPwd().click();
	}

	public WebElement getLinkedIn() {
		return linkedIn;
	}

	public void clickLinkedIn() {
		getLinkedIn().click();
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public void clickFacebook() {
		getFacebook().click();
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public void clickTwitterLink() {
		getTwitterLink().click();
	}

	public WebElement getYoutube() {
		return youtube;
	}

	public void clickYoutube() {
		getYoutube().click();
	}
	
	public void login(String userName,String password) {
		setUserName(userName);
		setPassword(password);
		clickLoginBtn();
	}
}
