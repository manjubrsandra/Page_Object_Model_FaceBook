package com.Facebook.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Facebook.qa.Base.TestBase;
import com.Facebook.qa.Pagess.HomePage;
import com.Facebook.qa.Pagess.LogInPage;
import com.Facebook.qa.Pagess.SignUpPage;

public class LogInPageTest extends TestBase {
	
	LogInPage loginTest;
	HomePage homePage;
	SignUpPage signup;

	@BeforeMethod
	public void setup() {
		initialization();
		loginTest = new LogInPage();
		homePage = new HomePage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginTest.validateLoginPageTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@Test(priority = 2)
	public void FBLogoTest() {
		boolean flag = loginTest.validateFBImage();
		Assert.assertTrue(flag);
	}
	@Test(priority = 3)
	public void FBemailTest() {
		boolean flag = loginTest.validateusername();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void loginTest() {
		homePage = loginTest.login();
	}
	@AfterMethod
	public void tearDown() {
	   driver.quit();
	}


}
