package mavendemo;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCount {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=testing&oq=testing&aqs=chrome..69i57.2270j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));//identify all the links
		int count=links.size();
		System.out.println("total no of links: "+count);
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));//Identify all the elements on web page
		int elementsCount = allElements.size();//Count the total all element on web page 
        System.out.println("Total Number of All Element on webpage : "  + elementsCount);    
	}

}



