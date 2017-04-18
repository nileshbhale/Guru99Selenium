package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG7 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilesh.bhale\\git\\Guru99Selenium\\selguru99\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://newtours.demoaut.com/";
		
		driver.get(baseURL);
		
		WebElement link_home = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + 
															"/table/tbody/tr/td" + "/table/tbody/tr"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_home).build();
		
		String bgColor = td_home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		bgColor = td_home.getCssValue("background-color");
		System.out.println("after hover: " + bgColor);
		
		driver.quit();
		
	}

}
