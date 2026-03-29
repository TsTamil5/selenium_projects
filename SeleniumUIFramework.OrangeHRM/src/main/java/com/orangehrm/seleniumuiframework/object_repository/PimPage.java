package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	WebDriver driver;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	@FindBy(xpath="//span[.='Configuration ']")
	private WebElement configurationDropDown;
	
	@FindBy(linkText = "Termination Reasons")
	private WebElement terminationReasons;
	
	@FindBy(css="[class='oxd-icon bi-plus oxd-button-icon']")
	private WebElement plusButton;
	
	@FindBy(xpath="//label[.='Name']/../..//input")
	private WebElement name;
	
	@FindBy(css="[type='submit']")
	private WebElement saveButton;

	public WebElement getAddButton() {
		return addButton;
	}

	public void clickAddButton() {
		getAddButton().click();
	}
	
	public WebElement getConfigurationDropDown() {
		return configurationDropDown;
	}

	public void clickConfigurationDropDown() {
		getConfigurationDropDown().click();
	}
	
	public WebElement getTerminationReasons() {
		return terminationReasons;
	}

	public void clickTerminationReasons() {
		getTerminationReasons().click();
	}

	public WebElement getPlusButton() {
		return plusButton;
	}

	public void clickPlusButton() {
		getPlusButton().click();
	}

	public WebElement getName() {
		return name;
	}

	public void setName(String reason) {
		getName().sendKeys(reason);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void clickSaveButton() {
		getSaveButton().click();
	}
	
	public void addTerminationReason(String reason) {
		setName(reason);
		clickSaveButton();
	}
	

	
}
