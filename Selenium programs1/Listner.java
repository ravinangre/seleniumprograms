package ListnerDemo1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The execution of the main test starts now");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed and results are"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and results are"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and results are"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
