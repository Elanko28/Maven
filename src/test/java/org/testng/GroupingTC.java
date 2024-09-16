package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingTC extends BaseClass {

	@Test
	private void tc2() {
		toCurrentUrl();
		
	}
	// @test(groups= {"sanity","regression"}) ----- OR
	// @test(groups= {"sanity , regression"}) ----- AND
	// RUN THE CODE NOT XML
	
	@Test(groups="sanity")
	private void tc3() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smart");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
	}

	@Test(groups="sanity")
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
	

}
