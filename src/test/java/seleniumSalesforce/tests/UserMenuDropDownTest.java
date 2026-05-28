package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.UserMenuDropDownPage;
import seleniumSalesforce.Pages.loginPage;

public class UserMenuDropDownTest extends baseTest {
	
	loginPage loginpage;
	UserMenuDropDownPage usermenudropdown;
	
	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage= new loginPage(driver);
		usermenudropdown = new UserMenuDropDownPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}
	
	@Test(priority=1)
	public void selectUserMenuDropDown() {
		usermenudropdown.clickOnUserNavButton();
	}
	
	@Test(priority=2)
	public void editProfile() throws InterruptedException {
		//usermenudropdown.clickOnUserNavButton();
		usermenudropdown.clickOnMyProfile();
		usermenudropdown.clickOnEditProfile();
		usermenudropdown.contactInfoTab();
		usermenudropdown.editLastName();
		usermenudropdown.saveEditedProfileInfo();
		usermenudropdown.clickOnPost();
		usermenudropdown.textToPost();
		usermenudropdown.sharePost();
		usermenudropdown.filePost();
		usermenudropdown.photoupload();
	}
	
	@Test(priority=3)
	public void mySetting() throws InterruptedException {
		usermenudropdown.clickOnUserNavButton();
		usermenudropdown.mySettings();
		usermenudropdown.personalInfo();
		usermenudropdown.displayAndLayout();
		usermenudropdown.emailSetup();
		usermenudropdown.CalendarAndReminders();
	}
	
	@Test(priority=4)
	public void developersConsole() throws InterruptedException {
		usermenudropdown.clickOnUserNavButton();
		usermenudropdown.developerConsole();
	}
	
	@Test(priority=5)
	public void logOut() {
		usermenudropdown.clickOnUserNavButton();
		usermenudropdown.logOut();
	}

	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}


}
