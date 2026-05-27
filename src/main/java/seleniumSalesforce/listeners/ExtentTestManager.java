package seleniumSalesforce.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {
    private static final ExtentReports extent = ExtentManager.createInstance();
    private static final ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    // Start a new test node in the report
    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.createTest(testName, desc);
        extentTestThreadLocal.set(test);
        return test;
    }

    // Get the test instance assigned to the current executing thread
    public static synchronized ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    // Clear the thread local reference when done
    public static synchronized void unload() {
        extentTestThreadLocal.remove();
    }
}
