package testNGdemo;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class ExtentReport
{
	
		ExtentReports extent;
		ExtentTest test1;
		
		@BeforeTest
		public void startReport1()
		{
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/myOwnreport.html",true);
		extent.addSystemInfo("HostName","RagiMadhu")
		.addSystemInfo("Environment","QA")
		.addSystemInfo("User Name","RagiiniMadhu");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
		}
		@Test
		public void demoReportPass()
		{
		test1 =extent.startTest("demoReportPass");
		Assert.assertTrue(true);
		test1.log(LogStatus.PASS,"Assert pass as condition is True");
		}
		
		@Test
		public void demoReportfail()
		{
		test1 =extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test1.log(LogStatus.FAIL,"Assert fail as condition is false");
		}
		
		@AfterMethod
		public void getResult(ITestResult result)
			{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		test1.log(LogStatus.FAIL,result.getThrowable());
		}
		extent.endTest(test1);
		}
		
		@AfterTest
		public void endReport()
		{
		extent.flush();
		extent.close();
		}

		}
