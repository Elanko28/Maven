package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapetonianPage2_POJO extends BaseClass{

	public CapetonianPage2_POJO() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Reject all']")
	private WebElement rejectall;
	
	public WebElement getRejectall() {
		return rejectall;
	}
	
	@FindBy(xpath="(//div[@class='button_button'])[5]")
	private WebElement boook;

	public WebElement getBoook() {
		return boook;
	}
		
	@FindBy(xpath="(//div[@class='button_button'])[24]")
	private WebElement boook1;

	public WebElement getBoook1() {
		return boook1;
	}
	
	

	
	}
     


