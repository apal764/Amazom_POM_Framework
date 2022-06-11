package com.qa.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage extends TestBase{


	@FindBy(id="ap_email")
	WebElement emailTextBox;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	public EmailPage()throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmail()
	{
		emailTextBox.sendKeys(prop.getProperty("username"));
	}
	public PasswordPage clickOnContinue() throws Exception
	{
		continueButton.click();
		return new PasswordPage();
	}

}
