package pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;
import framework.dropdown;


public class productDetailPage extends dropdown {

	public productDetailPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By name = By.xpath("//div[@class=\"inventory_details_name large_size\"]");
	public static By desc = By.xpath("//div[@class=\"inventory_details_desc large_size\"]");
	public static By price = By.xpath("//div[@class=\"inventory_details_price\"]");
	public static By Addtocart = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
	public static By Removebutton =By.xpath("//button[contains(text(),'Remove')]");
	


	public static String Getname() {
		 CommonMethods.waitForVisibility(name);
		String Detailname=CommonMethods.getText(name);
		return Detailname;
	    
	}
	public static String Description() {
		CommonMethods.waitForVisibility(desc);
		String DetailDescription=CommonMethods.getText(desc);
		return DetailDescription;
	    
	}
	public static String price() {
		CommonMethods.waitForVisibility(price);
		String Detailprice=CommonMethods.getText(price);
		return Detailprice;
	    
	}
	
	
	public static void Add_to_cart()
	{ 
		CommonMethods.waitForVisibility(Addtocart);
		CommonMethods.clickOnElementUsingJs(Addtocart);
	}
	
	
	public static void Remove()
	{ 
		CommonMethods.waitForVisibility(Removebutton);
		CommonMethods.clickOnElementUsingJs(Removebutton);
	}
}