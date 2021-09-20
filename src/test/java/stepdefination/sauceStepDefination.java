package stepdefination;




import Baseclasses.Baseclass;
import framework.Reusablefunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sauceStepDefination extends Baseclass{

	@Given("I navigate to the page with standard credential")
	public void i_navigate_to_the_page_with_standard_credential() throws Exception {
		
	  Reusablefunction.Loginwithcredential();
	}
	@When("Sort the products by Price high to low")
	public void sort_the_products_by_price_high_to_low() throws Exception {
	   Reusablefunction.sortproduct("hilo");
	}

	@And("Add the cheapest and the second costliest products to your basket")
	public void add_the_cheapest_and_the_second_costliest_products_to_your_basket() throws Exception {
		Reusablefunction.Addproducts();
	}

	@Then("Open the basket")
	public void open_the_basket() throws Exception {
		Reusablefunction.openBasket();
	}

	@And("Click on Checkout")
	public void click_on_checkout() throws Exception {
		Reusablefunction.Checkout();
	}

	@And("Enter details and Finish the purchase")
	public void enter_details_and_finish_the_purchase() throws Exception {
		Reusablefunction.Enter_detail_and_Purchase();
	}

}

