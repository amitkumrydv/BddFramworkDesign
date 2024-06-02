package com.stepDefination;

import org.openqa.selenium.WebDriver;

import com.pageObject.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginSteps {
	
	public WebDriver driver;
	
	public LoginPage lp;
	
	
	@Given("User Lounch chrome browser")
	public void user_Lounch_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		
		lp = new LoginPage(driver);
	  
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) {

		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {

		lp.setUserName(email);
		lp.setPassword(password);
	  
	}

	@When("Click on Login")
	public void click_on_Login() {

	  lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			
			Assert.assertTrue(false);
		}else {
			
			Assert.assertEquals(title, driver.getTitle());
		}
		
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	
	    lp.clickLogOut();
	    Thread.sleep(1000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	
	  
	}

	@Then("close browser")
	public void close_browser() {
	 
	   driver.quit();
	}
	
	
	

}
