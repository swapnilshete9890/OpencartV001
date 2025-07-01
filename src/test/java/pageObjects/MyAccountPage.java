package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="(//h2[normalize-space()='My Account'])[1]") // MyAccount Page Heading
	WebElement msgHeading;
	
	@FindBy(xpath="(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")
	WebElement lnkLogout;
	
	
	public boolean isMyAccountPageExists()
	{
		try {
		return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	

}
