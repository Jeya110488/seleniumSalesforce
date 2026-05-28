package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.CreateAccountPage;
import seleniumSalesforce.Pages.loginPage;
import seleniumSalesforce.Utilities.ScreenshotUtilities;

public class CreateAccountTest extends baseTest{
	loginPage loginpage;
	CreateAccountPage createAccountPage;
	ScreenshotUtilities screenshot;
	
	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);
		createAccountPage = new CreateAccountPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}
	
	@Test(priority=1)
	public void createNewAccounts() {
		createAccountPage.AccountsTab();
		createAccountPage.createNewAccount();
	}
	
	@Test(priority=2)
	public void createNewView() {
		createAccountPage.AccountHome();
		createAccountPage.CreateNewviewLink();
		createAccountPage.addCreateNewView();
	}
	
	@Test(priority=3)
	public void editCreateView() {
		createAccountPage.AccountHome();
		createAccountPage.viewDropDownSelect();
	}
	
	@Test(priority=4)
	public void mergeAccounts() throws InterruptedException {
		createAccountPage.AccountHome();
		createAccountPage.mergeAccountslink();
	}
	
	@Test(priority=5)
	public void createAccountReport() {
		createAccountPage.AccountHome();
		createAccountPage.lastActivityReport();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}

}
