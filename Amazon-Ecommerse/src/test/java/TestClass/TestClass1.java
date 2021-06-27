package TestClass;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import TestBrowserSetup.Pojo;
import pomsClass.HomePage;
import pomsClass.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
	
  public class TestClass1 extends Pojo{
		
	     private WebDriver driver;
	     private LoginPage loginpage;
	     private HomePage homepage;
	     static ExtentTest test;
	     static ExtentHtmlReporter reporter;
	     
	     @BeforeTest
	     @Parameters("browser")
	     public void launchBrowser(String browser) throws Exception {
	 		reporter = new ExtentHtmlReporter("C:\\Users\\AMD\\eclipse-workspace\\Amazon-Ecommerse\\src\\test\\java\\extendReport\\ExtentTestNGIReporterListener.java");
	 		ExtentReports extend = new ExtentReports();
	 		extend.attachReporter(reporter);
	 		System.out.println("Before Test");
	 		if(browser.equalsIgnoreCase("Chrome"))
	 		{
	 			driver = OpenChromeBrowser();
	 		}
	 		
	 		else if(browser.equalsIgnoreCase("Firefox"))
	 		{
	 			driver = OpenFireFoxBrowser();
	 		}
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	}

	     
	@BeforeClass
	    public void beforeclass() throws InterruptedException
	    {
	    	homepage = new HomePage(driver);
	        loginpage= new LoginPage(driver);
	    }
	     
	 @BeforeMethod
	     public void beforemethod() throws InterruptedException
	     {
		 driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	    	 loginpage = new LoginPage(driver);
	 		 Thread.sleep(3000);
	 		 loginpage.sendEmail();
	 		 loginpage.continuee();
	 		 loginpage.password();
	 		 loginpage.sign();
	 	 }
	     
	 @Test(enabled=false)
	     public void verifyAmazonPayButton() throws InterruptedException
	     {
	    	 System.out.println("Verify Amazon Pay Button");
	    	 homepage = new HomePage(driver);
	    	 Thread.sleep(3000);
	    	 homepage.amazonpay();
	    	 String url = driver.getCurrentUrl();
	 		
	 		if(url.equals("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f")) {
	 		System.out.println("pass");
	 		}
	 		else
	 		{
	 		System.out.println("fail");
	    	}
	     }
	 @Test(enabled=false)
	     public void verifyBestSellerButton() throws InterruptedException
	     {
	    	 System.out.println("Verify Seller Button");
	    	 homepage = new HomePage(driver);
	    	 Thread.sleep(3000);
	    	 homepage.seller();
	    	 Thread.sleep(3000);
	    	 String url = driver.getCurrentUrl();
	  		
	  		if(url.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98")) {
	  		System.out.println("pass");
	  		}
	  		else 
	  		{
	  			System.out.println("fail");
	     	 }
	    	 
	     }
	     
	 @Test
	     public void verifyMobileButton() throws InterruptedException
	     {
	    	 System.out.println("Verify Mobile Button");
	    	 homepage = new HomePage(driver);
	    	 Thread.sleep(10000);
	    	 homepage.moblile();
	    	 Thread.sleep(10000);
	    	 String url = driver.getCurrentUrl();
	  		
	  	   	if(url.equals("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7")) {
	  		System.out.println("pass");
	  		}
	  		else 
	  		{
	  		System.out.println("fail"); 
	  		Thread.sleep(3000);
	        }
	  		
	        }
	     
	 @AfterMethod
	         public void Aftermethod() throws InterruptedException {
	    	 Thread.sleep(2000);
	    	 homepage= new HomePage(driver);
	    	 homepage.Signout();
	         }
	     
	     
	 @AfterClass
	         public void AfterClass()
	         {
		     System.out.println("After Class");
		     homepage = null;
		     loginpage = null;
	         }
	     
	 @AfterTest
	 public void CloseBrowser() {
		 System.out.println("After Test");
		 driver.quit();
		 System.gc();
	 }
	     
	 }


