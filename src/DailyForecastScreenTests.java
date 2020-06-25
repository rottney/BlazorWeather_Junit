import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DailyForecastScreenTests {
	
	public WebDriver driver;
	
	private static DailyForecastScreen dailyForecastScreen;
	
	
	@Before
	public void before() {
		dailyForecastScreen = new DailyForecastScreen();
	}
	
	@Test
	public void titleTest() {
		String title = dailyForecastScreen.getTitle();
		
		Assert.assertEquals("Daily Forecast", title);
	}
	
	@After
	public void after() {
		dailyForecastScreen.quitDriver();
	}
	
}
