package com.qa.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends TestBase{
	
	@FindBy(id="ap_password")
	WebElement passwordTextBox;
	
	@FindBy(id="signInSubmit")
	WebElement signInsubmit;
	
	public PasswordPage()throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPassword()
	{
		passwordTextBox.sendKeys(prop.getProperty("password"));
	}
	public HomePage clickOnSignIn() throws Exception
	{
		signInsubmit.click();
		return new HomePage();
	}

}
