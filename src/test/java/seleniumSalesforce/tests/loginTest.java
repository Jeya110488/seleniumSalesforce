package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.loginPage;

public class loginTest extends baseTest {
	loginPage loginpage;

	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);	
		/*
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin(); */	
		Thread.sleep(10000);
	}
	
	@Test(priority=2)
	public void loginwithnopassword(){
		driver.get("https://login.salesforce.com/");	
		loginpage.entervalidusername();
		loginpage.enternopassword();
		loginpage.clickOnLogin();
	}
	
	@Test(priority=3)
	public void loginwithvalidcredentials(){
		driver.get("https://login.salesforce.com/");	
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();
	}
	
	@Test(priority=4)
	public void clickonrememberme() throws InterruptedException {
		driver.get("https://login.salesforce.com/");
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.rememberme();
		loginpage.clickOnLogin();
		Thread.sleep(20000);
		loginpage.clickonuserNavButton();
		loginpage.clickonlogout();
	}
	
	@Test(priority=5)
	public void clickonforgotpasswordlink() {
		driver.get("https://login.salesforce.com/");	
		loginpage.clickOnForgotPassword();
	}

	@Test(priority=1)
	public void loginwithinvalidcredentials() {
		loginpage.enterInvalidCredentials();
		loginpage.clickOnLogin();		
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
        driver=null;
	}
	
}

