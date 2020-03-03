package testNGdemo;

import org.testng.annotations.Test;

public class PriorityTestCAse {
  @Test(priority=3)
  public void testcase1() {
	  System.out.println("TEST case 1");
  }
  @Test(priority=1,invocationCount=3,invocationTimeOut=5)
  public void testcase2() {
	  System.out.println("TEST case 2");
  }
  @Test(priority=2,description="Logout of the Application")
  public void testcase3() {
	  System.out.println("TEST case 3");
  }
}
