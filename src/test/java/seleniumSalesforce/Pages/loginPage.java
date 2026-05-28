package seleniumSalesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumSalesforce.Base.basePage;

public class loginPage extends basePage {
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement loginbutton;
	
	@FindBy(id="rememberUn")
	WebElement rememberme;
	
	@FindBy(id="userNavButton")
	WebElement userNavButton;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id="un")
	WebElement forgotpasswordusername;

	@FindBy(id="continue")
	WebElement forgotpasswordcontinue;
	
	public void entervalidusername() {
		waitForElements(username,20);
		username.sendKeys("jeyakrithiga.ae8cec2d5b02@agentforce.com");
	}
	public void enternopassword() {
		waitForElements(password,20);
		password.sendKeys("");
	}
	public void entervalidpassword() {
		waitForElements(password,20);
		password.sendKeys("Jeya@11041988");
	}
	public void enterInvalidCredentials() {
		waitForElements(username,20);
		username.sendKeys("123");
		password.sendKeys("22131");
	}
	public void clickOnLogin() {
		waitForElements(loginbutton,10);
		loginbutton.click();
	}
	public void rememberme() {
		waitForElements(rememberme,20);
		rememberme.click();
	}
	public void clickonuserNavButton() {
		waitForElements(userNavButton,20);
		userNavButton.click();
	}
	public void clickonlogout() {
		waitForElements(logout,20);
		logout.click();
	}
	public void clickOnForgotPassword() {
		waitForElements(forgotpassword,20);
		forgotpassword.click();
		waitForElements(forgotpasswordusername,10);
		forgotpasswordusername.sendKeys("jeyakrithiga.ae8cec2d5b02@agentforce.com");
		waitForElements(forgotpasswordcontinue,10);
		forgotpasswordcontinue.click();
	}
	
}
