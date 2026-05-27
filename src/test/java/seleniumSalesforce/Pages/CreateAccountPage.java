package seleniumSalesforce.Pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seleniumSalesforce.Base.basePage;

public class CreateAccountPage extends basePage{
	
	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accountTab;
	
	@FindBy(id="Account_Tab")
	WebElement accountHome;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement newButton;
	
	@FindBy(id="acc2")
	WebElement accountName;
	
	@FindBy(id="acc6")
	WebElement typeDropDown;
	
	@FindBy(id="00Ng500000Dgxnn")
	WebElement typePriority;
	
	@FindBy(xpath="//input[@title='Save' and @tabindex='36']")
	WebElement newSaveButton;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createNewView;
	
	@FindBy(id="fname")
	WebElement viewName;
	
	@FindBy(id="devname")
	WebElement viewUniqueName;
	
	@FindBy(xpath="//input[@value=' Save ' and @data-uidsfdc='3']")
	WebElement saveCreateNewView;
	
	@FindBy(id="fcf")
	WebElement viewDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement editView;
	
	@FindBy(id="fcol1")
	WebElement accNameDropDown;
	
	@FindBy(id="fop1")
	WebElement operatorDropDown;
	
	@FindBy(id="fval1")
	WebElement value;
	
	@FindBy(id="colselector_select_0")
	WebElement selectActivity;
	
	@FindBy(id="colselector_select_0_right")
	WebElement addButton;
	
	@FindBy(xpath="//input[@value=' Save ' and @data-uidsfdc='5']")
	WebElement saveView;
	
	@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
	WebElement mergeAccountlink;
	
	@FindBy(id="srch")
	WebElement searchBox;
	
	@FindBy(name="srchbutton")
	WebElement searchButton;
	
	@FindBy(name="goNext")
	WebElement goNextButton;
	
	@FindBy(xpath="//div[@class='pbTopButtons']/input[@title='Merge']")
	WebElement mergeButton;
	
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity > 30 days')]")
	WebElement lastActivityLink;
	
	@FindBy(id="ext-comp-1042")
	WebElement fromDate;
	
	@FindBy(id="ext-comp-1045")
	WebElement toDate;
	
	@FindBy(id="ext-gen50")
	WebElement saveReport;
	
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportNameField;
	
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement developerName;
	
	//@FindBy(xpath="//button[contains(text(),'Save and Run Report')]")
	@FindBy(id="ext-gen291")
	WebElement saveLastActivityReport;
	
	public void AccountsTab() {
		waitForElements(accountTab,20);
		accountTab.click();
	}
	
	public void AccountHome() {
		waitForElements(accountHome,20);
		accountHome.click();
	}
	
	public void createNewAccount() {		
		waitForElements(newButton,10);
		newButton.click();
		waitForElements(accountName,10);
		accountName.sendKeys("JayKay");
		
		Select types = new Select(typeDropDown);	
		types.selectByValue("Technology Partner");
		
		Select priority = new Select(typePriority);
		priority.selectByValue("High");
		
		newSaveButton.click();
	}
	
	public void CreateNewviewLink() {
		waitForElements(createNewView,10);
		createNewView.click();
	}
	
	public void addCreateNewView() {
		waitForElements(viewName,10);
		viewName.sendKeys("JK_auto1");
		viewUniqueName.sendKeys("JK_view_auto1");
		waitForElements(saveCreateNewView,15);
		saveCreateNewView.click();
	}
	
	public void viewDropDownSelect() {
		waitForElements(viewDropDown,20);
		Select views = new Select(viewDropDown);
		views.selectByVisibleText("Jeya_auto_edited");
		waitForElements(editView,10);
		editView.click();
		waitForElements(viewName,10);
		viewName.sendKeys("Jeya_auto_edited1");
		Select accName = new Select(accNameDropDown);
		accName.selectByVisibleText("Account Name");
		Select operators = new Select(operatorDropDown);
		operators.selectByVisibleText("contains");	
		value.sendKeys("a");
		waitForElements(selectActivity,30);
		Select activity = new Select(selectActivity);
		activity.selectByValue("ACCOUNT.LAST_ACTIVITY");
		addButton.click();
		saveView.click();
	}
	public void mergeAccountslink() throws InterruptedException {
		waitForElements(mergeAccountlink,10);
		mergeAccountlink.click();
		waitForElements(searchBox,10);
		searchBox.sendKeys("JayKay");
		waitForElements(searchButton,10);
		searchButton.click();
		waitForElements(goNextButton,10);
		goNextButton.click();
		mergeButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void lastActivityReport() {
		waitForElements(lastActivityLink,10);
		lastActivityLink.click();
		Date date = new Date();
		SimpleDateFormat todaydate = new SimpleDateFormat("M/d/yyyy"); 
		String today = todaydate.format(date);
		fromDate.sendKeys(today);
		toDate.clear();
		toDate.sendKeys(today);
		saveReport.click();
		waitForElements(reportNameField,15);
		reportNameField.sendKeys("Jeya_report1");
		developerName.sendKeys("JK_report1");
		waitForElements(saveLastActivityReport,10);
		saveLastActivityReport.click();
	}
}
