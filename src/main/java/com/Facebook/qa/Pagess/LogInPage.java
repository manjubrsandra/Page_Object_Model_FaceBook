package com.Facebook.qa.Pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.qa.Base.TestBase;

public class LogInPage extends TestBase {


	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	 @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	    WebElement CreatenewAccount;

	@FindBy(xpath="//img[contains(@alt,'Facebook')]")
	WebElement FBLogo;
	
	@FindBy(xpath="//a[contains(.,'Forgotten password?')]")
	WebElement Forgotpswd;
	
	//intializing page object
	public LogInPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateFBImage(){
		return FBLogo.isDisplayed();
	}
	public boolean validateusername(){
		return email.isDisplayed();
	}
	
	public HomePage  login(){
		email.sendKeys("manjunathbrsandra43@gmail.com");
		pass.sendKeys("Manju@1994");
		loginBtn.click();
		    	
		return new HomePage();
	}

	
	
}


