package com.qa.aup.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.aup.utils.ElementsUtils;

public class IndexPage {
	
	WebDriver driver;
	ElementsUtils elmutil;
	
	By signIn=By.linkText("Sign in");
	By contactUs=By.linkText("Contact us");
	By contactNo=By.xpath("//span[@class='shop-phone']/strong");
	By footerHeaders=By.xpath("//footer[@id='footer']//h4");
	
	
	public IndexPage(WebDriver driver)
	{
	     elmutil=new ElementsUtils(driver);
	}
	
	
	public String getTitle()
	{
		return elmutil.getTitle();
	}
	
	public void clickSignIn()
	{
		elmutil.doClick(signIn);
	}
	
	public boolean isContactUsDisplayed()
	{
		return elmutil.isDisplayed(contactUs);
	}
	
	
	public boolean isSignInLinkDisplayed()
	{
		return elmutil.isDisplayed(signIn);
	}
	
	public String getContactNo()
	{
		return elmutil.getElement(contactNo).getText();
	}
	
	public List<String> getfooterHeadersList()
	{
		List<WebElement>hlist=elmutil.getElements(footerHeaders);
		List<String>headerList=new ArrayList<String>();
		
		for (WebElement e:hlist )
		{
			headerList.add(e.getText());
		}
		
		return headerList;
	}
	
	public int getFooterHeaderCount()
	{
		return elmutil.getElements(footerHeaders).size();
		
	}

}
