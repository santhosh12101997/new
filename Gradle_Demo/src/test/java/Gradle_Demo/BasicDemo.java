package  Gradle_Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public void BasicDemo()
{
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");

}
