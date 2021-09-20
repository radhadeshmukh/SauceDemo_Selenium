
@SeleniumTest @cart
Feature: Product page information same as cart page

Background: Sort the product,add to chart
     Given I navigate to the page with standard credential
     When Sort the products by Price high to low
     
   
  @cart1
  Scenario: Product Name in both Products page and Cart page should be same
    Then verify the Product Name in both Products page and Cart page should be same

  @cart2
Scenario: Product Description in both Products page and Cart page should be same 
     Then verify the Product Description in both Products page and Cart page should be same

    @cart3
Scenario: Product Price in both Products page and Cart page should be same
     Then verify the Product Price in both Products page and Cart page should be same