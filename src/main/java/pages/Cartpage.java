package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;
import framework.dropdown;


public class Cartpage extends dropdown {

	public Cartpage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By inventory_item_name = By.xpath("(//div[@class=\"inventory_item_name\"])[1]");
	public static By inventory_item_desc = By.xpath("(//div[@class=\"inventory_item_desc\"])[1]");
	public static By inventory_item_price = By.xpath("((//div[@class=\"inventory_item_price\"]))[1]");
	public static By continueshopping =By.id("continue-shopping");
	public static By Addtocart = By.xpath("(//button[contains(text(),'Add to cart')])[2]");

public static String Getname() {
	
	String Productname=CommonMethods.getText(inventory_item_name);
	return Productname;
    
}
public static String Description() {
	
	String ProductDescription=CommonMethods.getText(inventory_item_desc);
	return ProductDescription;
    
}
public static String price() {
	
	String Productprice=CommonMethods.getText(inventory_item_price);
	return Productprice;
    
}
public static void continueshopping() {
	
	CommonMethods.clickOnElementUsingActions(continueshopping);
}
public static void Add_to_cart()
{
	CommonMethods.clickOnElementUsingJs(Addtocart);
}
}
