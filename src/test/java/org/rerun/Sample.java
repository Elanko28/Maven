package org.rerun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.AmazonLogin1_POJO;
import org.testng.AmazonLogin2_POJO;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseClass {

	@Test(retryAnalyzer=Failed.class)
	private void TC1() throws InterruptedException {
		launchBrowser();

		loadUrl("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		maximize();
		AmazonLogin1_POJO am = new AmazonLogin1_POJO();
		WebElement login = am.getLoginP();
		toClick(login);
		WebElement email = am.getEmailP();
		toSendKeys(email, "asd123@gmail.com");
		assertEquals(email.getAttribute("value"), "asd123@gmail.com", "check the email");
		String attribute = email.getAttribute("value");
		assertTrue(attribute.startsWith("asd"), "check the email");
		WebElement submit = am.getSubmitP();
		toClick(submit);
		Thread.sleep(2000);
		AmazonLogin2_POJO am2 = new AmazonLogin2_POJO();
		WebElement pass = am2.getPassP();
		toSendKeys(pass, "123456789");
		String attribute1 = pass.getAttribute("value");
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, attribute1.contains("asd"));
		s.assertEquals(pass.getAttribute("value"), attribute1, "check the password2");
		WebElement signIn = am2.getSignInP();
		toClick(signIn);
		s.assertAll();
		toClose();
	}
	
	@Test(retryAnalyzer=Failed.class)
	private void TC2() throws InterruptedException {
		launchBrowser();

		loadUrl("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		maximize();
		AmazonLogin1_POJO am = new AmazonLogin1_POJO();
		WebElement login = am.getLoginP();
		toClick(login);
		WebElement email = am.getEmailP();
		toSendKeys(email, "asd123@gmail.com");
		assertEquals(email.getAttribute("value"), "asd123@gmail.com", "check the email");
		String attribute = email.getAttribute("value");
		assertTrue(attribute.startsWith("asd"), "check the email");
		WebElement submit = am.getSubmitP();
		toClick(submit);
		Thread.sleep(2000);
		AmazonLogin2_POJO am2 = new AmazonLogin2_POJO();
		WebElement pass = am2.getPassP();
		toSendKeys(pass, "123456789");
		String attribute1 = pass.getAttribute("value");
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, attribute1.contains("asd"));
		s.assertEquals(pass.getAttribute("value"), attribute1, "check the password2");
		WebElement signIn = am2.getSignInP();
		toClick(signIn);
		s.assertAll();
		toClose();
	}
	
	@Test(retryAnalyzer=Failed.class)
	private void TC3() throws InterruptedException {
		launchBrowser();

		loadUrl("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		maximize();
		AmazonLogin1_POJO am = new AmazonLogin1_POJO();
		WebElement login = am.getLoginP();
		toClick(login);
		WebElement email = am.getEmailP();
		toSendKeys(email, "asd123@gmail.com");
		assertEquals(email.getAttribute("value"), "asd123@gmail.com", "check the email");
		String attribute = email.getAttribute("value");
		assertTrue(attribute.startsWith("asd"), "check the email");
		WebElement submit = am.getSubmitP();
		toClick(submit);
		Thread.sleep(2000);
		AmazonLogin2_POJO am2 = new AmazonLogin2_POJO();
		WebElement pass = am2.getPassP();
		toSendKeys(pass, "123456789");
		String attribute1 = pass.getAttribute("value");
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, attribute1.contains("asd"));
		s.assertEquals(pass.getAttribute("value"), attribute1, "check the password2");
		WebElement signIn = am2.getSignInP();
		toClick(signIn);
		s.assertAll();
		toClose();
	}



}
