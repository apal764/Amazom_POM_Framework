package co.qa.Amazon.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Amazon.pages.CheckOutPage;
import com.qa.Amazon.pages.EmailPage;
import com.qa.Amazon.pages.HomePage;
import com.qa.Amazon.pages.ItemPage;
import com.qa.Amazon.pages.PasswordPage;
import com.qa.Amazon.pages.ResultsPage;
import com.qa.Amazon.pages.SignInPage;
import com.qa.Amazon.pages.TestBase;

public class ItemPageTest extends TestBase{

	public ItemPageTest() throws Exception {
		super();
	}
	SignInPage signInPage;
	EmailPage emailPage;
	PasswordPage passwordPage;
	HomePage homePage;
	ResultsPage resultsPage;
	ItemPage itemPage;
	CheckOutPage checkOutPage;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		signInPage=new SignInPage();
		signInPage.hoverOnAccounts();
		signInPage.clickOnSignIn();
		emailPage=new EmailPage();
		emailPage.enterEmail();
		emailPage.clickOnContinue();
		passwordPage=new PasswordPage();
		passwordPage.enterPassword();
		passwordPage.clickOnSignIn();
		homePage=new HomePage();
		homePage.enterInTextBox();
		homePage.clickOnSearch();
		resultsPage=new ResultsPage();
		resultsPage.scrollToItem();
		resultsPage.clickOnItem();
		itemPage=new ItemPage();
		checkOutPage=new CheckOutPage();
	}
	@Test
	public void clickOnAddToCartButton()
	{
		//itemPage.switchToNewWindow();
		itemPage.clickOnAddToCart();
	}

}
