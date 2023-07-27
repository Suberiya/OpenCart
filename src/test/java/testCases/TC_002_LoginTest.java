package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
@Test
//(groups={"Sanity", "Master"})
public void Test_Login()
	{
		try {
			logger.info("********Starding test case TC_002_LoginTest **********");
			HomePage hp= new HomePage(driver);

			hp.clickMyAccount();
			logger.info("Clicked on MyAccount ");
			hp.clickMyLogin();
			logger.info("Clicked on MyLogin Button ");
			LoginPage lp= new LoginPage(driver);
			lp.setEmail(rb.getString("email")); // valid email. getting from property file
			logger.info("set  emailid");
			lp.setPassword(rb.getString("password"));
			logger.info("set password ");
			lp.click_loginbtn();
			logger.info("Clicked on Login Button ");
//			MyAccountPage macc= new MyAccountPage(driver);
//			boolean target =	macc.isMyAccountPageExists();
//			Assert.assertEquals(target, true);

		}
		catch(Exception e)

		{
			e.getMessage();
		}

		logger.info("**********Ending Test Case TC_002_LoginTest*******");



	}


}
