package flaconi.shop.integration.cucumber;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fasterxml.jackson.core.Version;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import flaconi.shop.pageObject.CartPage;
import flaconi.shop.pageObject.HomePage;
import util.ConfigReader;

/**
 * Scenario wrapper TODO do before and after hooks here!
 * 
 * @author ovidiu
 *
 */
public class BaseUtil {

	public ConfigReader config;

	private static ChromeOptions options = new ChromeOptions();


	public DesiredCapabilities caps;

	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@Before
	public void setUp(Scenario scenario) throws Exception {

		String localBrowser;

		if ((localBrowser = System.getProperty("browser")) != null && localBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Initiating local: browser '" + localBrowser + "'");

			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} else if ((localBrowser = System.getProperty("browser")) != null && localBrowser.equalsIgnoreCase("firefox")) {
			System.out.println("Initiating local: browser '" + localBrowser + "'");
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().setSize(new Dimension(1920, 1080));

		} else if ((localBrowser = System.getProperty("browser")) !=null && localBrowser.equalsIgnoreCase("phantom")) {
			System.setProperty("phantomjs.binary.path", "Drivers\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
			driver = new PhantomJSDriver();
			driver.manage().window().maximize();
			System.out.println("PhantomJS is initialized !!!" + localBrowser);
			
		}

		else if ((localBrowser = System.getProperty("zalenium")) != null && localBrowser.equalsIgnoreCase("zalenium")) {

			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		}

		else {

		}

	}

	@Before
	public void goToHomePage(Scenario scenario) throws MalformedURLException {

		config = new util.ConfigReader();
		String environment;

		if ((environment = System.getProperty("environment")) != null && environment.equalsIgnoreCase("testing")) {
			driver.get(config.getKey("TESTING"));

		} else if ((environment = System.getProperty("environment")) != null
				&& environment.equalsIgnoreCase("production")) {
			driver.get(config.getKey("PRODUCTION"));

		} else if ((environment = System.getProperty("environment")) != null
				&& environment.equalsIgnoreCase("aws_zalenium_testing")) {

			DesiredCapabilities dc = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL(config.getKey("AWS_ZALENIUM")), dc);
			driver.manage().window().maximize();
			driver.get(config.getKey("TESTING"));

		} else if ((environment = System.getProperty("environment")) != null
				&& environment.equalsIgnoreCase("aws_zalenium_production")) {

			DesiredCapabilities dc = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL(config.getKey("AWS_ZALENIUM")), dc);
			driver.manage().window().maximize();
			driver.get(config.getKey("PRODUCTION"));
			
			// PhantomJS 
		} else if ((environment = System.getProperty("environment")) != null
				&& environment.equalsIgnoreCase("phantom_testing")) {

			
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), dc);
			
			driver.manage().window().maximize();
			driver.get(config.getKey("TESTING"));
		}


		else {

		}
	}

	/**
	 * Release driver and scenario
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown(Scenario scenario) throws Exception {
		driver.quit();
	}

}
