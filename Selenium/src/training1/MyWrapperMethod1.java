package training1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWrapperMethod1
{
	WebDriver driver;
	
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	
	public void clickbyxpath(String path)
	{
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(path)).click();
		
	}
	
	
	public void alert(String path,String value)
	{
		driver.findElement(By.xpath(path)).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		//a.sendKeys(value);
		
	}
	
	
	public void enterbyid(String loc,String value)
	{
		driver.findElement(By.id(loc)).sendKeys(value);
	}
	
	
	public void screenshot(String path1) throws IOException {
		TakesScreenshot ts=((TakesScreenshot)driver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(srcFile, new File(path1));
	}
	
	
	public void dropdown(String path ,int value) 
	{
		Select d = new Select(driver.findElement(By.xpath(path)));
		//d.selectByVisibleText(value);	Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		d.selectByIndex(value);
		//d.selectByValue(value);
	//driver.findElement(By.id()).click();
		
	}
	
	
	public void closeapp()
	{
		driver.close();
	}
	
	
}


