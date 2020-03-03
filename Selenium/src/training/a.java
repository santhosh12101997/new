package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
//		driver.findElement(By.className("nav__button-secondary")).click();
//		driver.findElement(By.id("username")).sendKeys("santhosh");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
//		
//		driver.findElement(By.linkText("Join now")).click();
//		//driver.findElement(By.partialLinkText("Join")).click();
//		try {
//		Thread.sleep(5);
//		}
//		catch(InterruptedException e)
//		{
//		e.printStackTrace();	
//		}
		
//		
//		driver.close();
//		
//		
//		driver.quit();
		
		
		//driver.findElement(By.xpath("/html/body/main/section[3]/div/a")).click();
		//relative xpath
		driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();
		//Using AND condition	
		//driver.findElement(By.xpath("//input[@id='first-name-ember18' and @type='text']")).sendKeys("santhosh");
		//Using OR condition	
				//driver.findElement(By.xpath("//input[@id='first-name-ember1' OR @type='text']")).sendKeys("santhosh");
		//using contains function
		driver.findElement(By.xpath("//*[contains(@id,'first-name-ember1')]")).sendKeys("santhosh");
		driver.findElement(By.xpath("//input[@id='last-name-ember18' and @type='text']")).sendKeys("santhosh");
		//driver.findElement(By.xpath("//input[@classname='ember-application boot-complete' OR @type='text']")).sendKeys("san");
		driver.findElement(By.xpath("//*[starts-with(@id,'email-')]")).sendKeys("santhosh");
				
	}
}
