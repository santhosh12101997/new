package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn_join {
	WebDriver driver;
	WebElement textbox;

	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
		System.out.println(driver.getTitle());
	}
//	public void linkedin_join() 
//	{
//
//		driver.findElement(By.className("nav__button-tertiary")).click();
////		Actions action = new Actions(driver);
////		action.click();
//	
//
//		}
	
	public void username() throws InterruptedException 
	{
		textbox = driver.findElement(By.xpath("//*[@id=\"email-or-phone\"]"));
		if (textbox.isEnabled()) 
		{
			textbox.sendKeys("santhosh");
			Thread.sleep(3000);

		}
	}
	public void password() throws InterruptedException 
	{
		textbox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		if (textbox.isEnabled()) 
		{
			textbox.sendKeys("183254995");
			Thread.sleep(3000);

		}
	}

	public void join() {
	 driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
//		Actions action = new Actions(driver);
//		action.click();
		//driver.close();

	}
}
