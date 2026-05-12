package seleniumSalesforce.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
		protected static WebDriver driver;
		
		public void launchbrower() {
			
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
			driver.get("https://login.salesforce.com/");
		}
		
		}

}
