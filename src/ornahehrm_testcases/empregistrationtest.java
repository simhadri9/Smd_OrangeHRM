package ornahehrm_testcases;

import orangeHRM_library.Employee;
import orangeHRM_library.loginpage;
import utils.AppUtils;

public class empregistrationtest {

	public static void main(String[] args) {
		AppUtils.lunchApp("http://orangehrm.qedgetech.com");
		loginpage lp = new loginpage();
		lp.loginpage("Admin","Qedge123!@#");
		Employee emp = new Employee();
		boolean res = emp.addEmployee("smd","p");
		if(res)
		{
			System.out.println("emp registration success , test pass");
		}else
		{
			System.out.println("emp registration not success,test fail");
		}
		
		lp.Logout();
		AppUtils.closeApp();
	}

}
