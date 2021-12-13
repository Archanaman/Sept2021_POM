package com.qa.openCart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.openCart.util.Constants;



public class LoginPageTest extends BaseTests{

	@Test
	public void loginpageTitleTest() {
		String actTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void registerLinkText() {
		Assert.assertTrue(loginpage.isRegisterLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	
}
