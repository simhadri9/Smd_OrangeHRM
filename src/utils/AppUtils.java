package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils
{
	public static WebDriver driver;
	
	public static void lunchApp(String url)
	{
	
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://orangehrm.qedgetech.com");
	
   }
	
	public static void closeApp()
	{
		driver.close();	
	}
	
	
	
	
}
