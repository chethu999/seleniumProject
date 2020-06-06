package testNG2;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListnersTset  extends TestListenerAdapter
{
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("test case pass");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("test case fail");
	}
}
