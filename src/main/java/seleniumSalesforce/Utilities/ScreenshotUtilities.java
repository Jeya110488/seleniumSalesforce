package seleniumSalesforce.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtilities{

	public void takesscreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);		
		String filepath = "/Users/jeyakrithiga/eclipse-workspace/seleniumSalesforce/Screenshots/screenshot"+timestamp+".jpeg";		
		File desFile = new File(filepath);
		
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
