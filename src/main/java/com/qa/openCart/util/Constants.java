package com.qa.openCart.util;

import java.util.ArrayList;
import java.util.List;

public class Constants {

	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final int PAGE_TIMEOUT = 5000;
	
	public static final String ACCOUNTS_PAGE_TITLE = "My Account";
	public static final Object IMAC_IMAGE_COUNT = null;
	
	public static List<String> getExpectedAccSecList() {
		List<String> expSeclist = new ArrayList<String>();
		expSeclist.add("My Account");
		expSeclist.add("My Orders");
		expSeclist.add("My Affiliate Account");
		expSeclist.add("Newsletter");
		return expSeclist;
		
		
	}
	
	
}
