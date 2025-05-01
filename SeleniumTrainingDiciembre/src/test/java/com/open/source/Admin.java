package com.open.source;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin {
	
	String username, password, usernameinvalid, msgNoRecords, employeeName, addUserName, addPassword, usernameDelete, alertForDeleteUser, addUserNameDisabled, passwordIcorrect;

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		
		//Test Data
		username = "Admin";
		password = "admin123";
		usernameinvalid = "xyz";
		msgNoRecords= "No Records Found";
		employeeName="a";
		addUserName="Pedro998";
		addPassword="1234567a";
		usernameDelete="Pedro99";
		alertForDeleteUser="Are you Sure?";
		addUserNameDisabled="JoseCallejon";
		passwordIcorrect="admin1234";
	}

	@Test
	public void tc001AdminSearchEmployed() throws InterruptedException {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//Step 3
		Reporter.log("Validate that you have logged in successfully");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
		
		//Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 5
		Reporter.log("Search username in field \"Username\"");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 6
		Reporter.log("Click Search");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step7
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
		Assert.assertEquals(actualValue, username);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 8
		Reporter.log("Log out");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.close();
	}
		@Test
		public void tc002AdminSearchEmployed() throws InterruptedException {	
			// Step 1
			Reporter.log("Open Browser \"OrangeHRM\" web page");
			ChromeOptions chromeOpt = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOpt);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Step 2
			Reporter.log("Enter Username, Password and click Login");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			//Step 3
			Reporter.log("Validate that you have logged in successfully");
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
			
			//Step 4
			Reporter.log("Click Admin - Go to the admin page");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Step 5
			Reporter.log("Search username in field \"Username\"");
//			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(usernameinvalid);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Step 6
			Reporter.log("Click Search");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Step7
			Reporter.log("Verify username exist in table");
			String actualValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText();
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actualValue, msgNoRecords);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			Reporter.log("Log out");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			Thread.sleep(3000);
			
			driver.close();
		
		
//		// Validation - Hard Assertion
//		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//
//		// Validation - Soft Assertion
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(driver.getTitle(), "OrangeHRM");
//
//		System.out.println("Checkpoint");
//		
//
//		softAssert.assertAll();

//		String row = "1";
//		By table = By.xpath("//tbody/tr["+row+"]/td[2]");
//		
//		table.findElement(driver).isDisplayed();
	}
		
		@Test
		public void TC003_Admin_AddNewUser() throws InterruptedException {	
			// Step 1
			ChromeOptions chromeOpt = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOpt);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Step 2
			Reporter.log("Enter Username, Password and click Login");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			//Step 3
			Reporter.log("Validate that you have logged in successfully");
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
			
			//Step 4
			Reporter.log("Click Admin - Go to the admin page");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Step 5
			Reporter.log("Click to button Add");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
			
			//Step 6
			Reporter.log("Enter User Role");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")).click();
			Thread.sleep(2000);
			
			//Step 7
			Reporter.log("Enter valid Employee Name");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys(employeeName);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")).click();
			
			//Step 8
			Reporter.log("Enter status");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
			Thread.sleep(2000);
			
			//Step 9
			Reporter.log("Enter Username");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(addUserName);
			
			//Step 10
			Reporter.log("Enter new password");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(addPassword);
			
			//Step 11
			Reporter.log("Confirm password");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(addPassword);
			
			//Step 12
			Reporter.log("Click Save");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
			//Step 13
			Reporter.log("Search username in field \"Username\"");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(addUserName);
			
			//Step 14
			Reporter.log("Click Search");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(10000);
			
			//Step 15
			Reporter.log("Verify username exist in table");
			String verifyAddUser = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
			Assert.assertEquals(verifyAddUser, addUserName);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			//Step 16
			Reporter.log("Log out");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
			Thread.sleep(2000);
			
			driver.close();
		}		
			@Test
			public void TC004_Admin_DeleteUser() throws InterruptedException {	
				// Step 1
				ChromeOptions chromeOpt = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(chromeOpt);

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Step 2
				Reporter.log("Enter Username, Password and click Login");
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				
				//Step 3
				Reporter.log("Validate that you have logged in successfully");
				
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
				
				//Step 4
				Reporter.log("Click Admin - Go to the admin page");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//Step 5
				Reporter.log("Search username in field \"Username\"");
//				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button")).click();
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(usernameDelete);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
				
				//Step 6
				Reporter.log("Click Search");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//Step 7
				Reporter.log("Verify username exist in table");
				String actualValueForDelete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
				Assert.assertEquals(actualValueForDelete, usernameDelete);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//Step 8
				Reporter.log("Select user");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div/label")).click();
				
				//Step 9
				Reporter.log("Click Delete");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button")).click();
				
				//Step 10
				Reporter.log("Validate pop-window is displayed: Are you Sure?");
				String alertConfirmDeleteUser= driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/p")).getText();
				Assert.assertEquals(alertConfirmDeleteUser, alertForDeleteUser);
				
				//Step 11
				Reporter.log("Click Ok to confirm delete user");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
				
				//Step 12
				Reporter.log("Validate in table that user was delete successfully");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"oxd-toaster_1\"]")).isDisplayed();
				
				//Step 13
				Reporter.log("Log out");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
				Thread.sleep(2000);
				
				driver.close();
			}	
				@Test
				public void TC005_Admin_CreateUserDisabled() throws InterruptedException {	
					// Step 1
					ChromeOptions chromeOpt = new ChromeOptions();
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver(chromeOpt);

					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					driver.manage().window().maximize();

					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//Step 2
					Reporter.log("Enter Username, Password and click Login");
					driver.findElement(By.name("username")).sendKeys(username);
					driver.findElement(By.name("password")).sendKeys(password);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
					
					//Step 3
					Reporter.log("Validate that you have logged in successfully");
					
					WebDriverWait wait = new WebDriverWait(driver,10);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
					
					//Step 4
					Reporter.log("Click Admin - Go to the admin page");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
					//Step 5
					Reporter.log("Click to button Add");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
					
					//Step 6
					Reporter.log("Enter User Role");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")).click();
					Thread.sleep(2000);
					
					//Step 7
					Reporter.log("Enter valid Employee Name");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys(employeeName);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")).click();
					
					//Step 8
					Reporter.log("Enter status");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[3]")).click();
					Thread.sleep(2000);
					
					//Step 9
					Reporter.log("Enter Username");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(addUserNameDisabled);
					
					//Step 10
					Reporter.log("Enter new password");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(addPassword);
					
					//Step 11
					Reporter.log("Confirm password");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(addPassword);
					
					//Step 12
					Reporter.log("Click Save");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
					
					//Step 13
					Reporter.log("Search username in field \"Username\"");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(addUserNameDisabled);
					
					//Step 14
					Reporter.log("Click Search");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
					Thread.sleep(10000);
					
					//Step 15
					Reporter.log("Verify username exist in table");
					String verifyAddUser = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
					Assert.assertEquals(verifyAddUser, addUserNameDisabled);
					String verifyAddUserDisabled= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[5]/div")).getText();
					Assert.assertEquals(verifyAddUserDisabled, "Disabled");
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
					
					//Step 16
					Reporter.log("Log out");
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
					Thread.sleep(2000);
					
					driver.close();
				}				
				
				@Test		
					public void TC006_Validate_User_Admin() throws InterruptedException {	
						// Step 1
						ChromeOptions chromeOpt = new ChromeOptions();
						WebDriverManager.chromedriver().setup();
						WebDriver driver = new ChromeDriver(chromeOpt);

						driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
						driver.manage().window().maximize();

						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
						//Step 2
						Reporter.log("Enter Username, Password and click Login");
						driver.findElement(By.name("username")).sendKeys(username);
						driver.findElement(By.name("password")).sendKeys(password);
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
						
						//Step 3
						Reporter.log("Validate that you have logged in successfully");
						
						WebDriverWait wait = new WebDriverWait(driver,10);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
						
						//Step 4
						Reporter.log("Click Admin - Go to the admin page");
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
						//Step 5
						Reporter.log("Search username in field \"Username\"");
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
						
						//Step 6
						Reporter.log("Click Search");
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
						Thread.sleep(10000);
						
						//Step 7
						Reporter.log("Verify username exist in table");
						String verifyAddUser = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
						Assert.assertEquals(verifyAddUser, "Admin");
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
						
						//Step 16
						Reporter.log("Log out");
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
						Thread.sleep(2000);
						
						driver.close();
				}
				
				@Test		
						public void TC007_Validate_Invalid_Password() throws InterruptedException{
							// Step 1
							ChromeOptions chromeOpt = new ChromeOptions();
							WebDriverManager.chromedriver().setup();
							WebDriver driver = new ChromeDriver(chromeOpt);

							driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
							driver.manage().window().maximize();

							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							
							//Step 2
							Reporter.log("Enter Username, Password and click Login");
							driver.findElement(By.name("username")).sendKeys(username);
							driver.findElement(By.name("password")).sendKeys(passwordIcorrect);
							
							//Step 3 Login
							driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
							
							//Step 4 Verify error message when enter invalid password
							String VerifyInvalidCredentials = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]")).getText();
							Assert.assertEquals(VerifyInvalidCredentials, "Invalid credentials");
							
							Thread.sleep(3000);
							
							driver.close();
					}
						}
		

	
