package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Task8  extends BaseClass{
	
	@Parameters({"mailX","passwordX"})
	@Test
	private void tc8(@Optional ("smart")String mailM ,String passwordM ) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys(mailM);
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys(passwordM);

	}


}
