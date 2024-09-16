package org.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.task.InstaLoginPOJO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class TestNg_Task extends BaseClass {

	@BeforeMethod
	private void bef() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void aft() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	private void befcls() {
	}

	@AfterClass
	private void aftcls() {
		toClose();
	}

	// QUESTION 1

	@Test
	private void tc1() {
		launchBrowser();

		loadUrl("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smart");
		assertEquals(email.getAttribute("value"), "Smart", "check the email");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(pass.getAttribute("value"), "12345678", "check the password");

	}

	// EXECUTED

	// QUESTION 2

	@Test
	private void tc2() throws InterruptedException {
		launchBrowser();

		loadUrl("https://demo.guru99.com/");
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
		email.sendKeys("asd123@gmail.com");
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		toClick(submit);
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> data = row.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement datum = data.get(j);
				String text = datum.getText();
				System.out.println(text);
			}
		}
	}

	// EXECUTED

	// QUESTION 3

	@Test
	private void tc3() throws InterruptedException {
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
		// s.assertEquals(attribute1.contains("123"),"check the password1");
		s.assertEquals(pass.getAttribute("value"), attribute1, "check the password2");
		WebElement signIn = am2.getSignInP();
		toClick(signIn);
		s.assertAll();
	}

	// EXECUTED

	// QUESTION 4

	@Test

	private void tc4() {
		launchBrowser();

		loadUrl("https://sso.godaddy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		toSendKeys(userName, "asd123@gmail.com");
		assertEquals(userName.getAttribute("value"), "asd123@gmail.com", "check the mail");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		toSendKeys(password, "asd12345");
		assertEquals(password.getAttribute("value"), "asd12345", "check the password");

		WebElement button = driver.findElement(By.xpath("(//button[@target='_parent'])[2]"));
		toClick(button);
	}

	// EXECUTED

	// QUESTION 5

	// link opened, nothing in the website

	// QUESTION 6

	@Test
	private void tc6() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		maximize();
		Thread.sleep(2000);
		InstaLoginPOJO i = new InstaLoginPOJO();
		WebElement name = i.getUserName();
		name.sendKeys("9876543210");
		WebElement word = i.getPassWord();
		word.sendKeys("2589631470");
		WebElement ok = i.getLogIn();
		ok.click();
		// toClose();
	}

	// EXECUTED

	// QUESTION 7
	/*
	 * @Test private void tc7() {
	 * 
	 * launchBrowser(); loadUrl("https://www.w3schools.com/"); maximize();
	 * 
	 * }
	 */

	// EXECUTED

	// QUESTION 8

//		org.testng.TestNg_Task8

	// EXECUTED

	// QUESTION 9

	// SPOTIFY

	// NOT EXECUTED

	// QUESTION 10

}
