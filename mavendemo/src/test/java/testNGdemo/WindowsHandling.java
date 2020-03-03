package testNGdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {
  @Test
  public void IrctcLogin() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("CONTACT US")).click();
		Set<String>winHandles=driver.getWindowHandles();
		System.out.println("The number of window handles are:"+" "+winHandles.size());
		for(String winHandle:winHandles) {
			driver.switchTo().window(winHandle);	
		}
		String title=driver.getTitle();
		System.out.println("The page title is"+title);
		driver.quit();
  }
}
