package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		rdriver = ldriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "Email")
	WebElement textEmail;

	@FindBy(id = "password")
	WebElement textPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogOut;

	public void setUserName(String name) {
		textEmail.clear();

		textEmail.sendKeys(name);

	}

	public void setPassword(String pwd) {
		textPassword.clear();

		textPassword.sendKeys(pwd);

	}

	public void clickLogin() {
		btnLogin.click();

	}

	public void clickLogOut() {
		btnLogOut.click();

	}

}
