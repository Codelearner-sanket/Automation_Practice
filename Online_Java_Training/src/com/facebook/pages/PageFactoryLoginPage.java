package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailOrPhone;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password;
	
	public void enterEmail() {
		EmailOrPhone.sendKeys("abc@gmail.com");
	}
	public void enterPass() {
		Password.sendKeys("12345");
	}
}
