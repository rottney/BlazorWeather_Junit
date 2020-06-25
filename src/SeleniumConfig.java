import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
	
	private WebDriver driver;
	
	public SeleniumConfig() {
	    //Capabilities capabilities = DesiredCapabilities.firefox();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	 
	static {
	    //System.setProperty("webdriver.gecko.driver", findFile("geckodriver.mac"));
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"	// works on my machine
			);
	}
	 
	/*static private String findFile(String filename) {
	   String paths[] = {"", "bin/", "target/classes"};
	   for (String path : paths) {
	      if (new File(path + filename).exists())
	          return path + filename;
	   }
	   return "";
	}*/
	
	// Maybe?
	public WebDriver getDriver() {
		return this.driver;
	}
}
