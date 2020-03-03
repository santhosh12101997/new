package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void login() {
		System.out.println("login the application");
	}
	@Test(dependsOnMethods= {"login"})
	public void search() {
		System.out.println("searching the application");	
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logout() {
		System.out.println("logout the application");
	}

}
