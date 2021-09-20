package framework;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclasses.Baseclass;

public class dropdown extends Baseclass{
	
	public dropdown(WebDriver driver) throws IOException{
		super();
		Baseclass.driver = driver;	
	}

	/**
	 * method to find an element
	 * @param locator element to be found
	 * @return WebElement if found else throws NoSuchElementException
	 */
	public static WebElement findElement(By locator){
		try {
			WebElement element = driver.findElement(locator);
			return element;
		}
		catch (NoSuchElementException e){
			//Log.logError(this.getClass().getName(), "findElement", "Element not found " + locator);
			throw new NoSuchElementException(e.getMessage());
		}
	}
	
	/**
	 * method to select a value from dropdown with index
	 * @param selectLocator element with select tag
	 * @param valueToBeSelectedindex index to be selected
	 */
	public static void selectValuefromDropdownviaIndex(By selectLocator, int valueToBeSelectedindex){
		Select  selectFromDropdown = new Select(findElement(selectLocator));
		selectFromDropdown.selectByIndex(valueToBeSelectedindex);

	}
	
	/**
	 * method to select a value from dropdown with value
	 * @param selectLocator element with select tag
	 * @param valueToBeSelectedvalue index to be selected
	 */
	public static void SelectUsingVisibleValue(By element,String visibleValue) {
		Select select = new Select(findElement(element));
		select.selectByVisibleText(visibleValue);
		
	}
	
	
	/**
	 * method to select a value from dropdown with value
	 * @param selectLocator element with select tag
	 * @param valueToBeSelectedvalue text to be selected
	 */
	public static void selectByVisibleText(By locator, String text) 
	{
		Select select= new Select(findElement(locator)); 
	    select.selectByVisibleText(text);
}
	
	public static By getSelectedValue(By locator) {
	return locator;
		//return getSelectedValue(findElement(locator));
	}
	
	public static List<String> getAllDropDownValues(By locator) {
		Select select = new Select(findElement(locator));
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		
		for (WebElement element : elementList) {
		
			valueList.add(element.getText());
		}
		return valueList;
	}

}