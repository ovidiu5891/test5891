package flaconi.shop.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	public static WebDriver driver;
	public static Wait<WebDriver> wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public  WebDriver getDriver() {
		return driver;
	}
	
	
	public static WebElement fluentWaitForElement(final By locator){
		return wait.until(driver -> driver.findElement(locator));
	}
	
	public void wait(WebElement webElement, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public void waitToBeVisible(WebElement webElement, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public static boolean fluentWaitForPageToLoad(){
		WebDriverWait plWait = new WebDriverWait(driver, 30);
		return plWait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) driver).executeScript("return.document.readyState").equals("complete"));
	}
}