package flaconi.shop.integration.cucumber;

import org.openqa.selenium.WebDriver;
import org.picocontainer.annotations.Inject;

import flaconi.shop.pageObject.BasePage;



public class AbstractStepDefinition {

	WebDriver driver;
	
	@Inject
    private static  BaseUtil base;
	
	/**
	 * Factory to create a navigate ready Page instance
	 * 
	 * @param pageClass
	 * @return
	 * @throws Exception 
	 */
	
	public <T extends BasePage> T getInitializedPage(
			Class<T> pageClass) throws Exception {

		T page = pageClass.getConstructor(WebDriver.class).newInstance(base.getDriver());	
		return page;

	}
	
}

