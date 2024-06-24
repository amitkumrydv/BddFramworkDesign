package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="Email")
	WebElement username;

	@FindBy(id="Password")
	WebElement password ;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogOut;

	public void setUserName(String userId) {
		System.out.println("username -------- " + username.getText());
		username.clear();
		System.out.println("username -------- " + username.getText());

		username.sendKeys(userId);

	}

	public void setPassword(String pwd) {
		password.clear();

		password.sendKeys(pwd);

	}

	public void clickLogin() {
		btnLogin.click();

	}

	public void clickLogOut() {
		btnLogOut.click();

	}

}
