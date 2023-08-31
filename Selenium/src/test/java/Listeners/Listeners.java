
package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener{

	public void onTestStart(ITestResult result) {
	System.out.println("Test case is Started");
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Test Failed -Screenshort Captured");
	}

	public void onTestSkipped(ITestResult result) {
		
	}
	
	

}
