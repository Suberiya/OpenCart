package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement eamiid_txt;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password_txt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn_click;
	
	// Action methods
	
	public void setEmail(String emailid)
	{
		eamiid_txt.sendKeys(emailid);
	}
	public void setPassword(String pwd)
	{
		password_txt.sendKeys(pwd);
	}
	public void click_loginbtn()
	{
		loginbtn_click.click();
	}
}
