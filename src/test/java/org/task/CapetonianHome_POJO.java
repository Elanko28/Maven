package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapetonianHome_POJO extends BaseClass {
	
	public CapetonianHome_POJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text()='Book Now'])[1]")
	private WebElement booknow;

	

	public WebElement getBooknow() {
		return booknow;
	}
	
	
}
