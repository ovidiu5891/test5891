#Author:Ovidiu Badea 
Feature: Cart 

	As a QA Engineer
	I want to add,update,delete products from cart page
	so that I can validate that cart functionality is working as expected

@cart	@regression  @smoke
Scenario: Empty Cart 

	Given I should see cart quantity as "0" 
	When I click on the shopping cart button 
	And I should be on the Cart page 
	Then I should see empty cart message 
	And I should see the recommended products 
	When I click here link 
	Then I should be on the page "home" 
	
	
