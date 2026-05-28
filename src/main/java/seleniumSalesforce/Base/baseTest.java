package seleniumSalesforce.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
		protected WebDriver driver;
		
		public void launchbrower() {			
		if(driver==null) {
			WebDriverManager.chromedriver().setup();

			String downloadPath = "/Users/jeyakrithiga/Downloads";

			Map<String, Object> prefs = new HashMap<>();
			prefs.put("download.default_directory", downloadPath); // Set custom path
			prefs.put("profile.default_content_settings.popups", 0); // Disable download popups
			prefs.put("download.prompt_for_download", false); // Bypass save-as prompt

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);

			driver = new ChromeDriver(options);
			driver.get("https://login.salesforce.com/");	
		}
		}

}
