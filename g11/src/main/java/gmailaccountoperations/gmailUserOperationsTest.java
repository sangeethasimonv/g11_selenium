package gmailaccountoperations;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericlib.Driver;
import genericlib.ReportLib;

public class gmailUserOperationsTest {
	
	/*public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver","E://My_sw_data_selenium//geckodriver-v0.24.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); */
		
		/*System.setProperty("webdriver.chrome.driver","E://My_sw_data_selenium//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
        */
		
		@org.testng.annotations.BeforeClass
		public void configBeforeClass()
		{
			
		}
		
		@BeforeMethod
		public void configBeforeMethod()
		{
			
		
	    }
		
		@Test
		public void login()
		{
			
		}
	
		@AfterMethod
		public void configAfterMethod(ITestResult t) throws IOException
		{
			if(t.isSuccess())
			{
				
			}
			else
			{
				ReportLib rLib=new ReportLib();
				rLib.getScreenShot(t.getMethod().getMethodName());
			}
			
			
		}
		
		@AfterClass
		public void configAfterClass()
		{
			
		}
	

	

}
