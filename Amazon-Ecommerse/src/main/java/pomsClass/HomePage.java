package pomsClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
    Actions a;
    
    @FindBy(xpath="//a[text()='Amazon Pay']")
	private WebElement AmazonPay;
    
    @FindBy(xpath="//a[text()='Best Sellers']")
	private WebElement Sellers;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement Mobiles;
	@FindBy(xpath="//a[text()='Starting ₹19,999']")
	private WebElement Redmi;
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement BuyNow;
	@FindBy(xpath="//a[@data-action='page-spinner-show']")
	private WebElement Delivery;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	private WebElement Radio;
	@FindBy(xpath="//a[text()='Add a credit or debit card']")
	private WebElement Credit;
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	private WebElement alt;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement AddCard;
	
	
	
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement Account;  
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	private WebElement signout;  
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void moblile() throws InterruptedException
	{
		Mobiles.click();
		Redmi.click();
		BuyNow.click();
		Delivery.click();
		Radio.click();
		Thread.sleep(3000);
		Credit.click();
		Thread.sleep(10000);
		driver.switchTo().frame((driver.findElement(By.name("ApxSecureIframe"))));
		alt.sendKeys("121213131414");
		Thread.sleep(3000);
		
		AddCard.click();
		
	}
	
	public void amazonpay()
	{
		AmazonPay.click();
	}
	
	public void seller()
	{
		Sellers.click(); 
	}
	
	public void Signout() throws InterruptedException
	{
		a=new Actions(driver);
		a.moveToElement(Account).perform();
		Thread.sleep(3000);
		a.moveToElement(signout).click().build().perform();
	}
		

}
