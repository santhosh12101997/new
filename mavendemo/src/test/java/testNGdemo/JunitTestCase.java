package testNGdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestCase {
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
@Before	
public void beforemethod() {
	 System.out.println("Before method");
}
@After
public  void aftermethod() {
	 System.out.println("after method");
}
@BeforeClass
public static void beforeclass() {
	 System.out.println("Before class");
}
@AfterClass
public static void afterclass() {
	 System.out.println("after class");
}
}


