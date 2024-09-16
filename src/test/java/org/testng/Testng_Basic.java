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

public class Testng_Basic extends BaseClass{
	
	@Test(enabled=false)
	private void tc2() {
		toCurrentUrl();
		
	
	}
	@Test(priority=-10)
	private void tc4() {
		System.out.println("priority -10");
	}
	@Test(priority=-2)
	private void tc5() {
		System.out.println("priority=-2");
	}
	@Test
	private void tc3() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smart");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
	}

	@Test(invocationCount=3)
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
