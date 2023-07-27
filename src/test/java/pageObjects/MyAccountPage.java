package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='My Affiliate Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement LogOutlink;

	public boolean isMyAccountPageExists()
	{
		try {
			return (msgHeading.isDisplayed());
		}
		catch(Exception e) {
			return false;}
	}
	
	public void setLogOut()
	{
		LogOutlink.click();
	}
}
