package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
	
	WebDriver driver;
	public RecruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Vacancies")
	private WebElement vacanciesLink;
	public WebElement getVacanciesLink() {
		return vacanciesLink;
	}
	
	public void clickVacanciesLink() {
		getVacanciesLink().click();
	}
}
