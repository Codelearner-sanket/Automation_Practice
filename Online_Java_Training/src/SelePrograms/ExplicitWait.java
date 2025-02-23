package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        
        // Enter Username
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        
        //fetch input box attribute value
        System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
        
        // use explicit wait to check if password field is visible
        WebDriverWait wt=new WebDriverWait(driver,30);
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
        

	}

}
