@SeleniumTest @CheckoutStepOnePageTest 
Feature: CheckoutStepOnePageTest validation

  Background: Sort the product,add to chart
    Given I navigate to the page with standard credential
    When Sort the products by Price high to low
    And Add the cheapest and the second costliest products to your basket
    Then Open the basket
    And Click on Checkout

  @CheckoutStepOnePageTest
  Scenario Outline: Verify the Mandatory field for Fisrtname,Lastname,postcode and verify the message
    And Add the details "<FirstName>" "<LastName>" "<postalcode>" "<expectedmessage>"

    Examples: 
      | FirstName | LastName | postalcode | expectedmessage                |
      |           | test     | test       | Error: First Name is required  |
      | test      |          | test       | Error: Last Name is required   |
      | test      | test     |            | Error: Postal Code is required |
