package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim {

	public static void main(String[] args) throws Exception {
		/*To do all the mouse simulations we use "Actions" class.
		 * After using Actions class, we must build perform 
		 */
		// property of chrome driver 
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); 
	        
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.get("https://www.flipkart.com/plus/all-offers");
	        
	        // create electronic web element ref 
	        WebElement electro =driver.findElement(By.xpath("//*[text()='Electronics']"));
	        // Mouse Simulations using Actions Class
	        Actions act = new Actions(driver);
	        // mouse hover to electronics
	        Thread.sleep(2000);
	        
	        act.moveToElement(electro).build().perform();
	        driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
	        
	        Thread.sleep(2000);
	        
	        // Keyboard Operations
//	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        WebElement men=driver.findElement(By.xpath("//*[text()='Men']"));
	        act.sendKeys(men,Keys.ENTER).build().perform();
	        System.out.println("Men Option Clicked ");
	        
	        // Right click on webpage 
	        Thread.sleep(2000);
	        act.contextClick().build().perform();

	}

}
