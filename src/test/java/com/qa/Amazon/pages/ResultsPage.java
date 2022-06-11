package com.qa.Amazon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends TestBase{
	
	@FindBy(xpath="//span[text()='HP 15s 11th Gen Intel Core i5 15.6 inch(39.6 cm) FHD Anti-Glare Display Laptop (8GB RAM/512GB SSD Micro-Edge/Iris Xe Graphics/Backlit Keyboard/Win 11/Alexa/Dual Speakers/MSO, 15s- fq4021TU, 1.69Kg)']")
	WebElement itemLink;
	
	public ResultsPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	public void scrollToItem()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", itemLink);
	}
	public ItemPage clickOnItem() throws Exception
	{
		itemLink.click();
		return new ItemPage();
	}

}
