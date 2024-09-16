package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildClass_base extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launchBrowser();
		
		toImplicitWait(2);
		
		loadUrl("https://www.facebook.com/");
		
		maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		toSendKeys(email, "asd123@gmail.com");
		
		toGetAttributeValue(email);
		 
		WebElement pass = driver.findElement(By.id("pass"));
		toexecuteScriptFill(pass, "asd123");
		
		
		javaScriptGetAttribute(pass, "value");
		
		javaScriptGetAttribute(pass, "id");
	

//		WebElement button = driver.findElement(By.name("login"));
	//	toClick(button);
		
		toGetTitle();
		
		toCurrentUrl();
		
		toGetwindowHandle();
		
		toGetwindowHandles();
		
		toGetAttributeValue(email);

		
		toGetAttributeValue(pass);

				
	    javaScriptGetAttribute(email, "value");
		
		javaScriptGetAttribute(email, "id");
	
		
	
		toTakesScreenshot("facebook");
		
		
		
		toQuit();

		
		
		

	 
	}

}
