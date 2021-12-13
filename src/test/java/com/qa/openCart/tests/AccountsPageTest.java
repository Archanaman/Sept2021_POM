package com.qa.openCart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.openCart.pages.AccountsPage;
import com.qa.openCart.util.Constants;

public class AccountsPageTest extends BaseTests {

	@BeforeClass()
	public void AccPageSetup() {
		accountpage = loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		}
	
	@Test
	public void accPageTitletest() {
		String ActTitle = accountpage.getAccountPageTitle();
		Assert.assertEquals(ActTitle,Constants.ACCOUNTS_PAGE_TITLE);
		}
	
	@Test
	public void isLogoutExistTest() {
		Assert.assertTrue(accountpage.isLogoutLinkExist());
	}
	
	@Test
	public void accPageSectionTest() {
		List<String> actAccountSecList = accountpage.getaccountSecLink();
		Assert.assertEquals(actAccountSecList,Constants.getExpectedAccSecList());
	}
	
	@DataProvider
	public Object[][] productData() {
		return new Object[][] {
			{"Macbook Pro"},
			{"Apple"},
			{"Samsung"}
		};
		}
	
	
	@Test(dataProvider= "productdata")
	public  void searchTest(String productName) {
		accountpage.doSearch(productName);
	}
	
	
	
	
	
	}
	
	
	
	
	
	

