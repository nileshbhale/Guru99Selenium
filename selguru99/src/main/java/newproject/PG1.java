package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;

public class PG1 
{
	public static void main (String[] args)
	{
		// Declaration and Instantiation of objects/variables
		
		WebDriver driver;
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\geckodriver.exe");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String baseUrl = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// Launch firefox and direct it to the base URL
		driver.get(baseUrl);
		
		// Get the actual value of the page title
		actualTitle = driver.getTitle();
		
		// Compare the actual and expected title and print the result "Passed" or "Failed"
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// Close Firefox
		driver.close();
		
		// Exit the program explicitly
		System.exit(0);
	}
}
