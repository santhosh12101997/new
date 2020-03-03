package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		//day.selectByVisibleText("12");
		day.selectByIndex(12);

		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByVisibleText("Oct");
		//month.selectByIndex(10);

		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		//year.selectByVisibleText("1997");
		year.selectByValue("1997");
		driver.findElement(By.id("u_0_7")).click();

	

}}
