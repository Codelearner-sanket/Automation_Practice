package SelePrograms;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	@DataProvider(parallel=true)
	public Object[][] sendData(){
		Object arr[][]=new Object[2][2];
		
		arr[0][0]="Email_1";
		arr[0][1]="chrome";
		
		arr[0][1]="Email_2";
		arr[0][1]="chrome";
		
		return arr;
		
	}
	@Test(dataProvider="sendData")
	public void login(String userName , String browserName) throws Exception {
		DesiredCapabilities cap =null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys(userName);
		}
	}
	

}
