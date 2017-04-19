package newproject;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG8 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/selenium/yahoo.html";
		
		driver.get(baseURL);
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		// For the below command, wget utility should be present on the mentioned location of C:
		String wget_command = "cmd /c C:\\Wget\\bin\\wget.exe -P D: --no-check-certificate " + sourceLocation;
		// The above command if executed succesfully, will download the yahoo messenger msgr11us on D drive
		
		try
		{
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		}
		catch (InterruptedException | IOException ex)
		{
			System.out.println(ex.toString());
		}
		
		driver.quit();

	}

}
