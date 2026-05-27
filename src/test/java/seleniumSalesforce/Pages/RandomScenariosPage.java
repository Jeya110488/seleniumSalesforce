package seleniumSalesforce.Pages;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumSalesforce.Base.basePage;

public class RandomScenariosPage extends basePage {
	
	WebDriver driver;
	
	LocalDate today = LocalDate.now();
	DayOfWeek days= today.getDayOfWeek(); 

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	@FindBy(id="home_Tab")
	WebElement homePage;
	
	@FindBy(xpath="//nav/ul/li[@id='home_Tab']")
	WebElement home;
	
	@FindBy(xpath="//span[@class='pageType']/h1[@class='currentStatusUserName']")
	WebElement userNameLink;
	
	@FindBy(xpath="//img[@alt='Edit Profile']")
	List<WebElement> editProfile;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement frame;
	
	@FindBy(xpath="//li[@id='aboutTab']")
	WebElement aboutTab;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveAllButton;
	
	@FindBy(xpath="//a/img[@title='All Tabs']")
	WebElement allTabsLink;
	
	@FindBy(name="customize")
	WebElement customizeLink;
	
	@FindBy(xpath="//option[@value='Chatter']")
	WebElement chatterTab;
	
	@FindBy(xpath="//img[@alt='Remove']")
	WebElement removeButton;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement saveButton;
	
	@FindBy(id="userNavButton")
	WebElement userNavDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	
	@FindBy(xpath="//span[@class='pageDescription']/a[contains(text(),'2026')]")
	WebElement currentDateLink;
	
	@FindBy(xpath="//a[contains(text(),'8:00 PM')]")
	WebElement time8PM;
	
	@FindBy(xpath="//img[@alt='Subject Combo (New Window)']")
	WebElement subjectCombo;
	
	@FindBy(xpath="//a[contains(text(),'Other')]")
	WebElement other;
	
	@FindBy(id="EndDateTime_time")
	WebElement endDateTime;
	
	@FindBy(id="timePickerItem_42")
	WebElement timePicker;
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@name='save']")
	WebElement saveEventButton;
	
	@FindBy(xpath="//a[contains(text(),'4:00 PM')]")
	WebElement time4PM;
	
	@FindBy(id="timePickerItem_38")
	WebElement timePicker2;
	
	@FindBy(id="IsRecurrence")
	WebElement isRecurrence;
	
	@FindBy(id="rectypeftw")
	WebElement recType;
	
	@FindBy(xpath="//label[contains(text(),'+days+')]") 
	WebElement dayInfos;
	
	@FindBy(id="RecurrenceEndDateOnly")
	WebElement recurrenceEnd;
	
	@FindBy(id="//img[@title='Month View']")
	WebElement monthView;
	
	public void homePage() {
		driver.switchTo().parentFrame();
		waitForElements(homePage,30);
		homePage.click();
	}
	
	public void home() {
		driver.switchTo().parentFrame();
		waitForElements(home,30);
		home.click();
	}
	
	public void userNameLink() {
		waitForElements(userNameLink,10);
		userNameLink.click();
	}
	
	public void editLastName() throws InterruptedException {
		Thread.sleep(3000);
		editProfile.get(0).click();
		waitForElements(frame,10);
		driver.switchTo().frame(frame);
		aboutTab.click();
		waitForElements(lastName,10);
		lastName.clear();
		lastName.sendKeys("Abcd");
		saveAllButton.click();
	}
	
	public void tabCustomize() {
		waitForElements(allTabsLink,10);
		allTabsLink.click();
		customizeLink.click();
		waitForElements(chatterTab,10);
		chatterTab.click();
		removeButton.click();
		saveButton.click();
		waitForElements(userNavDropDown,25);
		userNavDropDown.click();
		waitForElements(logOut,10);
		logOut.click();
	}
	
	public void currentDateLink() {
		waitForElements(currentDateLink,10);
		currentDateLink.click();
	}
	
	public void select8PM() throws InterruptedException {
		waitForElements(time8PM,10);
		time8PM.click();
	}

	public void calendarActivity() throws InterruptedException {
		waitForElements(subjectCombo,10);
		subjectCombo.click();
		Thread.sleep(2000);			
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
		    if (!window.equals(parentWindow)) {
		    	driver.switchTo().window(window);
		        break;
		    }
		} 
		other.click();
		driver.switchTo().window(parentWindow);
		waitForElements(endDateTime,10);
		endDateTime.click();
	}
	public void blockEvent() {
		waitForElements(timePicker,10);
		timePicker.click();
	}
	public void saveCalendar() {
		waitForElements(saveEventButton,10);
		saveEventButton.click();
	}
	
	public void select4PM(){
		waitForElements(time4PM,10);
		time4PM.click();	
	}
	
	public void pickTimeForRecurrance() {
		timePicker2.click();
		isRecurrence.click();
		waitForElements(recType,10);
		recType.click();
		//dayInfos.click();
		LocalDate twoWeeksLater = today.plusWeeks(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		String formattedDate = twoWeeksLater.format(formatter);
		recurrenceEnd.sendKeys(formattedDate);	
	}
	
	public void monthView() {
		waitForElements(monthView,10);
		monthView.click();
	}

}
