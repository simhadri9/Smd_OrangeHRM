package ornahehrm_testcases;

import orangeHRM_library.loginpage;
import utils.AppUtils;

public class Adminlogin_withinvalid_data {

	public static void main(String[] args) {
		AppUtils.lunchApp("http://orangehrm.qedgetech.com");
		loginpage lp = new loginpage();
		lp.loginpage("abc","xyz");
		boolean res = lp.iserrmsgDisplayed();
		if(res)
		{
			System.out.println("login displaying error msg , test pass");
		}else
		{
			System.out.println("login not displaying error , test fail");
		}
		AppUtils.closeApp();

	}

}
