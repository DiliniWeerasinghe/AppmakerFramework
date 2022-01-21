package com.Appmaker.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
	{
		if(browserName.contentEquals("Chrome"))
		{
			  ChromeOptions options = new ChromeOptions();
			  
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
		    options.addArguments("--no-sandbox");
		    driver = new ChromeDriver(options);
			//driver = new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}
		else
		{
			System.out.println("We do not support this browser");
		}

		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
