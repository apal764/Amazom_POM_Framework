package co.qa.Amazon.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Amazon.pages.EmailPage;
import com.qa.Amazon.pages.SignInPage;
import com.qa.Amazon.pages.TestBase;

public class SignInPageTest extends TestBase{
	
	SignInPage signInPage;
	EmailPage emailPage;
	
	public SignInPageTest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		signInPage=new SignInPage();
		emailPage=new EmailPage();
	}
	@Test
	public void hover() throws Exception
	{
		signInPage.hoverOnAccounts();
		signInPage.clickOnSignIn();
	}

}
