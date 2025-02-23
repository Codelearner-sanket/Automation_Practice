
package SelePrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Selenium Web Architecture consists of multiple components working together to automate web browser interactions. 
 * It follows a client-server model 
 * 
 *Language Bindings (Client Libraries)
Selenium supports multiple programming languages like Java, Python, C#, Ruby, JavaScript.
The Selenium Client Library provides bindings for these languages.
The test script uses Selenium APIs to interact with WebDriver.

 * JSON Wire Protocol
Selenium WebDriver communicates with browser drivers using the JSON Wire Protocol (REST API).
JSON Wire Protocol transmits data between client libraries and browser drivers.
Uses HTTP requests (GET, POST) for communication.
🔹 Role: Converts Selenium commands into HTTP requests and sends them to the browser driver.
 * 
 * 
 * 
 * Each browser has a dedicated driver that acts as a bridge between WebDriver and the real browser. Examples include:

ChromeDriver → Google Chrome
GeckoDriver → Mozilla Firefox
 * 1️⃣ WebDriver sends an HTTP request (via JSON Wire Protocol) to the Browser Driver.
2️⃣ Browser Driver translates the request into native browser commands.
3️⃣ The browser executes the commands and sends back the response
 * 
 * Real Browsers
The browser (Chrome, Firefox, Edge, Safari) executes the actions received from WebDriver.
The results (like page loading, element visibility, errors) are sent back via Browser Driver.
Supports headless execution (Chrome, Firefox) for faster test execution.


Test Script (Client Library) → Sends commands to WebDriver via Selenium APIs.
2️⃣ JSON Wire Protocol (HTTP Request) → Transmits commands to Browser Driver.
3️⃣ Browser Driver → Translates commands into native browser actions.
4️⃣ Browser → Executes the actions and sends the response back.
5️⃣ Response Flow → Browser → Browser Driver → WebDriver → Test Script.

       -- relative x path 
       
       //input[@id='email'][@name='email']
       //*[@id='email']
        *         //*[contains(@class,'inputtext_55r1')]
        *         //*[contains(@placeholder,'pa')]
        *         //div[text()='Log in to Facebook']
        *         
        *         
        *  Webdriver Commands :-
        *  WebDriver driver = new ChromeDriver();
        *  
        *  driver.
        *           close()
        *           findElement()
        *           findElements()
        *           get()
        *           getCurrentUrl()
        *           getTitle()
        *           getWindowHandle()
        *           getWindowHandles()
        *           manage()
        *           navigate()
        *           quit()
        *           switchTo()
        *           
        *           
        * WebElement Commands:-
        *  
        *  Clear()
        *  click()
        *  isEnabled()
        *  isDisplayed()
        *  isSelected()
        *  sendKeys()
        *  getText()
        *  getAttribute()
        *  
        * // absolute xpath - complete xpath - will start always single slash 
	    // relative xpath - partial xpath - will start always double slash
        * 
        */
       



public class OpenApplication {

	public static void main(String[] args) throws Exception {
		
		// setting the property of chrome browser and passing chrome driver path 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
      
		// Launching chrome browser instance 
		WebDriver driver = new ChromeDriver();
		
		// wait for given time 
		Thread.sleep(2000);
		//open url using get method 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
	    
		//maximizing the window 
	    driver.manage().window().maximize();
	    
	  
	     Thread.sleep(2000);
	     
	     // Delete all cookies 
	     driver.manage().deleteAllCookies();
	     
	     // open url using navigate method 
	     Thread.sleep(2000);
	     driver.navigate().to("https://www.google.com");
	     
	     // Refresh the page 
	     
	     Thread.sleep(2000);
	     driver.navigate().refresh();
	     
         // Navigate to back  
	     
	     Thread.sleep(2000);
	      driver.navigate().back();
	      
	      // Navigate to forward 
	      Thread.sleep(2000);
	      driver.navigate().forward();
	      
	      // fetch current url 
	      
	      Thread.sleep(2000);
	      System.out.println(driver.getCurrentUrl());
	      
	      // Fetch title of the webpage  
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	      
	      // close the browser instance 
	      Thread.sleep(2000);
	      driver.close();
	      
	
	     
	    
	    
	    
	}

}
