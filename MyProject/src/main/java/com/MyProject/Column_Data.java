package com.MyProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_Data {
	
	
	public static void main(String[] args) throws Throwable {
		column_Data();
	}
	
	public static void column_Data() throws Throwable {
	
	File f = new File("C:\\Users\\HariAmmu\\eclipse-workspace\\MyProject\\src\\main\\java\\com\\MyProject\\Driven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet sheetAt = w.getSheetAt(0);
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < numberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		int numberOfCells = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
	
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(numericCellValue);	
	}
	
	}
		
	}
	
	
	

}
