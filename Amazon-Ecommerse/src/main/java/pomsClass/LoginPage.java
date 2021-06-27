package pomsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	@FindBy (xpath="//div//input[@type='email']")
	private WebElement Email;
	
	@FindBy (xpath="//div//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath="//div//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath="//div//input[@id='signInSubmit']")
	private WebElement Signin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail()
	{
		Email.sendKeys("shubhamrathod9823@gmail.com");
	}
	
	public void continuee()
	{
		Continue.click();
	}
	
	public void password() 
	{
		Password.sendKeys("Shubham@123");
	}
	
	public void sign()
	{
		Signin.click();
	}
}
    
	
	
	
