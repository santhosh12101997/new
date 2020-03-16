package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Locating the IFrame
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement a= driver.findElement(By.xpath("//*[@id=\\\"selectable\\\"]/li[1]"));
		WebElement b= driver.findElement(By.xpath("//*[@id=\\\"selectable\\\"]/li[2]"));
		WebElement c= driver.findElement(By.xpath("//*[@id=\\\"selectable\\\"]/li[3]"));
		WebElement d= driver.findElement(By.xpath("//*[@id=\\\"selectable\\\"]/li[4]"));
		Actions  action = new Actions(driver);
		action.clickAndHold(a).clickAndHold(d).release().build().perform();
	}
}
