package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest {
	
	@Test
	public void loginTest() throws Exception {
		LoginPage lp=new LoginPage();
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.getFacebookText();
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPassword();
		Thread.sleep(2000);
		lp.readExcelData("EmailOrPhone", 3, 2);
		Thread.sleep(2000);
		lp.readExcelData("Password",3,3);
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		LoginPage lp=new LoginPage();
		lp.captureScreenshot(result2);
	}
	@AfterClass
	public static void closeLoginPage() {
		MasterPage.driver.close();
	}

}
