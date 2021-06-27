package Utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	
	public static void TakeScreenShot(WebDriver driver)throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\AMD\\Pictures\\Selenium Screeshots\\New folder"+File.separator+"Date and Time"+".jpg");
		FileHandler.copy(source, dest);
		
		//String destination = System.getProperty("test-output"+File.separator+"testScreenshots"+File.separator+"Test_");
	}
}
