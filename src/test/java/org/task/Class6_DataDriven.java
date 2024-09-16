package org.task;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.WaitStrategy;

public class Class6_DataDriven extends BaseClass {
	
	

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		 
		File f = new File("C:\\Users\\elank\\MAVEN_TASK\\Excel\\TestData.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("EmployeeDetails");
		
		// QUESTION 1
		
		//1.1
/*		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		double numericCellValue = cell.getNumericCellValue();
		long l= (long) numericCellValue;
		String mobNo = String.valueOf(l);
		System.out.println(mobNo);
		Cell cell2 = row.getCell(4);
		System.out.println(cell2);
		
		// EXECUTED
*/		
		//1.2
/*		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
			Row row2 = sheet.getRow(i);
			
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				
				Cell cell3 = row2.getCell(j);
				int cellType = cell3.getCellType();
				if (cellType==1) {
					String stringCellValue = cell3.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (DateUtil.isCellDateFormatted(cell3)) {
					Date dateCellValue = cell3.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("dd/MMM/yyyy");
					String format = sim.format(dateCellValue);
					System.out.println(format);
				}else {
					double numericCellValue2 = cell3.getNumericCellValue();
					long l1=(long)numericCellValue2;
					String valueOf = String.valueOf(l1);
					System.out.println(valueOf);
				}
				}	}
*/		
		
		// EXECUTED
		
		
		//1.3
/*		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row2 = sheet.getRow(i);
			
			Cell cell3 = row2.getCell(0);
			
			System.out.println(cell3);
			
			}
*/
		// EXECUTED
		
		
		// 1.4
		
//		sheet.createRow(4);
		
		// NOT EXECUTED
		
		// 1.5
/*		
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(1);
		cell.
	*/
		// NOT EXECUTED
		
		// 1.6
/*		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		int physicalNumberOfCells=0;
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
		physicalNumberOfCells =physicalNumberOfCells+ row.getPhysicalNumberOfCells();
		
		}
		System.out.println(physicalNumberOfRows);
		System.out.println(physicalNumberOfCells);
*/
		// EXECUTED
		
		
		// QUESTION 2
		
/*		excelReadAll("EmployeeDetails");
		excelReadOneCell("EmployeeDetails", 3, 3);
*/	
		// EXECUTED, WRITE THE DATA
		
		// QUESTION -3
/*		
		launchBrowser();
		
		loadUrl("https://www.facebook.com/");
		
		maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(excelReadOneCell("EmployeeDetails", 2, 1));
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(excelReadOneCell("EmployeeDetails", 2, 0));
		
	//	WebElement button = driver.findElement(By.name("login"));
	//	toClick(button);

		
		// EXECUTED + MOB ONLY NOT NAME
*/		
		
		// QUESTION 4
		

		launchBrowser();
		
		toImplicitWait(5);
		
		loadUrl("https://www.naukri.com/registration/createAccount");
		
		maximize();
		
		WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		userName.sendKeys(excelReadOneCell("EmployeeDetails", 3, 0));
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(excelReadOneCell("EmployeeDetails", 3, 5));
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(excelReadOneCell("EmployeeDetails", 3, 4));
		
		
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='mobile']"));
		mobNo.sendKeys(excelReadOneCell("EmployeeDetails", 3, 1));
		
		WebElement wS = driver.findElement(By.xpath("//p[contains(text(),'I am a student')]"));
		wS.click();
		
		WebElement location = driver.findElement(By.xpath("//input[@name='currentCity']"));
		location.sendKeys(excelReadOneCell("EmployeeDetails", 3, 6));
	 	toKeyPressEnter();
		Thread.sleep(2000);
//		WebElement frame = driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']"));
//		toSwitchToFrame(frame);
		WebElement tick = driver.findElement(By.xpath("//span[contains(text(),'Send me important updates')]"));
		tick.click();
		WebElement registerNow = driver.findElement(By.xpath("//button[text()='Register now']"));
		toexecuteScriptClick(registerNow);


		
		//  EXECUTED + java.lang.NullPointerException (memory not alloted)
		
		// QUESTION 5
/*		
		launchBrowser();
	
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys(excelReadOneCell("EmployeeDetails", 10, 0));
	   	WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(excelReadOneCell("EmployeeDetails", 10, 1));
	   	WebElement press = driver.findElement(By.id("login"));
	   	toClick(press);
*/		
		// EXECUTED
		
	  }
}
