package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;
import framework.dropdown;


public class Productpage extends dropdown {

	public Productpage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By inventory_item_name = By.xpath("(//div[@class=\"inventory_item_name\"])[2]");
	public static By inventory_item_desc = By.xpath("(//div[@class=\"inventory_item_desc\"])[2]");
	public static By inventory_item_price = By.xpath("((//div[@class=\"inventory_item_price\"]))[2]");


public static String Getname() {
	 CommonMethods.waitForVisibility(inventory_item_name);
	String Productname=CommonMethods.getText(inventory_item_name);
	return Productname;
    
}
public static String Description() {
	CommonMethods.waitForVisibility(inventory_item_desc);
	String ProductDescription=CommonMethods.getText(inventory_item_desc);
	return ProductDescription;
    
}
public static String price() {
	CommonMethods.waitForVisibility(inventory_item_price);
	String Productprice=CommonMethods.getText(inventory_item_price);
	return Productprice;
    
}
public static void Clickproduct() {
	CommonMethods.waitForVisibility(inventory_item_name);
	CommonMethods.clickOnElementUsingJs(inventory_item_name);
}


}
