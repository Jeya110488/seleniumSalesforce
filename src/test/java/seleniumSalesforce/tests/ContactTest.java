package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.ContactPage;
import seleniumSalesforce.Pages.loginPage;

public class ContactTest extends baseTest {	
	loginPage loginpage;
	ContactPage contactpage;

	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);
		contactpage = new ContactPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}

	@Test(priority=1)
	public void CreateNewContact() {
		contactpage.ClickOnContactTab();
		contactpage.AddNewContact();
	}
	
	@Test(priority=2)
	public void CreateNewContactView() {
		contactpage.ClickOnContactTab();
		contactpage.CreateNewView();
	}
	
	@Test(priority=3)
	public void RecentlyCreatedContact() {
		contactpage.ClickOnContactTab();
		contactpage.RecentlyCreatedContact();
	}

	@Test(priority=4)
	public void MyContactViewPage() {
		contactpage.ClickOnContactTab();
		contactpage.MyContactPage();
	}
	
	@Test(priority=5)
	public void RecentContactPage() {
		contactpage.ClickOnContactTab();
		contactpage.RecentContacts();
	}
	
	@Test(priority=6)
	public void ContactPageError() {
		contactpage.ClickOnContactTab();
		contactpage.CheckForContactError();
	}
	
	@Test(priority=7)
	public void ContactCancelButton() {
		contactpage.ClickOnContactTab();
		contactpage.CheckContactCancelButton();
	}
	
	@Test(priority=8)
	public void ContactSaveAndNew() {
		contactpage.ClickOnContactTab();
		contactpage.CheckSaveAndNewButton();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}
}
