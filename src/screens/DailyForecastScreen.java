package screens;
import org.openqa.selenium.By;

import configs.SeleniumConfig;

public class DailyForecastScreen {

	private SeleniumConfig config;
	
    private String url = "https://blazorserverweatherapp.azurewebsites.net/daily";
    
    
    public DailyForecastScreen() {
        config = new SeleniumConfig();
        config.getDriver().get(url);
    }
    
    public void quitDriver() {
    	config.getDriver().quit();
    }
    
    public String getTitle() {
		return config.getDriver().findElement(By.xpath("/html/body/app/div[2]/div[2]/h1")).getText();
	}
    
}
