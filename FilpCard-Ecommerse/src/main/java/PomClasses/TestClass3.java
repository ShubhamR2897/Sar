package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 {
	private WebDriver driver;
    private Loginpage loginpage;
    private Homepage homepage;
    
	@BeforeClass
        public void BeforeClass(){
		System.out.println("Launch The Flipcard Website");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMD\\Downloads\\New folder (2)\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	    }
	@BeforeMethod
	    public void BeforeMethod() throws InterruptedException {
		loginpage = new Loginpage(driver);
		Thread.sleep(3000);
		loginpage.Email();
		loginpage.Password();
		loginpage.Submit();
		}
	@Test
	    public void Grocery() throws InterruptedException {
		System.out.println("Verify Grocery Button");
		homepage = new Homepage(driver);
		Thread.sleep(3000);
		homepage.Grocery();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
	    if(url.equals("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_a645c801-4450-4ac0-aef5-98504f6c1831_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=CBUR1Q46W5F1")) {
	    System.out.println("pass");
	 	}
	 	else{
	 	System.out.println("fail");
	    }
		}
	@Test
        public void Fashion() throws InterruptedException {
		System.out.println("Verify Mobiles Button");
		homepage = new Homepage(driver);
		Thread.sleep(3000);
		homepage.Mobiles();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
	    if(url.equals("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_951e5455-b435-4626-a43d-33fcac66f60e_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J")) {
	    System.out.println("pass");
	 	}
	 	else{
	 	System.out.println("fail");
	    }
		
		
	    }
	@Test
	    public void Travel() throws InterruptedException {
		System.out.println("Verify Travel Button");
		homepage = new Homepage(driver);
		Thread.sleep(3000);
		homepage.Travel();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
	    if(url.equals("https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_b95c4c67-275c-4128-8f94-991ac4daa7ab_1_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L0_view-all&cid=V4ZPKTOAO321")) {
	    System.out.println("pass");
	 	}
	 	else{
	 	System.out.println("fail");
	    }
		
	    }
//	@AfterMethod
//	    public void signout
        
	    
	

}
