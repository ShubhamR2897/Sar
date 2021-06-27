package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Submit ;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Email()
	{
		Email.sendKeys("8007386064");
	}
	public void Password()
	{
		Password.sendKeys("Shiv@123");
	}
	public void Submit()
	{
		Submit.click();
	}
	
	

}
