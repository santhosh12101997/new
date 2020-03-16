package com.Excelutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filter {
	
	public static void main(String [] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1216\\Desktop\\PracticeAutomationProject(PAP)\\src\\test\\resources\\Drivers\\chromedriver.exe");
	WebDriver river = new ChromeDriver();
	river.get("http://practice.automationtesting.in/shop/");
	WebElement Slider = river.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div"));

	Actions builder = new Actions(river);

	org.openqa.selenium.interactions.Action dragAndDrop =

	builder.clickAndHold(Slider).moveByOffset(150,300).release().build();

	dragAndDrop.perform(); 
}
}