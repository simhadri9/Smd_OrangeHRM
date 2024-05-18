package orangeHRM_library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class loginpage extends AppUtils
{

	public void loginpage(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
			
	}
	
	public boolean isAdminModuleDisplayed()
	{
		try 
		{
			driver.findElement(By.linkText("Admin"));
			return true;
			
		} catch (Exception e)
		{
			return false;
		}
	
		
	}
	
	public void Logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean iserrmsgDisplayed()
	{
		String errmsg = driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid") || errmsg.toLowerCase().contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public boolean isempdisplayed()
	{
		try 
		{
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return false;
		} catch (Exception e) 
		{
		return true;
		}
		
	}
	
}
