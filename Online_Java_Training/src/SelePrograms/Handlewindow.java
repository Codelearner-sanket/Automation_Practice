package SelePrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// getWindowHandles
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		// step 1 - tab handling 
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		
		// get the total number of open tabs/windows 
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		
		Iterator<String> abc =allWindowsID.iterator();
		String win1= abc.next();
		String win2=abc.next();
		
		//print the title of the parent windows 
		driver.switchTo().window(win1);
		System.out.println("Parent window "+win1);	// alphanumeric id of parent window 
		
		// print the current url of the child tab 
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("Child Window Id :" + win2);  // alphanumeric child window 
		System.out.println(driver.getCurrentUrl());  // current url of child tab 
		driver.close();
		
		
		// Step 2
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('windowButton').click()");
		// print the title of child window 
		Set<String> allWindowsID2 = driver.getWindowHandles();
		System.out.println(allWindowsID2);
		
		Iterator<String> abc1 =allWindowsID2.iterator();
		String win3= abc.next();
		String win4=abc.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(win4);
		Thread.sleep(2000);
		System.out.println("child window id : "+win4);// alphanumeric id of child window 
		System.out.println(driver.getTitle()); //get title of child window 
		System.out.println(driver.getCurrentUrl());//get current url of child window 
		Thread.sleep(2000);
		driver.quit();//close parent window as well as all associated window 
		System.out.println("windows popup and tab handled");
		
		
		

	}

}
