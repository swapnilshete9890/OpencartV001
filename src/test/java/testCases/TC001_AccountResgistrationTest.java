package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountResgistrationTest extends BaseClass{
	
	@Test(groups={"Regression", "Master"})
	public void verify_account_registration()
	{
		logger.info("********* Starting TC001_AccountResgistrationTest **********");
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		//static data (which only for one tym bcoz email will be repeated so testcase may be failed so use testdata or random data
//		regpage.setFirstName("John");
//		regpage.setLastName("Wick");
//		regpage.setEmail("John.Wick@gmail.com");
//		regpage.setTelephone("9999999999");
//		regpage.setPassword("123456789");
//		regpage.setConfirmPassword("123456789");
//		regpage.setPrivacyPolicy();
//		regpage.clickContinue();
//		
//		String confmsg = regpage.getConfirmationMsg();
//		
//		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		//Using Random data
		
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String password = randomAlphanumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg = regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		logger.info("********* Finished TC001_AccountResgistrationTest **********");
	}
	
	
}
