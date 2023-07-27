package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email, String Password, String exp)
	{
		try {
		logger.info("*****Starding test TC_003_LoginDDT ******* ");
		
	
		HomePage hp= new HomePage(driver);

		hp.clickMyAccount();
		
		hp.clickMyLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(email); // valid email. getting from property file
		
		lp.setPassword(Password);
		lp.click_loginbtn();
		MyAccountPage macc= new MyAccountPage(driver);
		boolean target =	macc.isMyAccountPageExists();
		if(exp.equals("Valid")) {
			if(target==true)
			{
				macc.setLogOut();
				Assert.assertTrue(true);
			}else {
			//Assert.assertTrue(false);
			Assert.fail();
		}}
		if(exp.equals("Invalid"))
		{
			if(target==true)
			{
				macc.setLogOut();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
				
		}
	logger.info("******Ending test TC_003_LoginDDT********");	
		}
	catch(Exception e)
	{
		e.getMessage();
	}
}
}