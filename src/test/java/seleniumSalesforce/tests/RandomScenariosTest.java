package seleniumSalesforce.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumSalesforce.Base.baseTest;
import seleniumSalesforce.Pages.RandomScenariosPage;
import seleniumSalesforce.Pages.loginPage;

public class RandomScenariosTest extends baseTest {
	
	loginPage loginpage;
	RandomScenariosPage randomScenariosPage;

	@BeforeClass
	public void launchApplication() throws InterruptedException {
		launchbrower();
		loginpage = new loginPage(driver);
		randomScenariosPage = new RandomScenariosPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
		Thread.sleep(20000);
	}

	@Test(priority=1)
	public void clickOnUserNameLink() {
		randomScenariosPage.homePage(); 
		randomScenariosPage.userNameLink();
	}
	
	@Test(priority=2)
	public void editProfileLastName() throws InterruptedException {
		randomScenariosPage.homePage();
		randomScenariosPage.userNameLink();
		randomScenariosPage.editLastName();
	}
	
	@Test(priority=5)
	public void verifyCustomizeTab() throws InterruptedException {
		Thread.sleep(10000);
		randomScenariosPage.homePage();
		randomScenariosPage.tabCustomize();
		launchbrower();
		loginpage = new loginPage(driver);
		randomScenariosPage = new RandomScenariosPage(driver);		
		loginpage.entervalidusername();
		loginpage.entervalidpassword();
		loginpage.clickOnLogin();	
	}
	
	@Test(priority=3)
	public void blockEventInCalendar() throws InterruptedException {
		Thread.sleep(10000);
		randomScenariosPage.homePage();
		randomScenariosPage.currentDateLink();
		randomScenariosPage.select8PM();
		randomScenariosPage.calendarActivity();
		randomScenariosPage.blockEvent();
		randomScenariosPage.saveCalendar();
	}

	@Test(priority=4)
	public void blockEventWeeklyRecurrance() throws InterruptedException{
		Thread.sleep(10000);
		randomScenariosPage.homePage();
		randomScenariosPage.currentDateLink();
		randomScenariosPage.select4PM();
		randomScenariosPage.calendarActivity();
		randomScenariosPage.pickTimeForRecurrance();
		randomScenariosPage.saveCalendar();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
        driver=null;
	}

}
