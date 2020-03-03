package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		day.selectByVisibleText("12");

		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByVisibleText("Oct");

		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByVisibleText("1997");

		
		
		//Select day=new Select();
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		

	}

}
