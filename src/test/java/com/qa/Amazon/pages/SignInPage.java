package com.qa.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase{
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement accountsHover;
	
	@FindBy(id="nav-flyout-ya-signin")
	WebElement signInButton;
	
	public SignInPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnAccounts()
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountsHover).build().perform();
	}
	public EmailPage clickOnSignIn() throws Exception
	{
		signInButton.click();
		return new EmailPage();
	}
}