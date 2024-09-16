package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	
   		WebDriver driver= new ChromeDriver();
	
	//2.1,X2.2,2.3,X2.4,2.5,X2.6,2.7,X2.8,X2.9,2.10,2.11
   		//3.1,3.2,X3.3,3.4,3.5,X3.6,3.7,3.8,3.9,X3.10,3.11
   		
   		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abc123@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345678"); 
		String attribute = email.getAttribute("value");
		String attribute1 = email.getAttribute("id");
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute);
		System.out.println(attribute1);
		System.out.println(attribute2);
		driver.quit();
	
	
	}}
