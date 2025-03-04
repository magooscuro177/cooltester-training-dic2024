package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestPageFacebook {
	public static WebDriver driver;



@BeforeTest
public void beforeTest() {
}

@Test
public void facebookTest() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver2.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Assert.assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse");
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	
	System.out.println("Checkpoint");
}

@AfterTest
public void afterTest() {
	  driver.close();
}

}
