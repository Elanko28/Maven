package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Alert a;
	public static Actions ac; 
	public static Robot r;
	public static TakesScreenshot tk;
	public static JavascriptExecutor j;
	public static Select s;

	// under WebDriver

	public static void launchBrowser() {
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void toGetTitle() {
		// work only near to element
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void toCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toClose() {
		driver.close();
	}

	public static void toSwitchToAlert() {
		a = driver.switchTo().alert();
	}
	public static void toSwitchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void toSwitchToWindowHandle(String id) {
		driver.switchTo().window(id);
	}

	public static void toGetwindowHandle() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
	}

	public static void toGetwindowHandles() {
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
	}
	
	public static void toMoveChildWindow() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		List<String> li=new ArrayList<String>();
		li.addAll(allWindows);
		
		for (String s : allWindows) {
			if(!s.equals(parentId)) {
				System.out.println(driver.switchTo().window(s));
			}
		}
	}
	
	public static void toImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	

	// under WebElement

	public static void toSendKeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toGetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// under Action

	public static void toMoveToElement(WebElement element) {
		ac= new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void toDragAndDrop(WebElement src, WebElement desti) {
		ac.dragAndDrop(src, desti).perform();
	}

	public static void toRightClick(WebElement element) {
		ac.contextClick(element).perform();
	}

	public static void toDoubleClick(WebElement element) {
		ac.doubleClick(element).perform();
	}

	public static void toKeyUpShift(WebElement element) {
		ac.keyUp(element, Keys.SHIFT).perform();
	}

	public static void toKeyUpctrl(WebElement element) {
		ac.keyUp(element, Keys.CONTROL).perform();
	}

	public static void toKeyDownShift(WebElement element) {
		ac.keyDown(element, Keys.SHIFT).perform();
	}

	public static void toKeyDownctrl(WebElement element) {
		ac.keyDown(element, Keys.CONTROL).perform();
	}

	// under Robot

	public static void toKeyPressControl() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toKeyPressEnter() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toKeyPressDown() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toKeyPressUp() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void toKeyPressTab() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// under Alert

	public static void toAlertAccept() {
		a.accept();
	}

	public static void toAlertDismiss() {
		a.dismiss();
	}

	public static void toAlertSendkeys(String text) {
		a.sendKeys(text);
	}

	public static void toAlertText() {
		String text = a.getText();
		System.out.println(text);
	}

	// under TakesScreenshot

	public static void toTakesScreenshot(String a) throws IOException {
		tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\elank\\MAVEN_TASK\\Screenshots\\a.png");
		FileUtils.copyFile(source, desti);
	}

	// under JavaScript

	public static void toexecuteScriptFill(WebElement element, String values) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','values')", element);
	}
	
	public static void toexecuteScriptClick(WebElement element) {
		j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].click()", element);
	}
	
	public static void javaScriptGetAttribute(WebElement element, String anyLocator) {
		j = (JavascriptExecutor) driver;

		Object locator = j.executeScript("return arguments[0].getAttribute('anyLocator')", element);
	System.out.println(locator);
	}
	
	public static void toScrollDown(WebElement element) {
		j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	public static void toScrollUp(WebElement element) {
		j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].scrollIntoView(false)", element);

	}
	
	// under Select
	
	public static void toSelectByValue(WebElement element, String value) {
		s= new Select(element);
		s.selectByValue(value);
	}
	public static void toSelectByIndex(WebElement element, int index) {
		s= new Select(element);
		s.selectByIndex(index);
	}
	public static void toSelectByVisibleText(WebElement element, String text) {
		s= new Select(element);
		s.selectByVisibleText(text);
	}
	public static void isMultiple(WebElement element) {
		s= new Select(element);
		if(s.isMultiple()) {
		System.out.println("not able to select multiple options");
	}
		else {
			System.out.println("able to select multiple options ");
		}
	}
	public static void toGetOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());
		}
	}
	public static void toAllSelectedOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());
	}
		}
	public static void toFirstSelectedOption(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	public static void toDeSelectByValue(WebElement element, String value) {
		s= new Select(element);
		s.deselectByValue(value);
	}
	public static void toDeSelectByIndex(WebElement element, int index) {
		s= new Select(element);
		s.deselectByIndex(index);
	}
	public static void toDeSelectByVisibleText(WebElement element, String text) {
		s= new Select(element);
		s.deselectByVisibleText(text);
	}
	public static void toDeSelectAll(WebElement element) {
		s= new Select(element);
		s.deselectAll();
	}
	
	public static String excelReadAll(String sheetName) throws IOException {
		
	File f = new File("C:\\Users\\elank\\MAVEN_TASK\\Excel\\TestData.xlsx");
			String name="";

		FileInputStream fis= new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					name = cell.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sim= new SimpleDateFormat("dd/MMM/yyyy");
					name = sim.format(dateCellValue);
					System.out.println(name);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l=(long)numericCellValue;
					name = String.valueOf(l);
					System.out.println(name);
				}		

			}
			}
		return name;
}
	
	public static String excelReadOneCell(String sheetName, int rowNo, int cellNo) throws IOException {
		
		File f = new File("C:\\Users\\elank\\MAVEN_TASK\\Excel\\TestData.xlsx");
				String name="null";

			FileInputStream fis= new FileInputStream(f);
			Workbook book=new XSSFWorkbook(fis);
			Sheet sheet = book.getSheet(sheetName);
				Row row = sheet.getRow(rowNo);
					Cell cell = row.getCell(cellNo);
					int cellType = cell.getCellType();
					if (cellType==1) {
						name = cell.getStringCellValue();
						System.out.println(name);

					} else if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sim= new SimpleDateFormat("dd/MMM/yyyy");
						name = sim.format(dateCellValue);
						System.out.println(name);

					} else {
						double numericCellValue = cell.getNumericCellValue();
						long l=(long)numericCellValue;
						name = String.valueOf(l);
						System.out.println(name);

					}		return name;					
	}
	
	public static void toReadAllTableData() {
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> data = row.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement datum = data.get(j);
				String text = datum.getText();
				System.out.println(text);
			}
	
	}}

	
	
	
	}
