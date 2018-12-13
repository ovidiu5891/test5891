package flaconi.shop.pageObject;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

import cucumber.api.Scenario;
import flaconi.shop.integration.cucumber.BaseUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public util.ConfigReader config;
	public static Scenario scenario;
	public static String maincategory;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//*[@id='main-navigation']/ul/li[2]/a")
	public WebElement category_Perfume;

	@FindBy(id = "BannersSlider")
	public WebElement XLslider_block;

	@FindBy(id = "BannersSlider_1")
	public WebElement XLslider_block_1;

	// Payment block
	@FindBy(id = "block-footer-paymentmethods")
	public WebElement payment_block;

	@FindBy(xpath = "//*[@id='block-footer-paymentmethods']/h4[@class='hide-for-small-only']")
	public WebElement payment_block_title;

	@FindBy(xpath = "//*[@id='block-footer-paymentmethods']/a")
	public WebElement payment_block_link;

	// Trustly certified block
	@FindBy(xpath = "//*[@id='block_footer_trusties']")
	public WebElement trustly_certified_block;

	@FindBy(xpath = "//*[@id='block_footer_trusties']/h4")
	public WebElement trustly_certified_block_title;

	// Newsletter block
	@FindBy(id = "block-footer-newsletter")
	public WebElement newsletter_block;

	@FindBy(xpath = "//*[@id='block-footer-newsletter']/div/h4")
	public WebElement newsletter_block_title;

	// Customer Service block
	@FindBy(id = "block-footer-customer-service")
	public WebElement customer_service_block;

	@FindBy(xpath = "//*[@id='block-footer-customer-service']/h4")
	public WebElement customer_service_block_title;

	// links list
	@FindBy(xpath = "//*[@id='block-footer-customer-service']/ul/li/a")
	public List<WebElement> customer_service_block_links;

	// Customer Service block
	@FindBy(id = "block-footer-social-media")
	public WebElement follow_Flaconi_block;

	@FindBy(xpath = "//*[@id='block-footer-social-media']/h4")
	public WebElement follow_Flaconi_block_title;

	// About Flaconi block
	@FindBy(id = "block_footer_about_flaconi")
	public WebElement about_Flaconi_block;

	@FindBy(xpath = "//*[@id='block_footer_about_flaconi']/h4")
	public WebElement about_Flaconi_block_title;

	// BRAND block
	@FindBy(id = "BrandsSliderWidget")
	public WebElement brand_block;

	@FindBy(xpath = "//*[@id='BrandsSliderWidget']/a")
	public WebElement alle_Marken_button;

	@FindBy(xpath = "//*[@id='main-navigation']/ul/li[3]/ul/li/a")
	public List<WebElement> Pfelge;

	@FindBy(xpath = "//*[@id='main-navigation']/ul/li[2]/ul/li/a")
	public List<WebElement> Parfum;

	// STORY block
	@FindBy(id = "Story")
	public WebElement story_block;

	@FindBy(id = "Story_1")
	public WebElement story_block_1;

	// Brand Product Display
	@FindBy(id = "BrandAndProductDisplay")
	public WebElement brand_product_display_block;

	@FindBy(id = "BrandAndProductDisplay_1")
	public WebElement brand_product_display_block_1;

	// Featured
	@FindBy(id = "Featured")
	public WebElement featured_block;

	public void checkURLHomePage() {
		String URL = driver.getCurrentUrl();

		String envURL = System.getProperty("environment");
		if (envURL.contains("testing")) {
			Assert.assertTrue("URL - ASSERTION :", URL.contains("https://testing-de.flaconi.de"));
		}

	}

	public void hoverOverMenu(int orderCategory, String category) throws Throwable {
		WebElement menu = driver.findElement(By.xpath(
				"//*[@id='main-navigation']/ul/li[" + orderCategory + "]/a[@title=" + "'" + category + "'" + "]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menu).build().perform();
		Thread.sleep(500);
		maincategory = menu.getText();
		System.out.println(">>>>>>>>" + maincategory);
	}

	public void checkMainCategoryPflege(String mainCategory) {
		switch (mainCategory) {
		case "GESICHT":
			Assert.assertEquals(Pfelge.get(0).getText(), mainCategory);
			Pfelge.get(0).click();
			break;
		case "KORPER":
			Assert.assertTrue(Pfelge.get(1).getAttribute("href").contains("/koerperpflege/"));
			Pfelge.get(1).click();
			break;
		case "SONNEN":
			Assert.assertTrue(Pfelge.get(2).getText().equalsIgnoreCase(mainCategory));
			Pfelge.get(2).click();
			break;
		case "FOR MEN":
			Assert.assertTrue(Pfelge.get(3).getText().equalsIgnoreCase(mainCategory));
			Pfelge.get(3).click();
			break;
		case "TOP MARKEN":
			Assert.assertTrue(Pfelge.get(4).getText().equalsIgnoreCase(mainCategory));
			Pfelge.get(4).click();
			break;
		case "SPECIALS":
			Assert.assertTrue(Pfelge.get(5).getAttribute("href").contains("/#"));
			Pfelge.get(5).click();
			break;
		default:
			throw new ElementNotVisibleException("Main-category " + mainCategory + " not found");
		}
	}

	public void checkMainCategoryParfum(String mainCategory) {
		switch (mainCategory) {
		case "DAMMENPARFUM":
			Assert.assertEquals(Parfum.get(0).getText(), mainCategory);
			Parfum.get(0).click();
			break;
		case "HERRENPARFUM":
			Assert.assertTrue(Parfum.get(1).getAttribute("href").contains("/koerperpflege/"));
			Parfum.get(1).click();
			break;
		case "FUR ZUHAUSE":
			Assert.assertTrue(Parfum.get(2).getText().equalsIgnoreCase(mainCategory));
			Parfum.get(2).click();
			break;
		case "TOP MARKEN":
			Assert.assertTrue(Parfum.get(4).getText().equalsIgnoreCase(mainCategory));
			Parfum.get(3).click();
			break;
		case "SPECIALS":
			Assert.assertTrue(Parfum.get(5).getAttribute("href").contains("/#"));
			Parfum.get(4).click();
			break;
		default:
			throw new ElementNotVisibleException("Main-category " + mainCategory + " not found");
		}
	}

	public void checkSubCategoryGesicht(String subCategory) {
		List<WebElement> Gesicht = driver.findElements(By.xpath("//*[@id='main-navigation']/ul/li[3]/ul/li[1]/ul/li"));
		switch (subCategory) {
		case "Reinigung":
			Assert.assertEquals(Gesicht.get(0).getText(), subCategory);
			break;
		case "Tagespflege":
			Assert.assertEquals(Gesicht.get(1).getText(), subCategory);
			break;
		case "Nachtpflege":
			Assert.assertEquals(Gesicht.get(2).getText(), subCategory);
			break;
		case "Augenpflege":
			Assert.assertEquals(Gesicht.get(3).getText(), subCategory);
			break;
		case "Maske & Peeling":
			Assert.assertEquals(Gesicht.get(4).getText(), subCategory);
			break;
		case "Serum & Kur":
			Assert.assertEquals(Gesicht.get(5).getText(), subCategory);
			break;
		case "Anti-Aging":
			Assert.assertEquals(Gesicht.get(6).getText(), subCategory);
			break;
		case "Lippenpflege":
			Assert.assertEquals(Gesicht.get(7).getText(), subCategory);
			break;
		case "Zahnpflege":
			Assert.assertEquals(Gesicht.get(8).getText(), subCategory);
			break;
		case "Gesichtsbursten":

			Assert.assertTrue(Gesicht.get(9).isDisplayed());
			break;
		case "Gesichtpflege-Sets":
			Assert.assertEquals(Gesicht.get(10).getText(), subCategory);
			break;
		default:
			throw new ElementNotVisibleException("Sub-category " + subCategory + " not found");
		}

	}

	public void navigateToSpecificCategory(int orderCategory, String category) throws InterruptedException {
		driver.findElement(By.xpath(
				"//*[@id='main-navigation']/ul/li[" + orderCategory + "]/a[@title=" + "'" + category + "'" + "]"))
				.click();
		Thread.sleep(5000);
		List<WebElement> products = driver
				.findElements(By.xpath("//*[@class='small-block-grid-2 medium-block-grid-3 large-block-grid-3']/li"));
		Random r = new Random();
		int randomValue = r.nextInt(products.size()); // Getting a random value
														// that is between 0 and
														// (list's size)-1
		WebElement product = products.get(randomValue);
		Thread.sleep(2000);
		product.findElement(By.xpath("./div[@class='product-item-box']")).click();
		Thread.sleep(5000);
	}

	// check Block is displayed
	public void checkBlockDisplayed(String block) throws Throwable {
		switch (block) {
		case "Payment":
			/*
			 * File scrFile =
			 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
			 */
			waitToBeVisible(payment_block, 3);
			Assert.assertTrue("PAYMENT BLOCK - ASSERTION :", payment_block.isDisplayed());
			break;
		case "Trustly certified":
			waitToBeVisible(trustly_certified_block, 3);
			Assert.assertTrue("TRUSTLY CERTIFIED BLOCK - ASSERTION :", trustly_certified_block.isDisplayed());
			break;
		case "Newsletter":
			waitToBeVisible(newsletter_block, 3);
			Assert.assertTrue("NEWSLETTER BLOCK - ASSERTION :", newsletter_block.isDisplayed());
			break;
		case "Customer Service":
			waitToBeVisible(customer_service_block, 3);
			Assert.assertTrue("CUSTOMER SERVICE BLOCK - ASSERTION :", customer_service_block.isDisplayed());
			break;
		case "Follow Flaconi":
			waitToBeVisible(follow_Flaconi_block, 3);
			Assert.assertTrue("FOLLOW FLACONI BLOCK - ASSERTION :", customer_service_block.isDisplayed());
			break;
		case "About Flaconi":
			waitToBeVisible(about_Flaconi_block, 3);
			Assert.assertTrue("ABOUT FLACONI BLOCK - ASSERTION :", about_Flaconi_block.isDisplayed());
			break;

		// REACT blocks
		case "Brand":
			try {

				waitToBeVisible(brand_block, 3);
				Assert.assertTrue("BRAND BLOCK - ASSERTION :", brand_block.isDisplayed());

				int numberBrandBlocks = Integer.parseInt((String) js
						.executeScript("return window.ui_shop.pages.Home.blocks.BrandsSliderWidget.length").toString());
				for (int i = 0; i < numberBrandBlocks; i++) {
					Assert.assertTrue("XL Slider is not displayed !",
							js.executeScript("return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].enabled")
									.equals(true));

					int numberBrands = Integer.parseInt((String) js
							.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].brands.length")
							.toString());
					Assert.assertTrue(!(numberBrands == 0));
					BaseUtil.scenario.write("Number of brands: " + numberBrands);

					int slidesShowMobile = Integer.parseInt((String) js
							.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].slidesToShowMobile")
							.toString());

					Assert.assertEquals("Slides to show Mobile: ", slidesShowMobile, 3);

					int slidesShowDesktop = Integer.parseInt((String) js
							.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].slidesToShowDesktop")
							.toString());

					Assert.assertEquals("Slides to show Desktop: ", slidesShowDesktop, 7);

					int slidesToScroll = Integer.parseInt((String) js
							.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].slidesToScroll")
							.toString());

					Assert.assertEquals("Slides to scroll: ", slidesToScroll, 1);
				}
			} catch (Exception e) {
				BaseUtil.scenario.write("The following error occurs: " + e);
			}

			break;

		case "XL slider":
			try {
				Assert.assertTrue("XL Slider is not displayed !",
						js.executeScript("return window.ui_shop.pages.Home.blocks.BannersSlider[0].enabled")
								.equals(true));
				Assert.assertTrue("XL Slider BLOCK - ASSERTION :", XLslider_block.isDisplayed());

				String xlSliderBlock = js.executeScript("return window.ui_shop.pages.Home.blocks.BannersSlider.length")
						.toString();
				String slideIntervalSeconds = js
						.executeScript(
								"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerSlideIntervalInSecond")
						.toString();
				Assert.assertEquals(slideIntervalSeconds, "5");
				BaseUtil.scenario.write("Number of blocks: " + xlSliderBlock + "\n" + "Number of images: "
						+ (String) js
								.executeScript(
										"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems.length")
								.toString()
						+ "\nSlide interval seconds: " + slideIntervalSeconds);
				waitToBeVisible(XLslider_block, 3);

				int numberXL = Integer.parseInt(xlSliderBlock);
				if (numberXL > 1) {
					Assert.assertTrue("XL Slider BLOCK - ASSERTION :", XLslider_block_1.isDisplayed());
					BaseUtil.scenario.write("Number of images for the second block: " + (String) js
							.executeScript(
									"return window.ui_shop.pages.Home.blocks.BannersSlider[1].bannerItems.length")
							.toString());
				}
			} catch (Exception e) {
				BaseUtil.scenario.write("The following error occurs: " + e);
			}
			break;

		case "Story":
			try {
				Assert.assertTrue("Story block is not displayed !",
						js.executeScript("return window.ui_shop.pages.Home.blocks.Story[0].enabled").equals(true));

				waitToBeVisible(story_block, 3);
				Assert.assertTrue("STORY BLOCK - ASSERTION :", story_block.isDisplayed());
				int numberStoryBlocks = Integer.parseInt(
						(String) js.executeScript("return window.ui_shop.pages.Home.blocks.Story.length").toString());
				BaseUtil.scenario.write("Number of blocks: " + numberStoryBlocks);
				if (numberStoryBlocks > 1) {
					Assert.assertTrue("XL Slider BLOCK - ASSERTION :", story_block_1.isDisplayed());
					Assert.assertTrue("The second Story block is not displayed !",
							js.executeScript("return window.ui_shop.pages.Home.blocks.Story[1].enabled").equals(true));
				}
			} catch (Exception e) {
				BaseUtil.scenario.write("The following error occurs: " + e);
			}
			break;

		case "Brand Product Display":
			try {

				waitToBeVisible(brand_product_display_block, 3);
				Assert.assertTrue("BRAND PRODUCT DISPLAY BLOCK - ASSERTION :",
						brand_product_display_block.isDisplayed());

				int numberBrandProductDisplay = Integer.parseInt((String) js
						.executeScript("return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay.length")
						.toString());

				for (int i = 0; i < numberBrandProductDisplay; i++) {

					Assert.assertTrue("Brand Product Display block is not displayed !",
							js.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].enabled")
									.equals(true));

					int numberProducts = Integer.parseInt((String) js.executeScript(
							"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].products.length")
							.toString());

					String headLine = js.executeScript(
							"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].headline")
							.toString();

					Assert.assertTrue("There are no products displayed !", !(numberProducts == 0));
					Assert.assertTrue("There is no Headline !", !(headLine.isEmpty()));

					BaseUtil.scenario.write("Brand Product Display block: " + i + "\nNumber of products: "
							+ numberProducts + "\nHeadline: " + headLine);

				}
			} catch (Exception e) {
				BaseUtil.scenario.write("The following error occurs: " + e);
			}
			break;

		case "Featured":
			try {

				waitToBeVisible(featured_block, 3);
				Assert.assertTrue("FEATURED BLOCK - ASSERTION :", featured_block.isDisplayed());

				int numberFeaturedBlocks = Integer.parseInt((String) js
						.executeScript("return window.ui_shop.pages.Home.blocks.Featured.length").toString());

				for (int i = 0; i < numberFeaturedBlocks; i++) {

					Assert.assertTrue("Featured block is not displayed !",
							js.executeScript(
									"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].enabled")
									.equals(true));

					int numberBrands = Integer.parseInt((String) js
							.executeScript("return window.ui_shop.pages.Home.blocks.Featured[" + i + "].brands.length")
							.toString());

					String headLine = js
							.executeScript("return window.ui_shop.pages.Home.blocks.Featured[" + i + "].headline")
							.toString();

					Assert.assertTrue("There are no brands displayed !", !(numberBrands == 0));
					Assert.assertTrue("There is no Headline !", !(headLine.isEmpty()));

					BaseUtil.scenario.write(
							"Featured block: " + i + "\nNumber of brands: " + numberBrands + "\nHeadline: " + headLine);

				}
			} catch (Exception e) {
				BaseUtil.scenario.write("The following error occurs: " + e);
			}
			break;

		default:
			throw new ElementNotVisibleException(">>> Block " + block + " not found");

		}

	}

	// check Block title
	public void checkBlockTitle(String title) throws Throwable {
		switch (title) {
		case "Bequem bezahlen":
			waitToBeVisible(payment_block_title, 3);
			Assert.assertEquals("PAYMENT BLOCK TITLE - ASSERTION :", payment_block_title.getText(), title);
			break;
		case "Sicherheit":
			wait(trustly_certified_block_title, 3);
			Assert.assertTrue("TRUSTLY CERTIFIED BLOCK TITLE - ASSERTION :",
					trustly_certified_block_title.getText().contains(title));
			break;
		case "Beauty News":
			wait(newsletter_block_title, 3);
			Assert.assertEquals("NEWSLETTER BLOCK TITLE - ASSERTION :", newsletter_block_title.getText(), (title));
			break;
		case "Kundenservice":
			wait(customer_service_block_title, 3);
			Assert.assertEquals("CUSTOMER SERVICE BLOCK TITLE - ASSERTION :", customer_service_block_title.getText(),
					(title));
			break;
		case "Flaconi folgen":
			wait(follow_Flaconi_block_title, 3);
			Assert.assertEquals("FOLLOW FLACONI BLOCK TITLE - ASSERTION :", follow_Flaconi_block_title.getText(),
					(title));
			break;
		case "Flaconi":
			wait(about_Flaconi_block_title, 3);
			Assert.assertTrue("ABOUT FLACONI BLOCK TITLE - ASSERTION :",
					about_Flaconi_block_title.getText().contains(title));
			break;
		default:
			throw new ElementNotVisibleException(">>> Block title " + title + " not found");

		}
	}

	public void checkPage(String page) throws InterruptedException {
		config = new util.ConfigReader();
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();

		if (System.getProperty("environment").equalsIgnoreCase("aws_zalenium_production")) {
			String environmentURL = config.getKey("PRODUCTION");
			System.out.println(environmentURL + config.getKey(page));
			System.out.println(URL);
			Assert.assertTrue(URL.equals(environmentURL + config.getKey(page)));
		} else if (System.getProperty("environment").equalsIgnoreCase("aws_zalenium_testing")) {
			String environmentURL = config.getKey("TESTING");
			System.out.println(environmentURL + config.getKey(page));
			System.out.println(URL);
			Assert.assertTrue(URL.equals(environmentURL + config.getKey(page)));

		} else if (System.getProperty("environment").equalsIgnoreCase("testing")) {
			String environmentURL = config.getKey("TESTING");
			System.out.println(environmentURL + config.getKey(page));
			System.out.println(URL);
			Assert.assertTrue(URL.equals(environmentURL + config.getKey(page)));
		}

	}

	public void scrollBrandSlider() throws InterruptedException {
		waitToBeVisible(brand_block, 3);
		WebElement rightArrow = brand_block
				.findElement(By.xpath("//div[2]/div/div[@class='slider-control-centerright']/button"));
		Assert.assertTrue(rightArrow.isDisplayed());

		js.executeScript("arguments[0].click();", rightArrow);
	}

	public void clickAlleMarkenButton() {
		Assert.assertTrue(alle_Marken_button.isDisplayed());

		String buttonText = (String) js
				.executeScript("return window.ui_shop.pages.Home.blocks.BrandsSliderWidget[0].buttonText").toString();
		Assert.assertEquals(buttonText, alle_Marken_button.getText());
		js.executeScript("arguments[0].click();", alle_Marken_button);
	}

	public void checkContentBrandProductDisplay() {
		try {
			int numberBrandProductDisplay = Integer.parseInt((String) js
					.executeScript("return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay.length").toString());
			for (int i = 0; i < numberBrandProductDisplay; i++) {

				int httpCodeBrandImage = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandImage")
								.toString())
						.getStatusCode();

				int httpCodeBrandLink = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandLink")
								.toString())
						.getStatusCode();

				long responseTimeBrandImage = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandImage")
								.toString())
						.then().extract().timeIn(TimeUnit.MILLISECONDS);

				long responseTimeBrandLink = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandLink")
								.toString())
						.then().extract().timeIn(TimeUnit.MILLISECONDS);

				BaseUtil.scenario.write("Brand Product Display block " + i + "\nBrand image - CDN link: "
						+ (String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandImage")
						+ "\nHTTP status code: " + httpCodeBrandImage + "\nServer response time: "
						+ responseTimeBrandImage + "\n\nBrand link: "
						+ (String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandLink")
						+ "\nHTTP status code: " + httpCodeBrandLink + "\nServer response time: "
						+ responseTimeBrandLink);

				Assert.assertEquals((String) js
						.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandImage")
						.toString(), httpCodeBrandImage, 200);
				Assert.assertEquals((String) js
						.executeScript(
								"return window.ui_shop.pages.Home.blocks.BrandAndProductDisplay[" + i + "].brandLink")
						.toString(), httpCodeBrandLink, 200);

			}
		} catch (Exception e) {
			BaseUtil.scenario.write("Error: " + e);
		}
	}

	public void scrollXLSlider() {
		WebElement left = XLslider_block.findElement(By.xpath("//div/div[3]/button"));
		WebElement right = XLslider_block.findElement(By.xpath("//div/div[4]/button"));
		Assert.assertTrue(right.isDisplayed());
		Assert.assertTrue(left.isDisplayed());

		js.executeScript("arguments[0].click();", right);
		js.executeScript("arguments[0].click();", left);

		String images = (String) js
				.executeScript("return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems.length")
				.toString();
		int numberImages = Integer.parseInt(images);
		for (int i = 0; i < numberImages; i++) {

			try {
				RequestSpecification httpRequest = RestAssured.given();
				Response response = httpRequest.get((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage")
						.toString());
				String etag = response.header("etag");
				String age = response.header("age");

				int codeImage = given().when().get((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage")
						.toString()).getStatusCode();
				Assert.assertEquals(codeImage, 200);

				int codeLink = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].link")
								.toString())
						.getStatusCode();
				Assert.assertEquals(codeLink, 200);

				long timeImage = given().when().get((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage")
						.toString()).then().extract().timeIn(TimeUnit.MILLISECONDS);
				Assert.assertTrue((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage"),
						timeImage < 1000);

				long timeLink = given().when()
						.get((String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].link")
								.toString())
						.then().extract().timeIn(TimeUnit.MILLISECONDS);
				Assert.assertTrue(
						(String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].link"),
						timeLink < 1000);

				BaseUtil.scenario.write("Banner image " + i + " - CDN link: \n" + (String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage")
						+ "\n" + "HTTP status code: " + codeImage + "\n" + "Server response time: " + timeImage
						+ " milliseconds" + "\n" + "etag: " + etag + "\nage: " + age + "\n" + "\n" + "Link image " + i
						+ " :" + "\n"
						+ (String) js.executeScript(
								"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].link")
						+ "\n" + "HTTP status code: " + codeLink + "\nServer response time: " + timeLink
						+ " milliseconds");

				Assert.assertTrue((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage"),
						!etag.isEmpty());
				Assert.assertTrue((String) js.executeScript(
						"return window.ui_shop.pages.Home.blocks.BannersSlider[0].bannerItems[" + i + "].bannerImage"),
						!age.isEmpty());

			} catch (Exception e) {
				BaseUtil.scenario.write("Error: " + e);
			}
		}
	}

}
