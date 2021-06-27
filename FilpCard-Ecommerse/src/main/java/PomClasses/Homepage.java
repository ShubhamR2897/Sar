package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath=("//img[@alt='Grocery']"))
	private WebElement Grocery;
	
	@FindBy(xpath=("//img[@alt='Mobiles']"))
	private WebElement Mobiles;
	@FindBy(xpath=("//input[@placeholder='Search Brand']"))
	private WebElement Search;
	
	@FindBy(xpath=("//img[@alt='Travel']"))
	private WebElement Travel;
	
	
    public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void Grocery() {
	Grocery.click();	
	}
	public void Mobiles() {
	Mobiles.click();
	Search.sendKeys("realme");
	}
	public void Travel() {
	Travel.click();
	}

}
