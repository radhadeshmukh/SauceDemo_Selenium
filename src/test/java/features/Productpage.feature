
@ProductPage 
Feature: Product page validation

Background: Product page validation
	Given I navigate to the page with standard credential

	 
  @ProductPage1
  Scenario: Products are sorted in lexicographically ascending order of product names
      Then Veiry that the Products are sorted in lexicographically ascending order of product names

  @ProductPage2
Scenario: Products are sorted in lexicographically descending order of product names
     Then verify that the Products are sorted in lexicographically descending order of product names
    @ProductPage3
Scenario: Products are sorted in ascending order of product prices
     Then verify that the Products are sorted in ascending order of product prices
     
       @ProductPage4
Scenario: Products are sorted in descending order of product prices
     Then verify that the Products are sorted in descending order of product prices
     
     
       @ProductPage5
Scenario: No product is added in the shopping cart
     Then verify that the No product is added in the shopping cart
     
       @ProductPage6
Scenario: All product are added in the shopping cart
     Then verify that the All product are added in the shopping cart
     