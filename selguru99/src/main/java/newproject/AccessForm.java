package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class AccessForm 
{

	public static void main(String[] args) 
	{
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com";
		
		driver.get(baseUrl);
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("userName")).clear();
		
		//driver.findElement(By.linkText("Register here")).click();
		
		//driver.findElement(By.partialLinkText("here")).click();
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("password")).submit();
		
		driver.findElement(By.cssSelector("input[value='Business']"));
		
		//driver.quit();
	}

}
