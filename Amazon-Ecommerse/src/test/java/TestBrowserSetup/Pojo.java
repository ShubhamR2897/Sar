package TestBrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {
	
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMD\\Downloads\\New folder (2)\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    return driver;
	}
	
	public static WebDriver OpenFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AMD\\Downloads\\New folder (2)\\chromedriver_win32\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		return driver;
	}

}
