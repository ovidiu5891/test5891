package flaconi.shop.integration.cucumber;

import cucumber.api.java.en.Then;
import flaconi.shop.pageObject.ProductDetailPage;

public class ProductDetailStepDefinition extends AbstractStepDefinition {

	ProductDetailPage productDetail;

	@Then("^I should be on a product detail page$")
	public void i_should_be_on_a_product_detail_page() throws Throwable {
		productDetail = getInitializedPage(ProductDetailPage.class);
		productDetail.verifyProductDetailPageIsDisplayed();

	}
}