package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
	}
	// Get Text to webelement 
	public void getWebElementText(String xpathkey) {
		String getTextOfWebElement=driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(getTextOfWebElement);
	}

	// click method
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}
	// clear method
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}
	// Enter  data 
	public void enterData(String xpathkey,String testdata) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
		
	}
	// Mouse Over 
	public void  moveToElement(String xpathkey) {
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}
	
	// click list of web elements
	public void clickListElement(String xpathkey,String testdata) {
		List<WebElement> listofElements= driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for(int i=0;i<listofElements.size();i++) {
			if(listofElements.get(i).getText().equalsIgnoreCase(td.getProperty(testdata))) {
				listofElements.get(i).click();
			}
		}
	}
	// select dropdown value using visible text 
	public void selectDropdownValue(String xpathkey, String testdata) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(td.getProperty(testdata));
	}
	public void readExcelData(String xpathkey, int rowNo, int columnNo) throws Exception {
	    File src = new File("C:\\Users\\sanket umergi\\eclipse-workspace\\Online_Java_Training\\com.facebook.resources\\Testdata.xlsx");
	    FileInputStream fis = new FileInputStream(src);

	    try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {  // Use try-with-resources
	        XSSFSheet sh = wb.getSheet(prop.getProperty("ExcelTestDataSheetName"));
	        System.out.println(sh.getSheetName());
	        
	        String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
	        driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(abc);
	    }
	}
	// Handling explicit wait  - visiblity of element loacated 
	public void handleExplicitWait_visibilityOfElementLocated(String xpathkey, String testdata) {
		WebDriverWait wt= new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(xpathkey)))).sendKeys(td.getProperty(testdata));
	}
	
	//Handling explicit wait -element tobe clicked 
	public void handleExplicitWait_elementToBeClickable(String xpathkey) {
		WebDriverWait wt= new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(or.getProperty(xpathkey)))).click();
	}
	
	// Handle log file 
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger=Logger.getLogger(logClassName);
		PropertyConfigurator.configure(prop.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}
	// capture Screenshot 
	public void captureScreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File sourceFile=ts.getScreenshotAs(OutputType.FILE);
			File destFolder= new File("./screenshots/"+result.getName()+".png");
			FileUtils.copyFile(sourceFile,destFolder);
			System.out.println(result.getName()+"method() failed , screenshot captured ");
		}
	}
	
}
