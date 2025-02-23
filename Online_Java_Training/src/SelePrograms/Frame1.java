package SelePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://paytm.com");
		
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(2000);

		// Find the total number of frames present in the web page 
		int allFrames= driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames :" + allFrames);
		
		// check if the element is present or not 
		for(int i =0;i<allFrames;i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			
			String expText="Open Paytm App";
			String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(abc.equalsIgnoreCase(expText)) {
				System.out.println("Elements found");
				break;
			}
			else {
				System.out.println("Elements not found ");
			}
		}
		
	}

}
