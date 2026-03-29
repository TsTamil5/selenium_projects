package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	WebDriver driver;

	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		@FindBy(name = "firstName")
		private WebElement firstName;

		@FindBy(name = "middleName")
		private WebElement middleName;

		@FindBy(name = "lastName")
		private WebElement LastName;

		@FindBy(xpath = "//label[.='Employee Id']/../..//input")
		private WebElement empId;

		@FindBy(css = "[class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")
		private WebElement toggleBtn;

		@FindBy(xpath = "//label[.='Username']/../..//input")
		private WebElement userName;

		@FindBy(xpath = "//label[.='Password']/../..//input")
		private WebElement password;

		@FindBy(xpath = "//label[.='Confirm Password']/../..//input")
		private WebElement confirmPwd;

		@FindBy(xpath = "//button[.=' Save ']")
		private WebElement save;

		public WebElement getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			getFirstName().sendKeys(firstName);
		}

		public WebElement getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			getMiddleName().sendKeys(middleName);
		}

		public WebElement getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			getLastName().sendKeys(lastName);
		}

		public WebElement getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			getEmpId().sendKeys(empId);
		}

		public WebElement getToggleBtn() {
			return toggleBtn;
		}

		public void clickToggleBtn() {
			getToggleBtn().click();
		}

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

		public WebElement getConfirmPwd() {
			return confirmPwd;
		}

		public void setConfirmPwd(String confirmPwd) {
			getConfirmPwd().sendKeys(confirmPwd);
		}

		public WebElement getSave() {
			return save;
		}

		public void clickSave() {
			getSave().click();
		}

		// Bussiness Logic to add Employee
		public void addEmployee(String firstName, String middleName, String lastName, String empId) {
			setFirstName(firstName);
			setMiddleName(middleName);
			setLastName(lastName);
			setEmpId(empId);
			clickToggleBtn();

		}

		public void enterCredential(String userName, String password) {
			setUserName(userName);
			setPassword(password);
			setConfirmPwd(password);
			clickSave();
		}
}
