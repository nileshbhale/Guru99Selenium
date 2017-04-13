package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class AccessDropDown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//  Selecting from Drop-Down
		
		String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
		driver.get(baseUrl);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		
		// Selecting from Multi-choice list
		
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		driver.quit();

	}

}
