package com.qa.aup.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.aup.baseTest.BaseTest;
import com.qa.aup.pages.LoginPage;
import com.qa.aup.utils.Constants;

public class IndexPageTest extends BaseTest {
	
	@Test
	public void Titletest()
	{
		String title=indexPage.getTitle();
		Assert.assertEquals(title,Constants.INDEX_PAGE_TITLE);
	}
	
	@Test
	public void ContactUsLinkDisplayedTest()
	{
		
		Assert.assertTrue(indexPage.isContactUsDisplayed());
	}
	
	
	@Test
	public void SignUpLinkDisplayed()
	{
		Assert.assertTrue(indexPage.isSignInLinkDisplayed());
	}
	
	@Test
	public void ContactNoTest()
	{
		String contactNo=indexPage.getContactNo();
		Assert.assertEquals(contactNo, Constants.CONTACT_NUMBER);
	}
	
	@Test
	public void getheadersCount()
	{
		int count=indexPage.getFooterHeaderCount();
		Assert.assertEquals(count, Constants.TOTAL_FOOTER_HEADERS_COUNT);
	}
	
	@Test
	public void getHeaderList()
	{
		List<String>headerList=indexPage.getfooterHeadersList();
		Assert.assertEquals(headerList, Constants.ActualHeaderList());
	}

}
