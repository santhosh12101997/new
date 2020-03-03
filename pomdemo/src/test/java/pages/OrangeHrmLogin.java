package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLogin {
	WebDriver driver;
	By username= By.name("txtUsername");
	By password= By.id("txtPassword");
	By loginbutton= By.xpath("//*[@id=\"btnLogin\"]");

	public OrangeHrmLogin(WebDriver driver) {

		this.driver = driver;
	}
	public void loginToApp_username(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_Loginbutton() {
		driver.findElement(loginbutton).click();
	}

}
