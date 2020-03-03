package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wrappermethod {
	WebDriver driver;
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void clickbyxpath(String path)
	{
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(path)).click();
		
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
	public void closeapp() {
		driver.close();
	}
	}


