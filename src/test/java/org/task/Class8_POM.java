package org.task;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class8_POM extends BaseClass{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// QUESTION 1
	/*	
		loadUrl("https://capetonian.co.za/");
		maximize();
		
		// page 1
		CapetonianHome_POJO a = new CapetonianHome_POJO();
		CapetonianPage2_POJO b=new CapetonianPage2_POJO();
		WebElement bookNow = a.getBooknow();
		bookNow.click();
		
		toMoveChildWindow();
		WebElement rejectAll = b.getRejectall();
		rejectAll.click();
	 //   Thread.sleep(4000);

	  //  WebElement book = driver.findElement(By.xpath("(//div[@class='button_button'])[5]"));
		WebElement book = b.getBoook();
		toexecuteScriptClick(book); 
		Thread.sleep(2000);

	//	WebElement book1 = driver.findElement(By.xpath("(//div[@class='button_button'])[24]"));
		WebElement book1 = b.getBoook1();
		toMoveToElement(book1);
	//	Thread.sleep(4000);
		toClick(book1); 
		//book1.click();
	//	Thread.sleep(3000);
		

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		toSendKeys(firstName, "Arun");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		toSendKeys(lastName, "kumar");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		toSendKeys(email, "arun123@gmail.com");
		
		WebElement confirmEmail = driver.findElement(By.xpath("//input[@id='confirmEmail']"));
		toSendKeys(confirmEmail, "arun123@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		toSendKeys(phone, "9876543210");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		toSendKeys(address1, "pallikaranai");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		toSendKeys(city, "chennai");
		
		WebElement postCode = driver.findElement(By.xpath("//input[@id='postCode']"));
		toSendKeys(postCode, "600015");
		
		WebElement country = driver.findElement(By.xpath("(//label[@class='ibe-v-select-label-animated'])[1]"));
	//	country.click();

		WebElement country1 = driver.findElement(By.xpath("(//span[@class='vs__selected'])[1]"));
		country1.click();
		
		WebElement Continue = driver.findElement(By.xpath("//span[text()='Continue']"));
		toexecuteScriptClick(Continue);
*/
		
		
		// QUESTION 3
	/*	
		loadUrl("https://www.instagram.com/");
		maximize();
		InstaLoginPOJO i = new InstaLoginPOJO();
		WebElement name = i.getUserName();
		name.sendKeys("9876543210");
		WebElement word = i.getPassWord();
		word.sendKeys("2589631470");
		WebElement ok = i.getLogIn();
		ok.click();
	*/
	
		// QUESTION 4
		
		loadUrl("https://demo.automationtesting.in/Register.html");
		maximize();
		AutomationTesting_POJO a=new AutomationTesting_POJO();
		WebElement firstName = a.getFirstNameP();
		toSendKeys(firstName, excelReadOneCell("EmployeeDetails", 14, 0));
		
		WebElement lastName = a.getLastNameP();
		toSendKeys(lastName, excelReadOneCell("EmployeeDetails", 14, 1));
		
		WebElement address1 = a.getAddress1P();
		toSendKeys(address1, excelReadOneCell("EmployeeDetails", 14, 2));
		
		WebElement email = a.getEmailP();
		toSendKeys(email, excelReadOneCell("EmployeeDetails", 14, 3));
		
		WebElement phone = a.getPhoneP();
		toSendKeys(phone, excelReadOneCell("EmployeeDetails", 14, 4));
		
		WebElement gender = a.getGenderP();
		toClick(gender);
		
		WebElement hobby = a.getHobbyP();
		toClick(hobby);
		
		WebElement lang = a.getLangP();
		toScrollDown(lang);
		toexecuteScriptClick(lang);
		WebElement lang1 = a.getLang1P();
		lang1.click();
		toKeyPressEnter();
		WebElement skill = a.getSkillP();
		toSelectByVisibleText(skill, excelReadOneCell("EmployeeDetails", 14, 5));
		
		WebElement country = a.getCountryP();
		country.click();
		WebElement country1 = a.getCountry1P();
		toSendKeys(country1, excelReadOneCell("EmployeeDetails", 14, 6));
		toKeyPressEnter();
		
		WebElement year = a.getYearP();
		toSelectByVisibleText(year, excelReadOneCell("EmployeeDetails", 14, 7));
		WebElement month = a.getMonthP();
		toSelectByVisibleText(month, excelReadOneCell("EmployeeDetails", 14, 8));
		WebElement day = a.getDayP();
		toSelectByVisibleText(day, excelReadOneCell("EmployeeDetails", 14, 9));
		
		WebElement firstPassword = a.getFirstPasswordP();
		toSendKeys(firstPassword, excelReadOneCell("EmployeeDetails", 14, 10));
		
		WebElement secondPassword = a.getSecondPasswordP();
		toSendKeys(secondPassword, excelReadOneCell("EmployeeDetails", 14, 11));

		WebElement submit = a.getSubmitP();
		submit.click();
	
	
		// QUESTION 5
	/*	
		loadUrl("https://demo.automationtesting.in/Register.html");
		maximize();
		
		AutoTestPracPage1_POJO at1=new AutoTestPracPage1_POJO();
		WebElement practice = at1.getPracticeP();
		practice.click();
		
		AutoTestPracPage2_POJO at2=new AutoTestPracPage2_POJO();
		WebElement account = at2.getAccountP();
		account.click();
		
		AutoTestPracPage3_POJO at3=new AutoTestPracPage3_POJO();
		WebElement username = at3.getUsernameP();
		toSendKeys(username, excelReadOneCell("EmployeeDetails", 18, 0));
		WebElement password = at3.getPasswordP();
		toSendKeys(password, excelReadOneCell("EmployeeDetails", 18, 1));

		WebElement login = at3.getLoginP();
		login.click();
	
	*/	
		
		
		
		// QUESTION 6
	/*	
		loadUrl("https://toolsqa.com/");
		maximize();
		
		ToolsqaPage1_POJO ts1=new ToolsqaPage1_POJO();
		WebElement training = ts1.getTrainingP();
		training.click();
		
		ToolsqaPage2_POJO ts2=new ToolsqaPage2_POJO();
		WebElement text = ts2.getTextP();
		toScrollDown(text);

		WebElement text1 = ts2.getText1P();
		text1.click();

		WebElement text2 = ts2.getText2P();
		toGetText(text2);
//		WebElement text3 = ts2.getText3P();
//		toGetText(text3);
//		WebElement text4 = ts2.getText4P();
//		toGetText(text4);
	*/
	
	}
	
}
