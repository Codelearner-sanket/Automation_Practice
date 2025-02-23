package SelePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure {
	WebDriver driver;
	
	// ITestResult will provide us the test case execution status and test name 
	 public void captureScreenshot(ITestResult result) throws Exception {
		 
		 if (ITestResult.FAILURE==result.getStatus()) {
			 // create ref of takescreenshot Interace and type casting
			 
			 TakesScreenshot ts= (TakesScreenshot) driver;
			 
			 // Use getScreenShotAs() to capture the screenshot in file format 
			 //getScreenshotAs()  method return type FILE
			 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			 
			 // cpoy the file destination to specific ocation 
			 
			 File destFolder = new File("./screenshots/"+result.getName()+".png");
			 FileUtils.copyFile(sourceFile,destFolder);
			 System.out.println(result.getName()+"method() failed , screenshot captured ");
			 
		 }
	 }

}
