package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// constructor Implementation
	public MasterPage() throws Exception {

		// configuration properties file implementation
		FileInputStream ip = new FileInputStream(".\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// locators properties file implementation
		FileInputStream fs = new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		// testdata properties file implementation
		FileInputStream ts = new FileInputStream(".\\src\\com\\facebook\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);

		// Added latest Webdrivermanager dependency into pom.xml
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanket umergi\\eclipse-workspace\\Online_Java_Training\\chromedriver.exe"); // property of chrome driver 
		      
			// Launching chrome browser instance 
			 driver = new ChromeDriver();
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (prop.getProperty("browser").equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("No browser details found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}
