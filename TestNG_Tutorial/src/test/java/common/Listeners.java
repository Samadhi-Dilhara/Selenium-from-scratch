package common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    
    public void onTestStart(ITestResult result) {
        System.out.println("Testcase is starting");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Testcase is success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Testcase is failed");
    }
    public void onTestSkipped(ITestResult result) {

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
