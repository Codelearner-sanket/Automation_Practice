package SelePrograms;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		   // radiobutton and checkbox - associated with id -- by using click method - we can handle radio and checkbox
		   
		// Settinhg the property pf thr chrome browser and passing chrome passing chrome driber path 
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sanket umergi\\\\eclipse-workspace\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'Sign up for Facebook')]")).click();
		// driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Sign up for Facebook']")).click();
		
		// 1st way 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=1]")).click(); // Female
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=2]")).click(); // Male
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=-1]")).click(); // Custome
		
		// 2nd way 
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(" Total radio button "+ radios.size());
		System.out.println(radios.get(0).isSelected()); // false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(2).isDisplayed());// true
		
		Thread.sleep(2000);
		
		radios.get(1).click();
		System.out.println(radios.get(2).isSelected());// false
		
		
		
		// verify whether radio button/ checkbox is enabled or not - isEnabled();  -- return boolean 
		// verify whether radio button/ checkbox is displayed  or not - isDisplayed(); -- return boolean
		// verify whether radio button/ checkbox is selected   or not - isSelected(); -- return boolean
		
		// 3rd  way 
		
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(radiosText.size());//3
		
		String expResult="Male";
		for(int i= 0;i<radiosText.size();i++) {
			if(radiosText.get(i).getText().equalsIgnoreCase(expResult)) {
				radiosText.get(i).click();
				System.out.println(expResult +" Clicked");
			}
		}
		

	}

}
