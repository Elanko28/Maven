package org.sample;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


public class justRun {

	 public static void main(String[] args) {
	        // Set up WebDriver (ChromeDriver in this case)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to Google
	            driver.get("https://www.google.com");

	            // Locate the search box, type "watches", and submit the search
	            WebElement searchBox = driver.findElement(By.name("q"));
	            searchBox.sendKeys("watches");
	            searchBox.submit();

	            // Wait for the search results to load
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#search")));

	            // Find all search result links
	            List<WebElement> searchResults = driver.findElements(By.cssSelector("div#search a"));

	            // Check if there are at least 7 results
	            if (searchResults.size() >= 7) {
	                // Click on the 7th search result
	                searchResults.get(6).click();  // Index 6 corresponds to the 7th result
	            } else {
	                System.out.println("Less than 7 search results found.");
	            }

	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}		
	


