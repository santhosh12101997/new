package com.main;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkedIn {
	WebDriver driver;
	WebElement textbox;

	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://sts.cognizant.com/adfs/ls/?client-request-id=1d4990ff-e789-4e85-908b-81d32fed7a64&username=&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=estsredirect%3d2%26estsrequest%3drQIIAeNisFLKKCkpKLbS18_PS03OT8_LrErMK9FDZuUWCXEJ_J_gKdv5vNVvQnfjZf23VSmzGHlR1KxitCZskH6wo69PcLC_vmNpSUZwalFZZnJqsb5jcvEhRtV4k2RLQzMDE0tdY2Njc10T8xQT3SQjo0RdE-MkS-MUo2QLI0vLC4yMLxgZbzGxBifm5hjNYmbU38SskpJqYJFsYmCua2iZZKlrYmSeomuZlmqhm5qSZmRqYmxgkJxofoGF5xULjwGzFQcHmwCjBIMCww8WxkWsQI_VyDBs27La3XnfiZvFf-Z6Mpxi1TeIKvJxL9FP9NOPKi5KcUkOzc7OKkoy8i9L1C72CMvwCjP1cjTz0c9M1C-2NbMynMDGe4qN4QMbYwc7wwFOxltcIkYGRga6Bka6RhYKhkZWBkZWxmZRAA2#");
		System.out.println(driver.getTitle());
	}
//	public void linkedin_signin() throws InterruptedException
//	{
//
//		textbox=driver.findElement(By.xpath("/html/body/nav/a[3]"));
//		Actions action = new Actions(driver);
//		action.click();
//	
//
//		}
	
	public void username() throws InterruptedException 
	{
		textbox = driver.findElement(By.xpath("//*[@id=\"userNameInput\"]"));
		if (textbox.isEnabled()) 
		{
			textbox.sendKeys("santhosh");
			Thread.sleep(3000);

		}
	}
	public void password() throws InterruptedException 
	{
		textbox = driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
		if (textbox.isEnabled()) 
		{
			textbox.sendKeys("183254995");
			Thread.sleep(3000);

		}
	}

	public void submit() {
	 driver.findElement(By.xpath("//*[@id=\"Log_On1\"]")).click();
//		Actions action = new Actions(driver);
//		action.click();
		//driver.close();

	}

}
