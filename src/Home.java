import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Home {
	
	public WebDriver driver;
	
	private static SeleniumExample seleniumExample;
	
	
	@Before
	public void before() {
	    seleniumExample = new SeleniumExample();
	}
	
	@Test
	public void otherProjectsLink() {
		seleniumExample.clickOtherProjectsLink();
		seleniumExample.switchTabs();
		
		String url = seleniumExample.getCurrentUrl();
		
		Assert.assertEquals("https://github.com/rottney?tab=repositories", url);
	}
	
	@Test
	public void aboutLink() {
		seleniumExample.clickAboutLink();
		seleniumExample.switchTabs();
		
		String url = seleniumExample.getCurrentUrl();
		
		Assert.assertEquals("https://docs.microsoft.com/en-us/aspnet/core/?view=aspnetcore-3.1", url);
	}
	
	@Test
	public void currentForecastLink() {
		seleniumExample.clickCurrentForecastLink();
		
		String url = seleniumExample.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/current", url);
	}
	
	@Test
	public void hourlyForecastLink() {
		seleniumExample.clickHourlyForecastLink();
		
		String url = seleniumExample.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/hourly", url);
	}
	
	@Test
	public void dailyForecastLink() {
		seleniumExample.clickDailyForecastLink();
		
		String url = seleniumExample.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/daily", url);
	}
	
	@After
	public void after() {
		seleniumExample.quitDriver();
	}
	
}
