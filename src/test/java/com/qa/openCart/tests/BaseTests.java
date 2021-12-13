package com.qa.openCart.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.openCart.factory.Driverfactory;
import com.qa.openCart.pages.AccountsPage;
import com.qa.openCart.pages.LoginPage;
import com.qa.openCart.pages.ProductInfoPage;
import com.qa.openCart.pages.SearchResultsPage;

public class BaseTests {

	Driverfactory df;
	WebDriver driver;
	LoginPage loginpage;
	Properties prop;
	AccountsPage accountpage;
	ProductInfoPage productInfoPage;
	SearchResultsPage searchResultPage;
	
	@BeforeTest
	public void setup() {
		df = new Driverfactory();
		prop=df.init_prop();
		driver= df.init_driver(prop);
		loginpage= new LoginPage(driver);
		//accountpage = new AccountPage(driver);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	
}
