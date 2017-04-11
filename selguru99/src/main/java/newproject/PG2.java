package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG2 
{

	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://gmail.com";
		String tagName = "";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("Email")).getTagName();
		System.out.println(tagName);
		driver.quit();
		System.exit(0);		
	}
}
