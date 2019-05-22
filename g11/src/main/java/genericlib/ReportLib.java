package genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ReportLib {
	
	public void getScreenShot(String fileName) throws IOException
	{
		EventFiringWebDriver eDriver= new EventFiringWebDriver(Driver.driver);
		File srcImg=eDriver.getScreenshotAs(OutputType.FILE);
		
		File destImg=new File("E:\\selenium_project\\g11\\src\\ScreenShot" + fileName+".png");
		FileUtils.copyFile(srcImg, destImg);
	}
	

}
