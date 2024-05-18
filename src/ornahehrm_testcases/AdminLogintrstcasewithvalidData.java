package ornahehrm_testcases;

import orangeHRM_library.loginpage;
import utils.AppUtils;

public class AdminLogintrstcasewithvalidData 
{

	public static void main(String[] args) 
	{
	
		AppUtils.lunchApp("http://orangehrm.qedgetech.com");
		loginpage lp = new loginpage();
		lp.loginpage("Admin","Qedge123!@#");
		boolean res = lp.isAdminModuleDisplayed();
		if(res)
		{
			System.out.println("Admin login test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");
		}
		lp.Logout();
		AppUtils.closeApp();

	}

}
