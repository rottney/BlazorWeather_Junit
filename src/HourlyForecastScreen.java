import org.openqa.selenium.By;

public class HourlyForecastScreen {
	
	private SeleniumConfig config;
	
    private String url = "https://blazorserverweatherapp.azurewebsites.net/hourly";
    
    
    public HourlyForecastScreen() {
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
