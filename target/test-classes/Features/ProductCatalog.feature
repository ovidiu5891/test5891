#Author:Ovidiu Badea
Feature: Product Catalog 

	As a QA Engineer
	I want to check that the product catalog page display as expected
	so that the customer will not face any issue
	
	@product_catalog @regression @smoke 
	Scenario Outline: Checks the main-categories for Pfelge 
	Given I should be on the page "home" 
	Then I hover over the 3 "Pflege" category 
	Then I should see the main-categories "<Pflege-main-category>" 
	And I should be on the page "<page>" 
	
	
	Examples: 
	
		|Pflege-main-category|			|page|
		|GESICHT|						|gesichtspflege|		
		|KORPER|						|koerperpflege|		
		|SONNEN|						|sonnenpflege|
		|FOR MEN|						|herrenpflege|				
		|TOP MARKEN|					|marken|
		|SPECIALS|						|specials|
		
		
	@product_catalog @regression @ovidiu 
	Scenario Outline: Product Category Pages - Products Available 
	Given I should be on the page "home" 
	Then I am checking the "<Product Category>" name and products number 
	And I should be on the page "<page>" 
			
			
	Examples: 
			
	|Product Category|					|page|						
	|PARFUM|							|parfum|
	|PFLEGE|							|pflege|
	|MAKE-UP|							|make-up|
	|HAARE|								|haarpflege|
	|PREMIUM|							|premium|
	|NEU|								|neuheiten|
	|SALE|								|sale|
	|XMAS|								|geschenkideen|
	|GRATIS|							|gratis-zugaben|
				
				
				
	@product_catalog @filters @regression 
	Scenario: Product Category Pages - Filtering products
	Given I should be on the page "home" 
	And I click on Product Category "PFLEGE" 
	Then I should be on the page "pflege" 
	And I check if the "FILTERS" section is displayed 
	And I apply the "Marke" filter as "hugo-boss"
					
					
	@product_catalog 	@filters 	@demo
	Scenario: Product Category Pages - Filtering products
	Given I should be on the page "home" 
	And I click on Product Category "PFLEGE" 
	Then I should be on the page "pflege" 
	And I check if the "FILTERS" section is displayed 
	And I apply the "Fur wen" filter as "herren"		
	