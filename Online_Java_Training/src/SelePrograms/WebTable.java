package SelePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://money.rediff.com/gainers");
        
        // Create list of All Companies 
        List<WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
        System.out.println("Total Companies "+AllCompanies.size());
        
        // create list of current price 
        List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        System.out.println("Total Current price" + currentprice.size());
        
        String expResult="Godfrey Phillips Ind";
        for(int i=0;i<AllCompanies.size();i++) {
        	if(AllCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
        	System.out.println(AllCompanies.get(i).getText()+ "===" + currentprice.get(i).getText());
        	AllCompanies.get(i).click();
        	System.out.println(driver.getTitle());
        	break;
        	}
        	
        }
        
        
        
	}

}
