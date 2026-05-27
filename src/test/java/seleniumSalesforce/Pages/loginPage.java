package seleniumSalesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumSalesforce.Base.basePage;

public class loginPage extends basePage {
	
	public loginPage(WebDriver driver) {
		super(driver);
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
		password.sendKeys("");
	}
	public void entervalidpassword() {
		password.sendKeys("Jeya@11041988");
	}
	public void enterInvalidCredentials() {
		username.sendKeys("123");
		password.sendKeys("22131");
	}
	public void clickOnLogin() {
		waitForElements(loginbutton,10);
		loginbutton.click();
	}
	public void rememberme() {
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
		forgotpassword.click();
		waitForElements(forgotpasswordusername,10);
		forgotpasswordusername.sendKeys("jeyakrithiga.ae8cec2d5b02@agentforce.com");
		waitForElements(forgotpasswordcontinue,10);
		forgotpasswordcontinue.click();
	}
	
}
