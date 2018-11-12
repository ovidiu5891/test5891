package flaconi.shop.integration.cucumber;



import cucumber.api.java.en.*;
import flaconi.shop.pageObject.CartPage;

public class CartStepDefinition extends AbstractStepDefinition {

	CartPage cart;
	
	@Given("^I should see cart quantity as \"([^\"]*)\"$")
    public void getCartQuantity(String numberOfProducts) throws Throwable {
		cart = getInitializedPage(CartPage.class);
		cart.checkCartQuantity(numberOfProducts);
        
    }

	@When("^I click on the shopping cart button$")
	public void I_click_on_the_shopping_cart_button() throws Throwable {
		cart = getInitializedPage(CartPage.class);
		cart.navigateToCartPage();
		
	}
	
	@And("^I should be on the Cart page$")
	public void I_should_be_on_the_cart_page() throws Throwable{
		cart = getInitializedPage(CartPage.class);
		cart.checkURLCartPage();
	}
	
	@Then("^I should see empty cart message$")
	public void I_should_see_emppty_cart_message() throws Throwable{
		cart = getInitializedPage(CartPage.class);
		cart.checkNoItemsMessage();
	}
	
	@And("^I should see the recommended products$")
	public void I_should_see_the_recommended_products() throws Throwable{
		cart = getInitializedPage(CartPage.class);
		cart.checkIfRecommendedProductsisDisplayed();
	}
	
	@When("I click here link$")
	public void I_click_here_link() throws Throwable {

		cart = getInitializedPage(CartPage.class);
		cart.clickHereLink();
	}


}
