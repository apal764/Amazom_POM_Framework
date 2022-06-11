package co.qa.Amazon.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Amazon.pages.EmailPage;
import com.qa.Amazon.pages.HomePage;
import com.qa.Amazon.pages.PasswordPage;
import com.qa.Amazon.pages.ResultsPage;
import com.qa.Amazon.pages.SignInPage;
import com.qa.Amazon.pages.TestBase;

public class HomePageTest extends TestBase{

	public HomePageTest() throws Exception {
		super();
	}
	SignInPage signInPage;
	EmailPage emailPage;
	PasswordPage passwordPage;
	HomePage homePage;
	ResultsPage resultsPage;
	
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
		resultsPage=new ResultsPage();
	}
	@Test
	public void enterInSearch() throws Exception
	{
		homePage.enterInTextBox();
		homePage.clickOnSearch();
	}

}
