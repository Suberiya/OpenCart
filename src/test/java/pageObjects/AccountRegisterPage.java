package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AccountRegisterPage extends BasePage {
	public AccountRegisterPage(WebDriver driver)
	{
		super(driver);
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement first_username;
	@FindBy(xpath= "//input[@id='input-lastname']")
	WebElement txt_lastName;
	@FindBy(xpath= "//input[@id='input-email']")
	WebElement txt_email;
	@FindBy(css="#input-password")
	WebElement txt_password;
	@FindBy(css="input[value='1'][name='agree']")
	WebElement click_policy;
	@FindBy(xpath="//button[@type='submit']")
	WebElement click_continue;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='My Account']")
	WebElement msg_confirmation;

	//Actions
	public void setFirstName(String fname)
	{
		first_username.sendKeys(fname);
	}

	public void setLastName(String lastname)
	{
		txt_lastName.sendKeys(lastname);	
	}

	public void setEmail(String email)
	{
		txt_email.sendKeys(email);	
	}
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void setclickpolicy()
	{
		executor.executeScript("arguments[0].click();", click_policy);
	}
	public void click_continuebtn() {
		executor.executeScript("arguments[0].click();",click_continue);
	}
	
	public String getConfirmationMsg()
	{
		try
		{
			return (msg_confirmation.getText());
			
			//return (String) executor.executeScript("arguments[0]",msg_confirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}}
}

