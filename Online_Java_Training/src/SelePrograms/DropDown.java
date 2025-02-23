package SelePrograms;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception{
		
		// DropDown list is also called list box 
		// Every dropdown will have tagname as 'select'
		// Every element in droplist will have tag 'option'
		
	// to handle dropdown having select tag , we can use select class methods as below 
		/*
		 * 1.getFirstSelectedOption()- Gives text of current selected option from drop list 
		 * 2.selectByVisibleText()- select any element using visible text 
		 * 3.selectByValue()-selecting any element using attibute value 
		 * 4.selectByIndex()-select any element using index . index start from 0
		 * 5.getOptions()-total number of elemnts in droplist 
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		List<WebElement> birthMonth= driver.findElements(By.xpath("//select[@id='month']/option"));
		
		System.out.println(birthMonth.size());
		
		birthMonth.get(3);//Apr
		Thread.sleep(2000);
		birthMonth.get(4);//Sep
		
		// 2nd way 
		WebElement bm =  driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");// Apr
		Thread.sleep(2000);
		month.selectByValue("12");//dec
		Thread.sleep(2000);
        month.selectByIndex(7);// Aug 
        System.out.println(month.getFirstSelectedOption().getText());//Aug - current selected value 
        
        
		// 3rd way 
        
        List<WebElement> dropdown = month.getOptions();
        System.out.println(dropdown.size());
        for(int i=0;i<dropdown.size();i++) {
        	if(dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
        		dropdown.get(i).click();
        	}
        }
        
        // 4th way 
        Thread.sleep(2000);
        WebElement bm1=driver.findElement(By.xpath("//select[@id='month']"));
        bm1.sendKeys("Jun");
        
        //5th way 
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("Mar");
        
        // check if dropdown support multi selection 
         
//        System.out.println(month.isMultiple());
//        month.selectByVisibleText("Apr");
//        month.selectByValue("12");
        
        // deselect multiple value
      //  month.deselectByVisibleText("Apr");
//      month.deselectByValue("12");
     //   month.deselectAll();
        
        
        
        
	}

}
