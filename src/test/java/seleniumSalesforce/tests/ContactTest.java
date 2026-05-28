package seleniumSalesforce.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.ContactPage;
import seleniumSalesforce.Pages.loginPage;

public class ContactTest extends baseTest {
	
	loginPage loginpage;
	ContactPage contactpage;
/*	
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
*/	
	@BeforeClass
	public void initialDriver() throws InterruptedException{
		loginpage= new loginPage(driver);
		contactpage = new ContactPage(driver);	
		Thread.sleep(20000);
	}
	
	@Test
	public void CreateNewContact() {
		contactpage.ClickOnContactTab();
		contactpage.AddNewContact();
	}
	
	@Test
	public void CreateNewContactView() {
		contactpage.ClickOnContactTab();
		contactpage.CreateNewView();
	}
	
	@Test
	public void RecentlyCreatedContact() {
		contactpage.ClickOnContactTab();
		contactpage.RecentlyCreatedContact();
	}

	@Test
	public void MyContactViewPage() {
		contactpage.ClickOnContactTab();
		contactpage.MyContactPage();
	}
	
	@Test
	public void RecentContactPage() {
		contactpage.ClickOnContactTab();
		contactpage.RecentContacts();
	}
	
	@Test
	public void ContactPageError() {
		contactpage.ClickOnContactTab();
		contactpage.CheckForContactError();
	}
	
	@Test
	public void ContactCancelButton() {
		contactpage.ClickOnContactTab();
		contactpage.CheckContactCancelButton();
	}
	
	@Test
	public void ContactSaveAndNew() {
		contactpage.ClickOnContactTab();
		contactpage.CheckSaveAndNewButton();
	}
/*	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}
	*/
}
