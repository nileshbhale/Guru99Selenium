package newproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG6
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.microsoft.com/en-in/windows"; 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		
		driver.findElement(By.cssSelector("a[class=\"c-logo\"]")).click();
		
		// Verify that we are now back on Microsoft's homepage 
		if(driver.getTitle().equals("Microsoft – Official Home Page"))
		{
			System.out.println("We are back on Microsoft's homepage.");
		}
		else
		{
			System.out.println("We are not on Microsoft's homepage.");
		}
		
		driver.quit();
		
	}

}