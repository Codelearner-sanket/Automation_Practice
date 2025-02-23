package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
    public void testcase1() {
		
		String expectedText="Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        
        String  actualText=driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
        
        // Equal Assertion
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Equal Assertion Verified ");
        
        // False Assertion 
        Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isSelected());
        System.out.println("False Assertion Verified ");
        
        // True assertion 
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
        System.out.println("True assertion Verified ");
       
        // if any assertion failed , text execution will stop there      
        // further line of code will not execute 
        
        String a="abc";
        String b="ab";
        
        try {
			Assert.assertEquals(a,b,"not matching ");
		} catch (AssertionError e) {
			// in the place of the assertionerror we can use throwable --- error , and exception 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("equal assertion verified ");
		
	}
}
