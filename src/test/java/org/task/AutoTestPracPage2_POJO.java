package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoTestPracPage2_POJO extends BaseClass {

	public AutoTestPracPage2_POJO() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement accountP;

	public WebElement getAccountP() {
		return accountP;
	}
}
