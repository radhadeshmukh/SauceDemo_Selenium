package framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class TextBoxHelper extends dropdown{

	public TextBoxHelper(WebDriver driver) throws IOException 
	
{ 
		super(driver);
}
	  //oLog.debug("TextBoxHelper : " + this.driver.hashCode()); }
	 
	public static void settext(By locator,String value) throws InterruptedException {
	//	oLog.info("Locator : " + locator + " Value : " + value);
		
		findElement(locator).sendKeys(value);
	}
	
	public void clear(By locator) {
		//oLog.info("Locator : " + locator);
		findElement(locator).clear();
	}
	
	public String getText(By locator) {
		//oLog.info("Locator : " + locator);
		return findElement(locator).getText();
	}
	
	public void clearAndSendKeys(By locator,String value) {
		WebElement element =  findElement(locator);
		element.clear();
		element.sendKeys(value);
		//oLog.info("Locator : " + locator + " Value : " + value);
	}

}