package tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import screens.CurrentForecastScreen;


public class CurrentForecastScreenTests {
	
	public WebDriver driver;
	
	private static CurrentForecastScreen currentForecastScreen;
	
	
	@Before
	public void before() {
		currentForecastScreen = new CurrentForecastScreen();
	}
	
	@Test
	public void titleTest() {		
		String title = currentForecastScreen.getTitle();
		
		Assert.assertEquals("Current Forecast", title);
	}
	
	@After
	public void after() {
		currentForecastScreen.quitDriver();
	}
	
}
