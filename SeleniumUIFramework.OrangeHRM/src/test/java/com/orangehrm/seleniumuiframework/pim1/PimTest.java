package com.orangehrm.seleniumuiframework.pim1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.generic_utility.BaseClass;
import com.orangehrm.seleniumuiframework.generic_utility.ExcelUtility;
import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.AdminPage;
import com.orangehrm.seleniumuiframework.object_repository.PimPage;

public class PimTest extends BaseClass{
	PimPage pp;
	AddEmployeePage aemp;
	AdminPage ap;
	ExcelUtility eu;
	@Test
	public void addEmployee() throws IOException, InterruptedException {
		pp=new PimPage(driver);
		aemp=new AddEmployeePage(driver);
		ap=new AdminPage(driver);
		eu=new ExcelUtility();
		dsp.clickPimLink();
		
		pp.clickAddButton();
		
		
		String path="./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_recruitment_vacancy_Test_Data/UserData.xlsx";
		eu.loadExcelFile(path, "data");
		String firstName=eu.getDataFromSingleCell(1, 0);
		String middleName=eu.getDataFromSingleCell(1, 1);
		String lastName=eu.getDataFromSingleCell(1, 2);
		String empId=eu.getDataFromSingleCell(1, 3);
		String userName=eu.getDataFromSingleCell(1, 4);
		String password=eu.getDataFromSingleCell(1, 5);
		
		aemp.addEmployee(firstName, middleName,lastName , empId);
		wdu.waitTillTheElementIsVisible(aemp.getUserName(), 30);
		aemp.enterCredential(userName, password);
		
		aemp.clickSave();
		Thread.sleep(4000);
		
		dsp.clickAdmin();
		
		ap.searchUsers(firstName,userName);
		
		List<WebElement> records = driver.findElements(By.xpath("//div[@role='row']//div[2]"));

		boolean found = false;
		String expected=userName;
		for(WebElement ele : records) {
		    String text = ele.getText().trim();
		    if(text.equalsIgnoreCase(expected)) {
		        found = true;
		        break;
		    }
		}
		
		if(found) {
			Reporter.log("Passed",true);
		}
		else {
			Reporter.log("Failed",true);
		}
		Assert.assertTrue(found);
	}
	
	@Test
	public void terminationReason() throws IOException {
		pp=new PimPage(driver);
		eu=new ExcelUtility();
		
		String path="./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_recruitment_vacancy_Test_Data/UserData.xlsx";
		eu.loadExcelFile(path, "termination");
		
		String terminationReason=eu.getDataFromSingleCell(1, 0);
		
		dsp.clickPimLink();
		pp.clickConfigurationDropDown();
		pp.clickTerminationReasons();
		pp.clickPlusButton();
		pp.addTerminationReason(terminationReason);
		
		List<WebElement> records = driver.findElements(By.xpath("//div[@role='row']//div[2]"));
		boolean found = false;

		for (WebElement reason : records) {
		    String actualReason = reason.getText().trim();
		    if (actualReason.equals(terminationReason)) {
		        found = true;
		        break;
		    }
		}
		
		if(found) {
			Reporter.log("Passed",true);
		}
		else {
			Reporter.log("Failed",true);
		}
		Assert.assertTrue(found);
		
	}
	
}
