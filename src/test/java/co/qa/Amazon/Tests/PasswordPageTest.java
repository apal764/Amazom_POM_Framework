package co.qa.Amazon.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Amazon.pages.EmailPage;
import com.qa.Amazon.pages.HomePage;
import com.qa.Amazon.pages.PasswordPage;
import com.qa.Amazon.pages.SignInPage;
import com.qa.Amazon.pages.TestBase;

public class PasswordPageTest extends TestBase{

	public PasswordPageTest() throws Exception {
		super();
	}
	SignInPage signInPage;
	EmailPage emailPage;
	PasswordPage passwordPage;
	HomePage homePage;
	
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
		homePage=new HomePage();
	}
	@Test
	public void enterPassword() throws Exception
	{
		passwordPage.enterPassword();
		passwordPage.clickOnSignIn();
	}

}
