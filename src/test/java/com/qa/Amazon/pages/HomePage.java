package com.qa.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	@FindBy(id="twotabsearchtextbox")
	WebElement textBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement search;
	
	public HomePage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterInTextBox()
	{
		textBox.sendKeys("i5 laptops");
	}
	public ResultsPage clickOnSearch() throws Exception
	{
		search.click();
		return new ResultsPage();
	}
	

}
