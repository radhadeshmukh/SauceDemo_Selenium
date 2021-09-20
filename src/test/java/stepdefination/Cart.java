package stepdefination;



import org.junit.Assert;

import framework.Reusablefunction;
import io.cucumber.java.en.Then;

import pages.Cartpage;
import pages.Productpage;


public class Cart {




	@Then("verify the Product Name in both Products page and Cart page should be same")
	public void verify_the_product_name_in_both_products_page_and_cart_page_should_be_same() throws Exception {
		String Productname =Productpage.Getname();
		Cartpage.Add_to_cart();
		Reusablefunction.openBasket();
        Assert.assertEquals(Productname, Cartpage.Getname());
    
		 
	}

	@Then("verify the Product Description in both Products page and Cart page should be same")
	public void verify_the_product_description_in_both_products_page_and_cart_page_should_be_same() throws Exception {
		String ProductDescription =Productpage.Description();
		Cartpage.Add_to_cart();
		Reusablefunction.openBasket();

        Assert.assertEquals(ProductDescription, Cartpage.Description());
      
	}

	@Then("verify the Product Price in both Products page and Cart page should be same")
	public void verify_the_product_price_in_both_products_page_and_cart_page_should_be_same() throws Exception {
		String Productprice =Productpage.price();
		Cartpage.Add_to_cart();
		Reusablefunction.openBasket();
        Assert.assertEquals(Productprice, Cartpage.price());
        Cartpage.continueshopping();
	}

}
