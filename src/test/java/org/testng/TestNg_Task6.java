package org.testng;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.task.InstaLoginPOJO;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Task6 extends BaseClass {
	
	@Parameters({"browser"})
	@Test
	private void tc6(String browserName) throws InterruptedException {
		
		if (browserName.contains("Chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			maximize();
	//		Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			InstaLoginPOJO i = new InstaLoginPOJO();
			WebElement name = i.getUserName();
			name.sendKeys("9876543210");
			WebElement word = i.getPassWord();
			word.sendKeys("2589631470");
			WebElement ok = i.getLogIn();
			ok.click();
			toClose();
			
		}
		else if (browserName.startsWith("F")) {
			driver = new FirefoxDriver();
			driver.get("https://www.instagram.com/");
			maximize();
			Thread.sleep(1000);
			InstaLoginPOJO i = new InstaLoginPOJO();
			WebElement name = i.getUserName();
			name.sendKeys("9876543210");
			WebElement word = i.getPassWord();
			word.sendKeys("2589631470");
			WebElement ok = i.getLogIn();
			ok.click();
			toClose();
			
			
		} else
		{
			driver= new EdgeDriver();
			driver.get("https://www.instagram.com/");
			maximize();
			Thread.sleep(1000);

			InstaLoginPOJO i = new InstaLoginPOJO();
			WebElement name = i.getUserName();
			name.sendKeys("9876543210");
			WebElement word = i.getPassWord();
			word.sendKeys("2589631470");
			WebElement ok = i.getLogIn();
			ok.click();
			toClose();
		}
		

	}}
