package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.dropdown;

public class Testpage extends dropdown {

	public Testpage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static By username = By.name("user-name");
	public static By loginbutton = By.id("login-button");
	public static By password = By.name("password");
	public static By app_logo = By.className("app_logo");
	public static By Filterdropdown = By.xpath("//select[@class=\"product_sort_container\"]");
	public static By cheapest = By.xpath("(//button[contains(text(),'Add to cart')])[last()]");
	public static By secondcostliest = By.xpath("(//button[contains(text(),'Add to cart')])[2]");
	public static By shoppingbasket = By.className("shopping_cart_badge");
	public static By checkout = By.xpath("//button[@id=\"checkout\"]");
	public static By firstname = By.id("first-name");
	public static By lastname = By.id("last-name");
	public static By postalcode = By.id("postal-code");
	public static By Continue = By.id("continue");
	public static By finish = By.id("finish");
	public static By Error = By.xpath("//h3[@data-test=\"error\"]");

}
