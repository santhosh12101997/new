package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.WrapperEx;
import pages.LinkedInLogin;

public class OrangeTestCase extends WrapperEx {
	@BeforeClass
	public void startup()
	{
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login()
	{
		LinkedInLogin lpage=new LinkedInLogin(driver);
		lpage.loginToApp_username(" Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbutton();
	}
	@AfterClass
	public void endUp() {
		quit();
	}
}
