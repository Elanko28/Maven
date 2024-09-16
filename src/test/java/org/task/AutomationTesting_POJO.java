package org.task;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationTesting_POJO extends BaseClass {
	
	public AutomationTesting_POJO() {
		PageFactory.initElements(driver, this);	
}
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstNameP;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastNameP;

	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement address1P;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailP;

	@FindBy(xpath="//input[@type='tel']")
	private WebElement phoneP;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement genderP;

	@FindBy(xpath="//input[@value='Movies']")
	private WebElement hobbyP;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement langP;
	
	@FindBy(xpath="//a[text()='English']")
	private WebElement lang1P;

	@FindBy(xpath="//select[@id='Skills']")
	private WebElement skillP;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement countryP;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement country1P;
	
	@FindBy(xpath="//span[text()='India']")
	private WebElement indiaP;
	
	@FindBy(xpath="//select[@id='yearbox']")
	private WebElement yearP;

	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement monthP;

	@FindBy(xpath="//select[@placeholder='Day']")
	private WebElement dayP;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	private WebElement firstPasswordP;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement secondPasswordP;
	
	@FindBy(xpath="//button[@id='submitbtn']")
	private WebElement submitP;



	public WebElement getSubmitP() {
		return submitP;
	}

	public WebElement getFirstPasswordP() {
		return firstPasswordP;
	}

	public WebElement getSecondPasswordP() {
		return secondPasswordP;
	}

	public WebElement getYearP() {
		return yearP;
	}

	public WebElement getMonthP() {
		return monthP;
	}

	public WebElement getDayP() {
		return dayP;
	}

	public WebElement getCountryP() {
		return countryP;
	}

	public WebElement getCountry1P() {
		return country1P;
	}

	public WebElement getIndiaP() {
		return indiaP;
	}

	public WebElement getFirstNameP() {
		return firstNameP;
	}

	public WebElement getLastNameP() {
		return lastNameP;
	}

	public WebElement getAddress1P() {
		return address1P;
	}

	public WebElement getEmailP() {
		return emailP;
	}

	public WebElement getPhoneP() {
		return phoneP;
	}

	public WebElement getGenderP() {
		return genderP;
	}

	public WebElement getHobbyP() {
		return hobbyP;
	}

	public WebElement getLangP() {
		return langP;
	}

	public WebElement getLang1P() {
		return lang1P;
	}

	public WebElement getSkillP() {
		return skillP;
	}



}
