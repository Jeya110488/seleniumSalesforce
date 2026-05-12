package seleniumSalesforce.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.loginPage;

public class loginTest extends baseTest {
	loginPage loginpage;
	
	@BeforeMethod
	public void launchApplication(){
		launchbrower();
		loginpage = new loginPage(driver);
	}
	
	@Test
	public void loginwithnopassword() {
		loginpage.entervalidusername();
		loginpage.enternopassword();
		loginpage.clickOnLogin();
	}
	
	@Test
	public void loginwithvalidcredentials() {
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();
	}
}
