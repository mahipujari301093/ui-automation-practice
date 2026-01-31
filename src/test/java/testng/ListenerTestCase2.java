package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestCase2 implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case " + result.getName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case " + result.getName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case " + result.getName() + " failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case " + result.getName() + " skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished: " + context.getName());
    }

}
