package seleniumSalesforce.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	WebDriver driver;
	
	public basePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElements(WebElement elements, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOf(elements));
	}

}


/*
			<class name="seleniumSalesforce.tests.loginTest"> </class>
			<class name="seleniumSalesforce.tests.CreateAccountTest"> </class>
			<class name="seleniumSalesforce.tests.CreateOptyTest"> </class>
			<class name="seleniumSalesforce.tests.LeadsTest"> </class>
*/