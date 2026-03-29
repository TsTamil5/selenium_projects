package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	
	WebDriver driver;
	public AddVacancyPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//label[text()='Vacancy Name']/../..//input")
	WebElement vacancyNameTextField;
	
	@FindBy(xpath="//label[text()='Job Title']/../..//i")
	WebElement jobTitle;
	
	@FindBy(css="[placeholder='Type description here']")
	WebElement descriptionTextField;
	@FindBy(css="[placeholder='Type for hints...']")
	WebElement hiringManagerTextField;
	
	@FindBy(xpath="//label[text()='Number of Positions']/../..//input")
	WebElement numberOfPositionTextField;
	
	@FindBy(css="[type=submit]")
	WebElement SaveBtn;
	public WebElement getVacancyNameTextField() {
		return vacancyNameTextField;
	}

	public void setVacancyNameTextField(String vacancyNameTextField) {
		getVacancyNameTextField().sendKeys(vacancyNameTextField);
	}

	public WebElement getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(WebElement jobTitle) {
		this.jobTitle = jobTitle;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public void setDescriptionTextField(String descriptionTextField) {
		getDescriptionTextField().sendKeys(descriptionTextField);
	}

	public WebElement getHiringManagerTextField() {
		return hiringManagerTextField;
	}

	public void setHiringManagerTextField(WebElement hiringManagerTextField) {
		this.hiringManagerTextField = hiringManagerTextField;
	}

	public WebElement getNumberOfPositionTextField() {
		return numberOfPositionTextField;
	}

	public void setNumberOfPositionTextField(String numberOfPositionTextField) {
		getNumberOfPositionTextField().sendKeys(numberOfPositionTextField);
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}
}
