package configs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
	
	private WebDriver driver;
	
	public SeleniumConfig() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	 
	static {
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"	// works on my machine
			);
	}
	 
	public WebDriver getDriver() {
		return this.driver;
	}
	
}
