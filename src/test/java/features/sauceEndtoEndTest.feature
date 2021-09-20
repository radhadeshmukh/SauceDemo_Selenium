Feature: End to End flow for Saucedemo

  @SeleniumTest
  Scenario: Sort the product and purchase the product
    Given I navigate to the page with standard credential
    When Sort the products by Price high to low
    And Add the cheapest and the second costliest products to your basket 
    Then Open the basket
    And Click on Checkout
    And Enter details and Finish the purchase
