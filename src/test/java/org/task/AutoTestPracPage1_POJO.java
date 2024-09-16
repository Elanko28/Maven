package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoTestPracPage1_POJO extends BaseClass{

	public AutoTestPracPage1_POJO() {
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement getPracticeP() {
		return practiceP;
	}

	@FindBy(xpath="//a[text()='Practice Site']")
	private WebElement practiceP;
	
}
