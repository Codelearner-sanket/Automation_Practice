package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		
		Thread.sleep(2000);
		
		Alert myalert=driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		
		myalert.accept();
		
		// for cancel button 
		
//		myalert.dismiss();
		
		// for prompt 
//		myalert.sendKeys(text);
		
		
		
	
		

	}

}
