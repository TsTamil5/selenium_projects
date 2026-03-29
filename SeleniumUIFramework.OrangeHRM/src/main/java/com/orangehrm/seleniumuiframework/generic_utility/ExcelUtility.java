package com.orangehrm.seleniumuiframework.generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook wb;
	Sheet sheet;

	// load Excel file
	public void loadExcelFile(String filePath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		wb = WorkbookFactory.create(fis);
		sheet = wb.getSheet(sheetName);
	}

	// Read data
	public String getDataFromSingleCell(int rowNo, int cellNo) throws IOException {
		 CellType data=sheet.getRow(rowNo).getCell(cellNo).getCellType();
		 String value = "";
		 if (data == CellType.STRING) {
			 value = sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
		 }
		 else if (data == CellType.NUMERIC) {
		    value = String.valueOf((int) sheet.getRow(rowNo).getCell(cellNo).getNumericCellValue());
		 }
		 return value;  
	}

	// write data
	public void writeDataInTheCell(String filePath, String sheetName, int rowNo, int cellNo, String value) throws IOException {

		Row row = sheet.getRow(rowNo);

		if (row == null) {
			row = sheet.createRow(rowNo);
		}
		Cell cell = row.getCell(cellNo);
		if (cell == null) {
			cell = row.createCell(rowNo);
		}

		cell.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
	}
	
	//Get entire data using Data Provider
	public Object[][] getDataFromTheExcelSheet() throws IOException{
		int rowNo=sheet.getLastRowNum();
		int columnNo=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rowNo][columnNo];
		for(int i=1;i<=rowNo;i++) {
			for(int j=0;j<columnNo;j++) {
				data[i-1][j]=getDataFromSingleCell(i,j);
			}
		}
		return data;
		
	}
	 
	 
}
