package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTestNGscript 
{
	public String baseURL = "http://newtours.demoaut.com/";
	String driverPath = "src/main/resources/chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@Test
	public void verifyHomepageTitle()
	{
		String expectedTitle ="Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);		
	}
	
	@AfterTest
	public void terminateBrowser()
	{
		driver.quit();
	}
	
}
