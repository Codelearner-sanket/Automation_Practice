package SelePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         
         // Implicit wait 
         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Virat kohli ");
         
         // handling Auto suggestions 
         
         List<WebElement> AllSuggestions=driver.findElements(By.xpath("//ul[role='listbox']/li"));
         for(int i=0;i<AllSuggestions.size();i++) {
        	 String expResult="Virat kohli stats";
        	 if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
        		 AllSuggestions.get(i).click();
        		 break;
        	 }
        			 
         }
         
         
	}

}
