package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPageObject {
	
	
	public AddCustomerPageObject (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement expandsideMenuCustomer;
	
	@FindBy (xpath="//a[@href=\"/Admin/Customer/List\"]//p[contains(text(),'Customers')]")
	WebElement customer;
	
	
	@FindBy (xpath="//a[@href=\"/Admin/Customer/Create\"]")
	WebElement addCustomer;
	
	@FindBy (xpath="//div[text()=\"Customer info\"]")
	WebElement customerInfo;
	
	
	@FindBy (id="Email")
	WebElement email;
	
	
	@FindBy (id="Password")
	WebElement password;
	
	@FindBy (id="FirstName")
	WebElement firstName;
	
	
	@FindBy (id="LastName")
	WebElement lastName;
	
	@FindBy (id="Gender_Male")
	WebElement gender_Male;
	
	
	@FindBy (id="Gender_Female")
	WebElement gender_Female;
	
	
	@FindBy (id="DateOfBirth")
	WebElement dateOfBirth;
	
	@FindBy (id="Company")
	WebElement company;
	
	
	@FindBy (id="IsTaxExempt")
	WebElement isTaxExempt;
	
	
	
	@FindBy (xpath="//ul//li[1]//input[@type=\"search\"]")
	WebElement newsLatter;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
