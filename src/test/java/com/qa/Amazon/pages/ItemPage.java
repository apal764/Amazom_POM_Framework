package com.qa.Amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends TestBase {

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;

	public ItemPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	public void switchToNewWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();

		while (it.hasNext()) {
			String childWindow = it.next();

			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
	}

	public void ScrollToAddToCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500");
	}

	public CheckOutPage clickOnAddToCart() {
		addToCart.click();
		return new CheckOutPage();

	}

}
