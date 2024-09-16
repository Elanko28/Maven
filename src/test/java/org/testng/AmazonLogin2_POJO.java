package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin2_POJO extends BaseClass{

	public AmazonLogin2_POJO() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passP;
	
	@FindBy(xpath="//INPUT[@id='signInSubmit']")
	private WebElement signInP;

	public WebElement getPassP() {
		return passP;
	}

	public WebElement getSignInP() {
		return signInP;
	}
	
}
