package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//Locating the IFrame
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).isDisplayed());
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
        //To DRAG AND DROP
		WebElement a= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement b= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions  action = new Actions(driver);
		action.dragAndDrop(a, b).build().perform();
		///		action.moveToElement(a);
//		action.moveToElement(b).click().build().perform();

	}

}
