package testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fineuploader.com/demos.html");
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"fine-uploader-validation\"]/div/div[3]/input")).sendKeys("C:\\Users\\BLTuser.BLT1223\\Downloads\\New Text Document.txt");
	
}

}
