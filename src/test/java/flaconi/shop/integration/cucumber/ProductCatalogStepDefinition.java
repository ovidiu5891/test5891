package flaconi.shop.integration.cucumber;

import cucumber.api.java.en.*;
import flaconi.shop.pageObject.ProductCatalogPage;

public class ProductCatalogStepDefinition extends AbstractStepDefinition{
	
	ProductCatalogPage prodcutCatalogPage;
	
	
	@Then("^I am checking the \"([^\"]*)\" name and products number$")
	public void i_check(String page) throws Throwable {
		prodcutCatalogPage = getInitializedPage(ProductCatalogPage.class);
		prodcutCatalogPage.visitProductCatalogPage(page);
	}
	
	@And("^I check if the \"([^\"]*)\" section is displayed$")
	public void i_check_section_displayed(String section) throws Throwable {
		prodcutCatalogPage = getInitializedPage(ProductCatalogPage.class);
		prodcutCatalogPage.checkIfSectionDisplayed(section);
	}
	
	@And("^I click on Product Category \"([^\"]*)\"$")
	public void i_visit_product_category_page(String page) throws Throwable {
		prodcutCatalogPage = getInitializedPage(ProductCatalogPage.class);
		prodcutCatalogPage.clickCatalogProductPage(page);
	}
	
	@And("^I apply the \"([^\"]*)\" filter as \"([^\"]*)\"$")
	public void i_apply_filter(String filter,String text) throws Throwable {
		prodcutCatalogPage = getInitializedPage(ProductCatalogPage.class);
		prodcutCatalogPage.applyFilters(filter, text);
	}
	
	@Then("^I should see the applied filter$")
	public void i_check_applied_filter() throws Throwable {
		prodcutCatalogPage = getInitializedPage(ProductCatalogPage.class);
		prodcutCatalogPage.checkAppliedFilter();
	}

}
