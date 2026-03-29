package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void Test01() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\CapgeminiTraining\\SeleniumUIFramework.OrangeHRM\\src\\test\\resources\\Orangehrm_TestScript_Data\\Orangehrm_recruitment_vacancy_Test_Data\\vacancies.xlsx");
		Workbook workBook=WorkbookFactory.create(fis);
		
		Sheet sheet=workBook.getSheet("addVacancy");
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			String vacancyName= sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(vacancyName);
		}
		
		workBook.close();
		
	}
}
