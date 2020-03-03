package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=A3F9454B3BD3C515A3BD4FC08EB445FA ");
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		//This is for clicking OK button
		a.accept();
		 //to cancel
		//a.dismiss();
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("santhosh");;
		//a.sendKeys("santhosh");
		driver.close();
		
		}

}
