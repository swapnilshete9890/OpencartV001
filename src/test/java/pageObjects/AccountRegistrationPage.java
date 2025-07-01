package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);		
	}
	
	@FindBy(xpath="(//input[@id='input-firstname'])[1]")
	WebElement txtFirstname;
	
	@FindBy(xpath="(//input[@id='input-lastname'])[1]")
	WebElement txtLastname;
	
	@FindBy(xpath="(//input[@id='input-email'])[1]")
	WebElement txtEmail;
	
	@FindBy(xpath="(//input[@id='input-telephone'])[1]")
	WebElement txtTelephone;
	
	@FindBy(xpath="(//input[@id='input-password'])[1]")
	WebElement txtPassword;
	
	@FindBy(xpath="(//input[@id='input-confirm'])[1]")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="(//input[@name='agree'])[1]")
	WebElement checkPolicy;
	
	@FindBy(xpath="(//input[@value='Continue'])[1]")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy()
	{
		checkPolicy.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationMsg()
	{
		try 
		{
			return (msgConfirmation.getText());
		} 
		catch(Exception e)
		{
		   return (e.getMessage());
		}
	}
	
	

}
