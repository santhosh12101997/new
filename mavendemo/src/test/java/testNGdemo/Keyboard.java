package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {
	@Test
	public void key()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		driver.findElement(By.id("username")).sendKeys("santhoshjr97@gmail.com");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("123").perform();
		action.sendKeys(Keys.RETURN).perform();
	}

}
