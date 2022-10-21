package base_utility;

import java.io.IOException;

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
		try {
			Base_class.util.Get_Screenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}

