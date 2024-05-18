package orangeHRM_library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class User extends AppUtils
{

	public boolean addUser(String role ,String empname ,String uname ,String pwd) throws InterruptedException
	{
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		Select temp = new Select(driver.findElement(By.id("systemUser_userType")));
		temp.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("searchBtn")).click();
		
		driver.findElement(By.id("resultTable"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		boolean isuserexist = false;
		
		for(int i=1; i<rows.size();i++)
		{
			List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empname))
			{
				isuserexist =true;
				break;
			}
		}
		
		return isuserexist;
			
	}
	
}
