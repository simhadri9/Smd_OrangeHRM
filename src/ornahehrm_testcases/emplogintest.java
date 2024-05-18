package ornahehrm_testcases;

import orangeHRM_library.loginpage;
import utils.AppUtils;

public class emplogintest 
{

	public static void main(String[] args) {
		AppUtils.lunchApp("http://orangehrm.qedgetech.com");
		loginpage lp = new loginpage();
		lp.loginpage("ravan","Qedge123!@#");
		boolean res = lp.isempdisplayed();
		if(res)
		{
			System.out.println("emp login test pass");
		}else
		{
			System.out.println("emp login test fail");
		}
		
		lp.Logout();
		AppUtils.closeApp();

	}

}
