#Author:Ovidiu Badea
Feature: Product Catalog 

	As a QA Engineer
	I want to check that the product catalog page display as expected
	so that the customer will not face any issue
	
	@product_catalog	@regression		@smoke
	Scenario: Product Category Pages - products available
	Given I should be on the page "home" 
	Then I hover over the 3 "Pflege" category
	
	
	