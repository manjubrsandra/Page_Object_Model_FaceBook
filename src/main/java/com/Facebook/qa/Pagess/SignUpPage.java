package com.Facebook.qa.Pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.qa.Base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement Firstname;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement Lastname;

	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement RegEmail;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	WebElement RegPswd;

	@FindBy(xpath = "//button[@name='websubmit']")
	WebElement SignupBtn;

	public void SignupPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateSignupPageTitle() {
		return driver.getTitle();
	}

	public boolean validateFirstname() {
		return Firstname.isDisplayed();
	}

	public boolean validatelastname() {
		return Lastname.isDisplayed();
	}

	public boolean validateemail() {
		return RegEmail.isDisplayed();
	}

	public boolean validatepassword() {
		return RegPswd.isDisplayed();
	}

	public boolean validatesignupbutton() {
		return SignupBtn.isDisplayed();
	}

	public LogInPage aftersignup() {
		SignupBtn.click();
		return new LogInPage();
	}

}
