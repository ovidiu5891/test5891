package flaconi.shop.integration.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flaconi.shop.pageObject.HomePage;

public class HomePageStepDefinition extends AbstractStepDefinition {

	HomePage home;

	@Given("I hover over the (\\d+) \"([^\"]*)\" category$")
	public void i_hover_over_menu(int orderCategory, String category) throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.hoverOverMenu(orderCategory, category);

	}

	@Then("^I should see the main-categories \"([^\"]*)\"$")
	public void i_should_see_the_mainCategory(String mainCategory) throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.checkMainCategoryPflege(mainCategory);
	}
	
	
	
	@And("^I should be on the page \"([^\"]*)\"$")
	public void i_should_be_on_the_page(String page) throws Throwable{
		home = getInitializedPage(HomePage.class);
		home.checkPage(page);
	}

	@And("^I should see the sub-categories \"([^\"]*)\"$")
	public void i_should_see_the_subcategory(String subCategory) throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.checkSubCategoryGesicht(subCategory);
	}

	@Then("^I should be on the Home page$")
	public void i_am_on_the_home_page() throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.checkURLHomePage();

	}
	
	//check block is displayed
	@Then("^I should see the \"([^\"]*)\" block on the page$")
	public void I_shoulld_see_the_block(String block) throws Throwable{
		home = getInitializedPage(HomePage.class);
		home.checkBlockDisplayed(block);
	}
	
	@And("^I should see the block title as \"([^\"]*)\"$")
    public void getPaymentBlockTitle(String title) throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.checkBlockTitle(title);
	}
	
	@And("^I should be able to scroll the images$")
    public void i_scroll_images() throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.scrollXLSlider();
	}
	
	@And("^I should be able to scroll through the brands$")
	public void scroll_through_the_brands() throws Throwable{
		home = getInitializedPage(HomePage.class);
		home.scrollBrandSlider();
	}
	
	@And("^I click the Alle Marken button$")
	public void click_Alle_Marken_button() throws Throwable{
		home = getInitializedPage(HomePage.class);
		home.clickAlleMarkenButton();
	}

	@And("^I check the block content$")
	public void check_block_functionality() throws Throwable{
		home = getInitializedPage(HomePage.class);
		home.checkContentBrandProductDisplay();
	}

	@When("^I visit a random product detail page from category (\\d+) \"([^\"]*)\"$")
	public void getCartQuantity(int orderCategory, String category) throws Throwable {
		home = getInitializedPage(HomePage.class);
		home.navigateToSpecificCategory(orderCategory, category);
	}

}
