package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PAP_ShoptheProduct 
{
	WebDriver driver;
	
	By myacc = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By logemail1 = By.id("username");
	By logpass1 = By.id("password");
	By loginbutton1 = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	By address=By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a");
	By edit=By.className("edit");
	By shop= By.xpath("//*[@id=\"menu-item-40\"]/a");
	By fpj_book= By.xpath("//*[@id=\"content\"]/ul/li[4]/a[1]/h3");
	By q1=By.xpath("//*[@id=\"product-170\"]/div[2]/form/div/input");
	By atb1= By.xpath("//*[@id=\"product-170\"]/div[2]/form/button");
	By hwd_book= By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/h3");
	By q2= By.xpath("//*[@id=\"product-182\"]/div[2]/form/div/input");
	By atb2= By.xpath("//*[@id=\"product-182\"]/div[2]/form/button");
	By addtocart= By.xpath("//*[@id=\"wpmenucartli\"]/a/i");
	
	public void url()
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void openwebsite()
	{
		driver.get("http://practice.automationtesting.in/");
		System.out.println(driver.getTitle());
	}
	public void logindetails()
	{
		driver.findElement(myacc).click();
		driver.findElement(logemail1).sendKeys("madhusavi1@gmail.com");
		driver.findElement(logpass1).sendKeys("madhuvickyrekha");
		driver.findElement(loginbutton1).click();
	}
	public void fillbilldetails()
	{
		driver.findElement(address).click();
		driver.findElement(edit).click();
		driver.findElement(By.id("billing_first_name")).sendKeys("Madhumitha");
		driver.findElement(By.id("billing_last_name")).sendKeys("V");
		driver.findElement(By.id("billing_phone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"s2id_billing_country\"]")).click();
		driver.findElement(By.id("s2id_autogen1_search")).sendKeys("india");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("no.9a,sowbenika garden,Ariyankuppam");
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Puducherry");
		driver.findElement(By.xpath("//*[@id=\"select2-drop-mask\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")).sendKeys("po");
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ENTER);
		driver.findElement(By.id("billing_postcode")).sendKeys("605007");
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[12]/input[1]")).click();
	}
		//Click Shop link
		public void shop()
		{
			driver.findElement(shop).click();
		}
		
		public void selectfromsort()
		{
			Select day=new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
			day.selectByVisibleText("Sort by newness");
		}
		//Functional
		public void funcprogbook()
		{
			driver.findElement(fpj_book).click();
			driver.findElement(q1).clear();
			driver.findElement(q1).sendKeys("2");
			driver.findElement(atb1).click();
		}
		
	
		public void htmlwebappdvelop()
		{
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(hwd_book).click();
			driver.findElement(q2).clear();
			driver.findElement(q2).sendKeys("3");
			driver.findElement(atb2).click();
		}
		
		public void addtocart() throws InterruptedException
		{
			driver.findElement(addtocart).click();
			Thread.sleep(2000);
			
		}
}
