package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.seleniumuiframework.generic_utility.ActionsHelper;

public class AdminPage {
	WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[.='Username']/../..//input")
	private WebElement userName;
	
	@FindBy(xpath="//label[.='User Role']/../..//i")
	private WebElement userRole;
	
	@FindBy(css="[placeholder='Type for hints...']")
	private WebElement empName;
	
	@FindBy(xpath="//label[.='Status']/../..//i")
	private WebElement status;
	
	@FindBy(css="[type='submit']")
	private WebElement search;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getUserRole() {
		return userRole;
	}

	public void clickUserRole() {
		getUserRole().click();
	}

	public WebElement getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		getEmpName().sendKeys(empName);
	}

	public WebElement getStatus() {
		return status;
	}

	public void clickStatus() {
		getStatus().click();
	}

	public WebElement getSearch() {
		return search;
	}

	public void clickSearch() {
		getSearch().click();
	}
	
	public void searchUsers(String userName,String empName) {
		ActionsHelper ah=new ActionsHelper(driver);
		setUserName(userName);
		ah.navigateDownDrpDown(getUserRole(),5,2);
		setEmpName(empName);
		ah.navigateDownDrpDown(getStatus(),5,1);
		clickSearch();
	}
	
	
	
	
}
