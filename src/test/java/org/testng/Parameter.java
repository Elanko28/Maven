package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends BaseClass {

	@Test(priority=10,enabled=false)
	private void tc2() {
		toCurrentUrl();
	}
	
	//				X missed and optional used	
	@Parameters({"mail","passwordX"})
	@Test(priority=-18)
	private void tc3(@Optional ("smart")String mailM ,String passwordM ) {
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
	//	toClose();
	}

}
