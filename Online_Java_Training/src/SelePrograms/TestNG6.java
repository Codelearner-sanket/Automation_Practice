package SelePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG6 {
	

	WebDriver driver;
	@BeforeClass
	public void setEnv() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\chromedriver.exe"); // property of chrome driver 
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        
	}
	 
	@DataProvider
	public Object[][] dataSet() throws Exception{
		// specify the location of the properties file 
		File src = new File("C:\\Users\\sanket umergi\\eclipse-workspace\\Online_Java_Training\\Repository\\testdata.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][]=new Object[3][2];
		arr[0][0]=pro.getProperty("email");
		arr[0][1]=pro.getProperty("pass");
		
		arr[1][0]="Testdata2";
		arr[1][1]="Testdata2";
		
		arr[2][0]="Testdata3";
		arr[2][1]="Testdata3";
		
		return arr;
		
	}
	
	@Test(dataProvider="dataSet")
	public void enterData(String userName, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		
	}
}
