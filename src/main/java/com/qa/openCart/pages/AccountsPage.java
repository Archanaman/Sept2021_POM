package com.qa.openCart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.openCart.util.Constants;
import com.qa.openCart.util.Elementutil;

public class AccountsPage {
	
	
	
	private WebDriver driver;
	private Elementutil eleutil;
	
	private By header = By.cssSelector("div#logo a");
	private By accountsSection = By.cssSelector("div#content h2");
	private By searchField = By.name("search");
	private By searchButton = By.cssSelector("div#search button");
	private By logoutLink = By.linkText("logout");
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		eleutil = new Elementutil(driver);
	}
	
	public String getAccountPageTitle() {
		return eleutil.doGetTitleWithFraction(Constants.ACCOUNTS_PAGE_TITLE, Constants.PAGE_TIMEOUT);
	}
	
	
	public boolean isLogoutLinkExist() {
		return eleutil.doIsDisplayed(logoutLink);
	}
	
	public void Logout() {
		if(isLogoutLinkExist()) {
			eleutil.doClick(logoutLink);
		}
	}
	
	public List<String> getaccountSecLink() {
		List<WebElement> accList=eleutil.waitForElementsToBeVisible(accountsSection, 10);
		List<String> accListValList = new ArrayList<String>();
		for(WebElement e : accList) {
			String text =e.getText();
			accListValList.add(text);
		}
		return accListValList;
	}
	
	public SearchResultsPage doSearch(String Productname) {
		eleutil.doSendKeys(searchField, Productname);
		eleutil.doClick(searchButton);
		return new SearchResultsPage(driver);
	}
}
