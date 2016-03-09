package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.internal.Configuration;


public class PageDriver {
	WebDriver driver;
	Configuration configuration;
	
	public PageDriver(Configuration config) throws Exception {
		this.configuration = config;
		initializeBrowser();
		
		//this.driver = new FirefoxDriver();
		
	}
	
	public void initializeBrowser() throws Exception
	{
		Config.readprops();
		String browser = Config.browser;
		System.out.println("configbrowser:" + browser);

		switch (browser)
		{
		case "firefox":
			startFirefox();
			break;
		case "chrome":
			startChrome();
			break;
		case "ie":
			startIE();
			break;
		default:
			startHTML();
			break;
		}
		
		driver.get(Config.url);
	}
	
	public void startFirefox()
	{
		this.driver = new FirefoxDriver();
	}
	
	public void startChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anukrsh\\Downloads\\chromeSetup.exe");
		this.driver = new ChromeDriver();
				
				
				
	}
	
	public void startIE()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anukrsh\\Downloads\\IEDriverServer.exe");
		this.driver = new InternetExplorerDriver();
	}
	
	public void startHTML()
	{
		this.driver = new HtmlUnitDriver();
	}
	public void get(String url)
	{
		driver.get(url);
	}
	
	public WebElement findElement(By by)
	{
		return driver.findElement(by);
	}
	
	
	public List<WebElement> findElements(By by)
	{
		return driver.findElements(by);
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void quit()
	{
		driver.quit();
	}
}



