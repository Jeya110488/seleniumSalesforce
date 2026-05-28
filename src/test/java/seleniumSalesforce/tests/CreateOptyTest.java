package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.CreateOptyPage;
import seleniumSalesforce.Pages.loginPage;

public class CreateOptyTest extends baseTest{
	loginPage loginpage;
	CreateOptyPage createOptyPage;
	
	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);
		createOptyPage = new CreateOptyPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}	
	
	@Test(priority=1)
	public void clickOnOptyDropDown() {
		createOptyPage.clickOnOptyTab();
		createOptyPage.optyDropDown();
	}
	
	@Test(priority=3)
	public void createNewOpty() {
		createOptyPage.clickOnOptyTab();
		createOptyPage.createNewOptylink();
	}
	
	@Test(priority=4)
	public void pipelineReport() {
		createOptyPage.clickOnOptyTab();
		createOptyPage.optyPipelineReport();
	}
	
	@Test(priority=2)
	public void stuckOptyReport() {
		createOptyPage.clickOnOptyTab();
		createOptyPage.stuckOptyLink();
	}
	
	@Test(priority=5)
	public void quartelySummaryReport() {
		createOptyPage.clickOnOptyTab();
		createOptyPage.quarterlyReport();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}
	
}
