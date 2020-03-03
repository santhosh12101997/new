package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).isDisplayed());
		//driver.switchTo().defaultContent();
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement c=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		Actions ca=new Actions(driver);
		ca.clickAndHold(a).clickAndHold(c).release().build().perform();		
	}
}
