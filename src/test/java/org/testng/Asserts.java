package org.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts extends BaseClass {
	
	@Test
	private void tc1() {
		assertTrue(true);
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smart");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		
		toCurrentUrl();
		
		toClose();
	}
	
	@Test
	private void tc2() {
		Assert.assertTrue(false);
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	@Test
	private void tc3() {
		assertTrue(true, "check the testcase");
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}
	
	@Test
	private void tc4() {
		assertTrue(false, "check the testcase");
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	
	@Test
	private void tc5() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.startsWith("www."), "check the url");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	
	@Test
	private void tc6() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.startsWith("https"), "check the url");

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}
	
	@Test
	private void tc7() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");
		assertNotEquals(email.getAttribute("value"), "smart", "check the attribute");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	@Test
	private void tc8() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");
		assertEquals(email.getAttribute("value"), "skills", "check the attribute");
		// many condition are there
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	@Test
	private void tc9() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertTrue(currentUrl.startsWith("https"), "check the url");

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}

	@Test
	private void tc10() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		assertTrue(currentUrl.startsWith("https"), "check the url");

		
		SoftAssert s = new SoftAssert();

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");
		s.assertEquals(email.getAttribute("value"), "skill", "check the attribute");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		s.assertAll();
		toClose();
	}

	@Test
	private void tc11() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		String title = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("book"), "check the title");

		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("skills");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("987654321");
		
		toCurrentUrl();
		
		toClose();
	}



}
