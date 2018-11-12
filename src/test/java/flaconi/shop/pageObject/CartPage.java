package flaconi.shop.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ConfigReader;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	ConfigReader config;
	String oldTab = null;

	@FindBy(xpath = "//*[@id='mini-basket']")
	public WebElement shopping_cart;

	@FindBy(xpath = "//span[@class='ico-basket']/span")
	public WebElement shopping_cart_quantity;

	@FindBy(xpath = "//*[@class='inner-wrap row-collapse']/div/div[@class='content']/div/div/h1")
	public WebElement no_items_message;

	@FindBy(id = "recommend-empty-cart")
	public WebElement recommended_product;

	@FindBy(xpath = "//*[@class='content']/div/div/p/a")
	public WebElement here_link;

	public void checkCartQuantity(String numberOfProducts) {
		Assert.assertTrue(
				"Expected Result :" + numberOfProducts + " " + "Actual Result :" + shopping_cart_quantity.getText(),
				shopping_cart_quantity.getText().equals(numberOfProducts));
	}

	public void navigateToCartPage() {
		shopping_cart.click();
	}

	public void checkURLCartPage() {
		String URL = driver.getCurrentUrl();
		Assert.assertTrue("URL ASSERTION :" + URL, URL.contains("/warenkorb/"));
	}

	public void checkNoItemsMessage() throws InterruptedException {

		String msg = no_items_message.getText();
		Assert.assertTrue("MESSAGE-ASSERTION :" + no_items_message.getText(),
				msg.equals("Sie haben keine Artikel im Warenkorb"));
	}

	public void checkIfRecommendedProductsisDisplayed() {
		wait(recommended_product,5);
		Assert.assertTrue("Recommended products section is missing :", recommended_product.isDisplayed());
	}

	public void clickHereLink() {
		here_link.click();

	}

}
