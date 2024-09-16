package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class4_DataDriven {

	public static void main(String[] args) throws IOException {
		
		// practice - 1

		File f= new File("C:\\Users\\elank\\MAVEN_TASK\\Excel\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook book= new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("EmployeeDetails");
	
	
		Row row = sheet.getRow(3);
			
		Cell cell = row.getCell(0);
		
		System.out.println(cell);
		
		// practice 2
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row2 = sheet.getRow(i);
			
			for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
				
				Cell cell2 = row2.getCell(j);
				
				System.out.println(cell2);
			}
			
		}
	}
	}
