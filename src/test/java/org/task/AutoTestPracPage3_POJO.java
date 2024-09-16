package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoTestPracPage3_POJO extends BaseClass {

	public AutoTestPracPage3_POJO() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement usernameP;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordP;

	@FindBy(xpath="//input[@name='login']")
	private WebElement loginP;

	public WebElement getUsernameP() {
		return usernameP;
	}

	public WebElement getPasswordP() {
		return passwordP;
	}

	public WebElement getLoginP() {
		return loginP;
	}


}
