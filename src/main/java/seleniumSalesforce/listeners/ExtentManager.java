package seleniumSalesforce.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;

	public static synchronized ExtentReports createInstance() {
		if (extent == null) {
			// Set the HTML report output path
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/ExtentReports/TestReport.html");

			// Configure report UI
			sparkReporter.config().setTheme(Theme.STANDARD);
			sparkReporter.config().setDocumentTitle("Automation Test Report");
			sparkReporter.config().setReportName("Execution Summary");
			sparkReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);

			// Add system environment details
			extent.setSystemInfo("OS", System.getProperty("os.name"));
			extent.setSystemInfo("Java Version", System.getProperty("java.version"));
			extent.setSystemInfo("Environment", "QA");
		}
		return extent;
	}
}
