package selguruTestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

public class FirstTestNGscript 
{
	public String baseURL = "http://newtours.demoaut.com/";
	String driverPath = "src/main/resources/chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void verifyHomepageTitle()
	{
		System.out.println("Launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}
		
		
		
	
}
