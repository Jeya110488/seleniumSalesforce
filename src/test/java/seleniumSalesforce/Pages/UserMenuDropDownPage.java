package seleniumSalesforce.Pages;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import seleniumSalesforce.Base.basePage;

public class UserMenuDropDownPage extends basePage{
	
	WebDriver driver;

	public UserMenuDropDownPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(id="userNavLabel")
	//@FindBy(xpath="//div[@id='userNav']/div[@id='userNavButton']/span[@id='userNavLabel']")
	WebElement userNavButton;
		
	//@FindBy(xpath="//a[contains(text(),'My Profile')]")
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[@title='My Profile']")
	WebElement myProfile;
	
	@FindBy(xpath = "//img[@alt='Edit Profile']")
	List<WebElement> editProfileImages;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement contactInfoFrame;
	
	@FindBy(xpath="//li[@id='aboutTab']")
	WebElement aboutTab;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveAll;

	@FindBy(xpath="//li[@class='publisherFeedItemTypeChoice']/a[@title='Post']/span[text()='Post']")
	WebElement postlink;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement postFrame;
	
	@FindBy(xpath="//body[contains(text(),'Share')]")
	WebElement postText;
	
	@FindBy(id="publishersharebutton")
	WebElement sharePost;

	@FindBy(xpath="//li[@class='publisherFeedItemTypeChoice']/a[@title='File']/span[text()='File']")
	WebElement filepost;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement contactInfoFrames;

	@FindBy(id="publisherAttachContentPost")
	WebElement fileButton;

	@FindBy(id="chatterUploadFileAction")
	WebElement uploadfile1;
	
	@FindBy(id="chatterFile")
	WebElement uploadfile2;
	
	@FindBy(id="publishersharebutton")
	WebElement publishershare;
	
	@FindBy(id="displayBadge")
	WebElement displayBadge;
	
	@FindBy(id="uploadPhotoContentId")
	WebElement photoframe;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement uploadphoto;
	
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement uploadbutton;

	@FindBy(xpath="//div[@class='imgCrop_selArea']")
	WebElement selectArea;
	
	@FindBy(id="j_id0:j_id7:save")
	WebElement photosave;
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mysetting;
	
	@FindBy(id="PersonalInfo_font")
	WebElement personalInfo;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginHistory;
	
	@FindBy(xpath="//a[contains(text(),'Download ')]")
	WebElement downloadHistory;
	
	@FindBy(id="DisplayAndLayout")
	WebElement displayLayout;
	
	@FindBy(id="CustomizeTabs_font")
	WebElement customizeTabs;
	
	@FindBy(id="p4")
	WebElement customTabDropDown;
	
	@FindBy(xpath="//option[@value='Chatter']")
	WebElement chatterTab;
	
	@FindBy(xpath="//img[@alt='Add']")
	WebElement addTab;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement saveTab;
	
	@FindBy(id="EmailSetup")
	WebElement emailSetup;
	
	@FindBy(id="EmailSettings_font")
	WebElement emailSettingFont;
	
	@FindBy(id="auto_bcc1")
	WebElement autoBcc;
	
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement emailSave;
	
	@FindBy(xpath="//span[@id='CalendarAndReminders_font']")
	WebElement calendarAndReminder;
	
	@FindBy(id="Reminders_font")
	WebElement reminders;
	
	@FindBy(id="testbtn")
	WebElement testButton;
	
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement developerConsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logOut;
	
	public void clickOnUserNavButton() {
		waitForElements(userNavButton,50);
		userNavButton.click();
	}
	
	public void clickOnMyProfile() throws InterruptedException {
		myProfile.click();
	}
	
	public void clickOnEditProfile() {
		waitForElements(editProfileImages.get(0),10);
		editProfileImages.get(0).click();
	}
	
	public void contactInfoTab() {
		driver.switchTo().frame(contactInfoFrame);
		waitForElements(aboutTab,10);
		aboutTab.click();
	}
	
	public void editLastName() {
		waitForElements(lastName,10);
		lastName.clear();
		lastName.sendKeys("SathyaN");
	}
	
	public void saveEditedProfileInfo() throws InterruptedException {
		saveAll.click();
		Thread.sleep(10000);
	}
	
	public void clickOnPost() {
		driver.switchTo().parentFrame();
		System.out.println("Testing1");
		waitForElements(postlink,30);
		driver.switchTo().parentFrame();
		System.out.println("Testing2");
		postlink.click();
		driver.switchTo().parentFrame();
		System.out.println("Testing3");
	}
	
	public void textToPost() {
		waitForElements(postFrame,15);
		driver.switchTo().frame(postFrame);
		waitForElements(postText,10);
		postText.sendKeys("Selenium TestNG Automation....");
		driver.switchTo().parentFrame();		
	}
	public void sharePost() throws InterruptedException {
		waitForElements(sharePost,10);
		sharePost.click();
		Thread.sleep(10000);
	}
	
	public void filePost() throws InterruptedException {
		driver.switchTo().parentFrame();
		waitForElements(filepost,20);
		filepost.click();
		waitForElements(uploadfile1,20);
		uploadfile1.click();
		waitForElements(uploadfile2,10);
		WebElement myFile = uploadfile2;
		String filePath = "/Users/jeyakrithiga/Desktop/jk.jpeg";
        myFile.sendKeys(filePath);
        Thread.sleep(5000);
        publishershare.click();
        System.out.println("Testing file upload");
	}
	
	public void photoupload() throws InterruptedException {
		Thread.sleep(20000);
		displayBadge.click();
		waitForElements(photoframe,20);
		driver.switchTo().frame(photoframe);  		
		String filePath2 = "/Users/jeyakrithiga/Desktop/jk.jpeg";
        uploadphoto.sendKeys(filePath2);
        waitForElements(uploadbutton,50);
        uploadbutton.click();
        waitForElements(selectArea,20);
        Actions action = new Actions(driver);
        action.clickAndHold(selectArea).dragAndDropBy(selectArea, 100, 50).release().perform();
        waitForElements(photosave,15);
        photosave.click();
        Thread.sleep(20000);
        driver.switchTo().parentFrame();
	}
	
	public void mySettings() {
		waitForElements(mysetting,20);
		mysetting.click();
	}
	public void personalInfo() {
		waitForElements(personalInfo,10);
		personalInfo.click();
		waitForElements(loginHistory,10);
		loginHistory.click();
		waitForElements(downloadHistory,10);
		downloadHistory.click();
	}
	public void displayAndLayout() {
		waitForElements(displayLayout,10);
		displayLayout.click();
		waitForElements(customizeTabs,10);
		customizeTabs.click();
		waitForElements(customTabDropDown,10);
		Select customTab = new Select(customTabDropDown);
		customTab.selectByVisibleText("Salesforce Chatter");
		chatterTab.click();
		addTab.click();
		saveTab.click();
	}
	public void emailSetup() throws InterruptedException {
		Thread.sleep(15000);
		emailSetup.click();
		emailSettingFont.click();
		autoBcc.click();
		emailSave.click();
		Thread.sleep(15000);
	}
	public void CalendarAndReminders() {
		driver.switchTo().parentFrame();
		waitForElements(calendarAndReminder,50);
		calendarAndReminder.click();
		reminders.click();
		testButton.click();
	}
	public void developerConsole() throws InterruptedException {
		String parentWindow = driver.getWindowHandle(); 
		waitForElements(developerConsole,10);
		developerConsole.click();	
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();		
		for (String window : allWindows) {
		    if (!window.equals(parentWindow)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}
		driver.close();
		driver.switchTo().window(parentWindow);
	}
	public void logOut() {
		waitForElements(logOut,10);
		logOut.click();
	}
}