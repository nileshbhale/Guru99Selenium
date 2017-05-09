package selguruTestNG;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.testng.*;

public class ThirdTestNGscript 
{
	public String baseURL = "http://newtours.demoaut.com/";
	String driverPath = "src/main/resources/chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseURL);
		
	}
	
	@BeforeMethod
	public void verifyHomepageTitle()
	{
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	
	@Test (priority = 0)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual,expected);
	}
	
	@Test (priority = 1)
	public void support()
	{
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Support: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void goBackToHomepage()
	{
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void terminateBrowser()
	{
		driver.quit();
	}
}
