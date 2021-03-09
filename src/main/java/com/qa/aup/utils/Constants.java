package com.qa.aup.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	
	public static final String INDEX_PAGE_TITLE="My Store";
	
	public static final String CONTACT_NUMBER="0123-456-789";
	public static final int TOTAL_FOOTER_HEADERS_COUNT=6;
	
	public static List<String> ActualHeaderList()
	{
		List<String>hlist=new ArrayList<String>();
		
		hlist.add("Newsletter");
		hlist.add("Follow us");
		hlist.add("Categories");
		hlist.add("Information");
		hlist.add("My account");
		hlist.add("Store information");
		
		return hlist;
	}

}
