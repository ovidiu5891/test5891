#Author:Ovidiu Badea
@homepage 
Feature: HomePage 

	As a QA Engineer
	I want to validate the functionality of the footer and related pages
	so the customer can use it like its supposed to.

	 @mainCategory
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
		
#Scenario Outline: Checks the main-categories for Parfum 

	#Given I hover over the 2 "Parfum" category 
	#Then I should see the main-categories "<Parfum-main-category>" 
	#And I should be on the page "<page>"
	
	
	#Examples: 
	
		#|Parfum-main-category|				|page|
		#|DAMENPARFUM|						|damenparfum|		
		#|HERRENPARFUM|						|herrenparfum|		
		#|SONNEN|							|sonnenpflege|
		#|FOR MEN|							|herrenpflege|				
		#|TOP MARKEN|						|marken|
		#|SPECIALS|							|specials|
		
#@subCategory 
#Scenario Outline: Checks the sub-category for Gesicht 

	#Given I hover over the 3 "Pflege" category 
	#And I should see the sub-categories "<Gesicht-sub-category>" 
	
	#Examples: 
		#|Gesicht-sub-category|			
		#|Reinigung|
		#|Tagespflege|
		#|Nachtpflege|
		#|Augenpflege|
		#|Maske & Peeling|
		#|Serum & Kur|
		#|Anti-Aging|
		#|Lippenpflege|
		#|Zahnpflege|
		#|Gesichtsbursten|
		#|Gesichtpflege-Sets|
		
		
		@XLsliderBlock		@regression
		Scenario: Check if the XL slider block is displayed
		Given I should be on the page "home" 
		Then I should see the "XL slider" block on the page
		And I should be able to scroll the images
		
		@brandBlock		@regression
		Scenario: Check if the Brands block is displayed
		Given I should be on the page "home"
		Then I should see the "Brand" block on the page
		And I should be able to scroll through the brands
		And I click the Alle Marken button
		
		
		
		
		@aboutBlock		@regression
		Scenario: Check if the About Flaconi block is displayed 
			Given I should be on the page "home" 
			Then I should see the "About Flaconi" block on the page 
			And I should see the block title as "Flaconi"
		
		@followBlock	@regression
		Scenario: Check if the Follow Flaconi block is displayed 
			Given I should be on the page "home"
			Then I should see the "Follow Flaconi" block on the page 
			And I should see the block title as "Flaconi folgen"
		
		
		@customerServiceBlock	@regression 
		Scenario: Check if the Customer Service block is displayed 
			Given I should be on the page "home" 
			Then I should see the "Customer Service" block on the page 
			And I should see the block title as "Kundenservice"
			And I check that there are 4 links displayed
			
			
		@newsLetterBlock	@regression 
		Scenario: Check if the Newsletter block is displayed 
			Given I should be on the page "home"
			Then I should see the "Newsletter" block on the page 
			And I should see the block title as "Beauty News" 
			
			
		@paymentBlock	@regression
		Scenario: Check if the Payment block is displayed 
			Given I should be on the page "home" 
			Then I should see the "Payment" block on the page 
			And I should see the block title as "Bequem bezahlen" 
			#Then I click on the Payment block 
			#And I should be on the Klarna page 
			
			
		@trustlyCertifiedBlock	@regression 
		Scenario: Check if the Certified trustly block is displayed 
			Given I should be on the page "home" 
			Then I should see the "Trustly certified" block on the page 
			And I should see the block title as "Sicherheit" 
			
			
			
			
			
	