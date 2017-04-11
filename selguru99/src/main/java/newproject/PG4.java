package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG4
{
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement (By.linkText("Deprecated")).click();
		
		driver.quit();
	}
}
