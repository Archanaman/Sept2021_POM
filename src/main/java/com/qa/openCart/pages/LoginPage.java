package com.qa.openCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.openCart.util.Constants;
import com.qa.openCart.util.Elementutil;

public class LoginPage {

	//1.declare private driver
	private WebDriver driver;
	private Elementutil eleutil;
	
	//2. page constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleutil = new Elementutil(driver);
	}
	
	//3.By locaters
	private By emailid= By.id("input-email");
	private By password= By.id("input-password");
	private By loginbtn= By.xpath("//input[@value=login]");
	private By registerLink= By.linkText("Register");
	private By forgotpwdLink= By.linkText("Forgotten Password");
	
	//4. Page action
	public String getLoginPageTitle() {
		return eleutil.doGetTitleWithFraction(Constants.LOGIN_PAGE_TITLE, Constants.PAGE_TIMEOUT);
	}
	
	public String getLoginPAgeURL() {
	return driver.getCurrentUrl();}
	
	public boolean isForgotPwdLinkExist() {
		return eleutil.doIsDisplayed(forgotpwdLink);
	}
	
	public boolean isRegisterLinkExist() {
		return driver.findElement(registerLink).isDisplayed();
	}
	
	public AccountsPage doLogin(String un,String pwd) {
		System.out.println("login with :"+un+" "+pwd);
		eleutil.doSendKeys(emailid, un);
		eleutil.doSendKeys(password, pwd);
		eleutil.doClick(loginbtn);
		return new AccountsPage (driver);
	}
	
}
