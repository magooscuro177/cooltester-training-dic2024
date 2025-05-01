package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private WebDriver driver;

	/*
	 * Constructor
	 */

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public void reporterLog(String log) {
		Reporter.log(log);
	}

	public WebDriver driverConnection() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		return driver;
	}

	public void launchBrowser(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void implicitWait(int time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void explicitWait(By obj, int time) {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver,time);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(obj);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void hardWait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void sendKeys(By obj, String txtname) {
		try {
			driver.findElement(obj).sendKeys(txtname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOrange(By obj) {
		try {
			driver.findElement(obj).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public boolean objIsDisplayed(By obj) {
		try {
			return driver.findElement(obj).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void objgetText(By obj, String username, String actualValue) {
		try {
			
			actualValue=driver.findElement(obj).getText();
			Assert.assertEquals(actualValue, username);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public String getJSONData(String jsonFileObj, String nestedObjKey, String jsonKey) {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(nestedObjKey).get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}

public void driverClose() {
	driver.close();
}
		
	
	
	
	
	
}