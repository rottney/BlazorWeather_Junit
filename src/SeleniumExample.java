import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumExample {
	
	private SeleniumConfig config;
    private String url = "https://blazorserverweatherapp.azurewebsites.net";	// homepage
 
    
    public SeleniumExample() {
        config = new SeleniumConfig();
        config.getDriver().get(url);	// does getDriver() work?
    }
    
    
    public void quitDriver() {
    	config.getDriver().quit();
    }
    
    public String getCurrentUrl() {
    	return config.getDriver().getCurrentUrl();
    }
    
    
    // I might use this?
    public void closeWindow() {
    	config.getDriver().close();
	}
    
    // I might use this?
	public String getTitle() {
		return config.getDriver().getTitle();
	}

	public void switchTabs() {
		ArrayList<String> tabs = new ArrayList<String> (config.getDriver().getWindowHandles());
		config.getDriver().switchTo().window(tabs.get(1));
	}
	
	public void clickOtherProjectsLink() {
		config.getDriver().navigate().to(url);
		config.getDriver().findElement(By.xpath("/html/body/app/div[2]/div[2]/a")).click();
	}
	
	public void clickAboutLink() {
		config.getDriver().navigate().to(url);
		config.getDriver().findElement(By.xpath("/html/body/app/div[2]/div[1]/a")).click();
	}
	
	public void clickCurrentForecastLink() {
		config.getDriver().navigate().to(url);
		config.getDriver().findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[2]/a")).click();
	}
	
	public void clickHourlyForecastLink() {
		config.getDriver().navigate().to(url);
		config.getDriver().findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[3]/a")).click();
	}
	
	public void clickDailyForecastLink() {
		config.getDriver().navigate().to(url);
		config.getDriver().findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[4]/a")).click();
	}
	
}
