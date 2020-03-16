package com.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excelutility.ExcelData;

public class PAP_RegisterAndLogin 
{
	WebDriver driver;
	
	// Declaring Locators for Register and Login
	By myaccount = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By regemail = By.id("reg_email");
	By regpass = By.id("reg_password");
	By registerbutton = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]");
	By logemail = By.id("username");
	By logpass = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");

	// To launch the chrome browser
	public void launchurl() 
	{ 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Using webdriver the user visits the PAP website
	public void OpenPAPWebsite() 
	{
		driver.get("http://practice.automationtesting.in/");
		System.out.println(driver.getTitle());
	}
	
	//Click MyAccount link
	public void myaccount()
	{
		driver.findElement(myaccount).click();
	}
	
	//Enter email id for Register
	public void regemailandpass()
	{
		driver.findElement(regemail).sendKeys("soundaryariya27@gmail.com");
		driver.findElement(regpass).sendKeys("soundarya12@");;
	}
	
	//Click Register Button
	public void registerbutton() throws InterruptedException
	{
		driver.findElement(registerbutton).click();
		Thread.sleep(2000);
	}
	
	//Navigate back and again click my account
	public void clickagainmyaccount()
	{
		driver.navigate().back();
		driver.findElement(myaccount).click();
	}
	//Enter Registered email and password in login
	public void loginemailandpass() throws Exception
	{
		ExcelData ed = new ExcelData();
		int a=ed.coun();
		for(int i=1;i<=a;i++) 
		{	
			driver.findElement(logemail).sendKeys(ed.excel_username(i));
			driver.findElement(logpass).sendKeys(ed.excel_password(i));
			driver.findElement(loginbutton).click();				
			driver.findElement(logemail).clear();
		}
	}}



