package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import base.GlobalVariables;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Objetos
	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	// Custome methods
	public void LoginOrange(String username, String password) {
		launchBrowser(GlobalVariables.QA_URL);
		implicitWait(10);
		sendKeys(txtUsername, username);
		sendKeys(txtPassword, password);
		clickOrange(btnLogin);
		hardWait(5000);
	}

}
