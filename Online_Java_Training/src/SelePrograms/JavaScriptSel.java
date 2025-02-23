package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSel {

	public static void main(String[] args) throws Exception {
		/*
		 * # Javascript is powerful scripting language
		    JavascriptExecuter -> executeScript()
		 */
		// property of chrome driver 
      System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); 
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        
        // JavaScriptexecuter 
        JavascriptExecutor jse = (JavascriptExecutor) driver ;
        
        // Locate Web Element using java script 
        jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
        jse.executeScript("document.getElementsByName('pass')[0].value='abc@gmail.com'");
        jse.executeScript("document.getElementsByName('login')[0].click()");
        // scroll down using javascript 
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,500)");
        
        // scroll up using javascript 
         Thread.sleep(3000);
         jse.executeScript("window.scrollBy(0,-500)");
        
        
		
		
	}

}
