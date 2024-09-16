package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin1_POJO extends BaseClass {
	
	public AmazonLogin1_POJO() {
		PageFactory.initElements(driver, this);	

	}
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement loginP;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailP;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitP;



	public WebElement getSubmitP() {
		return submitP;
	}

	
	public WebElement getLoginP() {
		return loginP;
	}

	public WebElement getEmailP() {
		return emailP;
	}

	

}
