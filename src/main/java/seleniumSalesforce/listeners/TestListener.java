package seleniumSalesforce.listeners;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import seleniumSalesforce.*;


public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        // Triggers ExtentManager setup
        ExtentManager.createInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Starts tracking the test method name dynamically
        String methodName = result.getMethod().getMethodName();
        String description = result.getMethod().getDescription();
        ExtentTestManager.startTest(methodName, description);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
        ExtentTestManager.unload();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
        ExtentTestManager.getTest().fail(result.getThrowable());
        
        // OPTIONAL: If you have a BaseTest setup for screenshots, add it here:
        // String screenshotPath = BaseTest.getScreenshot(result.getName());
        // ExtentTestManager.getTest().addScreenCaptureFromPath(screenshotPath);
        
        ExtentTestManager.unload();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
        ExtentTestManager.unload();
    }

    @Override
    public void onFinish(ITestContext context) {
        // Writes everything to the HTML file
        if (ExtentManager.createInstance() != null) {
            ExtentManager.createInstance().flush();
        }
    }
}
