package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG3
{

	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/popuptest2.html");
		
		driver.quit(); // Using 'quit()' all windows will be closed
	}
}