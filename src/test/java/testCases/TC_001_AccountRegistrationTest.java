package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;
import testBase.BaseClass;
public class TC_001_AccountRegistrationTest extends BaseClass{
	@Test
	//(groups={"Regression", "Master"})
	public void test_account_Registration() throws InterruptedException
	{
		try{
			logger.info("******Application ******");
			logger.info("*****Starting TC_001_AccountRegistrationTest*******");
			HomePage hp= new HomePage(driver);

			hp.clickMyAccount();
			logger.info("Clicked on MyAccount");
			hp.clickRegister();
			logger.info("Clicked Register link");
			AccountRegisterPage regpage= new AccountRegisterPage(driver);
			logger.info("Providing customer data");
			regpage.setFirstName(randomString().toUpperCase());
			regpage.setLastName(randomString().toUpperCase());
			regpage.setEmail(randomString()+"@gmail.com");
			regpage.setPassword(randomAlphanumeric());
			Thread.sleep(3000);
			regpage.setclickpolicy();
			regpage.click_continuebtn();
			logger.info("Clicked on Continue");
			String confimsg=	regpage.getConfirmationMsg();
			logger.info("Validating Expected message");
			Assert.assertEquals(confimsg, "My Account", "Test failed");
		}
		catch(Exception e)
		{
			logger.error("Test failed");
			Assert.fail();

		}
		logger.info("*****Finishied TC_001_AccountRegistrationTest*******");
	}


}
