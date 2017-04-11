package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG4
{
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String alertMessage = "";
		
		// Switching between frames
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement (By.linkText("Deprecated")).click();
		
		// Switching to the Alert Message
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
				
		driver.quit();
	}
}
