import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class HomeScreenTests {
	
	public WebDriver driver;
	
	private static HomeScreen homeScreen;
	
	
	@Before
	public void before() {
	    homeScreen = new HomeScreen();
	}
	
	@Test
	public void homeScreenTitle() {
		String title = homeScreen.getTitle();
		
		Assert.assertEquals("BlazorServerWeatherApp", title);
	}
	
	@Test
	public void otherProjectsLink() {
		homeScreen.clickOtherProjectsLink();
		homeScreen.switchTabs();
		
		String url = homeScreen.getCurrentUrl();
		
		Assert.assertEquals("https://github.com/rottney?tab=repositories", url);
	}
	
	@Test
	public void aboutLink() {
		homeScreen.clickAboutLink();
		homeScreen.switchTabs();
		
		String url = homeScreen.getCurrentUrl();
		
		Assert.assertEquals("https://docs.microsoft.com/en-us/aspnet/core/?view=aspnetcore-3.1", url);
	}
	
	@Test
	public void currentForecastLink() {
		homeScreen.clickCurrentForecastLink();
		
		String url = homeScreen.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/current", url);
	}
	
	@Test
	public void hourlyForecastLink() {
		homeScreen.clickHourlyForecastLink();
		
		String url = homeScreen.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/hourly", url);
	}
	
	@Test
	public void dailyForecastLink() {
		homeScreen.clickDailyForecastLink();
		
		String url = homeScreen.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/daily", url);
	}
	
	@After
	public void after() {
		homeScreen.quitDriver();
	}
	
}
