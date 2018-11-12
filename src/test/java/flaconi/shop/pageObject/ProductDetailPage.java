package flaconi.shop.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='product-list']")
	public WebElement product_list;
	
	public void verifyProductDetailPageIsDisplayed(){
		wait(product_list,5);
		Assert.assertTrue("Recommended products section is missing :", product_list.isDisplayed());
	}

}
