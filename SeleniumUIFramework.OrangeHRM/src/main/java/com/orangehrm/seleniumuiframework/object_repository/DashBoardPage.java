package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="PIM")
	private WebElement pimLink;
	
	@FindBy(linkText="Recruitment")
	private WebElement recruitment;
	
	@FindBy(linkText="Admin")
	private WebElement admin;
	
	
	@FindBy(css="li[class='oxd-userdropdown']")
	private WebElement logoutDropDown;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	

	public WebElement getPimLink() {
		return pimLink;
	}
	
	public void clickPimLink() {
		getPimLink().click();
	}
	public WebElement getRecruitment() {
		return recruitment;
	}

	public void clcikRecruitment() {
		getRecruitment().click();
	}


	public WebElement getLogoutDropDown() {
		return logoutDropDown;
	}
	public void setLogoutDropDown() {
		getLogoutDropDown().click();
	}
	
	public WebElement getLogout() {
		return logout;
	}

	public void clickLogout() {
		getLogout().click();
	}

	public void logout() {
		setLogoutDropDown();
		clickLogout();
	}

	public WebElement getAdmin() {
		return admin;
	}

	public void clickAdmin() {
		getAdmin().click();
	}


	
	
}
