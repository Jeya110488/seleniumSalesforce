package seleniumSalesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seleniumSalesforce.Base.basePage;

public class ContactPage extends basePage {

	WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//@FindBy(xpath="//li[@id='Contact_Tab']")
	@FindBy(id="Contact_Tab")
	WebElement contactTab;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement contactNewButton;
	
	@FindBy(id="name_lastcon2")
	WebElement contactLastName;
	
	@FindBy(id="con4")
	WebElement contactAccountName;
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@name='save']")
	WebElement contactSaveButton;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createNewViewLink;
	
	@FindBy(id="fname")
	WebElement contactViewName;
	
	@FindBy(id="devname")
	WebElement contactUniqueName;
	
	@FindBy(xpath="//input[@name='save' and @data-uidsfdc='3']")
	WebElement contactViewSaveButton;
	
	@FindBy(id="hotlist_mode")
	WebElement contactDropDown;
	
	@FindBy(id="fcf")
	WebElement contactViewDropDown;
	
	@FindBy(xpath="//a[contains(text(),'India')]")
	WebElement recentContact;
	
	@FindBy(xpath="//div[@class='pbHeader']/table/tbody/tr/td/input[@value='Cancel']")
	WebElement contactCancelButton;
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@value='Save & New']")
	WebElement contactSaveAndNewButton;
	
	
	public void ClickOnContactTab() {
		waitForElements(contactTab,20);
		contactTab.click();
	}
	
	public void AddNewContact() {
		waitForElements(contactNewButton,10);
		contactNewButton.click();
		waitForElements(contactLastName,10);
		contactLastName.sendKeys("Sathya");
		contactAccountName.sendKeys("JayKay");
		contactSaveButton.click();
	}
	
	public void CreateNewView() {
		waitForElements(createNewViewLink,10);
		createNewViewLink.click();
		waitForElements(contactViewName,10);
		contactViewName.sendKeys("new_view1");
		contactUniqueName.click();
		contactViewSaveButton.click();
	}
	
	public void RecentlyCreatedContact() {
		waitForElements(contactDropDown,10);
		Select contactSelect = new Select(contactDropDown);
		contactSelect.selectByVisibleText("Recently Created");
	}
	
	public void MyContactPage() {
		waitForElements(contactViewDropDown,10);
		Select contactViewSelect = new Select(contactViewDropDown);
		contactViewSelect.selectByVisibleText("My Contacts");
	}
	
	public void RecentContacts() {
		waitForElements(recentContact,10);
		recentContact.click();
	}
	
	public void CheckForContactError() {
		waitForElements(createNewViewLink,10);
		createNewViewLink.click();
		waitForElements(contactUniqueName,10);
		contactUniqueName.sendKeys("EFGH");
		contactViewSaveButton.click();
	}
	
	public void CheckContactCancelButton() {
		waitForElements(createNewViewLink,10);
		createNewViewLink.click();
		waitForElements(contactViewName,10);
		contactViewName.sendKeys("ABCD");
		contactUniqueName.clear();
		contactUniqueName.sendKeys("EFGH");
		contactCancelButton.click();
	}
	
	public void CheckSaveAndNewButton() {
		waitForElements(contactNewButton,10);
		contactNewButton.click();
		waitForElements(contactLastName,10);
		contactLastName.sendKeys("India");
		contactAccountName.sendKeys("JayKay");
		contactSaveAndNewButton.click();
	}

}
