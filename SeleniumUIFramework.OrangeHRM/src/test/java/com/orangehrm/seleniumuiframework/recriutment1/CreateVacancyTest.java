package com.orangehrm.seleniumuiframework.recriutment1;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumuiframework.generic_utility.ActionsHelper;
import com.orangehrm.seleniumuiframework.generic_utility.BaseClass;
import com.orangehrm.seleniumuiframework.generic_utility.ExcelUtility;
import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;

public class CreateVacancyTest extends BaseClass{
	@Test
	public void addVacancy() throws InterruptedException, IOException {
		RecruitmentPage rp=new RecruitmentPage(driver);
		VacanciesPage vp=new VacanciesPage(driver);
		AddVacancyPage avp=new AddVacancyPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		ExcelUtility eu=new ExcelUtility();
		SoftAssert sa=new SoftAssert();
		
		// DashBoard
		dsp.clcikRecruitment();
		
		//RecruitmentPage
		rp.clickVacanciesLink();
		
		//VacanciesPage
		vp.clickAddBtn();
		eu.loadExcelFile("./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_recruitment_vacancy_Test_Data/vacancies.xlsx","addVacancy" );
		
		// Recruitment vacancy
		avp.setVacancyNameTextField(eu.getDataFromSingleCell(1, 1));
//		avp.setVacancyNameTextField("v-001");
		
		ah.navigateDownDrpDown(avp.getJobTitle(), 3, 2);
//		action.click(avp.getJobTitle()).pause(5000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
		
		avp.setDescriptionTextField(eu.getDataFromSingleCell(1, 2));
		ah.scrollDownAutoSugesstion(avp.getHiringManagerTextField(),"t",4,1);
//		action.sendKeys(avp.getHiringManagerTextField(),"t").pause(4000).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		
		avp.setNumberOfPositionTextField(eu.getDataFromSingleCell(1, 3));
		avp.clickSaveBtn();
		
		List<WebElement> validateVacancyName=driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		for(WebElement c:validateVacancyName) {
			String name=c.getText();
			sa.assertEquals(name,eu.getDataFromSingleCell(1, 1));
			if(name.equals(eu.getDataFromSingleCell(1, 1))) {
				Reporter.log("Test case:PASS");
			}
			else {
				Reporter.log("Test case:Fail");
			}
		}
		sa.assertAll();
	}
	
}
