package ornahehrm_testcases;

import orangeHRM_library.User;
import orangeHRM_library.loginpage;
import utils.AppUtils;

public class userRegistrationtest 
	{

	public static void main(String[] args) throws InterruptedException {
		AppUtils.lunchApp("orangehrm.qedgetech.com");
		loginpage lp = new loginpage();
		lp.loginpage("Admin","Qedge123!@#");
		User us = new User();
		boolean res = us.addUser("ESS","smd p","chenna ch","Qedge123!@#");
		if(res)
		{
			System.out.println("emp not registerd successfully , test fail");
		}else
		{
			System.out.println("emp registered successfully , test pass");
		}
		lp.Logout();
		AppUtils.closeApp();
		
		
	}

}
