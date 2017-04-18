package newproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PG9 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/selenium/guru99home/megaupload/upload.html"; // This link is not working
		
		driver.get(baseURL);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("D:\\newhtml.html");
		
		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();
		
		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		
	}

}
