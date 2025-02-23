package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();
	}

	// click Email
	public void clickEmail() {
		clickWebElement("EmailOrPhone");
		handleLogger("LoginPage", "Clicked Email");
	}

	// Enter Email
	public void enterEmail() {
		enterData("EmailOrPhone", "TestData1");
		handleLogger("LoginPage", "Entered Email");
	}

	// Clear Email
	public void clearEmail() {
		clearData("EmailOrPhone");
		handleLogger("LoginPage", "cleared Email");
	}

	// click Password
	public void clickPassword() {
		clickWebElement("Password");
		handleLogger("LoginPage", "Clicked Password");
	}

	// Enter password
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Entered Password");
	}

	// Clear Password
	public void clearPassword() {
		clearData("Password");
		handleLogger("LoginPage", "cleared Password");
	}
	// Get facebook Text
	public void getFacebookText() {
		getWebElementText("FacebookText");
		handleLogger("LoginPage","Fetched Facebook Text	");
	}
	// click Login Button 
	public void clickLoginButton() {
		clickWebElement("LoginButton");
		handleLogger("LoginPage","Clicked Login Page");
	}

}
