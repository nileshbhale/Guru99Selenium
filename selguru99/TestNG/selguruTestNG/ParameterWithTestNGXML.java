package selguruTestNG;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

public class ParameterWithTestNGXML
{
	String driverPath = "src/main/resources/chromedriver.exe";
	WebDriver driver;
	
	@Test
	@Parameters({"author","searchKey"})
	public void testParameterWithXML(@Optional("Abc") String author, String searchKey) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		WebElement searchText = driver.findElement(By.name("q"));
		// Searching text in google text box
		searchText.sendKeys(searchKey);
		
		System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
		System.out.println("Thread will sleep now");
		Thread.sleep(3000);
		System.out.println("Value in Google search box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
		// Verifying the value in Google search box
		AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));	
	}
}
