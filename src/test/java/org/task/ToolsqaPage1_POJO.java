package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsqaPage1_POJO extends BaseClass {

	public ToolsqaPage1_POJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement trainingP;

	public WebElement getTrainingP() {
		return trainingP;
	}

}
