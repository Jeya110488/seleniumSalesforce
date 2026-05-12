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
	
	public void entervalidusername() {
		waitForElements(username);
		username.sendKeys("jeyakrithiga.ae8cec2d5b02@agentforce.com");
	}
	public void enternopassword() {
		password.sendKeys("");
	}
	public void entervalidpassword() {
		password.sendKeys("Jeya@11041988");
	}
	public void clickOnLogin() {
		loginbutton.click();
	}

}
