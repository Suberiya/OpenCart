package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		}

	//Elements
	@FindBy(xpath="//i[@class='fas fa-user']")
	WebElement lnMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")
	WebElement login_link;
	
	// Action Methods 
	public void clickMyAccount()
	{
		lnMyaccount.click();
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}

	public void clickMyLogin()
	{
		login_link.click();
	}
}
