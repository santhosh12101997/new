package testNGdemo;


import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;


public class LinkedInTestCases
{
	
WebDriver driver;
  
@Test(alwaysRun=true)
  
public void Signin() 
  
{
	 
 driver.findElement(By.className("nav__button-secondary")).click();

	  driver.findElement(By.id("username")).sendKeys("2227@gmail.com");
	
  driver.findElement(By.id("password")).sendKeys("267277");
	
  driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
  
}
 
 
 @BeforeMethod(description="Launching the App")
  
public void beforeMethod() 
 
 {
	  	
System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1216/Desktop/selenium folders/chromedriver.exe");

		driver=new ChromeDriver();
		
driver.get("https://www.linkedin.com/");
		
driver.manage().window().maximize();	
 
 }

  
@AfterMethod(description="Closing the App")
  
public void afterMethod() 
  
{
	  
driver.close();
 
 }


}
