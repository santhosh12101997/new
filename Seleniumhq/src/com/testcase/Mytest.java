package com.testcase;

import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.pages.Mypage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Mytest extends WrapperClass {

	
	
	

	@Test
	public void f() throws InterruptedException {
		Mypage searchShip = new Mypage(driver);
		Thread.sleep(3000);
		searchShip.check_link();
		searchShip.shipClick();
		Thread.sleep(3000);
		searchShip.rhapsodyOfShips();
		Thread.sleep(5000);
		searchShip.select_Deck(8);
		Thread.sleep(5000);
		searchShip.check_Suite("Royal Suite - 1 Bedroom");
		Thread.sleep(3000);
		searchShip.result();
		

	}

	@BeforeClass
	public void beforeClass() {
		launchApplication("chrome", "https://www.royalcaribbean.com/alaska-cruises");
		
	}

	@AfterClass
	public void afterClass() {
		quit();
	}

}