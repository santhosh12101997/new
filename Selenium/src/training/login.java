package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
	WebDriver chrome=new ChromeDriver();
	chrome.get("https://www.facebook.com");
	
	WebDriver fire=new  FirefoxDriver();
	fire.get("https://www.gmail.com");
	
	WebDriver ie=new InternetExplorerDriver();
	ie.get("https://www.amazon.com");
	
	
	
	
	
	}

}
