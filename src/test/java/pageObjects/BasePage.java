package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	
	private WebDriverWait wait10;
	private WebDriverWait wait40;
	JavascriptExecutor executor;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.executor = (JavascriptExecutor) this.driver;
	    this.wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    this.wait40 = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		
	}

}
