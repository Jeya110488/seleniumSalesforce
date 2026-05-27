package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.LeadsPage;
import seleniumSalesforce.Pages.loginPage;

public class LeadsTest extends baseTest{
	
	loginPage loginpage;
	LeadsPage leadspage;
	
	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);
		leadspage = new LeadsPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}
	
	@Test(priority=1)
	public void clickOnLeadsTab() {
		leadspage.LeadsTab();
	}
	
	@Test(priority=2)
	public void clickOnLeadsView() {
		leadspage.LeadsTab();
		leadspage.LeadsView();
	}
	
	@Test(priority=5)
	public void checkingGoButton() throws InterruptedException {
		leadspage.LeadsTab();
		leadspage.LeadsView();
		leadspage.LeadsDropDown();
		leadspage.logOut();
		launchbrower();
		loginpage= new loginPage(driver);
		leadspage = new LeadsPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
		leadspage.LeadsTab();
		leadspage.GoButton();
	}

	@Test(priority=3)
	public void selectTodaysLead() {
		leadspage.LeadsTab();
		leadspage.LeadsView();
		leadspage.LeadsDropDown();
		leadspage.GoButton();	
	}
	
	@Test(priority=4)
	public void ClickOnNewLeads() {
		leadspage.LeadsTab();
		leadspage.NewLeads();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}
	
}
