package stepdefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import framework.CommonMethods;

import framework.TextBoxHelper;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;


import pages.Testpage;

public class CheckoutStepOnePageTest {

	public static WebDriver driver;

	@DataTableType(replaceWithEmptyString = "<empty>")
	public String stringType(String cell) {
		return "";
	}
	
	

	@And("Add the details {string} {string} {string} {string}")
	public void add_the_details(String FirstName, String LastName, String Postalcode, String expectedmessage) throws Exception {

		CommonMethods.waitForVisibility(Testpage.firstname);
		TextBoxHelper.settext(Testpage.firstname, FirstName);
		CommonMethods.waitForVisibility(Testpage.lastname);
		TextBoxHelper.settext(Testpage.lastname, LastName);
		CommonMethods.waitForVisibility(Testpage.postalcode);
		TextBoxHelper.settext(Testpage.postalcode, Postalcode);
		CommonMethods.waitForVisibility(Testpage.Continue);
		CommonMethods.clickOnElementUsingActions(Testpage.Continue);
		CommonMethods.waitForVisibility(Testpage.Error);
		
		String AcutalErrorMessage=CommonMethods.getText(Testpage.Error);
		Assert.assertEquals(AcutalErrorMessage, expectedmessage);

	}
}
