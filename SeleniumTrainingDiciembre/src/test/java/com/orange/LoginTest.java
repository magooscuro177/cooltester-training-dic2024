package com.orange;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.AdminPage;
import poc.DashboardPage;
import poc.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	Base base;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	@Test
	public void tc001() {
		// Step 1, 2
		loginPage.LoginOrange("Admin", "admin124");
		
		//Step 3
		Assert.assertTrue(dashboardPage.isConfirmedLogin(), "User is not logued");
		
		//Step 4
		dashboardPage.clickAdmin();
		
		//Step 5, 6 Search username
		adminPage.searchUsername("Admin");
		
		adminPage.clickSearch();
		
		//Step 7
		adminPage.isConfirmedSearchUser("Admin");
		
		//Step 8
		dashboardPage.Logout();
		
		
		
	}

	@BeforeTest
	public void beforeTest() {
		base=new Base(driver);
		driver=base.driverConnection();
		loginPage=new LoginPage(driver);
		dashboardPage= new DashboardPage(driver);
		adminPage= new AdminPage(driver);
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
