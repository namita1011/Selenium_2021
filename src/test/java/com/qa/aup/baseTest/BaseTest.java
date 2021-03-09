package com.qa.aup.baseTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.aup.factory.DriverFactory;
import com.qa.aup.pages.IndexPage;

public class BaseTest {
	
	DriverFactory dr;
	WebDriver driver;
	public IndexPage indexPage;
	 
	
	@BeforeTest
	public void setUp()
	{
		dr=new DriverFactory();
		//Properties prop=dr.inti_prop();
		driver=dr.inti_driver("chrome");
		indexPage=new IndexPage(driver);
		
	}
	
	
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
	}

}
