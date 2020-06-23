import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	
	@Test
	public void otherProjectsLink() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net");
		
		
		// "Check out my other projects" link
		driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/a")).click();
		
		// Switch tabs
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://github.com/rottney?tab=repositories", url);
		
		
		// Refactor...?
		driver.quit();
	}
	
	@Test
	public void aboutLink() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net");
		
		
		// "About" link
		driver.findElement(By.xpath("/html/body/app/div[2]/div[1]/a")).click();
		
		// Switch tabs
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://docs.microsoft.com/en-us/aspnet/core/?view=aspnetcore-3.1", url);
		
		
		// Refactor...?
		driver.quit();
	}
	
	@Test
	public void currentForecastLink() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net");
		
		
		// "Current Forecast" link
		driver.findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[2]/a")).click();
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/current", url);
		
		
		// Refactor...?
		driver.quit();
	}
	
	@Test
	public void hourlyForecastLink() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net");
		
		
		// "Hourly Forecast" link
		driver.findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[3]/a")).click();
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/hourly", url);
		
		
		// Refactor...?
		driver.quit();
	}
	
	@Test
	public void dailyForecastLink() {
		// Refactor...?
		System.setProperty(
				"webdriver.chrome.driver",
				"/Users/randyroughhouse/Downloads/chromedriver"
			);  
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://blazorserverweatherapp.azurewebsites.net");
		
		
		// "Daily Forecast" link
		driver.findElement(By.xpath("/html/body/app/div[1]/div[2]/ul/li[4]/a")).click();
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals("https://blazorserverweatherapp.azurewebsites.net/daily", url);
		
		
		// Refactor...?
		driver.quit();
	}
	
}
