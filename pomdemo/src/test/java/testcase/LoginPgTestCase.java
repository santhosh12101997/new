package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.WrapperEx;
import pages.LinkedInLogin;

public class LoginPgTestCase extends WrapperEx {
	@BeforeClass
	public void startup()
	{
		launchApplication("chrome","https://www.linkedin.com/login");
	}
	@Test
	public void login()
	{
		LinkedInLogin lpage=new LinkedInLogin(driver);
		lpage.loginToApp_username("welcome");
		lpage.loginToApp_password("welcome123");
		lpage.loginToApp_Loginbutton();
	}
	@AfterClass
	public void endUp() {
		quit();
	}
}
