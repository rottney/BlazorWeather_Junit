import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HourlyForecast {
	@Test
	public void titleTest() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net/hourly");
		
		
		String title = driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/h1")).getText();
		
		Assert.assertEquals("Hourly Forecast", title);
		
		
		// Refactor...?
		driver.quit();
	}
}
