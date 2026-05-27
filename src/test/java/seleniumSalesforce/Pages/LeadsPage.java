package seleniumSalesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seleniumSalesforce.Base.basePage;

public class LeadsPage extends basePage {
	
	WebDriver driver;
	
	public LeadsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath="//li[@id='Lead_Tab']")
	WebElement leadsTab;
	
	@FindBy(id="fcf")
	WebElement leadsView;
	
	@FindBy(id="userNavButton")
	WebElement userNavButton;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logOut;
	
	@FindBy(xpath="//input[@value=' Go! ']")
	WebElement goButton;
	
	@FindBy(name="new")
	WebElement newLeads;
	
	@FindBy(id="name_lastlea2")
	WebElement lastnameLeads;
	
	@FindBy(id="lea3")
	WebElement companyName;
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@name='save']")
	WebElement leadSave;
	
	public void LeadsTab() {
		waitForElements(leadsTab,15);
		leadsTab.click();
	}
	
	public void LeadsView() {
		waitForElements(leadsView,10);
		leadsView.click();
	}
	public void LeadsDropDown() {
		Select leadSelect = new Select(leadsView);
		leadSelect.selectByVisibleText("Today's Leads");
		userNavButton.click();
	}
	public void GoButton() {
		waitForElements(goButton,10);
		goButton.click();
	}
	public void NewLeads() {
		waitForElements(newLeads,10);
		newLeads.click();
		waitForElements(lastnameLeads,10);
		lastnameLeads.sendKeys("ABCD");
		companyName.sendKeys("ABCD");
		leadSave.click();
	}
	public void logOut() {
		waitForElements(logOut,10);
		logOut.click();	
	}

}
