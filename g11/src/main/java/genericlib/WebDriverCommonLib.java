package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void waitForPageToLoad()
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForXpathPresent(String xPath)
	{
		WebDriverWait wait=new WebDriverWait(Driver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
	}
	
	public void waitForLinkPresent(String wbLink)
	{
		WebDriverWait wait=new WebDriverWait(Driver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(wbLink)));
	}
	
    public void selectBYVisiblText(WebElement wb, String value)
    {
    	Select sel=new Select(wb);
    	sel.selectByVisibleText(value);
    }
    public void selectByVal(WebElement wb, String value)
    {
    	Select sel=new Select(wb);
    	sel.selectByValue(value);
    }
	public void selectByIndex(WebElement wb, String value)
    {
    	Select sel=new Select(wb);
    	sel.selectByIndex(value);
    }
	
}
