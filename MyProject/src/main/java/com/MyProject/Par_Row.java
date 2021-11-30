package com.MyProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Par_Row {
	
	public static void main(String[] args) throws Throwable {
		particular_Row();
	}
	
	public static void particular_Row() throws IOException {

		File f = new File("C:\\Users\\HariAmmu\\eclipse-workspace\\MyProject\\src\\main\\java\\com\\MyProject\\Driven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
			
		Row row = sheetAt.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
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