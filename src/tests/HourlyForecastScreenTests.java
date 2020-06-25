package tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import screens.HourlyForecastScreen;

public class HourlyForecastScreenTests {
	
	public WebDriver driver;
	
	private static HourlyForecastScreen hourlyForecastScreen;
	
	
	@Before
	public void before() {
		hourlyForecastScreen = new HourlyForecastScreen();
	}
	
	@Test
	public void titleTest() {
		String title = hourlyForecastScreen.getTitle();
		
		Assert.assertEquals("Hourly Forecast", title);
	}
	
	@After
	public void after() {
		hourlyForecastScreen.quitDriver();
	}
}
