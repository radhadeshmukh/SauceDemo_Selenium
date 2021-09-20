package stepdefination;

import org.junit.Assert;

import framework.CommonMethods;
import framework.Reusablefunction;

import io.cucumber.java.en.Then;

import pages.Cartpage;
import pages.Productpage;

import pages.productDetailPage;

public class ProductDetails {

	@Then("Verify that the Product Name in both Product page and Product Detail page should be same")
	public void verify_that_the_product_name_in_both_product_page_and_product_detail_page_should_be_same() {
		String Productname =Productpage.Getname();
		Productpage.Clickproduct();
		 Assert.assertEquals(Productname, productDetailPage.Getname());
		
	}

	@Then("verify that the Product Description in both Product page and Product Detail page should be same")
	public void verify_that_the_product_description_in_both_product_page_and_product_detail_page_should_be_same() {
		String ProductDescription =Productpage.Description();
		Productpage.Clickproduct();
		 Assert.assertEquals(ProductDescription, productDetailPage.Description());

	}

	@Then("Verify that the Product Price in both Product page and Product Detail page should be same")
	public void verify_that_the_product_price_in_both_product_page_and_product_detail_page_should_be_same() {
		String Productprice =Productpage.price();
		Productpage.Clickproduct();
		 Assert.assertEquals(Productprice, productDetailPage.price());
	}



@Then("Verify that the Product is correctly added to cart from Product Detail page")
public void verify_that_the_product_is_correctly_added_to_cart_from_product_detail_page() throws Exception {
	Productpage.Clickproduct();
	String productNameindetailpage = productDetailPage.Getname();
	productDetailPage.Add_to_cart();
	Reusablefunction.openBasket();
	  Assert.assertEquals(productNameindetailpage, Cartpage.Getname());
}

	@Then("Click on Remove button")
	public void click_on_remove_button() throws InterruptedException {
		Productpage.Clickproduct();
		productDetailPage.Add_to_cart();
		productDetailPage.Remove();
		
	}

	@Then("verify that the Product is correctly removed from Product Detail page")
	public void verify_that_the_product_is_correctly_removed_from_product_detail_page() throws InterruptedException {
		CommonMethods.isElementNotPresent(productDetailPage.Removebutton);
		
	}

}
