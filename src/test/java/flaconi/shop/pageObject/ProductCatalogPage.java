package flaconi.shop.pageObject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flaconi.shop.integration.cucumber.BaseUtil;
import org.junit.Assert;

public class ProductCatalogPage extends BasePage {

	public ProductCatalogPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	static JavascriptExecutor ex = (JavascriptExecutor) driver;
	
	@FindBy(xpath = "//*[@id='main-navigation']/ul/li")
	public List<WebElement> catalog_product_pages;

	@FindBy(xpath = "//*[@class='content']/div[@class='row']/div[contains(@class, 'category-products') or contains(@class ,'pull-right')]/div/h1")
	public WebElement catalog_product_name;

	@FindBy(xpath = "//*[@class='content']/div[@class='row']/div[contains(@class, 'category-products') or contains(@class ,'pull-right')]/div/h1/span")
	public WebElement numberProducts;

	@FindBy(xpath = "//*[@class='content']/div[@class='row']/div[contains(@class, 'category-products') or contains(@class ,'pull-right')]/div/div/h1")
	public WebElement gratis_title;

	@FindBy(xpath = "//*[@id='list-filter-id']")
	public WebElement filters_section;
	
	@FindBy(xpath = "//*[@id='list-filter-id']/div[2]/div[@data-filter='gender']")
	public WebElement gender_filter;
	
	@FindBy(xpath = "//*[@id='list-filter-id']/div[2]/div[@data-filter='brand']")
	public WebElement brand_filter;
	

	public void visitProductCatalogPage(String page) throws Exception {

		for (int i = 1; i < catalog_product_pages.size(); i++) {

			WebElement myPage = catalog_product_pages.get(i);
			if (myPage.getText().contains(page)) {

				try {
					myPage.click();
					System.out.println(numberProducts.getText());
					String str = numberProducts.getText();
					String number = str.replaceAll("\\D+", "");
					int ProductsNumber = Integer.parseInt(number);

					Assert.assertTrue(ProductsNumber != 0);
					Assert.assertTrue(!catalog_product_name.getText().isEmpty());

					BaseUtil.scenario.write("Catalog Product Page Name: " + catalog_product_name.getText());
					BaseUtil.scenario.write("Number of products: " + ProductsNumber);

				} catch (Exception e) {
					BaseUtil.scenario.write("The following error occurs: " + e);
					BaseUtil.scenario.write("Catalog Product Page Name: " + gratis_title.getText());
				}

			}

		}
	}

	public void checkIfSectionDisplayed(String section) {
		switch (section) {
		case "FILTERS":
			waitToBeVisible(filters_section, 3);
			Assert.assertTrue(filters_section.isDisplayed());
			break;

		default:
			throw new ElementNotVisibleException("Section: " + section + " not found");
		}

	}

	public void clickCatalogProductPage(String page) {
		for (int i = 1; i < catalog_product_pages.size(); i++) {

			WebElement myPage = catalog_product_pages.get(i);
			if (myPage.getText().contains(page)) {
				myPage.click();
				break;
			}
		}
		
	}
	
	public void applyFilters(String filter,String text) throws Exception{
		switch (filter) {
		case "Fur wen":
			waitToBeVisible(gender_filter, 3);
			Assert.assertTrue(gender_filter.isDisplayed());
			WebElement openGenderFilter = driver.findElement(By.xpath("//*[@id='list-filter-id']/div[2]/div[2]/div[1]/div/span"));
			WebElement men = gender_filter.findElement(By.id("filter-men"));
			WebElement women = gender_filter.findElement(By.id("filter-women"));
			WebElement SchlieBen = driver.findElement(By.xpath("//*[@id='list-filter-id']/div[2]/div[2]/div[2]/button"));
			
			if(text.equalsIgnoreCase("herren")){
				waitToBeVisible(openGenderFilter, 2);
				ex.executeScript("arguments[0].click();", openGenderFilter);
				waitToBeVisible(men, 2);
				ex.executeScript("arguments[0].click();",men);
				Assert.assertTrue(men.isEnabled());
				ex.executeScript("arguments[0].click();",SchlieBen);
				waitForPageLoaded();
			}else if (text.equalsIgnoreCase("damen")){
				ex.executeScript("arguments[0].click();", openGenderFilter);
				ex.executeScript("arguments[0].click();",women);
				Assert.assertTrue(women.isEnabled());
				ex.executeScript("arguments[0].click();",SchlieBen);
				waitForPageLoaded();
			}
			break;
			
		case "Marke":
			waitToBeVisible(brand_filter, 3);
			Assert.assertTrue(brand_filter.isDisplayed());
			WebElement openBrandFilter = driver.findElement(By.xpath("//*[@id='list-filter-id']/div[2]/div[3]/div[1]/div/span"));
			WebElement brandInput = driver.findElement(By.id("brand-input"));
			List<WebElement> brandList = driver.findElements(By.xpath("//*[@id='filter-brand']/li"));
			WebElement brandSchlieBen = driver.findElement(By.xpath("//div[@data-filter='brand']//button[contains(@type,'submit')]"));

			ex.executeScript("arguments[0].click();", openBrandFilter);
			brandInput.sendKeys(text);
			WebElement checkBox = driver.findElement(By.xpath("//*[contains(@data-filter, '"+ text +"')" + "]"));
			ex.executeScript("arguments[0].click();", checkBox);
			ex.executeScript("arguments[0].click();",brandSchlieBen);
			waitForPageLoaded();
			break;
			
		default:
			throw new ElementNotVisibleException("Filter: " + filter + " not found");
		}
		
		
		
	}
	
	public void checkAppliedFilter(){
		WebElement filter = driver.findElement(By.xpath("//ul[contains(@class,'small-block-grid-2')]/li[1]/div[2]/div/a/strong"));
		
		String brand =  filter.getAttribute("innerHTML").toString();
		System.out.println(brand.substring(1,10));
		Assert.assertTrue(filter.getAttribute("innerHTML").contains("Boss"));
		
	}
}
