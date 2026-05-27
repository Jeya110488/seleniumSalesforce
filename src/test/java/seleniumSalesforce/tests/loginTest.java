package seleniumSalesforce.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.loginPage;
import seleniumSalesforce.Utilities.ScreenshotUtilities;

public class loginTest extends baseTest {
	loginPage loginpage;
	ScreenshotUtilities screenshot;
	
	@BeforeMethod
	public void launchApplication(){
		launchbrower();
		loginpage = new loginPage(driver);	
		screenshot = new ScreenshotUtilities();
	}
	
	@Test(priority=1)
	public void loginwithnopassword(){
		loginpage.entervalidusername();
		loginpage.enternopassword();
		loginpage.clickOnLogin();
	}
	
	@Test(priority=3)
	public void loginwithvalidcredentials(){
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();
	}
	
	@Test(priority=4)
	public void clickonrememberme() throws InterruptedException {	
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.rememberme();
		loginpage.clickOnLogin();
		Thread.sleep(10000);
		loginpage.clickonuserNavButton();
		loginpage.clickonlogout();
		launchbrower();
	}
	
	@Test(priority=3)
	public void clickonforgotpasswordlink() {
		loginpage.clickOnForgotPassword();
	}

	@Test(priority=2)
	public void loginwithinvalidcredentials() {
		loginpage.enterInvalidCredentials();
		loginpage.clickOnLogin();
	}
	
	@AfterMethod
	public void closeDriver() {
		screenshot.takesscreenshot(driver);
		driver.close();
        driver=null;
	}
	
}

