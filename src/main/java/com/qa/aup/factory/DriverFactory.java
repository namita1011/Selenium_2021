package com.qa.aup.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private WebDriver driver;
	private Properties prop;
	
	public WebDriver inti_driver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			}
			
		else if(browserName.equalsIgnoreCase("safari"))
		{
			
			driver=new SafariDriver();
		}
		
		else {
			
			System.out.println("entered browser is not found "+browserName);
			
		}
		
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		
		return driver;
		
	}
	
	
	public Properties inti_prop()
	{
		prop=new Properties();
		
		try {
			FileInputStream fl=new FileInputStream(".src/test/resources/config/config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
