package org.testng;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.task.InstaLoginPOJO;
import org.testng.annotations.Test;

public class TestNg_Task6_1 extends BaseClass{

	@Test
	private void tc1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	//	Thread.sleep(1000);

		InstaLoginPOJO i = new InstaLoginPOJO();
		WebElement name = i.getUserName();
		name.sendKeys("9876543210");
		WebElement word = i.getPassWord();
		word.sendKeys("2589631470");
		WebElement ok = i.getLogIn();
		ok.click();
		toClose();

	}
	
	@Test
	private void tc2() throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		maximize();
		Thread.sleep(2000);
		InstaLoginPOJO i = new InstaLoginPOJO();
		WebElement name = i.getUserName();
		name.sendKeys("9876543210");
		WebElement word = i.getPassWord();
		word.sendKeys("2589631470");
		WebElement ok = i.getLogIn();
		ok.click();
		toClose();
		}
	
	@Test
	private void tc3() throws InterruptedException {
		
		driver= new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		maximize();
		Thread.sleep(2000);

		InstaLoginPOJO i = new InstaLoginPOJO();
		WebElement name = i.getUserName();
		name.sendKeys("9876543210");
		WebElement word = i.getPassWord();
		word.sendKeys("2589631470");
		WebElement ok = i.getLogIn();
		ok.click();
		toClose();

	}
}
