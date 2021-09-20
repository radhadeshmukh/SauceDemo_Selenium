
@SeleniumTest @ProductDetails
Feature: Verification of product details

Background: Sort the product,add to cart and checkout
	Given I navigate to the page with standard credential
  When Sort the products by Price high to low

	 
  @ProductDetails1
  Scenario: Product Name in both Product page and Product Detail page should be same
      Then Verify that the Product Name in both Product page and Product Detail page should be same

            
  @ProductDetails2
Scenario: Product Description in both Product page and Product Detail page should be same
     Then verify that the Product Description in both Product page and Product Detail page should be same
     
    @ProductDetails3
    Scenario: Product Price in both Product page and Product Detail page should be same
     Then Verify that the Product Price in both Product page and Product Detail page should be same
     
     @productDetails4
     Scenario: Product is correctly added from Product Detail page
	   Then Verify that the Product is correctly added to cart from Product Detail page
	   
      @ProductDetails5
    Scenario: Product is correctly removed from Product Detail page
     Then Click on Remove button 
     And verify that the Product is correctly removed from Product Detail page