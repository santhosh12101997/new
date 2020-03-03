package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(srcFile, new File("C:\\\\Users\\\\BLTuser.BLT1223\\\\eclipse-workspace\\\\Selenium\\\\screenshot\\\\2.png"));
		
		
	}

}
