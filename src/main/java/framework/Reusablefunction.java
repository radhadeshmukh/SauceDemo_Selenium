package framework;

import Baseclasses.Baseclass;

import pages.Testpage;

public class Reusablefunction extends Baseclass{

	public static void Loginwithcredential() throws Exception
	{
		
		 Baseclass.getDriver();
		 
		   CommonMethods.waitForVisibility(Testpage.username);
		   TextBoxHelper.settext(Testpage.username, prop.getProperty("username"));
		   CommonMethods.waitForVisibility(Testpage.password);
		   TextBoxHelper.settext(Testpage.password, prop.getProperty("Password"));
		   CommonMethods.clickOnElementUsingActions(Testpage.loginbutton);
		   
	}
 
	public static void sortproduct(String option) throws Exception
	{
		
		  CommonMethods.waitForVisibility(Testpage.Filterdropdown);
		  CommonMethods.selectValuefromDropdownviabyvalue(Testpage.Filterdropdown, option);
	}
	
	public static void Addproducts() throws Exception
	{
	
		CommonMethods.waitForVisibility(Testpage.cheapest);
		CommonMethods.clickOnElementUsingActions(Testpage.cheapest);
		CommonMethods.waitForVisibility(Testpage.secondcostliest);
		CommonMethods.clickOnElementUsingActions(Testpage.secondcostliest);
	}
	
	public static void openBasket() throws Exception
	{
		CommonMethods.waitForVisibility(Testpage.shoppingbasket);
		CommonMethods.clickOnElementUsingActions(Testpage.shoppingbasket);
	}
	public static void Checkout() throws Exception
	{
		CommonMethods.waitForVisibility(Testpage.checkout);
		//CommonMethods.clickOnElementUsingActions(Testpage.checkout);
		CommonMethods.clickOnElementUsingJs(Testpage.checkout);
	}
	public static void Enter_detail_and_Purchase() throws Exception
	{
		CommonMethods.waitForVisibility(Testpage.firstname);
		   TextBoxHelper.settext(Testpage.firstname, prop.getProperty("username"));
		   CommonMethods.waitForVisibility(Testpage.lastname);
		   TextBoxHelper.settext(Testpage.lastname, prop.getProperty("Lastname"));
		   CommonMethods.waitForVisibility(Testpage.postalcode);
		   TextBoxHelper.settext(Testpage.postalcode, prop.getProperty("postalcode"));
		   CommonMethods.waitForVisibility(Testpage.Continue);
			CommonMethods.clickOnElementUsingActions(Testpage.Continue);
			 CommonMethods.waitForVisibility(Testpage.finish);
				CommonMethods.clickOnElementUsingActions(Testpage.finish);
	}
	 
}
