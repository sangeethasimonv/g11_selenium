package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver driver;
	public static WebDriver getdriver()
	{
		if(Constants.browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E://My_sw_data_selenium//geckodriver-v0.24.0-win64//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E://My_sw_data_selenium//chromedriver_win32 (1)//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		return driver;
	}
}
