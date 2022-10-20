package base_utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("On test failure");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//Base_class.ul.Take_screenshot(result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}

