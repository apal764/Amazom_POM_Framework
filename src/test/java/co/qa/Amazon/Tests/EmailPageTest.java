package co.qa.Amazon.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Amazon.pages.EmailPage;
import com.qa.Amazon.pages.PasswordPage;
import com.qa.Amazon.pages.SignInPage;
import com.qa.Amazon.pages.TestBase;

public class EmailPageTest extends TestBase{
	
	SignInPage signInPage;
	EmailPage emailPage;
	PasswordPage passwordPage;
	
	public EmailPageTest() throws Exception {
		super();
	}
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		signInPage=new SignInPage();
		signInPage.hoverOnAccounts();
		signInPage.clickOnSignIn();
		emailPage=new EmailPage();
		passwordPage=new PasswordPage();
	}
	@Test
	public void enterEmail() throws Exception
	{
		emailPage.enterEmail();
		emailPage.clickOnContinue();
	}

}
