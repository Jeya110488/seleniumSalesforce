package seleniumSalesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seleniumSalesforce.Base.basePage;

public class CreateOptyPage extends basePage {
	
	WebDriver driver;
	
	public CreateOptyPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//@FindBy(xpath="//a[@title='Opportunities Tab']")
	@FindBy(id="Opportunity_Tab")
	WebElement OptyTab;
	
	@FindBy(xpath="//span[@class='fBody']")
	WebElement OptyDropdown;
	
	@FindBy(name="new")
	WebElement OptyNewButton;
	
	@FindBy(id="opp3")
	WebElement optyName;
	
	@FindBy(id="opp4")
	WebElement AccountName;
	
	@FindBy(xpath="//a[@ tabindex='7']")
	WebElement closeDate;
	
	@FindBy(id="opp11")
	WebElement optDropDown;
	
	@FindBy(id="opp6")
	WebElement leadSourceDropDown;
	
	@FindBy(id="opp17")
	WebElement source;
	
	@FindBy(xpath="//input[@tabindex='18']")
	WebElement optySaveButton;
	
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement optyPipeline;
	
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuckOptyLink;
	
	@FindBy(id="quarter_q")
	WebElement intervalDropDown;
	
	@FindBy(id="open")
	WebElement includeDropDown;
	
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement runReportButton;
	
	public void clickOnOptyTab() {
		waitForElements(OptyTab,20);
		OptyTab.click();
	}
	
	public void optyDropDown() {
		waitForElements(OptyDropdown,10);
		OptyDropdown.click();
	}
	
	public void createNewOptylink() {
		waitForElements(OptyNewButton,10);
		OptyNewButton.click();
		waitForElements(optyName,10);
		optyName.sendKeys("Opt_new");
		AccountName.sendKeys("JayKay");
		closeDate.click();
		Select optSelect = new Select(optDropDown);
		optSelect.selectByVisibleText("Needs Analysis");
		Select leadSourceSelect = new Select(leadSourceDropDown);
		leadSourceSelect.selectByVisibleText("Other");	
		source.sendKeys("user");
		optySaveButton.click();
	}
	
	public void optyPipelineReport() {
		waitForElements(optyPipeline,10);
		optyPipeline.click();
	}
	
	public void stuckOptyLink() {
		waitForElements(stuckOptyLink,10);
		stuckOptyLink.click();
	}
	
	public void quarterlyReport() {
		waitForElements(intervalDropDown,10);
		Select intervalSelect = new Select(intervalDropDown);
		intervalSelect.selectByVisibleText("Current FQ");
		
		Select includeSelect = new Select(includeDropDown);
		includeSelect.selectByVisibleText("Closed Opportunities");
		
		runReportButton.click();
	}
}
