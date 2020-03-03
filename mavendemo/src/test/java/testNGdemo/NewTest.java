package testNGdemo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testcase1() {
	  System.out.println("TEST case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("TEST case 2");
  }
  @Test
  public void testcase3() {
	  System.out.println("TEST case 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method:Launch The App");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method:Close The App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class:Prepare TestData");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class:Clear TestData");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test:Open Db Connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test:Close Db Connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite:Smoke Testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite:Generate Report");
  }

}
