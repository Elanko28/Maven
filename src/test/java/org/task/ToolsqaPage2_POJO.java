package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsqaPage2_POJO extends BaseClass {

	public ToolsqaPage2_POJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Selenium Course FAQs']")
	private WebElement textP;
	
	@FindBy(xpath="//div[text()='Who delivers the training?']")
	private WebElement text1P;
	
	@FindBy(xpath="//p[text()='All our ']")
	private WebElement text2P;

	@FindBy(xpath="//a[text()='TOOLSQA’s']")
	private WebElement text3P;
	
	@FindBy(xpath="(//p[contains(text(),'All our')])[1]")
	private WebElement text4P;

	public WebElement getTextP() {
		return textP;
	}

	public WebElement getText1P() {
		return text1P;
	}

	public WebElement getText2P() {
		return text2P;
	}

	public WebElement getText3P() {
		return text3P;
	}

	public WebElement getText4P() {
		return text4P;
	}
	
	

}
