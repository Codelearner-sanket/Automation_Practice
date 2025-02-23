package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure t1=new TakeScreenshotOnFailure();
	
	@Test
	public void doLogin() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		 t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        t1.driver.get("https://www.facebook.com/");
        
        t1.driver.findElement(By.id("email")).sendKeys("12345");
        // pass wrong id for pass field - test case failed 
        t1.driver.findElement(By.id("pass_wrong")).sendKeys("12344");
	}
        
        @AfterMethod
        public  void takescreenshot(ITestResult result2) throws Exception{
        	t1.captureScreenshot(result2);
        }
	}

