package org.testng;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDD extends BaseClass {
	
	@Test(priority=10,enabled=false)
	private void tc2() {
		toCurrentUrl();
	}
	
	
	//@Parameters({"mailX","passwordX"})
	@Test(priority=-18, dataProvider="testdata")
	private void tc3(String mailM ,String passwordM ) {
		loadUrl("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(mailM);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(passwordM);
	}

	@Test(priority=18, invocationCount=3)
	private void tc1() {
		toGetTitle();
	}

	@BeforeMethod
	private void bef() {
		Date d= new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void aft() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	private void befcls() {
		launchBrowser();  
		loadUrl("https://www.facebook.com/");
	}
	@AfterClass
	private void aftcls() {
		toClose();
	}
	
	@DataProvider(name="testdata")
	private Object[][] getdata() throws IOException {
		return new Object[][] {
			{excelReadOneCell("EmployeeDetails", 1, 0) , excelReadOneCell("EmployeeDetails", 1, 1)},
			{excelReadOneCell("EmployeeDetails", 2, 0) , excelReadOneCell("EmployeeDetails", 2, 1)},
			{excelReadOneCell("EmployeeDetails", 3, 0) , excelReadOneCell("EmployeeDetails", 3, 1)},
			{excelReadOneCell("EmployeeDetails", 4, 0) , excelReadOneCell("EmployeeDetails", 4, 1)},
			{excelReadOneCell("EmployeeDetails", 5, 0) , excelReadOneCell("EmployeeDetails", 5, 1)},
			{excelReadOneCell("EmployeeDetails", 6, 0) , excelReadOneCell("EmployeeDetails", 6, 1)},
			{excelReadOneCell("EmployeeDetails", 7, 0) , excelReadOneCell("EmployeeDetails", 7, 1)},
			{excelReadOneCell("EmployeeDetails", 8, 0) , excelReadOneCell("EmployeeDetails", 8, 1)},
			{excelReadOneCell("EmployeeDetails", 9, 0) , excelReadOneCell("EmployeeDetails", 9, 1)},
			{excelReadOneCell("EmployeeDetails", 10, 0) , excelReadOneCell("EmployeeDetails", 10, 1)}
		};
	}


}
