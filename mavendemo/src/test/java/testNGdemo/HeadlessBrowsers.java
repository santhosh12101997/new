package testNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowsers {
@Test
public void login() {
	WebDriver driver = new HtmlUnitDriver();  
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
}
}
